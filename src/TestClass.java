
public class TestClass extends TestMain 
{
	private String a;
	
	public void doSomthing ()
	{
		TestClass tc = new TestClass ();
		tc.doSomethingElse();
	}
	
	public void doSomethingElse ()
	{
		a = "aString";
	}
}
