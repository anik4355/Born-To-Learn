class Factorial{
    public static void main(String[] args) {
       int n = 5;
       int ans1 = factorial(n);
       System.out.println(ans1);
       
       if(n == 0|| n== 1) {
        System.out.println(1);
       }else{
        int fact =1;
        for(int i =2; i<=n ;i++){
            fact = multiply(fact, i);
        }
        System.out.println(fact);
       }
    }
    public static int addition(int a, int b){
        if(b == 0) return 0;
        return a + addition(a,b-1);
    }
    public static int factorial(int n){
        if(n == 0 || n == 1) return 1;
        return addition(n, factorial(n-1));
    }
    public static int multiply(int a, int b){
        int result = 0;
        for(int i = 0; i< b; i++){
            result += a;
        }
        return result;
    }
    
}