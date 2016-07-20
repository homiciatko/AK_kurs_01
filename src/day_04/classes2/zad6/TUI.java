package day_04.classes2.zad6;

import java.util.Scanner;

public class TUI {
	
	static Scanner sc = new Scanner(System.in);
	
	static String getString() {
		return sc.next();
	}
	
	static int getInt() {
		return sc.nextInt();
	}
	
	static void showMainMenu(Clinic clinic) {
		System.out.println("klinika " + clinic.getName() + " wybierz opcje:\n"
				+ "1: Dodaj nowego pacjenta\n"
				+ "2: Dodaj lekarza do kliniki\n"
				+ "3: Dodaj now� wizyt�\n"
				+ "4: Wy�wietl pacjent�w\n"
				+ "5: Wy�wietl lekarzy\n"
				+ "6: Wy�wietl wizyty\n"
				+ "0: Zakoncz");
		getChoise(sc.nextInt(), clinic);
	}

	static void getChoise(int choice, Clinic clinic) {
		switch (choice) {
		case 1:
			System.out.println("podaj dane pacj�ta: imie, nazwisko i pesel");
			clinic.addPatient(new Patient(getString(), getString(), getInt()));
			
			showMainMenu(clinic);
			break;
		case 2:
			System.out.println("podaj dane doktora: imie, nazwisko, pesel, specjalizacje i stawke");
			clinic.addDoctor(new Doctor(getString(), getString(), getInt(), getString(), getInt()));
			showMainMenu(clinic);
			break;
		case 3:
			System.out.println("podaj dane wizyty: pesel pacienta, ID lekarza, opis wizyty");
			clinic.addAppointment(new Appointment(clinic.getPatientByPesel(getInt()), clinic.getDoctorById(getInt()), getString()));
			showMainMenu(clinic);
			break;
		case 4:
			clinic.showPatients();
			showMainMenu(clinic);
			break;
			
		case 5:
			clinic.showDoctors();
			showMainMenu(clinic);
			break;
			
		case 6:
			clinic.showAppointments();
			showMainMenu(clinic);
			break;
			
		case 0:
			System.out.println("do widzenia");
			sc.close();
			System.exit(0);
		
		default: 
			System.out.println("Jeszcze raz");
			showMainMenu(clinic);
		}
	}
}
