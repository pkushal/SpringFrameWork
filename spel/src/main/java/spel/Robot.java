package spel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	private String id = "Default Robot";
	private String speech = "Hello there";

	@Autowired
	public void setId(@Value("#{randomText.getText()?.length()}") String id) {
		this.id = id;
	}

	@Autowired
	public void setSpeech(@Value("#{T(Math).sin(T(Math).PI/4)}") String speech) {
		this.speech = speech;
	}

	public void speak() {
		System.out.println(id + " :: " + speech);

	}
}
