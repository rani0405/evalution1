package testing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] employeeNames = {
			    "Alice", "Bob", "Charlie", "Alice", "David", "Bob", "Eve",
			    "Charlie", "Alice", "Frank", "Grace", "Bob"
			};

      List<String>employeeList=new ArrayList<>();
      System.out.println("Total Entries:"+employeeList.size());
      System.out.println("Employee List:"+employeeList);
      
      //2.
      Set<String>employeeSet=new HashSet<>();
      employeeSet.add("Alice");
      employeeSet.add("Bob");
      employeeSet.add("Charlie");
      employeeSet.add("Alice");
      employeeSet.add("David");
      employeeSet.add("Bob");
      employeeSet.add("Eve");
      employeeSet.add("Charlie");
      employeeSet.add("Alice");
      employeeSet.add("Frank");
      employeeSet.add("Grace");
      employeeSet.add("Bob");
      System.out.println("Unique Employees:");
      for(String name:employeeSet) {
    	  System.out.println(name);
      }
	Map<String,Integer> employeeCount=new HashMap<>();
	for(String name:employeeNames) {
		if(employeeCount.containsKey(name)) {
			employeeCount.put(name, employeeCount.get(name)+1);
		}else {
			employeeCount.put(name, 1);
		}
	}
	System.out.println("Employee Frequency:");
	
	for(Map.Entry<String,Integer>entry:employeeCount.entrySet()) {
		System.out.println(entry.getKey()+":"+entry.getValue());
	}
	}
}