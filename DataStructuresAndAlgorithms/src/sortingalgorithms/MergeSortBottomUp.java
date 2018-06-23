package sortingalgorithms;

public class MergeSortBottomUp extends Sorting {

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

    public void sort(int[] data){
        int N = data.length;
        int[] aux = new int[N];
        for(int sz = 1; sz<N; sz = sz+sz){
            for(int lo = 0; lo< N-sz; lo += sz+sz ){
                merge(data, aux, lo, lo+sz-1, Math.min(lo+sz+sz-1,N-1));
            }
        }
    }

    public static void main(String[] args){
        MergeSortBottomUp mergeSortBottomUp = new MergeSortBottomUp();

        System.out.println("Data before sorting:");
        mergeSortBottomUp.printArray(data);

        System.out.println("");

        System.out.println("Data after sorting");
        mergeSortBottomUp.sort(data);
        mergeSortBottomUp.printArray(data);
    }
}
