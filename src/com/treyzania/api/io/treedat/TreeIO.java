package com.treyzania.api.io.treedat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TreeIO {

	public static byte[] toByteArray(Entry entry) {
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = null;
		
		try {
			
			oos = new ObjectOutputStream(baos);
			oos.writeObject(entry);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return baos.toByteArray();
		
	}
	
	public static Entry toEntry(byte[] data) {
		
		Entry out = null;
		
		ObjectInputStream ois = null;
		ByteArrayInputStream bais = new ByteArrayInputStream(data);
		
		String msg_badData = "The supplied data is not coded for any type of Entry.";
		
		try {
			
			ois = new ObjectInputStream(bais);
			Object readData = ois.readObject();
			
			if (readData instanceof Entry) {
				out = (Entry) readData;
			} else {
				throw new IllegalArgumentException(msg_badData);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			throw new IllegalArgumentException(msg_badData);
		}
		
		return out;
		
	}
	
	/**
	 * An absolutely horrible way of checking to see if some data contains any Entry data.
	 * 
	 * @param data Data that might contain Entries
	 * @return if it does
	 */
	public static boolean validateData_simple(byte[] data) {
		
		String dataAsString = new String(data);
		String[] keywords = {
				"Entry"
		};
		
		boolean goodSoFar = true;
		for (int i = 0; i < keywords.length; i++) {
			
			goodSoFar = dataAsString.contains(keywords[i]) && goodSoFar;
			if (!goodSoFar) break;
			
		}
		
		return goodSoFar;
		
	}
	
}
