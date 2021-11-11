package package1;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RotatedArray 
{
	private int findIndex(int[] n) {
		int index = 0;
		int[] n1 = Arrays.copyOf(n, n.length);
		Arrays.sort(n1);
		for(int i=0;i<n.length;i++)
		{
			if(n[i]==n1[0])
			{
				index = i;
			}
		}
		return index;
	}
	
	@Test
	public void testCase1()
	{
		int[] n = {4,5,6,1};
		Assert.assertEquals(findIndex(n), 3);
	}

}
