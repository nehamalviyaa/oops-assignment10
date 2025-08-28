/*Create a class to calculate Area of circle with one data member to store the radius and another to 
store area value. Create method members 
init - to input radius from user 
calc - to calculate area 
display- to display area*/
import java.util.Scanner;
class CalculateArea{
    private int radius;
    private double area;
 public CalculateArea(){

 }  
 public CalculateArea(int radius,double area){
    this.radius=radius;
    this.area=area;
 }
 public double getArea(int radius){
   this.radius=radius;
    this.area=3.14*this.radius*this.radius;
    return this.area;
     }
     public void display(){
        System.out.println("Area of circle :"+this.area);
     }
}
class MainTest{
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the radius ");
     int r=sc.nextInt();
     //creating object
     CalculateArea obj=new CalculateArea();
   
     obj.getArea(r);
     obj.display();

    }
}