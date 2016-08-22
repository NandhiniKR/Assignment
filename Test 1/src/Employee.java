

public class Employee  {
public int EmpNo;
public String EmpName;
public int EmpSalary;


@Override
public String toString() {
	String ToString = "EmpNo:" +this.EmpNo+"   EmpName:" + this.EmpName.toString()+ "  EmpSalary:"+this.EmpSalary;
	return ToString;
}
public Employee(int empNo, String empName, int empSalary) {
	super();
	EmpNo = empNo;
	EmpName = empName;
	EmpSalary = empSalary;
}
public int getEmpNo() {
	return EmpNo;
}

public String getEmpName() {
	return EmpName;
}
public int getEmpSalary() {
	return EmpSalary;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (EmpName == null) {
		if (other.EmpName != null)
			return false;
	} else if (!EmpName.equals(other.EmpName))
		return false;
	if (EmpNo != other.EmpNo)
		return false;
	if (EmpSalary != other.EmpSalary)
		return false;
	return true;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((EmpName == null) ? 0 : EmpName.hashCode());
	result = prime * result + EmpNo;
	result = prime * result + EmpSalary;
	return result;
	
}

}



