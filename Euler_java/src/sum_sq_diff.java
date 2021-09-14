public class sum_sq_diff {

	public static void main(String[] args) {
		int n=1;
		long sq_num = 1;
		
		for(int i=2;i<=100;i++) {
			n=n+i;
			for(long j=i*i;j<=i*i;j++) {
				sq_num = sq_num+j;
			}
		}
		long sq_sum=n*n;
		long difference = sq_sum-sq_num;
		System.out.println("The Square of Sum is:"+sq_sum);
		System.out.println("The Sum of Squares is:"+sq_num);
		System.out.println("The Difference is :"+difference);
	}
}