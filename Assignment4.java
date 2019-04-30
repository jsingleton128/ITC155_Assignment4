import java.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Assignment4 {

	public static void main(String[] args) {
		Map<String, String> names1 = new HashMap<String, String>();
		names1.put("Marty", "Stepp");
		names1.put("Stuart", "Reges");
		names1.put("Jessica", "Miller");
		names1.put("Amanda", "Camp");
		names1.put("Hal", "Perkins");

		Map<String, String> names2 = new HashMap<String, String>();
		names2.put("Kendrick", "Perkins");
		names2.put("Stuart", "Reges");
		names2.put("Jessica", "Miller");
		names2.put("Bruce", "Reges");
		names2.put("Hal", "Perkins");
		names2.put("Shaun", "Vance");
		
		System.out.println(isUnique(names1));
		System.out.println(isUnique(names2));
	}

	public static boolean isUnique(Map<String, String> list) {
		ArrayList<String> test = new ArrayList<>();
		Collection<String> surnames = list.values();
		for(String i: surnames) {
			if(!test.contains(i)) {
				test.add(i);}}
			if(test.size() == surnames.size()) {
				return true;
			} return false;
			
		} 
		
	}


