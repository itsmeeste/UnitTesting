package Testing;

import org.junit.Assert;
import org.junit.Test;

import logic.Blackjack;
import logic.ErrorHandling;

public class MainTest 
{
	Blackjack b = new Blackjack();
	
	
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
		Assert.assertEquals(17, b.newGame(17, 17));
	}
	
	@Test
	public void testBothLower()
	{
		Assert.assertEquals(13, b.newGame(10, 13));
	}
	@Test
	public void testBothEqualHigher()
	{
		Assert.assertEquals(0, b.newGame(25, 25));
	}
}
