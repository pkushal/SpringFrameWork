package autowiringwithannotations;

import org.springframework.stereotype.Component;

@Component
public interface LogWriter {
	public void write(String s);
}
