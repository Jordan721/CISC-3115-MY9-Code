public class Inheritance
{

   public static void main(String[] args) {

     Dog d = new Dog("Husky");

     Animal a = ne Dog("Lab"); //upcast

      //ERROR:Animal doesen't neccessarily have a breed
     System.out.println(a.getBreed());

     System.out.println(a);

   }
}
