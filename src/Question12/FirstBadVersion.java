package Question12;

public class FirstBadVersion {

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    // Example implementation of the isBadVersion API
    private boolean isBadVersion(int version) {
        // Implementation details of isBadVersion are not provided in the question
        // You should replace this with your own implementation or use the provided API
//        Assuming in this scenario bad version starts from 95
        return version >= 95;
    }

    public static void main(String[] args) {
        // Example usage
        FirstBadVersion solution = new FirstBadVersion();

        int n = 100; // Number of versions
        int firstBad = solution.firstBadVersion(n);
        System.out.println("The first bad version is: " + firstBad);
    }
}
