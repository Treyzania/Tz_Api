package com.treyzania.api.util.varret;

import com.treyzania.api.io.DataEntry;

public interface IRetableVars {

	public void setVar(String key, DataEntry value);
	public DataEntry getVar(String key);
	
}
