package day_04.classes2.zad6;

public class Patient extends Person{
	
	private static int idPatientCounter = 0;
	
	private int idPatient;
	

	public Patient(String name, String surname, int pesel) {
		super(name, surname, pesel);
		idPatient = idPatientCounter;
		idPatientCounter++;
	}

	public int getIdPatient() {
		return idPatient;
	}
}
