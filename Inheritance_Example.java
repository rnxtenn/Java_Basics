package Java_Basics;

class parent{
    public parent(){
        System.out.println("Parent class Called");
    }
}
class child extends parent{
    public child(){
        System.out.println("child class Called");
    }
}


public class Inheritance_Example {
    public static void main(String[] args){
        child c = new child();
    }
}
