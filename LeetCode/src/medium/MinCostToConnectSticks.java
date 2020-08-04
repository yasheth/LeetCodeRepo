package medium;

import java.util.PriorityQueue;

public class MinCostToConnectSticks {

	public static int connectSticks(int[] sticks) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int s : sticks) {
            pq.offer(s);
        }
        int sum = 0;
        while (pq.size() > 1) {
            int two = pq.poll() + pq.poll();
            sum += two;
            pq.offer(two);
        }
        return sum;
    }

	public static void main(String[] args) {
		System.out.println(connectSticks(new int[] { 5, 6, 7, 1, 23, 5 }));
	}

}
