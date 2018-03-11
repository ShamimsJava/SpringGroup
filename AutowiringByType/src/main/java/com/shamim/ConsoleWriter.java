package com.shamim;

public class ConsoleWriter implements LogWriter {

	public void write(String text) {
		
		System.out.println("Log from console : " + text);
	}

}
