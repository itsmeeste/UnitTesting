package Testing;

import org.junit.Assert;
import org.junit.Test;

import logic.UniqueSum;

public class UniqueSumTesting
{
	UniqueSum sum = new UniqueSum();
	
	@Test
	public void TestUniqueSum()
	{
		Assert.assertEquals(3, sum.uniqueSum(3, 4, 4));
	}

}
