package homework2;

public class Greeting {
    public static void greeting(String name){
        if (name == "Alice" || name == "Bob"){
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("Hello!");
        }

    }

    public static void main(String[] args){
        greeting("Julianna");
        greeting ("Bob");
        greeting ("Susan");
        greeting ("Alice");
        greeting ("John");
    }
}
