package selfstudymultilevelinheritance;

public class Multiplication extends Substraction {
	
		public void multi()
		{
		int e=a*b;
		System.out.println(" The Multiplication Of Two Numbers: "+e);
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiplication arithmeticoperation=new Multiplication();
		arithmeticoperation.arithmetic();
		arithmeticoperation.add();
		arithmeticoperation.sub();
		arithmeticoperation.multi();
		

	}

}
