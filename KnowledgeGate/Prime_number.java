class Prime_number{
    public static void  main (String[] args) {
        int n = 8;
        boolean ans = true;
        for(int i = 2; i<=n/2; i++){
            if(n%i == 0){
               ans = false;
               break;
            }
        }
        System.out.println(ans);
    }
}