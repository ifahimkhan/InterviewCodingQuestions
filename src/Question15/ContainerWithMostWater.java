package Question15;

/*
* container with most water
you are given an integer array height of length n. there are n vertical lines drawn such that the two endpoints of the ith line are (i,0) and (i,height[i])
return the maximum amount of water a container can store.*/
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        // Example usage
        ContainerWithMostWater solution = new ContainerWithMostWater();

        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int maxArea = solution.maxArea(height);
        System.out.println("Maximum amount of water that can be stored: " + maxArea);
    }
}
