package WEEK_9;

public class Animal {
    public String species;
    public void makeSound(){};

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.makeSound();
    }
}

 class Bird extends Animal{
    public String featherColor;

    @Override
    public void makeSound(){
        System.out.println("bird song");
    }
 }

