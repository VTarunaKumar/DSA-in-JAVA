package Sorting;

import java.util.Arrays;

public class bubbleSort{
    public static void main(String [] args){
        int []arr = {6,5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int [] arr){
        for(int i = 0;i<arr.length;i++){
            boolean val = false;
            for(int j =1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    val = true;
                }
            }
            if (!val){
                break;
            }


        }
    }

}