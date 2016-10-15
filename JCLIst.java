import java.util.ArrayList;
import java.util.List;

public class JCLIst {

	//Array List is like a dynamic array
	public static void main(String[] args) {
		ArrayList<Integer> somenumbers = new ArrayList<Integer>();
		
		somenumbers.add(10);
		somenumbers.add(100);
		somenumbers.add(40);
		
		//This gets the first in the array list
		System.out.println(somenumbers.get(0));
		
		System.out.println("Iteration #1: ");
		
		for (int i = 0; i < somenumbers.size(); i++) {
			System.out.println(somenumbers.get(i));
		}
		
		
		somenumbers.remove(somenumbers.size() -1);
		
		somenumbers.remove(0);
		
		System.out.println("Iteration #2: ");
		for (Integer value : somenumbers) {
			System.out.println(value);
		}
		
		List<String> values = new ArrayList<String>();

	}

}
