public class PartitionAsForest extends AbstractSet implements Partition{
  protected PartitionTree[] array;
  
  public Set find(int item){
    PartitionTree ptr = arrey[item]; 
    while (ptr.parent != null) ptr = ptr.parent;
    return ptr;
  }
  
  public void checkArguments(PartitionTree s , PartitionTree t){
    if (! isMember (s) || s.parent != null || ! isMember (t) || t.parent != null || s==t) throw IllegalArgumentException ( "IncompatibleSet");
  }
  
  public void join (Set s,Set t){
    PartitionTree p = (PartitionTree) s;
    PartitionTree q = (PartitionTree) t;
    checkArguments(p,q);
    q.parent = p;
    --count;
  }
    
  public PartitionAsForest (int n){
    super(n);
    array = new PartitionTree[universeSize];
    for(int item =0; item< universeSize; ++item) array[item] = new PartitionTree (item);
    count = universeSize;
    
  }
  protected class PartitionTree extends AbstractSet implements Set, three{
  protected int item;
  protected PartitionTree parent;
  protected int rank;
  public PartitionTree(int item){
    super (PartitionAsForest.this.universeSize);
    this.item = item;
    parent = null;
    rank = 0;
    count =1; 
  }
}
  
}
