/*Create a class MathOperation containing method ‘multiply’ to calculate multiplication of 
following arguments. 
two integers 
three float 
all elements of array 
one double and one integer*/
import java.util.Scanner;
class MathOperation{
  public int Multiply(int x, int y){
    return (x*y);
  }
  public double Multiply(float x,float y,float z) {
    return(x*y*z);
  } 
  public int Multiply(int ar[]){
    int mul=1;
    for(int i=0;i<ar.length;i++){
        mul=mul*ar[i];

    }return mul;
  }
  public double Multiply(double x,int y){
    return (x*y);
  }
}

class Maintest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ar[]={1,2,3,4};
        MathOperation m1=new MathOperation();
       System.out.println(" multiply of two integers :" +m1.Multiply(12,15));
       System.out.println(" miltiplicationof three float numbers :" +m1.Multiply(12.5f,10.4f,11.4f));
        System.out.println(" multiplication of array elements :" +m1.Multiply(ar));
        System.out.println(" multiplication of one double and one float :" +m1.Multiply(15.3d,10));
    }
}