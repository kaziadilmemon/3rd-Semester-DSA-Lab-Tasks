// Implement binarysearch on 1D and 2D array.
// Note: create methods for both 1D and 2D binarysearch
// BinarySearch1D(int[] A,int key, int first, int end) //BinarySearch2D(int[][] A,int key,int first, int end)
// call methods and show the search result

public class Task_2_BinarySearch {
    public static boolean binarySearch1D(int[] array,int target){
        int p=0,q=array.length-1;
        while (p<q){
            int mid=(p+q)/2;
            if(array[mid]==target)return true;
            else if(array[mid]<target)p=mid+1;
            else q=mid-1;
        }
        return false;
    }
    public static boolean binarySearch2D(int[][] array,int target){
        int[] arr=new int[array.length*array[0].length];
        int count=0;
        for (int[] i : array) {
            for (int k : i) {
                arr[count] = k;
                count++;
            }
        }
        return binarySearch1D(arr,target);
    }

    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9};
        int[][] array2={{1,2},{3,4},{5,6},{7,8},{9,10}};
        if(binarySearch1D(array,8)) System.out.println("Target found");
        else System.out.println("Target not found");
        if(binarySearch2D(array2,5)) System.out.println("Target Found");
        else System.out.println("Target not found");
    }
}

