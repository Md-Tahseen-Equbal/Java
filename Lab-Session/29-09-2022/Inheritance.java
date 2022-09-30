//Ques1:create a class parent with default constructor and void sing method.print something inside the constructor and method
//Create child class which will inherit the property of parent and has methods void speak and void dance.print something inside the two methods.
//Create another class inheritance and object of class and call all the methods.also mention the type of inheritance on the top of the program.

package Lab;
class Inheritance 

{
    public static void main(String tahseen[])
    //Creating instance of Parent and Child All function.
    {
        VocalAndPhysical Obj = new VocalAndPhysical();
        Obj.sing();
        Obj.speak();
        Obj.dance();
    }
}
