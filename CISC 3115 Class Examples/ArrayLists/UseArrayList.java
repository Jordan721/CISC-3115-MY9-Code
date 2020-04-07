import java.util.;
public class UseArrayLists{

  public static void main(String[] args){

    ArrayLists<Integer> lists = new ArrayLists<Integer>();

    for(int i=0; i<10; i++)
    list.add(i+1);

  }
  public static  void print(ArrayList<Integer> lists){

    for(int i=0; i<list.size(); i++)
    System.out.println(list.get(i));
  }

  public static void addOne(ArrayList<Integer> list){

        for(int i=0; i<list.size(); i++)
      list.set(i, list.get(i) + 1);
  }
  // ArrayLists can only store reference types
  // Java has wrapper class to convert form primative type to reference type
  // int -> Integer
  // double -> Double
  // char -> Character
  // boolean -> Boolean
}
