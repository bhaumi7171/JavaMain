package selfstudyhierrarchialinheritance;



public class Arithmetic_mult extends Arithmetic_Add{

	public void multi()
	{
	int e=a*b;
	System.out.println(" The Multiplication Of Two Numbers: "+e);
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Arithmetic_mult arithmeticoperation=new Arithmetic_mult();
	arithmeticoperation.arithmetic();
	arithmeticoperation.add();
		arithmeticoperation.multi();
	}

}
