public interface SearchableContainer extends Container{
  boolean isMember (Comparable object);
  void insert (Comparable object);
  void withdraw (Comparable object);
  Comparable find (Comparable object);
}
