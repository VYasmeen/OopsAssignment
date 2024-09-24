package com.exercise4_2;
public class Person {
    private String name; 
    private String address; 
    
    public Person() {
        this.name = "Unknown";
        this.address = "Unknown";
    }
   
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
   
    public String getName() {
        return name;
    }
   
    public String getAddress() {
        return address;
    }

   @Override
    public String toString() {
        return "Person: name=" + name + ", address=" + address;
    }
}

  public class Staff extends Person {
    private String title; 
    private double salary; 
    
    public Staff() {
        super(); 
        this.title = "Unknown";
        this.salary = 0.0;
    }
    
    public Staff(String name, String address, String title, double salary) {
        super(name, address); 
        this.title = title;
        this.salary = salary;
    }
   
    public String getTitle() {
        return title;
    }
    
    public double getSalary() {
        return salary;
    }
   
    @Override
    public String toString() {
        return "Staff: " + super.toString() + ", title=" + title + ", salary=" + salary;
    }
}
  public class Student extends Person {
    private String program; 
    private int year; 
   
    public Student() {
        super(); 
        this.program = "Unknown";
        this.year = 1;
    }
   
    public Student(String name, String address, String program, int year) {
        super(name, address); 
        this.program = program;
        this.year = year;
    }
    public String getProgram() {
        return program;
    }
   
    public int getYear() {
        return year;
    }
   
    @Override
    public String toString() {
        return "Student: " + super.toString() + ", program=" + program + ", year=" + year;
    }
}
public class Test {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("Alice", "123 Main St", "Computer Science", 3);
        System.out.println(student);
        // Create a Staff object
        Staff staff = new Staff("Bob", "456 Elm St", "Professor", 75000);
        System.out.println(staff);
    }
}
  
  
    
   
