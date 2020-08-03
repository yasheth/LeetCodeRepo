package easy;
public class StudentAttendanceRec {

	public static boolean checkRecord(String s) {
		int count = 0;
        for(char c:s.toCharArray()){
           if(c == 'A')
               count++;
        }
        return count < 2 && !s.contains("LLL"); 
    }

	public static void main(String[] args) {
		System.out.println(checkRecord("PPALP"));
	}

}
