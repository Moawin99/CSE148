package courses;

import java.util.Random;

public enum Major {
	CST, CSE, MAT, ENG, PED, HIS;
	
	public static Major getAMajor() {
		Random rand = new Random();
//		return values()[rand.nextInt(values().length)];
		return  values()[(int)(Math.random() * 6)];
		
	}
}
