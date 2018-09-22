
public class InsertionSort implements SortingAlgorithm{
	public void sort(int [] a){
		for(int i = 1; i < a.length; i++){
            int pivot = a[i];
            int j = i-1;
 
            while(j >= 0 && a[j] > pivot){
                a[j+1] = a[j];
                j = j-1;
            }
            a[j+1] = pivot;
        }
	}
}