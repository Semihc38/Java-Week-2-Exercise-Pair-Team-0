package com.techelevator;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {


    /**
     * The main entry point in the application
     * @param args
     */
	
	  static List<Department> departments = new ArrayList<>();
	 static List<Employee>employees = new ArrayList<>();
	 static Map<String,Project>projects=new HashMap<>();
	
	
	
    public static void main(String[] args) {
    

        // create some departments
        createDepartments();

        // print each department by name
        printDepartments();

        // create employees
        createEmployees();

        // give Angie a 10% raise, she is doing a great job!

        // print all employees
        printEmployees();

        // create the TEams project
        createTeamsProject();
        // create the Marketing Landing Page Project
        
        
        createLandingPageProject();

        // print each project name and the total number of employees on the project
        printProjectsReport();
        
    }

    /**
     * Create departments and add them to the collection of departments
     */
    private static void createDepartments() {
    	Department marketing =new Department(001,"Marketing");
    	Department sales=new Department(002,"Sales");
    	Department engineering=new Department(003,"Engineering");
    	
    	
    	departments.add(marketing);
    	departments.add(sales);
    	departments.add(engineering);
    
    	
   
    }

    /**
     * Print out each department in the collection.
     */
    private static void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");
        for(Department each:departments) {
        	System.out.println(each.getName());
        }

    }

    /**
     * Create employees and add them to the collection of employees
     */
    private static void createEmployees() {
    	Employee employee1=new Employee();
    	Employee employee2=new Employee("Angie","Smith", "asmith@teams.com",departments.get(2),"08/21/2020",002);
    	Employee employee3=new Employee("Margaret","Thompson","mthompson@teams.com", departments.get(0),"08/21/2020",003);
    	
    	employee1.setFirstName("Dean");
    	employee1.setLastName("Johnson");
    	employee1.setDepartment(departments.get(2));
    	employee1.setEmail("djohnson@teams.com");
    	employee1.setEmployeeId(001);
    	employee1.setHireDate("08/21/2020");
    	
    	
    	employees.add(employee1);
    	employees.add(employee2);
    	employees.add(employee3);
    	employee2.setSalary(employee2.raiseSalary(10));
    	
    
    }

    /**
     * Print out each employee in the collection.
     */
    private static void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");
        
        //Johnson, Dean (60000.0) Engineering
       // Smith, Angie (66000.0) Engineering
       // Thompson, Margaret (60000.0) Marketing
        NumberFormat currency = NumberFormat.getCurrencyInstance();
       
        
        for(int i=0; i<employees.size();i++) {
        	System.out.println(employees.get(i).getFullName()+" "
        			+ "("+currency.format(employees.get(i).getSalary())+") "
        			+employees.get(i).getDepartment().getName());
        
        }

    }

	/**
     * Create the 'TEams' project.
     */
    private static void createTeamsProject() {
    	LocalDate startDate=LocalDate.now();
    	LocalDate endDate=LocalDate.now().plusDays(30);
    	Project project=new Project("TEams", "Project Management Software",startDate,endDate);
        
        List<Employee>emp=new ArrayList<>();
        for(Employee each:employees) {
        	if(each.getDepartment().equals(departments.get(2))) {
        		emp.add(each);
        	}
        }
        project.setTeamMembers(emp);
        projects.put(project.getName(), project);
        
        
    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private static void createLandingPageProject() {
    	LocalDate startDate=LocalDate.now().plusDays(31);
    	LocalDate endDate=LocalDate.now().plusDays(31).plusDays(7);
    	

    	Project project=new Project("Marketing Landing Page", "Lead Capture Landing Page for Marketing", startDate,endDate);
        
        
        List<Employee>emp=new ArrayList<>();
        for(Employee e:employees) {
        	if(e.getDepartment().equals(departments.get(0))) {
        		emp.add(e);
        	}
        }
        project.setTeamMembers(emp);
        projects.put(project.getName(), project);
       
    }

    /**
     * Print out each project in the collection.
     */
    private static void printProjectsReport() {
    	System.out.println("\n------------- PROJECTS ------------------------------");
        
    	for(Map.Entry<String, Project > entry: projects.entrySet()) {
        	System.out.println(entry.getKey()+": "+entry.getValue().getTeamMembers().size() );
        }
       

        
        
        
        
    }

}
