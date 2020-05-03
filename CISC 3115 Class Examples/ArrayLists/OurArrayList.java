public class OurArrayList {

  private int numElements;
  
  private int[] numbers;


  public OurArrayList() {

    numElements = 0;

    numbers = new int[10];
  }

  public int size() {

    return numElements;

  }

  public int get(int index) throws Exception {
    
    if(index<0 || index>=size())
      throw new IndexOutOfBoundsException();
    return numbers[index];
  }


  public int set(int index, int value)
        throws Exception {


    int old = get(index);
    numbers[index] = value;
    return old;


  }


  public void add(int value) {

    if(numElements==numbers.length)
      grow();

    numbers[numElements] = value;
    numElements++;

  }


  private void grow() {

    int[] temp = new int[numElements*2];

    for(int i=0; i<numbers.length; i++)
         temp[i] = numbers[i];

    numbers = temp;

  }








}
