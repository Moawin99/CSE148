package p1;

import java.util.Random;

public class NameWarehouse {
	Random rand = new Random();
	NameData nameData = new NameData();
	private String boysNames = nameData.getBoysNames();
	private String girlsNames = nameData.getGirlsNames();
	private String lastNames = nameData.getLastNames();

	private String[] boys_names;
	private String[] girls_names;
	private String[] last_names;

	public void buildBoysNameArray() {
		String[] boys_data = boysNames.split("\t");
		boys_names = new String[boys_data.length];
		for (int i = 0; i < boys_data.length; i++) {
			String[] tokens = boys_data[i].split(" ");
			boys_names[i] = tokens[1];
		}
	}

	public void buildGirlsNameArray() {
		girls_names = girlsNames.split("[\t ]");
	}

	public void buildLastNameArray() {
		last_names = lastNames.split("\n");
	}
	
	public boolean checkThroughBoysNames(String name) {
		for (int i = 0; i < boys_names.length; i++) {
			if (boys_names[i].equalsIgnoreCase(name)) {
				System.out.println("It's a boy!");
				System.out.println(boys_names[i] + " " + last_names[rand.nextInt(2000)]);
				return true;
			}
		}
		return false;
	}
	
	public boolean checkThroughGirlsNames(String name) {
		for (int i = 0; i < girls_names.length; i++) {
			if (girls_names[i].equalsIgnoreCase(name)) {
				System.out.println("It's a Girl!");
				System.out.println(girls_names[i] + " " + last_names[rand.nextInt(2000)]);
				return true;
			}
		}
		return false;
	}
}
