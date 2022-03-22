package POO_Final;

import java.util.logging.Level;
import java.util.logging.Logger;

public class QueueAsArray extends AbstractContainer implements Queue {

    protected Object[] array;
    protected int head;
    protected int tail;
   public    QueueAsArray(int size){
     array = new Object[size];
    head = 0;
     tail = size - 1;
    }

  public void purge(){
    while(count > 0){
      array[head] = null;
      if(++head == array.length)
        head = 0;
      --count;
    }
  }
   public Object getHead(){
     if(count == 0)
       throw new ContainerEmptyException();
     return array [head];
   }
    public void enqueue(Object object){
       if(count == array.length)
         throw new ContainerFullException();
      if(++tail == array.legth)
        tail = 0;
      array[tail] = object;
      count++;
    }

    public Object enqueue(){
        if (count == 0) {
            throw new ContainerFullException();
        if(++tail == array.length)
          tail = 0;
        array[tail] = object;
          ++count;
        }

      public Object dequeue(){
        if(count == 0)
          throw new ContainerEmptyException();
        Object result = array[head];
        array[head] = null;
        if(++head == array.lenght)
          head = 0;
        --count;
        return result;
      }
}
