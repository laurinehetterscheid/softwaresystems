package tutorials;

import java.util.*;

public class TutorialList {

	public static void main(String[] args) {
		String[] groceries = {"eggs", "milk", "butter", "flour"};
		List<String> groceryList = new ArrayList<String>();
		
		//add array items (groceries) to (grocery) list
		for (String x: groceries) {
			groceryList.add(x);
		}
		
		String[] moreGroceries = {"bread", "jam", "salami", "cheese", "milk"};
		List<String> moreGroceryList = new ArrayList<String>();
		
		//add array items (moreGroceries) to (moreGrocery) list
		for (String y: moreGroceries) {
			moreGroceryList.add(y);
		}
		
		//print out groceryList
		for(int i = 0; i < groceryList.size(); i++) {
			System.out.printf("%s ", groceryList.get(i));
		}
		
		editList(groceryList, moreGroceryList);
		System.out.println();
		
		//print out groceryList
		for(int i = 0; i < groceryList.size(); i++) {
			System.out.printf("%s ", groceryList.get(i));
		}
		
		
	}
	
	//takes out extra groceries (items that are in both lists)
	public static void editList(Collection<String> list1, Collection<String> list2) {
		
		//Iterator (imported) goes through each list item by item
		Iterator<String> it = list1.iterator();
		
		//loop through until you reach the end of the list (while I have something next to go to)
		while (it.hasNext()) {
			if( list2.contains(it.next())) {
				it.remove();
			}
		}	
		
	}
	
}
