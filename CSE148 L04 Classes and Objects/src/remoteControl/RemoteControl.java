package remoteControl;

public class RemoteControl {
	//instance variables, fields,properties, attributes
	private String color;
	private int length = 5;
	
	// methods, behavior
	public void setLength(int len) {
		length = len;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setColor(String c) {
		color = c;
	}
	
	public String getColor() {
		return color;
	}
}
