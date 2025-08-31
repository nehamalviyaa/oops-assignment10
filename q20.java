
/*Create class Tile to store the edge length of a square tile , and create another class to store
length and width of a rectangular floor. Add method totalTiles(Tile t) in Floor class with Tile 
as argument to calculate the whole number of tiles needed to cover the floor completely.*/
import java.util.Scanner;
class Tile{
    private int edge;
    public Tile(int edge){
        this.edge=edge;

    }
    public int getArea(){
     return edge*edge;
    }
}


class Floor{
    private int length;
    private int width;
    public Floor(int length,int width){
        this.length=length;
        this.width=width;
    }
    public int Totaltiles(Tile t){
        int Floorarea=length*width;
        int Tilearea=t.getArea();

        int NumberOfTiles=Floorarea/Tilearea;
        return NumberOfTiles;
    }
}
class q20{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter edge length of sqaure ");
    int edge=sc.nextInt();
    System.out.println("enter length of floor");
    int length=sc.nextInt();
    System.out.println("enter breadth of floor");
    int width=sc.nextInt();

    // create object of floor 
    Floor f=new Floor(length,width);
    Tile t=new Tile(edge);

     System.out.println("total tiles needed to cover the floor :"+f.Totaltiles(t)); 

    }
}
