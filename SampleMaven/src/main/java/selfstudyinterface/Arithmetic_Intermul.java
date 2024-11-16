package selfstudyinterface;

public class Arithmetic_Intermul implements Arithmetic_Inter,Arithmetic_intersub {
	
	public void multi()
	{
		int e=a*b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic_Intermul arithmetic=new Arithmetic_Intermul();
		arithmetic.addition();
		arithmetic.sub();
		arithmetic.multi();
	}

	@Override
	public void sub() {
		System.out.println(" The Substraction of two numbers "+d);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addition() {
		// TODO Auto-generated method stub
		System.out.println(" The Addition of two numbers "+c);
		
	}
	

}
