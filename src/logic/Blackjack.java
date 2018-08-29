package logic;

public class Blackjack {

	public int newGame(int a,int b)
	{	
		int rA = 0;
		int rB = 0;
		
		if(a <=21)
			rA = a;
		if(b <= 21)
			rB = b;
		
		if(rA > rB)
			return rA;
		else if (rB > rA)
			return rB;
		else if(rA == rB)
			return rA;
		else
			return 0;
	}

}
