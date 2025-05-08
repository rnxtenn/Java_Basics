package Java_Basics;

class parent{
    public parent(){ // non parameterised Constructor
        System.out.println("Parent class Called");
    }
    public parent(int y){
        System.out.println("parent class Parameterised Constructor");
    }
}
class child extends parent{
    public child(){
        System.out.println("child class Called");
    }
    public child(int x){
        super(4);
        System.out.println("child class parameterised constructor");
    }
}


public class Inheritance_Example {
    public static void main(String[] args){
        child c = new child(7);
    }
}
