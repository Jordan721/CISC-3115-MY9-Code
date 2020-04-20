public class OurArrayList{

  private int numElements;

  private int[] arr;

  public OurArrayList(){
    numElements = 0;

    arr = new int[10];
  }

  public int size(){
    return numElements;
  }

  public int get(int index){
    if(index < 0 || index>=size())
    throw new IndexOutOfBoundsException();
    return arr[index];
  }

  public int set(int index, int value){

    // replaces the old value at index with a new oldValue
    //returns the original value

if(index<0 || index>=size())
throw new IndexOutOfBoundsException();
iny oldValue = arr[index];
    arr[index] = value;
    return oldValue;
  }

  public void add(int value){

    if(numElements==arr.length){

      int[] temp = new int[arr.length*2];

      for(int i=0; i<arr.length; i++)
      temp[i] = arr[i];

      arr = temp;
    }

    arr[numElements] = value;
    numElements++;
  }
}
