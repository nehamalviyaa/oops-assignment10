/*Make list of Students having name, roll no., age, score.
 Write a program to accept 10 students record and arrange the Students 
 based on the score group [0-50], [50-65],[65-80],[80-100].*/
 import java.util.Scanner;
class Student{
    private String name;
    private int rollno;
    private int age;
    private int score;
    public Student(){}
    public Student(String name,int rollno,int age, int score){
    this.name=name;
    this.rollno=rollno;
    this.age=age;
    this.score=score;    
    }
    //getters
    public String getName(){
        return name;
    }
    public int getRollno(){
        return rollno;
    }public int getAge(){
        return age;
    }public int getScore(){
        return score;
    }
    public String toString(){
    return("Name :   "  +name+  " Roll no :  "  +rollno+  " Age :  "  +age+  "Score :  "  +score);
    }


} 
class MainTest{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

     Student students[]=new Student[5];
      for(int i=0;i<5;i++){
      System.out.println("enter name : rollno : age : score  : "+(i+1)+ "student");
      String name=sc.next();
      int rollno=sc.nextInt();
      int age=sc.nextInt();
      int score=sc.nextInt();
         
      students[i]=new Student(name,rollno,age,score);
      }
       // groups 4
       System.out.println("----------students under group [0-50]-----------");
       for(Student s:students){
        if(s.getScore()>=0 && s.getScore()<=50)
        System.out.println(s);
       }
        // groups 3
       System.out.println("----------students under group [50-65]-----------");
       for(Student s:students){
        if(s.getScore()>50 && s.getScore()<=65)
        System.out.println(s);
       }
    // group 2
       System.out.println("----------students under group[65-80]-----------");
       for(Student s:students){
        if(s.getScore()>65 && s.getScore()<=80)
        System.out.println(s);
       }
        //group 1
  
       System.out.println("----------students under group [80-100]-----------");
       for(Student s:students){
        if(s.getScore()>80 && s.getScore()<=100)
        System.out.println(s);
       }
    }
}