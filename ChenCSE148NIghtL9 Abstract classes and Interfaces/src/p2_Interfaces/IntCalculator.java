package p2_Interfaces;

public interface IntCalculator {
	// final variables are known as constants
	public static final double PI = 3.14;// public static final
//	private int number = 2; // not okay
	int square(int number); // public abstract
	int squareIt(int number);
	
	/*Access Modifiers:
	 * public: all classes in the world can access the member
	 * private: only the local class can access the member
	 * default (package): only classes in the same package can access the member
	 * protected: all classes in the same package + all subclasses can access 
	 * the member
	 */
	
}
