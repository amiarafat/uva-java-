import java.util.Scanner;
import java.math.BigInteger;

class UVA11448
{
	public static void main(String args[])
	{
		int t,i,j,k;
		BigInteger benifits,costs,tbalance;
		benifits=BigInteger.ZERO;
		costs=BigInteger.ZERO;
		tbalance=BigInteger.ZERO;

		Scanner in=new Scanner(System.in);

		t=in.nextInt();
		for(i=1;i<=t;i++)
		{
			benifits=in.nextBigInteger();
			costs=in.nextBigInteger();
			tbalance=benifits.subtract(costs);

			System.out.println(tbalance);
		}
	}
}