package p9_realworldExample;

public interface Flyable {
	default void fly() {
		System.out.println("Flying");
	}
}
