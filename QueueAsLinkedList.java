package POO_Final;

import java.util.logging.Level;
import java.util.logging.Logger;

public class QueueAsLinkedList extends AbstractContainer implements Queue {

    protected LinkedList list;

   public    QueueAsLinkedList()
  {list = new LinkedList();}

  public void purge(){
    list.purge();
    count = 0;
  }
   public Object getHead(){
     if(count == 0)
       throw new ContainerEmptyException();
     return list.getFirst();
   }
    public void enqueue(Object object) {
       list.append(object);
      count++;
    }

    public Object dequeue() {
        if (count == 0) {
            try {
                throw new ContainerEmptyException();
            } catch (ContainerEmptyException ex) {
                Logger.getLogger(QueueAsArray.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Object result = list.getFirst();
       list.extract(result);
        count--;
        return result;
    }
}
