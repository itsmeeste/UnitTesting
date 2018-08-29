package logic;

public class ErrorHandling {
	
	public int DivideTest(int a, int b)
	{
		try
		{
			return a /b;
		}
		catch(Exception e)
		{
			//System.out.println(e);
			return 0;
		}
	}

}
