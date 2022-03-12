package day1assignment;

import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n,i,j,a[][];
		System.out.println("Steps:");
		n=scanner.nextInt();
		a= new int[n][n];
		//matrix
		for(i=0;i<n;i++) {
			for(j=0;j<=i;j++)
				if(j==0||j==i)
					a[i][j]=1;
				else
					a[i][j]=a[i-1][j-1]+a[i-1][j];
				
		}
		System.out.println("\nResult:\n");
		for(i=0;i<n;i++)
		{
			for(j=0;j<=i;j++)
				System.out.print(a[i][j]+"\t");
			
			System.out.println();
		}
		
		
	}

}
