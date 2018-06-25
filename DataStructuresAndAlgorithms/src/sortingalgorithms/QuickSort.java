package sortingalgorithms;

public class QuickSort extends Sorting {

    public int partition(int[] data, int low, int high){
        int i = low;
        int j = high +1;
        while(true){
            while(data[++i] < data[low]){
                if(i == high) {
                    break;
                }
            }
            while(data[low] < data[--j]){
                if(j == low){
                    break;
                }
            }
            if(i>=j){
                break;
            }
            int temp = data[i];
            data[i] = data[j];
            data[j] = temp;
        }
        int newTemp =  data[low];
        data[low] = data[j];
        data[j] = newTemp;
        return j;
    }

    public void sort(int[] data){
        sort(data, 0, data.length -1);
    }

    public void sort(int[] data, int low, int high){
        if(low >= high){
            return;
        }
        int j = partition(data, low, high);
        sort(data, 0, j);
        sort(data, j+1, high);
    }

    public static void main(String[] args){
        QuickSort quickSort = new QuickSort();

        System.out.println("Data before sorting:");
        quickSort.printArray(data);

        System.out.println("");

        System.out.println("Data after sorting");
        quickSort.sort(data);
        quickSort.printArray(data);

    }
}
