import java.util.Scanner;
import java.math.BigInteger;

class UVA11879
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int t,i,j,k;
		BigInteger n,a,b;
		a=BigInteger.ZERO;
		b=BigInteger.ZERO;

		while(in.hasNext())
		{
			n=in.nextBigInteger();
			k=n.compareTo(BigInteger.valueOf(0));
			if(k<=0)
			break;

			a=n.divide(BigInteger.valueOf(17));
			b=a.multiply(BigInteger.valueOf(17));

			j=n.compareTo(b);

			if(j==0)
			System.out.println(1);
			else
			System.out.println(0);
		}
	}
}