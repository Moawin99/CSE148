package p4_interfacesRevisit;

public class Calculator implements Calculatable{

	@Override
	public int square(int number) {
		return number * number;
	}

}
