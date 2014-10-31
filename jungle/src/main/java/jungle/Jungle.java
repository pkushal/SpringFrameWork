package jungle;

import java.util.HashMap;
import java.util.Map;

public class Jungle {

	private Map<String, String> foods = new HashMap<String, String>();
	private Map<String, Animals> animals = new HashMap<String, Animals>();

	public void setFoods(Map<String, String> foods) {
		this.foods = foods;
	}

	public void setAnimals(Map<String, Animals> animals) {
		this.animals = animals;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (Map.Entry<String, String> entry : foods.entrySet()) {
			sb.append(entry.getKey() + " : " + entry.getValue() + "\n");
		}
		
		for (Map.Entry<String, Animals> entry : animals.entrySet()) {
			sb.append(entry.getKey() + " : " + entry.getValue() + "\n");
		}
		return sb.toString();
	}
}

/*
 * public Animals getLargest() { return largest; }
 * 
 * public void setLargest(Animals largest) { this.largest = largest; }
 * 
 * public List<Animals> getAnimals() { return animals; }
 * 
 * public void setAnimals(List<Animals> animals) { this.animals = animals; }
 * 
 * private Animals largest; private List<Animals> animals;
 * 
 * public String toString() { StringBuffer sb = new StringBuffer();
 * sb.append("The largest animal is: " + this.largest); sb.append("\n"); for
 * (Animals ani : animals) { sb.append(ani); sb.append("\n"); } return
 * sb.toString(); }
 */