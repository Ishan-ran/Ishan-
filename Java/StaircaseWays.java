public class StaircaseWays {
       static int countWays(int n) {
        return (n / 2) + 1;  
    }

    public static void main(String[] args) {
        int n = 5; 
        System.out.println("Number of ways to climb " + n + " stairs: " + countWays(n));
    }
}
