package multilevelinheritance;

public class Parent_C extends Parent_B {
	public void div()
	{
int e=b/a;
System.out.println(" The division of two numbers "+e);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Parent_C h=new Parent_C();
h.div();
h.sub();
h.add();
	}
}
