package com.shamim.corejava;

public class Logger {

	private ConsoleWriter consoleWriter;
	private FileWriter fileWriter;

	public ConsoleWriter getConsoleWriter() {
		return consoleWriter;
	}

	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}

	public FileWriter getFileWriter() {
		return fileWriter;
	}

	public void setFileWriter(FileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}
	
	public void writeConsole(String text) {
		consoleWriter = new ConsoleWriter();
		consoleWriter.write(text);
	}
	
	public void writeFile(String text) {
		fileWriter = new FileWriter();
		fileWriter.write(text);
	}

}
