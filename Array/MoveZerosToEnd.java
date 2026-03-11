package Array;
import java.util.Arrays;
public class MoveZerosToEnd {
    public static void moveZerosToEnd(int[] arr) {
        int insertpos = 0;
        for(int i =0; i < arr.length; i++) {
            if(arr[i] != 0) {
                arr[insertpos] = arr[i];
                insertpos++;
            }
        }
        while(insertpos < arr.length) {
            arr[insertpos] = 0;
            insertpos++;
        
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZerosToEnd(arr);
        System.out.println("Array after moving zeros to the end : " + Arrays.toString(arr));
    }
}