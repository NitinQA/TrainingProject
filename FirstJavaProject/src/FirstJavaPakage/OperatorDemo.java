package FirstJavaPakage;

import java.nio.file.spi.FileSystemProvider;

public class OperatorDemo {

	public static void main(String[] args) {
		int a=5, b=10;
		int c=a+b;
		int d=c-a;
		System.out.println(c);
		System.out.println(d);
		System.out.println(a==b);
		System.out.println(a<b);
		System.out.println(((a==b) || (a<b)));
		System.out.println(a>b);
		System.out.println((a>b) && (a!=b));
		System.out.println(!((a>b) && (a>b)));
		//System.out.println(a!=b);
		//System.out.println(a>b);
		//System.out.println(a<b);

	}

}
