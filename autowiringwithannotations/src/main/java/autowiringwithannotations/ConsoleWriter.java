package autowiringwithannotations;

import org.springframework.stereotype.Component;

@Component
public class ConsoleWriter implements LogWriter {

	public void write(String s) {
		System.out.println("This is from the console writer : " + s);
	}

}
