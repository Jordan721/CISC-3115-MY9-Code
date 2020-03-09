public class Dog extends Animal {

  private String breed;

  public Dog(String breed) {

    super("dog", "woof");
    this.breed = breed;

  }

  public String getBreed(){
    return breed;
  }

  public String toString() {

    return "I am a " + breed+ " and I say " + getsound();
  }

  public boolean equals(Object obj){

    if(! (obj instanceof Dog))
    return false;

    Dog another = (Dog)obj;
  }

  public static void main(String[] args) {

    Dog d = new Dog("Husky");

    System.out.println(d);

    d.getSpecies();

  }

}
