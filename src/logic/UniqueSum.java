package logic;

public class UniqueSum 
{
	public int uniqueSum(int a,int b,int c)
	{
		int result =0;
		if(a  != b && a != c)
			result +=a;
		if(b != c && b != a)
			result += b;
		if(c != a && c !=b)
			result +=c;
		
		return result;
	}
}
