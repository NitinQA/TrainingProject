package FirstJavaPakage;

public class VariableDemo {
	static int n=4;
	double l=123.45;

	public static void main(String[] args) {
		
		VariableDemo obj = new VariableDemo();
		obj.method();
		obj.method2();
		System.out.println("in main method the global or instance variable from method2 " +n);

	}

	public void method() {
		//local variables 
		//int i; // declaration of variable
		//i=10; // initialization
		//int j=9; //both declaration and initialization in single line
		int k = 0;
		System.out.println("this is a local variable of int data type  " +k );
		System.out.println("this is a global variable of int data type " +n );
	}
	public void method2() {
		System.out.println("global or instance variable from double data type " +n);
	}
}