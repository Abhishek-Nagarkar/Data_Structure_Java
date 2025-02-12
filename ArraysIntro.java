package Data_Structures_Java;

public class ArraysIntro {
    public static void main(String[] args) {
        // 1. Declaring  an array without initialization
        int[] arr;
        // Notes: same declaration can be written as: int arr[];
        // Q. What would be the output of System.out.println(arr);
        
        // 2. Declaring  an array with initialization
        // int[] arr1 = new int[]; Notes: This also gives error since size must be mentioned when initializing array
        int[] arr1 = new int[1];
        //Q. What would be the output of System.out.println(arr1[0]);
        //Q. Try changing size from 1 to 0 and execute above print statement

        // Notes: Variable name is stored on stack i.e. arr1 will be stored on stack memory
        // While new int[10] will create 10 contiguous int type objects in memory and arr1 will point to object at 0th index
        // ------------------------------------
        //| Stack |      | Heap               |
        //--------       ---------------------
        // arr1 -------> arr1[0] => Suppose at memory location 1000
        //               arr1[1] => Since int datatype thus 4 bytes in size therefore stored at base + size_of_datatype = 1000 + 4 = 1004
        // and so on.....
    }
}
