public class largest_palindrome {
	static int ispalin(int a) {
		int temp = a;
		int reverse = 0;
		while(temp>0) {
			int digit = temp%10;
			reverse = (reverse*10)+digit;
			temp /=10;
		}
		a = reverse;
		return a;
	}
	public static void main(String[] args) {
		
		for(int i=100;i<1000;i++) {
			for(int j=i+1;j<1000;j++) {
				int product = i*j;
				if(product == ispalin(product)) {
					System.out.println(i+"*"+j+"="+product);
				}
			}
		}
		}
	}