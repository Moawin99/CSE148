package remoteControl;

public class RemoteControl {
	//instance variables, fields,properties, attributes
	private String color;
	private int length = 5;
	
	// methods, behavior
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
}
