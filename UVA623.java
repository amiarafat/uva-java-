import java.math.BigInteger;
import java.util.Scanner;

class UVA623
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
			{
				int n=in.nextInt();
				int x;
				BigInteger big= BigInteger.ONE;
				for(int i=1;i<=n;i++)
				{
					big=big.multiply(BigInteger.valueOf(i));
				}
				System.out.printf("%d!\n",n);
				System.out.println(big);
			}
	}
}
