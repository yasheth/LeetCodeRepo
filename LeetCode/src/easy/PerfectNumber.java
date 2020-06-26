package easy;

public class PerfectNumber {

	public static boolean checkPerfectNumber(int num) {
		if (num == 1) return false;
        double compare = Math.sqrt(num);
        int sum = 1;
        for (int i = 2; i <= compare; i++) {
            if (num % i == 0) {
                sum += i;
                sum += num / i;
            }
        }
        return sum == num;
    }

	public static void main(String[] args) {
		System.out.println(checkPerfectNumber(28));
	}

}
