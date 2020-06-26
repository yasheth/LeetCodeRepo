package easy;
//Very Important.. How to Use Memoization
public class FibonacciNumber {

	public static int fib(int N) {
		if (N < 2)
			return N;
		if (N == 2)
			return 1;
		int result = 0;
		int p1 = 1;
		int p2 = 1;
		for (int i = 3; i <= N; i++) {
			result = p1 + p2;
			p1 = p2;
			p2 = result;
		}
		return result;

	}

	public static void main(String[] args) {
		System.out.println(fib(23));
	}

}
