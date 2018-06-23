package sortingalgorithms;

public class MergeSort extends Sorting {

    public void merge(int[] a, int[] aux, int low, int mid, int high){
        for(int i=low; i<=high; i++){
            aux[i] = a[i];
        }

        int i = low;
        int j = mid+1;

        for(int k=low; k<=high; k++){
            if(i > mid){
                a[k] = aux[j++];
            }else if(j > high){
                a[k] = aux[i++];
            }else if(a[i] > a[j]){
                a[k] = aux[j++];
            }else{
                a[k] = aux[i++];
            }
        }
    }

    public void sort(int[] a, int[] aux, int low, int high){
        if(low >= high){
            return;
        }
        int mid = low + (high - low)/2;
        sort(a, aux, low, mid);
        sort(a, aux,mid+1, high);
        merge(a, aux, low, mid, high);
    }

    public void sort(int[] a){
        int[] aux = new int[a.length];
        sort(a, aux, 0, a.length-1);
    }

    public static void main(String[] args){
        MergeSort mergeSort = new MergeSort();

        System.out.println("Data before sorting:");
        mergeSort.printArray(data);

        System.out.println("");

        System.out.println("Data after sorting");
        mergeSort.sort(data);
        mergeSort.printArray(data);
    }

}
