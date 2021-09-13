import java.util.Scanner;
public class even_fibonacci {
	 static int fib(int n) {
		if(n<=1) {
			return n;
		}
		else {
			return fib(n-1)+fib(n-2);
		}
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int j,sum=0;
		int limit = 4000000;
		for(int i=2;i<=n+1;i++) {
			j=fib(i);
			System.out.print(j+" ");
			if(j%2 == 0) {
				sum+=j;
			}
			System.out.println(sum);
		}
		
		
	}

}