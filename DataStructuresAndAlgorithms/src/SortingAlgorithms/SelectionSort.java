package SortingAlgorithms;

public class SelectionSort extends Sorting {

    public void selectionSort(int data[]){
        int length = data.length;
        for(int i=0; i<length-1; i++){
            int minIndex = i;
            for(int j=i+1; j<length; j++){
                if(data[j] < data[minIndex]){
                    minIndex = j;
                }
            }
            int temp = data[i];
            data[i] = data[minIndex];
            data[minIndex] = temp;
        }
    }

    public static void main(String args[]){
        SelectionSort selectionSort = new SelectionSort();

        System.out.println("Unsorted array");
        selectionSort.printArray(data);
        System.out.println("");
        System.out.println("Sorted array");
        selectionSort.selectionSort(data);
        selectionSort.printArray(data);

        //Time complexity for this algorithm is: O(n^2)
    }
}
