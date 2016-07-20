package aaa01_przyklady;

public class Main {

	public static void main(String[] args) {

		int a = 10;
		Person owner = new Person();
		Person notOwner = new Person();
		
		owner.age = 10;
		owner.adress = "ul. ma³a";
		owner.name = "kowalski";
		
		notOwner.age = 20;
		notOwner.adress = "ul. DUZA";
		notOwner.name = "Kowalski";
		
		
		System.out.println(a);
		
		System.out.println(owner.age);
		System.out.println(notOwner.age);
		
		System.out.println(owner);
		System.out.println(notOwner);

	}

}
