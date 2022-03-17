package POO_Final;

import java.util.logging.Level;
import java.util.logging.Logger;

public class QueueAsArray extends Container implements Queue {

    protected Object array[];
    protected int head;
    protected int tail;
    protected int count;

    public Object getHead() {
        if (count == 0) {
            try {
                throw new ContainerEmptyException();
            } catch (ContainerEmptyException ex) {
                Logger.getLogger(QueueAsArray.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return array[head];
    }

    public void enqueue(Object object) {
        if (count == array.length) {
            try {
                throw new ContainerFullException();
            } catch (ContainerFullException ex) {
                Logger.getLogger(QueueAsArray.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (tail++ == array.length) {
            tail = 0;
        }
        array[tail] = object;
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
        Object result = array[head];
        array[head] = null;
        if (head++ == array.length) {
            head = 0;
        }
        count--;
        return result;
    }
}
