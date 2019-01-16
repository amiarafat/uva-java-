import java.util.*;
import java.math.BigInteger;
public class UVA10220
{
	public static void main(String[] args)
	{
		int t,n,result,i;
		//long m,result;
		BigInteger sum;
		Scanner in = new Scanner(System.in);
		while (in.hasNext())
		{
			n=in.nextInt();
			result=0;
			sum=BigInteger.valueOf(1);

			for(i=2;i<=n;i++)
			{
				sum=sum.multiply(BigInteger.valueOf(i));
			}
			String A=sum.toString();

			char[] a=A.toCharArray();

			for(i=0;i<A.length();i++)
			result=result+a[i]-48;

			System.out.println(result);
		}
	}
}