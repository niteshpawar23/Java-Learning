package chapter01_ClassesObject;

class Addition{
		public static int add(int a, int b)
		{
			return a+b;
		}
}
public class FirstClassesProgram {
	public static void main(String[] args) {

		System.out.println("Hey This is my new File...");
		System.out.println((Addition.add(10, 20)));
	}

}
