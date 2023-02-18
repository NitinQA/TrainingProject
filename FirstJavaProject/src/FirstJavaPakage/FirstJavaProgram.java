package FirstJavaPakage; // package declaration
import java.io.Console; // importing java project, io package and Console Class
import java.lang.*;

//interface and Class declaration public access modifier and class is keyword followed by the name of class
public class FirstJavaProgram {
	public	static void main(String args[]) {
		System.out.println("A Test Java Program");
		//FirstJavaProgram firstJavaProgram = new FirstJavaProgram();  
		//when non static function is called it requires to be called via object of the class
		FirstJavaProgram.main(123);	//classs name dot static function name being called
	}
	public static void main(int i) { // i is a variable i.e. named memory location for int data type
		System.out.println("Your in the Overloaded main method " +i);
	}

}
