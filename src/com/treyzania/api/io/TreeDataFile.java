package com.treyzania.api.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class TreeDataFile implements Flushable {
	
	private File targetFile;
	private RootDirectory rootDir;
	
	public TreeDataFile(String filename) {		
		
		// Inits
		targetFile = new File(filename);
		rootDir = null;
		
		this.sync(); // Read the path tree
		
	}
	
	/**
	 * Gets an entry from an address.
	 * I.E. "/data/example/number.int"
	 * 
	 * 
	 */
	@SuppressWarnings("unused")
	public Entry getEntryFromPath(String path) {
		
		Vector<Entry> entryPathAsVec = new Vector<Entry>();
		Entry e = null;
		boolean finished = false;
		String adjPath = path;
		
		while (!finished) {
			
			String currentTarget = "";
			
			
			
			
			
		}
		
		
		return e;
		
	}
	
	public Entry getEntry(String name, EntryCompound ec) { 
		
		Entry e = null;
		
		for (int i = 0; i < ec.entries.length; i++) {
			
			if (ec.getEntry(i).name == name) e = ec.getEntry(i);
			
		}
		
		return e;
		
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
