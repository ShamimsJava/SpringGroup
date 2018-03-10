package com.shamim.corejava;

public class FileWriter implements LogWriter {

	public void write(String text) {
		
		System.out.println("Log from file : " + text);
	}

}
