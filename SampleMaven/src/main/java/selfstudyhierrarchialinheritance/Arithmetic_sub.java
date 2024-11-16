package selfstudyhierrarchialinheritance;

public class Arithmetic_sub extends Arithmetic_Add {
	public void sub()
	{
		int d=b-a;
		System.out.println(" The Substraction Of Two Numbers: "+d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic_sub arithmeticsub=new Arithmetic_sub();
		arithmeticsub.arithmetic();
		arithmeticsub.add();
		arithmeticsub.sub();

	}

}
