public class BinaryHeap extends Conteiner implements PriorityQueue{
  protected Comparable [] array;
  public BinaryHeap(int lenght){
    array = Comparable[lenght+1];
  }
  public void purge(){
    while(count>0)
      array[count--] = null;
  }
  public void enqueue(Comparable object){
    if(count == array.lenght-1)
      throw new ContainerFullException();
    ++count;
    int i = count;
    while(i > 1 && array [i/2].isGT(object)){
      array[i] = array [i/2];
      i /= 2;
    }
    array [i] = object;
  }
  public Comparable finMin(){
    if(count == 0)
      throw new ContainerEmptyException();
    return array [1];
  }
  public Comparable dequeueMin(){
    if(count == 0)
      throw new ContainerEmptyException();
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
}
