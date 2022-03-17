package POO_Final;

public interface Queue extends Container{
  Object getHead();
  void enqueue(Object object);
  Object dequeue();
}
