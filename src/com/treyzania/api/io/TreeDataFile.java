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
	 * NOTE: Will return a null if the Entry cannot be found.
	 * 
	 * @param path
	 * @return
	 */
	public Entry getEntryFromPath(String[] path) {
		
		/*
		 * Entry finder revision number: 3.1
		 */
		
		Entry targetEntry = null;
		EntryCompound ec = this.rootDir;
		
		for (int i = 0; i < path.length; i++) {
			
			String filename_cur = path[i];
			
			targetEntry = ec.getEntry(filename_cur);
			
			if (targetEntry instanceof EntryCompound) ec = (EntryCompound) targetEntry;
			//if (targetEntry instanceof DataEntry) throw new IllegalArgumentException();
			
		}
		
		return targetEntry;
		
	}
	
	/**
	 * Gets the specified entry.
	 * NOTE: Will return a null if the Entry cannot be found.
	 * 
	 * @param path
	 * @return
	 */
	public Entry getEntryFromPath(String path) {
		
		try {
			return this.getEntryFromPath(path.split("/"));
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			return null;
		}
		
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
