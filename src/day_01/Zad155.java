package day_01;

import java.util.Scanner;

public class Zad155 {
	public static void main(String[] args) {
		String password = "Akademia";
		String userPassword;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Podaj has�o:");
			userPassword = sc.next();
		}while(!password.equals(userPassword));
		
		System.out.println("Gratulacje poda�e� poprawne has�o!");
		
		sc.close();
	}

}
