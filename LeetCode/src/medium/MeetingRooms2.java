package medium;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRooms2 {

	public static int minMeetingRooms(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }        
        Comparator<int []> myComp = new Comparator<int []>(){
            public int compare(int[] interval1, int[] interval2){
                return Integer.compare(interval1[0], interval2[0]);
            }
        };
        
        Arrays.sort(intervals, myComp);
        int[][] room = new int[intervals.length][2];
        room[0][1] = 101;
        room[0][0] = 0;
        int used = 1;
        for(int i = 0; i < intervals.length; i++) {
        	for(int j = 0; j < room.length; j++) {
        		if(room[j][1] == 101) {
        			if(intervals[i][0] >= room[j][0]) {
        				room[j][0] = intervals[i][1];
        				break;
        			}
        		}        		
        		else {
        			used++;
        			room[j][1] = 101;
        			room[j][0] = intervals[i][1];
        			break;
        		}
        	}
        }
        return used;
	}
	
	public static void main(String[] args) {
		System.out.println(minMeetingRooms(new int[][] {{4,9},{4,17},{9,10}}));
	}

}
