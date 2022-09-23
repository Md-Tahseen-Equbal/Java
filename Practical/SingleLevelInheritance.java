package Corejava;

class Teacher 
{
  public void teach()
  {
      System.out.println("Teaching Subjects");
  }
}
 

class Student extends Teacher 
{
    public void listen()
    {
        teach();
        System.out.println("Listening To The Subject");
        
    }
}
class Main
{
public static void main(String args[])
{
    Student Obj= new Student();
    Obj.listen();
}
}