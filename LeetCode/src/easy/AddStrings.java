package easy;
public class AddStrings {

	 public static String addStrings(String num1, String num2) {
	        long n1 = 0;
	        long n2 = 0;
	        for(char c: num1.toCharArray()){
	            System.out.println(c);
	        	n1 = n1*10 + Integer.valueOf(c);
	        }
	        for(char c: num2.toCharArray()){
	        	System.out.println(c);
	            n2 = n2*10 + Integer.valueOf(c);
	        }
	        System.out.println(n1);
	        System.out.println(n2);
	        return String.valueOf(n1+n2);
	    }
	 
	public static void main(String[] args) {
		System.out.println(addStrings("12", "13"));
	}

}
