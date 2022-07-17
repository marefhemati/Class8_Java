package abstruction;

public class A extends Abs2{

	public static void main(String[] args) {
		A objA = new A();
		objA.sum();

	}
//Here I implement the two abstract method from Abs2 abstract Class.
	@Override
	public void sum() {
		System.out.println(5+18+3);
		
	}

	@Override
	public void sum(int a, int b) {
		
		
	}
	

}
