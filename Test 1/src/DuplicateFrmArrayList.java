import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateFrmArrayList {

	public static void main(String[] args) {
		 List<String> strList = new ArrayList<String>();
		 strList.add("Steve");
		 strList.add("Jhon");
		 strList.add("Tim");
		 strList.add("Steve");
		 strList.add("Jhon");
		 strList.add("Tim");
		 strList.add("Ken");
		 strList.add("Steve");

		    System.out.println("Duplicates List "+strList);
		    
System.out.println("No.Of Steve Count:"+Collections.frequency(strList, "Steve"));

Set<String> uniqueSet = new HashSet<String>(strList);
for (String temp : uniqueSet) {
	System.out.println(temp + ": " + Collections.frequency(strList, temp));
}
		    /*Object[] st = strList.toArray();
		      for (Object s : st) {
		        if (strList.indexOf(s) != strList.lastIndexOf(s)) {
		        	strList.remove(strList.lastIndexOf(s));
		         }
		      }

		    System.out.println("Distinct List "+strList);*/

	}

	}


