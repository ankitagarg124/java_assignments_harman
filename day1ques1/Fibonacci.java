package day1ques1;

public class Fibonacci {
	public static void main(String[] args) {
		int a=0,b=1,sum = 0,f=0;
		float avg;
		System.out.println("\nSeries of first 20 fibonacci no:");
		
		for(int i=0;i<=20;i++){
			f=a+b;
			b=a;
			a=f;
			sum=sum+f;
		    System.out.print(f);
		}
		
		avg = sum/20;
		System.out.println("\nThe average is:"+avg);
	}
		
}
