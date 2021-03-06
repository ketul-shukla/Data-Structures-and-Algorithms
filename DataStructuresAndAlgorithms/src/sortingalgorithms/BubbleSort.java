package sortingalgorithms;

public class BubbleSort extends Sorting {

    public void bubbleSort(int data[]){
        int length = data.length;
        for(int i=0; i<length-1; i++){
            for(int j=0; j<length-i-1; j++){
                if(data[j+1] < data[j]){
                    int temp = data[j+1];
                    data[j+1] = data[j];
                    data[j] = temp;
                }
            }
        }
    }

    public static void main(String args[]){
        BubbleSort bubbleSort = new BubbleSort();

        System.out.println("Unsorted Array");
        bubbleSort.printArray(data);
        System.out.println("");
        System.out.println("Sorted Array");
        bubbleSort.bubbleSort(data);
        bubbleSort.printArray(data);

        //Time Complexity of this algorithm is: O(n^2)
    }
}
