package autowiringwithannotations;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Logger {
	/*
	 * @Autowired public Logger(ConsoleWriter consoleWriter, FileWriter
	 * fileWriter) { this.consoleWriter = consoleWriter; this.fileWriter =
	 * fileWriter; }
	 */

	// @Autowired
	private ConsoleWriter consoleWriter;
	// @Autowired
	private LogWriter fileWriter;

	// @Autowired
	// @Qualifier("toConsoleKP")
	@Inject
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}

	// @Autowired
	// @Qualifier("fileWriter")
	@Inject
	@Named(value="fileWriter")
	public void setFileWriter(LogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	public void writeFile(String s) {
		fileWriter.write(s);
	}

	public void writeConsole(String s) {
		consoleWriter.write(s);
	}
}
