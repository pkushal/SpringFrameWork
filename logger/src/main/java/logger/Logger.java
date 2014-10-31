package logger;

public class Logger {
	// private ConsoleWriter consoleWriter;
	// private FileWriter fileWriter;

	// public void setConsoleWriter(ConsoleWriter Writer) {
	// this.consoleWriter = Writer;
	// }
	//
	// public void setFileWriter(FileWriter fileWriter) {
	// this.fileWriter = fileWriter;
	// }

	private LogWriter consoleWriter;
	private LogWriter fileWriter;

	public void setConsoleWriter(LogWriter Writer) {
		this.consoleWriter = Writer;
	}

	public void setFileWriter(LogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	public void writeFile(String text) {
		fileWriter.write(text);
	}

	public void writeConsole(String text) {
		consoleWriter.write(text);
	}

}
