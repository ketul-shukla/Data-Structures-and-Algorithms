package sortingalgorithms;

public class InsertionSort extends Sorting {

    /* Version 1:
    public void insertionSort(int data[]){
        int length = data.length;
        for(int i=1; i<length; i++){
            int key = data[i];
            int j = i-1;

            while(j>=0 && data[j] > key){
                data[j+1] = data[j];
                j = j-1;
            }
            data[j+1] = key;
        }
    }
    */

    // version 2: Easy Implementation:
    public void insertionSort(int[] data){
        int length = data.length;
        for(int i = 0; i<length; i++){
            for(int j=i; j>0; j--){
                if(data[j] < data[j-1]){
                    int temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }else{
                    break;
                }
            }
        }
    }

    public static void main(String args[]){
        InsertionSort insertionSort = new InsertionSort();

        System.out.println("Unsorted array:");
        insertionSort.printArray(data);
        System.out.println("");
        System.out.println("Sorted Array:");
        insertionSort.insertionSort(data);
        insertionSort.printArray(data);

        //Time Complexity of this algorithm is: O(n^2)
    }
}
