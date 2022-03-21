import java.util.Enumeration;


public class BinaryHeap extends AbstractContainer implements PriorityQueue{
  protected Comparable [] array;
  public BinaryHeap(int lenght){
    array = new Comparable[lenght+1];
  } 
  public void purge(){
    while(count>0)
      array[count--] = null;
  }
  public void enqueue(Comparable object){
    if(count == array.length -1)
      try {
        throw new ContainerFullException();
      } catch (ContainerFullException e) {
        e.printStackTrace();
      }
    ++count;
    int i = count;
    while(i > 1 && array [i/2].isGT(object)){
      array[i] = array [i/2];
      i /= 2;
    }
    array [i] = object;
  }
  public Comparable finMin() throws ContainerEmptyException{
    if(count == 0)
      throw new ContainerEmptyException();
    return array [1];
  }
  public Comparable dequeueMin(){
    if(count == 0)
      try {
        throw new ContainerEmptyException();
      } catch (ContainerEmptyException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
  Comparable result = array[1];
  Comparable last = array[count];
    --count;
    int i = 1;
    while(2 * i < count+1){
      int child = 2 * i;
      if(child + 1 < count + 1 && array[child+1].isLT(array[child]))
        child += 1;
      if(last.isLE(array[child]))
        break;
      array[i] = array[child];
      i = child;
    }
  array[i] = last;
    return result;
    }
  @Override
  public void accept(Visitor visitor) {
    // TODO Auto-generated method stub
    
  }
  @Override
  public Enumeration getEnumeration() {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public Comparable findMin() {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  protected int compareTo(Comparable arg) {
    // TODO Auto-generated method stub
    return 0;
  }
}
