package remoteControl;

public class Demo {

	public static void main(String[] args) {
		RemoteControl rc1 = new RemoteControl();
		rc1.setColor("RED");
		System.out.println(rc1.getLength());
		System.out.println(rc1.getColor());
		RemoteControl rc2 = rc1;
		rc2.setColor("Black"); // equivalent to rc1.setColor("Black");
		System.out.println(rc1.getColor());
		System.out.println(rc2.getColor());
		
		RemoteControl rc3 = new RemoteControl();
		rc3.setColor("GREEN");
		rc1 = rc3;
		System.out.println(rc1.getColor());
		System.out.println(rc2.getColor());
		
	}

}
