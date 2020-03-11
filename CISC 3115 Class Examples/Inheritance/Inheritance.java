public class Inheritance {

  public static void main(String[] args) {

    Dog d = new Dog("Husky");

    Animal a = new Dog("Lab"); //upcast will always work

    //ERROR:Animal doesen't neccessarily have a breed
    System.out.println(a.getBreed());

    System.out.println(a);

    Dog dog = (Dog) a; //downcast doesn't always work

    System.out.println(dog.getBreed());


    Animal[] animals = new Animal[4];

    animals[0] = new Animal("Cat", "Meow");

    animals[1] = new Dog("Poodle");

    animals[2] = new Dog("Lab");

    animals[3] = new Animal("Bird", "Chirp");

    printAllAnimals(animals);

    // dog is a two string methods

    //Dog dog = a;
    //Will cause an ERROR

  }

  public static void printAllAnimals(Animal[] a) {

    for (int i = 0; i < a.length; i++)
      System.out.println(a[i]);
  }
}
