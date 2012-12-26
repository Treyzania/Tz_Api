package com.treyzania.api.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TreeDataFile implements Flushable {
	
	private File targetFile;
	public RootDirectory rootDir;
	
	public TreeDataFile(String filename, boolean read) {		
		
		// Inits
		targetFile = new File(filename);
		rootDir = null;
		
		if (read) {
			sync();
		} else {
			resetRootDir();
		}
			
	}
	
	public void resetRootDir() {
		
		this.rootDir = new RootDirectory();
		
	}
	
	/**
	 * Gets the specified entry.
	 * NOTE: "path" must be a java.lang.String[]
	 * 
	 * @param path
	 * @return
	 */
	@SuppressWarnings("unused")
	public Entry getEntryFromPath(String[] path) {
		
		// Inits
		Entry e = null;
		boolean finished = false;
		int point = 0;
		
		// Work
		e = rootDir.getEntry(path[0]); point++;
		for (int i = 0; i < path.length; i++) {
			
			if (point >= path.length) break;
			if ( !(e instanceof EntryCompound) ) break;
			EntryCompound ec = (EntryCompound) e;
			
			e = ec.getEntry(path[i]);
			
		}
		
		// Return
		return e;
		
	}
	
	public boolean addEntry(Entry entry) {
		
		return rootDir.addEntry(entry);
		
	}
	
	private void sync() {
		
		// Inits
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(targetFile);
			ois = new ObjectInputStream(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Read data
		try {
			
			this.rootDir = (RootDirectory) ois.readObject();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void read() {
		this.sync();
	}
	
	@Override
	public void flush() {
		
		// Inits
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(targetFile);
			oos = new ObjectOutputStream(fos);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Write data
		try {
			
			oos.writeObject(this.rootDir);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
