public class RockClimbWays {

    public static int countWays(int N, int I, int X) {
        int[] dp = new int[N + 1]; 
        dp[I] = 1;  
        for (int i = I; i <= N; i++) {
            for (int jump = 1; jump <= X; jump++) {
                if (i + jump <= N) {
                    dp[i + jump] += dp[i];
                }
            }
        }

        return dp[N];
    }

    public static void main(String[] args) {
        int N = 6; 
        int I = 3; 
        int X = 2; 

        int ways = countWays(N, I, X);
        System.out.println("Number of ways he can reach the peak: " + ways);
    }
}
