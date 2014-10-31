package autowiringwithannotations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fileWriter")
@Qualifier("fileWriter")
public class FileWriter implements LogWriter {
	public void write(String s) {
		System.out.println("this is from the logwriter: " + s);
	}
}
