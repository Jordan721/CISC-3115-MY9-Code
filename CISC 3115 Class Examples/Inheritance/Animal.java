public class Animal {

  private String species;
  private String sound;

  public Animal(String species, String sound ){

    this.species = species;
    this.sound = sound;
  }

  public String getSpecies() {
    return  species;
  }

  public String getSound() {
    return sound;
  }

  public String toString() {
    return "I am a" + species + sound;
  }

  public boolean equals(Object obj) {

    if(!(obj instanceof Animal))
    return false;

    Animal another = (Animal) obj;

    return species.equals(another.species)
    && sound.equals(another.sound);
  }

}
