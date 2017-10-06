package cis350;

public class Hello {
	public static void main(String[]args){
		System.out.println("Hello World");
		for(Elements element: Elements.values())
			System.out.printf("%s\t%s\t%s\t%s\n", element, element.getAtomicNumber(), element.getName(), element.getAtomicWeight());
		
	}
}
