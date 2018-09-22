
public class SelectionSort implements SortingAlgorithm{
	public void sort(int [] a){
		for(int i = 0; i < a.length-1; i++){
			int minIndex = i;
			for(int j = i+1; j < a.length; j++){
				if(a[j] < a[minIndex]){
					minIndex = j;
				}
			}
			int temp = a[minIndex];
			a[minIndex] = a[i];
			a[i] = temp;
		}
	}
}