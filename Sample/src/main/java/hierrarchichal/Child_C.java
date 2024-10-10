package hierrarchichal;

public class Child_C extends Parent {
	public void mul()
	{
		int e=a*b;
		System.out.println("The multiplication of two numbers "+e);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child_C n=new Child_C();
n.add();
n.mul();
	}

}
