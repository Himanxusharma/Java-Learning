package Misc;

// Java code to explain cloning
// issue with singleton

class SuperClass implements Cloneable {

    int i = 10;

    @Override
    protected Object clone()
            throws CloneNotSupportedException {
            return super.clone(); //By this we can break and clone the singleton instance.
        //throw new CloneNotSupportedException(); //by this we can prevent from clonneable.
    }
}

// Singleton class
class Singleton extends SuperClass {
    // public instance initialized when loading the class
    public static Singleton instance = new Singleton();

    private Singleton() {
        // private constructor
    }
}

public class SingletonPreventClone {
    public static void main(String[] args)
            throws CloneNotSupportedException {
        Singleton instance1 = Singleton.instance;
        Singleton instance2 = (Singleton) instance1.clone();
        System.out.println("instance1 hashCode:- "
                + instance1.hashCode());
        System.out.println("instance2 hashCode:- "
                + instance2.hashCode());
    }
}
