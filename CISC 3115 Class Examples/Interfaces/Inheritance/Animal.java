public class Animal{

  private String species;
  private String sound;

  public Animal(String species, String sound){

    this.species = species;
    this.sound = sound;
  }

  public String getSpecies(){
    return  species;
  }

  public String getSound(){
    return sound;
  }

  public String toString(){
    return "I am a" + species + sound;
  }

}
