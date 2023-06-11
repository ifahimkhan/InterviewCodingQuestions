package Question6;

/*
binary search:
Given an array of integers nums which is sorted in ascending order, and an integer target,
write a function to search target in nums. if target exists, then return its index. otherwise return -1.
you must write an algorithm with O(log n) runtime complexity
*/
public class BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        // Example usage
        BinarySearch solution = new BinarySearch();

        int[] nums = {1, 2, 3, 5, 7, 9, 11, 13};
        int target = 9;
        int index = solution.search(nums, target);

        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found.");
        }
    }
}


