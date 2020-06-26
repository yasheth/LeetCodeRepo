package easy;
public class StudentAttendanceRec {

	public static boolean checkRecord(String s) {
        int L=0;
        int A=0;
        for(char c: s.toCharArray()) {
        	if(c=='A'){
        		A++;
                L=0;
                if(A>1) 
                    return false;
            }else if(c=='L'){
        		L++;
                if(L>2)
                    return false;
            }else{
                L=0;
                continue; 
            }
        		
        }
        return true;
    }

	public static void main(String[] args) {
		System.out.println(checkRecord("PPALP"));
	}

}
