/*Create class Product (pid, price, quantity) with parameterized constructor.Create a main function 
in different class (say XYZ) and perform following task:

Accept five product information from user and store in an array

Find Pid of product with highest price.

Create method (with array of product’s object as argument) in XYZ class to calculate
 and return total amount spent on all products. (amount spent on single product=price

  of product * quantity of product).*/
  import java.util.Scanner;
  class Product{
    private int pid;
    private double price;
    private int quantity;
    public Product(){}
    public Product(int pid,double price, int quantity){
      this.pid=pid;
      this.price=price;
      this.quantity=quantity;  
    } 
    //getters for all variables
    public int getPid(){
        return pid;
    }
    public double getPrice(){
        return price;
    }
    public double getAmount(){
        return price*quantity;
    }

  }
  class XYZ{
    public static double calculate(Product []products){
        double total=0;
        for(Product p: products){
            total +=p.getAmount();
        }
        return total;
    }

  }
  class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //create array
        
        Product products[]=new Product[5];
            for(int i=0;i<5;i++){
         System.out.println("enter pid,price,quantity of product"+i+1);
             int pid=sc.nextInt();
             double price=sc.nextDouble();
             int quantity=sc.nextInt();

             products[i]=new Product(pid,price,quantity);
            }
            // highest price of pid found
            double maxprice=products[0].getPrice();
            int pidwithmaxprice=products[0].getPid();
 
             for(int i=1;i<products.length;i++){
                if(products[i].getPrice()>maxprice){
                  maxprice=products[i].getPrice();
                    pidwithmaxprice=products[i].getPid();
                }
                System.out.println("pid with highest price :"+pidwithmaxprice);
             }
             //calculate total price
             //XYZ xyz = new XYZ();
             double TotalAmount=XYZ.calculate(products);
                System.out.println("Total amount spent on all products :"+TotalAmount);
             
    }
  }

            

        
         

    