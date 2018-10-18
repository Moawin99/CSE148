package p9_realworldExample;

public interface Quackable {
	default void quack() {
		System.out.println("Quacking...");
	}
}
