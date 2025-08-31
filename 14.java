/*Create a class MathOperation with two data member X and Y to store the operand and third data 
member R to store result of operation.Create method members 
init - to input X and Y from user 
add - to add X and Y and store in R 
multiply - to multiply X and Y and store in R 
power - to calculate X Y and store in R 
display- to display Result R */
import java.util.Scanner;
class MathOperation{
    private int x;
    private int y;
    private double r;
    public MathOperation(){}
   public void init(int x,int y){
      this.x=x;
      this.y=y;
   }
   public void add(){
      this.r=this.x+this.y;
   }
   public void multiply(){
      this.r=this.x*this.y;
   }
   public void power(){
      this.r=Math.pow(this.x ,this.y);

   }
   public void display(){
    System.out.println("Result :"+this.r);    
   }

}
class MainTest{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter value of x and y");
    int x=sc.nextInt();
    int y=sc.nextInt();
    // creating object...
    MathOperation obj= new MathOperation();
    obj.init(x,y);

    System.out.println("Adding  of two number");
    obj.add();
    obj.display();

    System.out.println("multiplication of two numbers");
    obj.multiply();
    obj.display();

    System.out.println("power  :");
    obj.power();
    obj.display();



    }
}