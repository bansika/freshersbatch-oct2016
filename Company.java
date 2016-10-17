class Employee{
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary){
		this.id=id;
		this.name = name;
		this.salary = salary;
	}
	
	public double getsalary(){
		return this.salary;
	}
}

class Manager extends Employee{
	private double incentive;
	
	public Manager(int id,String name,double salary,double incentive){
		super(id,name,salary);
		this.incentive = incentive;
	}
	
	public double getsalary()
	{
		return super.getsalary() + this.incentive;
	}
	
}

class Labour extends Employee{
	private double overtime;
	
	public Labour(int id,String name,double salary,double overtime){
		super(id,name,salary);
		this.overtime = overtime;
	}
	
	public double getsalary()
	{
		return super.getsalary() + this.overtime;
	}
}

public class Company{
	public static void main(String args[]){
		Employee e[] = new Employee[3];
		e[0] = new Labour(1001,"bansika" , 10000,200);
		e[1] = new Manager(102,"ravindra" , 20000,400);
		e[2] = new Labour(103,"hemant" , 15000,1800);
		double res = gettotalsalary(e);
		System.out.print("Total salary: "+res);
		
	}
	
	public static double gettotalsalary(Employee e[]){
		double sum = 0;
		for(int i = 0 ;i<e.length;i++){
			sum+=e[i].getsalary();
		}
		
		return sum;
	}
}