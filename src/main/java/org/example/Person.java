package org.example;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private boolean isMarried;
    private double salary;
    private double tax;

public Person(String firstName,String lastName,int age){
    this.firstName=firstName;
   this.lastName=lastName;
   this.age=age;
}

public Person(String firstName,String lastName,int age,double tax,boolean isMarried,double salary)
{
  this(firstName,lastName,age);
    this.tax=tax;
    this.salary=salary;
    this.isMarried=isMarried;
}

    public String getFirstName() {
        return firstName;
    }
    public String getLastName () {
        return lastName;
    }
    public int getAge () {
        return age;
    }
    public boolean isTeen(){

        return age >= 13 && age < 19 ? true : false;


    }
}
