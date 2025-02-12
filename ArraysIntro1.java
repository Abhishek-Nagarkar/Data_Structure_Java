package Data_Structures_Java;

import java.util.Objects;

public class ArraysIntro1 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        //Q. What would be the output of for loop on arr1
        // for(int i=0; i<arr1.length; i++){
        //     System.out.println(arr1[i]));
        // }

        // 2D Array
        int[][] arr2 = new int[5][5];
        for(int outerIdx = 0; outerIdx < arr2.length; outerIdx++){
            for(int innerIdx = 0; innerIdx < arr2[outerIdx].length; innerIdx++){
                arr2[outerIdx][innerIdx] = 1;
            }
        }

        for(int outerIdx = 0; outerIdx < arr2.length; outerIdx++){
            for(int innerIdx = 0; innerIdx < arr2[outerIdx].length; innerIdx++){
                System.out.print(arr2[outerIdx][innerIdx]+" ");
            }
            System.out.println();
        }

        int[][] arr3 = {
            {1,2,3,4,5},
            {2,3,4,5,6},
            {3,4,5,6,7},
            {4,5,6,7,8},
            {5,6,7,8,9}
        };

        
    }
}
