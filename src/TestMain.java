
public class TestMain 
{
	public int number;
	public TestClass tm;
	public TestMain tmm;
	
	public static void main(String[] args) 
	{
		TestMain a = new TestMain();
		a.test();
		
		TestClass c = new TestClass ();
		c.doSomthing();
		
		a.number = 10;
		
		a.tm = new TestClass();
		
		if (a.tm instanceof TestMain)
		a.tmm = (TestMain)a.tm;
	}
	
	public void test ()
	{
		int a;
	}

}
