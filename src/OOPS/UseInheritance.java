package OOPS;

public class UseInheritance extends Object{
    public static void main(String[] args) {
        Animal myAnimal = new Animal("General","Large",50);
        DoAnimalStuff(myAnimal,"Fast");
        Dog dog = new Dog();
        DoAnimalStuff(dog,"Medium");
        Dog myBeagle = new Dog("Wolf",80, "Drop Ear","Swimmer");
        DoAnimalStuff(myBeagle, "slow");

        Fish GoldenFish = new Fish();
        DoAnimalStuff(GoldenFish,"Fast");

        Fish starFish = new Fish();
        DoAnimalStuff(starFish,"Medium");
    }
    public static void DoAnimalStuff(Animal animal,String speed){
        animal.move(speed);
        animal.makeNoise();
        System.out.println(animal);
        System.out.println("_____");
    }
}
