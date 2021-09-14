import java.util.Scanner;
public class largest_prime_factor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long num = scanner.nextLong();
		for(int i=2;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
				num=num/i;
			}
		}
	}
}
