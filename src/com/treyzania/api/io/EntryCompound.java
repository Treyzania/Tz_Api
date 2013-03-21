package com.treyzania.api.io;

import java.util.ArrayList;
import java.util.HashMap;

public class EntryCompound extends Entry implements ISubfiles, Cloneable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7583127222094927379L;
	HashMap<String, Entry> entries;
	
	public EntryCompound() {
		this(null);
	}
	
	public EntryCompound(EntryCompound parent) {
		
		super(parent);
		
		this.entries = new HashMap<String, Entry>();
		
	}
	
	/* Beginning of entry-setters */
	
	/**
	 * Adds an entry compound with the name specified.  There is no need to parentalize the compound.
	 * 
	 * @param name
	 * @param ec
	 */
	public void setCompound(String name, EntryCompound ec) {
		
		if (ec == this) { // We don't want any compound-ception!
			System.err.println("wtf?");
			return;
		}
		
		ec.parent = this;
		this.internalEntrySet(name, ec);
		
	}
	
	/**
	 * Makes a new entry compound, then returns it.
	 * 
	 * @param name
	 * @return
	 */
	public EntryCompound setCompound(String name) {
		
		EntryCompound ec = new EntryCompound(this);
		this.internalEntrySet(name, ec);
		return ec;
		
	}
	
	/**
	 * Makes a new boolean entry.
	 * 
	 * @param name
	 * @param value
	 */
	public void setBoolean(String name, boolean value) {
		
		this.internalEntrySet(name, new EntryBoolean(value, this));
		
	}
	
	/**
	 * Makes a new byte entry.
	 * 
	 * @param name
	 * @param value
	 */
	public void setByte(String name, byte value) {
		
		this.internalEntrySet(name, new EntryByte(value, this));
		
	}
	
	/**
	 * Makes a new double entry.
	 * 
	 * @param name
	 * @param value
	 */
	public void setDouble(String name, double value) {
		
		this.internalEntrySet(name, new EntryDouble(value, this));
		
	}
	
	/**
	 * Makes a new float entry.
	 * 
	 * @param name
	 * @param value
	 */
	public void setFloat(String name, float value) {
		
		this.internalEntrySet(name, new EntryFloat(value, this));
		
	}
	
	/**
	 * Makes a new integer entry.
	 * 
	 * @param name
	 * @param value
	 */
	public void setInteger(String name, int value) {
		
		this.internalEntrySet(name, new EntryInteger(value, this));
		
	}
	
	/**
	 * Makes a new long entry.
	 * 
	 * @param name
	 * @param value
	 */
	public void setLong(String name, long value) {
		
		this.internalEntrySet(name, new EntryLong(value, this));
		
	}
	
	/**
	 * Makes a new object entry.
	 * 
	 * @param name
	 * @param value
	 */
	public void setObjet(String name, Object value) {
		
		this.internalEntrySet(name, new EntryObject(value, this));
		
	}
	
	/**
	 * Makes a new short entry.
	 * 
	 * @param name
	 * @param value
	 */
	public void setShort(String name, short value) {
		
		this.internalEntrySet(name, new EntryShort(value, this));
		
	}
	
	/**
	 * Makes a new string entry.
	 * 
	 * @param name
	 * @param value
	 */
	public void setString(String name, String value) {
		
		this.internalEntrySet(name, new EntryString(value, this));
		
	}
	
	/**
	 * Generic entry-setter for use with custom values.  There is no need to parentalize the entry.
	 * 
	 * @param name
	 * @param entry
	 */
	public void setGenericEntry(String name, Entry entry) {
		
		entry.parent = this;
		this.internalEntrySet(name, entry);
		
	}
	
	// The raw entry setter.
	/**
	 * Internal entry setter.  Don't even _think_ about calling it.
	 * 
	 * @param name
	 * @param entry
	 */
	private void internalEntrySet(String name, Entry entry) {
		
		// TODO Make handling for nested entries. (i.e. "/some/random/path/thing.str")
		entries.put(name, entry);
		
	}
	
	/* End of entry-setters */
	
	/**
	 * Gets the value of an entry.
	 * 
	 * @param name
	 * @return
	 */
	public Entry getEntry(String name) {
		return entries.get(name);
	}
	
	public EntryCompound getECompound(String name) {
		
		Entry theEntry = this.getEntry(name);
		
		if (theEntry instanceof EntryCompound) {
			return (EntryCompound) theEntry;
		} else {
			return null;
		}
		
	}
	
	/**
	 * Gets all of the compounds in this compound.
	 * 
	 * @return
	 */
	public EntryCompound[] getCompounds() {
		
		ArrayList<EntryCompound> compounds = new ArrayList<EntryCompound>();
		
		for (int i = 0; i < entries.size(); i++) {
			
			Entry entry = entries.get(i);
			if (entry instanceof EntryCompound) {
				compounds.add((EntryCompound) entry);
			}
			
		}
		
		return (EntryCompound[]) compounds.toArray();
		
	}
	
	public Entry[] getAllEntries() {
		
		return (Entry[]) entries.values().toArray();
		
	}
	
}
