
import java.util.HashSet;

import java.util.Set;


public class ListObjEx {

	public static void main(String[] args) throws Exception {
		Set<Employee> EmpSet = new HashSet<Employee>();
		EmpSet.add(new Employee(101,"Nandhini",6000));
		EmpSet.add(new Employee(102,"Aman",9000));
		EmpSet.add(new Employee(103,"Nakshatra",5000));
		EmpSet.add(new Employee(104,"Vihaan",5000));
		
		EmpSet.add(new Employee(101,"Nandhini",6000));
		EmpSet.add(new Employee(102,"Aman",9000));
		EmpSet.add(new Employee(103,"Nakshatra",5000));
		EmpSet.add(new Employee(104,"Vihaan",5000));
		
		System.out.println("List:"+ EmpSet);
		if(EmpSet.contains((new Employee(104,"Vihaan",5000)))){
			System.out.println("Found");
		}
			else {
				System.out.println("NotFound");
			}
			}
		
	}


