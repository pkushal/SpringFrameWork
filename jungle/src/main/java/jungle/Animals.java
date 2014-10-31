package jungle;

public class Animals {
	private String name;
	private String type;

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Animals [name=" + name + ", type=" + type + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
