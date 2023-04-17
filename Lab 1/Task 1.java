// Task#01 :Implement linear search on 1D and 2D array.
// LinearSearch1D(int[] A,int key)
// LinearSearch2D(int[][] A, int key)
// call methods and show the search result

public class Task_1_LinearSearch {
    public static int linearSearch1D(int[] array,int target){
        for(int i=0;i<array.length;i++){
            if(array[i]==target)return i;
        }
        return -1;
    }
    public static void linearSearch2D(int[][] array,int target){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(array[i][j]==target){
                    System.out.println("Target found at ("+i+","+j+")");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array={1,5,9,0,10,-6,18};
        int[][] array2={{1,2},{3,4},{0,-1},{9,7},{5,15}};
        int index=linearSearch1D(array,10);
        System.out.println("Linear Search in 1D array");
        if(index>=0) System.out.println("Target found at index "+index);
        else System.out.println("Target not found");
        System.out.println("Linear Search in 2D array");
        linearSearch2D(array2,4);
    }
}

