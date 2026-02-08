import java.util.Arrays;
// import java.util.Collection;
// import java.util.Collections;

public class h_Index {
    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int i = 0;
        for(int j = citations.length-1; j>=0; j--){
            if(citations[j] > i){
                i++;
            }else {
                break;
            }
        }

        return i;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,1};
        System.out.println(hIndex(arr));
    }

}
