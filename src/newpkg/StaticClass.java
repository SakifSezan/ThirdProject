package newpkg;

public class StaticClass {

	public static void main(String[] args) {
		StaticClass TX = new StaticClass();
		TX.Houston();
		StaticClass NY = new StaticClass();
		NY.Austin();
		StaticClass.Sakif();
		StaticClass.NXT();
		StaticClass Sakif = new StaticClass();
		Sakif.Boishakh();
		

	}
	public void Houston() {
		int a  = 20;
		int b = 50;
		int c = a*b;
		System.out.println(c);
		
	}
	
	public void Austin() {
		
		System.out.println("123456");
		

	}
	
	
	public static void Sakif() {
		
		char a = 'W';
		System.out.println(a);
	}
	
	public static void NXT() {
		String x = "Tuesday";
		String y = " Evening";
		String z = x+y;
		System.out.println(z);
	}
	
	public void Boishakh() {
		Double a =  10.99;
		Double b =  17.75;
		System.out.println(b);
	}

}
