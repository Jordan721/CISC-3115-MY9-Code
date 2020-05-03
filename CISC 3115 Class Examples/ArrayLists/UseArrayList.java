import java.util.*;

public class UseArrayList {


  public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<Integer>();

    //ArrayList<Integer> list = new ArrayList<>();

    for(int i=1; i<=10; i++)
    list.add(i);

    System.out.println(list);
    
  }

  private static void doubleList(ArrayList<Integer> list)
  {
    for(int i=0; i<list.size(); i++) {
      int oldValue = list.get(i);
      list.set(i, oldValue*2);

    }

  }

}


/*

primitive           wrapper class

int         Integer
double        Double
boolean       Boolean
char        Character
long        Long
short       Short


autoboxing -- when Java takes a primitive type
      and automatically converts it to a wrapper class
      type.

autounboxing -- when Java takes a wrapper class type and 
    converts it to a primitive type. 

*/

