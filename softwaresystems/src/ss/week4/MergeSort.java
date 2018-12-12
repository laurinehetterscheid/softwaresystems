package ss.week4;

import java.util.*;

public class MergeSort {
    
	public static <E extends Comparable<E>> void mergesort(List<E> list) {
		
		List<E> mergeList = new ArrayList<E>();
		
		for (E x: list) {
			mergeList.add(x);
		}
    	
		Comparator<? super E> c = null;
		mergeList.sort(c);
		
		list.clear(); 
		list.addAll(mergeList);
    }
	
}
