package com.langfundamentals.constructors;
//parameterized constructor
public class Employee {
	int empId;
    String empName;
    double salary;
    String department;
    
    Employee(){
    	System.out.println("No arg constructor");
    	empId=1;
    	empName="abc";
    	salary=10000.0;
    	department="java";
    }
    Employee(int empId){
    	this.empId=empId;
    }
    Employee(double salary){
    	this.salary=salary;
    }
    Employee(String department){
    	this.department=department;
    }
    Employee(String empName,String department){
    	this.empName=empName;
    	this.department=department;
    }
    Employee(int empId,String empName){
    	this.empId=empId;
    	this.empName=empName;
    }
    Employee(int empId,String empName,double salary){
    	this.empId=empId;
    	this.empName=empName;
    	this.salary=salary;
    }
    Employee(int empId,String empName,double salary,String department){
    	this.empId=empId;
    	this.empName=empName;
    	this.salary=salary;
    	this.department=department;
    }
    Employee(float salary){
    	this.salary=(int)salary;
    }
    Employee(int empId,float salary){
    	this.empId=empId;
    	this.salary=(int)salary;
    }
    
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.display();
		Employee e2=new Employee(12);
		e2.display();
		Employee e3=new Employee(2300.00);
		e3.display();
		Employee e4=new Employee("cse");
		e4.display();
		Employee e5=new Employee("cde","ece");
		e5.display();
		Employee e6=new Employee(13,"hij");
		e6.display();
		Employee e7=new Employee(23,"klm",34500.0);
		e7.display();
		Employee e8=new Employee(14,"xyz",2300.0,"eee");
		e8.display();
		Employee e9=new Employee(345.9);
		e9.display();
		Employee e10=new Employee(2,37);
		e10.display();
		
	}
	
	void display() {
		System.out.println("Employee Id is: "+empId);
		System.out.println("Employee name : "+empName);
		System.out.println("salary: "+salary);
		System.out.println("department: "+department);
        System.out.println("----------------------------");

	}
}
