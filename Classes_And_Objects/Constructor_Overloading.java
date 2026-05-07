package Classes_And_Objects;

public class Constructor_Overloading {

	Constructor_Overloading() {
		System.out.println("Default Constructor Called");
	}

	Constructor_Overloading(int a) {
		System.out.println("Parameterized Constructor Called");
		System.out.println("Value: " + a);
	}

	public static void main(String[] args) {
		Constructor_Overloading d1 = new Constructor_Overloading();
		Constructor_Overloading d2 = new Constructor_Overloading(100);
	}
}
