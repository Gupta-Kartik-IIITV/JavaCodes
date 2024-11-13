import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<sc.nextInt();i++){
			int l = sc.nextInt();
			int nsum = (l*(l+1))/2;
			int asum=0;
			int cnt = 0;
			for(int j=0;j<l;j++){
				int n = sc.nextInt();
				if(n==l){
					cnt++;
				}
				asum += n;
			}
			if(cnt>1){
				System.out.println(-1);
			}
			else{
				System.out.println(nsum-asum);
			}

		}

	}
}
