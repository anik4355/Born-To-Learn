public class StairSteps {
    public static void main(String[] args) {
        int ans  = CountWay(5);
        System.out.println("Number of ways : " + ans);
    }
    public static int CountWay(int n ){
        int a = 1, b =2;
        if(n == 1) return a;
        if(n == 2) return b;
        for(int i =1 ;i <= n-2;i++){
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
