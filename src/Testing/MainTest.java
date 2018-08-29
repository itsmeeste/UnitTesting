package Testing;

import org.junit.Assert;
import org.junit.Test;

import logic.Blackjack;
import logic.ErrorHandling;

public class MainTest 
{
	Blackjack b = new Blackjack();
	
//	@Test
//	public void testMethod()
//	{
//		//ErrorHandling err = new ErrorHandling();
//		//Assert.assertEquals(0,err.DivideTest(10, 0) );
//		
//		
//		Assert.assertEquals(10, b.newGame(10, 22));
//		Assert.assertEquals(0, b.newGame(22, 22));
//		Assert.assertEquals(21, b.newGame(21, 22));
//		Assert.assertEquals(17, b.newGame(17, 17));
//		Assert.assertEquals(21, b.newGame(10, 21));		
//		
//	}
	
	@Test
	public void testOver21()
	{
		Assert.assertEquals(10, b.newGame(23, 10));
	}
	
	@Test
	public void testBothOver21()
	{
		Assert.assertEquals(0, b.newGame(23, 25));
	}
	
	@Test
	public void testBothEqual()
	{
		Assert.assertEquals(0, b.newGame(23, 25));
	}
	
	@Test
	public void testBothLower()
	{
		Assert.assertEquals(13, b.newGame(10, 13));
	}

}
