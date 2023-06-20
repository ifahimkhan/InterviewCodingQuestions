package Question13;

/*Climbing Stairs
you are climbing a staircase. it takes n steps to reach the top.
Each time you can either climb 1 or 2 steps in how many distinct ways can you climb to the top?
*/
public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        // Example usage
        ClimbingStairs solution = new ClimbingStairs();

        int n = 5; // Number of steps
        int distinctWays = solution.climbStairs(n);
        System.out.println("Number of distinct ways to climb the stairs: " + distinctWays);
    }
}

