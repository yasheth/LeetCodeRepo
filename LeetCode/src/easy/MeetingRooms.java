package easy;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRooms {

	public static boolean canAttendMeetings(int[][] intervals) {
		Comparator<int []> myComp = new Comparator<int []>(){
			public int compare(int[] interval1, int[] interval2){
                return Integer.compare(interval1[0], interval2[0]);
            }
        };
        Arrays.sort(intervals, myComp);
        for(int i = 0; i < intervals.length-1; i++)
            if(intervals[i][1] > intervals[i+1][0]) return false;
        
        return true;
    }
	
	public static void main(String[] args) {
		System.out.println(canAttendMeetings(new int[][] {{4,9},{4,17},{9,10}}));
	}

}
