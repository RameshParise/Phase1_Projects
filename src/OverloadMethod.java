class methodExecution {

	public int multipynumbers(int a, int b) {
		int z = a * b;
		return z;
	}

}

//call by value
class callMethod {

	int val = 150;

	int operation(int val) {
		val = val * 10 / 100;
		return (val);
	}

}

//method overloading
public class OverloadMethod {

	public void area(int b, int h) {
		System.out.println("Area of Triangle : " + (0.5 * b * h));
	}

	public void area(int r) {
		System.out.println("Area of Circle : " + (3.14 * r * r));
	}

	public static void main(String args[]) {

		methodExecution b = new methodExecution();
		callMethod d = new callMethod();
		OverloadMethod ob = new OverloadMethod();
		int ans = b.multipynumbers(10, 3);
		System.out.println("Multipilcation is :" + ans);
		System.out.println("Before operation value of data is " + d.val);
		d.operation(100);
		System.out.println("After operation value of data is " + d.val);
		ob.area(10, 12);
		ob.area(5);
	}
}

