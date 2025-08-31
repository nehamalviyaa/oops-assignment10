/*Create a class Person with properties (name and age) with following features.

Default age of person should be 18.

A person object can be initialized with name and age.

Method to display name and age of person*/
import java.util.Scanner;
class Person{
private String name;
private int age;
public Person(){
}
public void data(String name, int age){
    this.name=name;
    if(age<=0)
    this.age=18;
    else
    this.age=age;
}
public void display(){
    System.out.println("Name of person :"+this.name);
    System.out.println("Age of person :"+this.age);
}   
}
class Main{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter name of person");
    String name=sc.nextLine();
    System.out.println("enter age of person(use 0 for default age)");
    int age=sc.nextInt();


    Person p=new Person();
    
    p.data(name,age);
    p.display();


    }
}