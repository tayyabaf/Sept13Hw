package homework3;
//Resources: https://www.youtube.com/watch?v=Ft88V_rDO4I
// https://www.youtube.com/watch?v=6wVmqY-CrGM

public class Main {
    public static void main(String[] args) {
        Pet newPet =new Pet( 2);
   Cat myCat = new Cat();
   myCat.setName("Ginger");

   Dog myDog= new Dog();
   myDog.setName("Spot");
   System.out.println(myCat + "\n" + myDog);
    }
}
