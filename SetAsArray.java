public class SetAsArray extends AbstractSet implements Set{
  protected boolean [] array;
  public SetAsArray(int n){
    super(n);
    array = new boolean [universeSize];
    for(int item = 0; item < universeSize; ++item)
      array[item] = false;
  }
  protected void insert(int item){
    array[item] = true;
  }
  protected boolen isMember(int item){
    return array[item];
  }
  protected void withdraw(int item){
    array[item] = false;
  }
  public Set union (Set set){
    SetAsArray arg =(SetAsArray)set;
    if(univerSize != arg.universeSize)
      throw new IllegalArgumentException("mismatched sets");
    SetAsArray result = new SetAsArray(universeSize);
    for(int i = 0; i < universeSize; ++i)
      result.array[i] = array[i] || arg.array[i];
    return result;
  }
  public Set intersection (Set set){
    SetAsArray arg = (SetAsArray)set;
    if(universeSize != arg.universeSize)
      throw new IllegalArgumentException("mismatched sets");
    SetAsArray result = new SetAsArray(universeSize);
    for(int = 0; i < universeSize; ++i)
      result.array[i] = array[i] && arg.array[i];
    return result;
  } 
  public Set difference (Set set){
    SetAsArray arg = (SetAsArray)set;
    if(universeSize != arg.universeSize)
      throw new IllegalArgumentException("mismatch sets");
    SetAsArray result = new SetAsArray(universeSize);
    for(int i = 0; i < universeSize; ++i)
      result.array[i] = array[i] && !arg.array[i];
    return result;
  }
  public boolean isEQ(Set set){
    SetAsArray arg = (SetAsArray)set;
    if(universeSize != arg.universeSize)
       throw new IllegalArgumentException("mismatch sets");
    for(int item = 0; item < universeSize; ++item)
      if(array[item] != arg.array[item])
        return false;
    return true;
  }
  public boolean isSubset(Set set){
    SetAsArray arg = (SetAsArray)set;
    if(universeSize != arg.universeSize)
     throw new IllegalArgumentException("mismatch sets"); 
   for(int item = 0; item < universeSize; ++item)
      if(array[item] && !arg.array[item])
        return false;
    return true;
  }
}
