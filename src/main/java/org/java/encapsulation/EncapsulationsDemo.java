package org.java.encapsulation;

public class EncapsulationsDemo {
    public static void main(String[] args){
        Employee emp=new Employee();

        emp.setName("Ram Kumar");
        emp.setAge(30);
        emp.setSalary(75000);

        System.out.println("Employee details: ");
        System.out.println("Name: "+emp.getName());
        System.out.println("Age: "+ emp.getAge());
        System.out.println("Salary: "+ emp.getSalary());
    }
}
