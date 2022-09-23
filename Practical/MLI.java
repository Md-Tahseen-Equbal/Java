package Corejava;

class LevelOne 
{
  public void first()
  {
      System.out.println("I'm Method Of The Class LevelOne");
  }
}
class LevelTwo extends LevelOne 
{
    public void second()
    {
        System.out.println("I'm Method Of The Class LevelTwo");
    }
}
class LevelThree extends LevelTwo
{
    public void Third()
    {
        first();
        second();
        System.out.println("I'm Method Of The Class LevelThree");
    }
}
class MLI
{
public static void main(String args[])
{
    LevelThree Obj= new LevelThree();
    Obj.Third();
}
}
