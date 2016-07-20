package day_04.classes2.zad6;


public class Main {

	public static void main(String[] args) {
		Clinic klinika = new Clinic("Zoo");
		
		klinika.addPatient(new Patient("Pawe³", "nowak", 851234));
		klinika.addPatient(new Patient("jan", "kowalski", 32451));
		klinika.addDoctor(new Doctor("Gregory", "house", 98, "kidneys", 100));
		klinika.addDoctor(new Doctor("Jim", "Wilson", 78, "Cancer", 99));
		
		
		
		TUI.showMainMenu(klinika);

	}

}
