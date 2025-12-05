package org.java.encapsulation;

public class Employee {

    private String name;
    private int age;
    private double salary;

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name=newName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age>18){
            this.age=age;
        }
        else{
            System.out.println("Age must be greater than 18");
        }
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        if(salary>0){
            this.salary=salary;
        }
        else{
            System.out.println(" Salary should not be nagative");
        }

    }
}
