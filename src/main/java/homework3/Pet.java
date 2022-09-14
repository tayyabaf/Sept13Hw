package homework3;

public class Pet {
    public String name;
    public int numberOfPets;

public Pet(){

}
    public Pet(int numberOfPets){
        this.numberOfPets=numberOfPets;

    }
    public String speak() {
        return "grrrr";
    }

    public void setName (String name){
        this.name=name;
    }

    public String getName (){
        return this.name;
    }

    public String toString (){
        String speaker = speak();
        return name +" says " + speaker;
    }
}
