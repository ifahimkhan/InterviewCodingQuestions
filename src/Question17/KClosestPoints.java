package Question17;

import java.util.Arrays;
import java.util.PriorityQueue;

/*
*
* K Closest points to origin
Given an array of points, where points[i] = [xi,yi] represents a point on the x-y plane and an integer k, return the k closest points to the origin(0,0)
you may return the answer in any order.
* */
public class KClosestPoints {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((int[] a, int[] b) -> {
            return (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1]);
        });

        for (int[] point : points) {
            pq.offer(point);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[][] result = new int[k][2];
        int index = 0;
        while (!pq.isEmpty()) {
            result[index] = pq.poll();
            index++;
        }

        return result;
    }

    public static void main(String[] args) {
        // Example usage
        KClosestPoints solution = new KClosestPoints();

        int[][] points = {{1, 3}, {-2, 2}, {5, -1}};
        int k = 2;
        int[][] kClosestPoints = solution.kClosest(points, k);
        System.out.println("K closest points to the origin:");
        for (int[] point : kClosestPoints) {
            System.out.println(Arrays.toString(point));
        }
    }
}
