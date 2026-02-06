public class GasStation {
    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas,cost));

    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {
//        for(int j = 0; j<gas.length; j++){
//            int fuel = gas[j];
//            int i = j;
//            boolean flag = true;
//            do{
//                if(fuel < cost[i]){
//                    flag =false;
//                    break;
//                }
//                fuel = fuel - cost[i];
//                fuel = fuel + gas[(i+1)%gas.length];
//                i = (i+1)% gas.length;
//            }while  (i!= j);
//            if(flag){
//                return j;
//            }
//        }
//        return -1;
        int t = 0;
        int c = 0;
        int s = 0;
        for(int i = 0; i<gas.length; i++){
            int d = gas[i] - cost[i];
            t += d;
            c += d;
            if(c<0){
                s =  i +1;
                c =0;
            }
        }
        return t >= 0 ? s : -1;
    }

}
