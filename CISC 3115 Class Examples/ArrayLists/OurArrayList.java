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

if(index<0 || index>=size())
throw new IndexOutOfBoundsException();
iny oldValue = arr[index];
    arr[index] = value;
    return oldValue;
  }
}
