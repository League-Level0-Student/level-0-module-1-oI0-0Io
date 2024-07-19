package _05_for_loops._2_badgers;

public class Badgers {

	public static void main(String[] args) {
		for (int a = 0; a < 2; a++) {
			for (int i = 0; i < 12; i++) {
				System.out.print("Badger");
				if (i < 11) {
					System.out.print(", ");
				}
			}
			System.out.println();
			for (int i = 0; i < 2; i++) {
				System.out.print("Mushroom");
				if (i < 1) {
					System.out.print(", ");
				}
			}
			System.out.println();
			System.out.println();
		}
		System.out.print("A Snake!!!");
	}

}

//Badger, Badger, Badger, Badger, Badger, Badger, Badger,Badger, Badger,Badger, Badger, Badger
//Mushroom, Mushroom
//
//Badger, Badger, Badger,Badger, Badger, Badger, Badger,Badger, Badger, Badger, Badger, Badger
//Mushroom, Mushroom
//
//A Snake!!!