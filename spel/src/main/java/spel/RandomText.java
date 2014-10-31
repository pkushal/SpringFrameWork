package spel;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component
public class RandomText {
	private static String[] texts = { "wala kushal babu", "hey whats up",
			"Have a good one" };

	public String getText() {
		Random random = new Random();
		return texts[random.nextInt(texts.length)];
	}
}
