package vinoth.dsa.array;


import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.stream.Collectors;

/*
https://takeuforward.org/data-structure/find-second-smallest-and-second-largest-element-in-an-array/
 */
public class SecondSmallestAndLargestElement {
    private static int secondLargest(int[] arr) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int j : arr) {
            if (firstMax < j) {
                secondMax = firstMax;
                firstMax = j;
            } else if (j > secondMax && j != firstMax) {
                secondMax = j;
            }
        }
        return secondMax;
    }

    private static int thirdLargest(int[] arr) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        for (int j : arr) {
            if (firstMax < j) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = j;
            } else if (j > secondMax && j != firstMax) {
                thirdMax = secondMax;
                secondMax = j;
            } else if (j > thirdMax && j != firstMax && j != secondMax) {
                thirdMax = j;
            }
        }
        return thirdMax;
    }

    private static int secondSmallest(int[] arr) {
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int j : arr) {
            if (firstMin > j) {
                firstMin = j;
            } else
                secondMin = j;
        }
        return secondMin;
    }

    public static void main(String[] args) {
        String one = new String("one");
        String one1 = new String("one");
        String on = "one";
        System.out.println(one.equals(one1));
        System.out.println(one == one1);
        int[] arr = {10, -2, 4, 7, 700, 5};
        System.out.println(thirdLargest(arr));
        System.out.println(largestNumber(arr, 3));
        System.out.println(smallestNumber(arr, 3));
    }

    public static int largestNumber(int[] arr, int k) {
        Set<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);

        for (Integer num : collect) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }

    public static int smallestNumber(int[] arr, int k) {
        Set<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k, Collections.reverseOrder());

        for (Integer num : collect) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}
