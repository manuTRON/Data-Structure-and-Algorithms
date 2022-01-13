package sorting;
/**
Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
<p>Example: <br>
<p>First Pass: <br>
( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.<br> 
( 1 5 4 2 8 ) –>  ( 1 4 5 2 8 ), Swap since 5 > 4 <br>
( 1 4 5 2 8 ) –>  ( 1 4 2 5 8 ), Swap since 5 > 2 <br>
( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.<br>
<p>Second Pass: <br>
( 1 4 2 5 8 ) –> ( 1 4 2 5 8 )<br> 
( 1 4 2 5 8 ) –> ( 1 2 4 5 8 ), Swap since 4 > 2<br> 
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )<br>
( 1 2 4 5 8 ) –>  ( 1 2 4 5 8 )<br>
<p>Now, the array is already sorted, but our algorithm does not know if it is completed. The algorithm needs one whole pass without any swap to know it is sorted.
<p>Third Pass: <br>
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )<br> 
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )<br>
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )<br>
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )<br>
 *
 */
public interface BubbleSort {
	//bubble sort implementation (Generic)
	static <T extends Comparable<? super T>> void bubbleSort(T[] array) {		
		T temp;
		boolean isSwap;       //this variable monitor if swaps done in current pass
		int maxIndex = array.length-1;
		while(maxIndex > 0) {
			isSwap=false;
			for(int i=0 ; i < maxIndex; i++) {
				if(array[i].compareTo(array[i+1]) > 0) {  // swap if current element is grater than next element
					temp = array[i];
					array[i]=array[i+1];
					array[i+1]=temp;
					isSwap=true;
				}
			}	
			// if no swaps done that means array is already sorted so no need to continue execution
			if (!isSwap) {
				return;		
			}
			maxIndex--;
		}
	}
	
	//this is a overloaded function and can be used for both ascending order and descending order
	static <T extends Comparable<? super T>> void bubbleSort(T[] array,boolean descending) {
		//if descending = false run the above function for ascending sort and return
		if(!descending) {
			bubbleSort(array);
			return;
		}
		
		T temp;
		boolean isSwap=false;     //this variable monitor if swaps done in current pass
		int maxIndex = array.length-1;
		
		while(maxIndex > 0) {
			for(int i=0 ; i < maxIndex; i++) {
				if(array[i].compareTo(array[i+1]) < 0) {    // swap if current element is smaller than next element
					temp = array[i];
					array[i]=array[i+1];
					array[i+1]=temp;
					isSwap=true;
				}
			}	
			// if no swaps done that means array is already sorted so no need to continue execution
			if (!isSwap)
				return;			
			maxIndex--;
		}
	}
	
}
