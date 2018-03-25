package SortingAlgorithms;

public class InsertionSort extends Sorting {

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

    public static void main(String args[]){
        InsertionSort insertionSort = new InsertionSort();

        System.out.println("Unsorted array:");
        insertionSort.printArray(data);
        System.out.println("");
        System.out.println("Sorted Array:");
        insertionSort.insertionSort(data);
        insertionSort.printArray(data);
    }
}
