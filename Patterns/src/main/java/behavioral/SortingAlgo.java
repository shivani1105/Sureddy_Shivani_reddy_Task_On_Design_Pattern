package behavioral;

public abstract class SortingAlgo {
	
	public void sortingTemplate(int[] data){
	      selectionSort(data);
	      mergeSort(data);
	   }
	   public abstract void selectionSort(int[] data);
	   public abstract void mergeSort(int[] data);
	}