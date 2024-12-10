package inheritance;

public class Employee {
String EmployeeName;
int Age;
double Salary;
double Bonus;
	public Employee(String EmployeeName, int Age, double Salary)
	{
	this.EmployeeName=EmployeeName;
	this.Age=Age;
	this.Salary=Salary;
	this.Bonus=0;
	}
	public void DisplayBonus()
	{		
		System.out.println("Employees bonus amount: "+Bonus);
	}
	
}
class Developers extends Employee
{
String DevWork;
	public Developers(String EmployeeName, int Age, double Salary, String DevWork) {
		super(EmployeeName, Age, Salary);
		this.DevWork=DevWork;
	}
	public void DeveloperDetails()
	{
		System.out.println("Name of the employee: " + EmployeeName +", age: " + Age + " ,Salary: " + Salary + ", Work of developers: " +DevWork);
		DisplayBonus();
	}
}
class QA extends Employee
{
String QAWork;
	public QA(String EmployeeName, int Age, double Salary, String QAWork)
	{
		super(EmployeeName, Age, Salary);
		this.QAWork=QAWork;
	}
	public void QADetails()
	{
		System.out.println("Name of the employee: " + EmployeeName +", age: " + Age + " ,Salary: " + Salary + ", Work of developers: " +QAWork);
		DisplayBonus();
	}
}


