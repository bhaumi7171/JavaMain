package acessmodifier;

public class Newsample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
Newsample s=new Newsample();
s.display();
s.view();
s.add();
s.sub();
	}
public void display()
{
	System.out.println("a");
	}
private void view()         
{
	System.out.println("b");
}
protected void add()
{
	System.out.println("c");
}
void sub()
{
	System.out.println("d");
}
}
