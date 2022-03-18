public interface PriorityQueue extends Conteiner{
  void enqueue(Comparable object);
  Comparable findMin();
  Comparable dequeueMin();
}
