public class Association extends AbstractObject{
  protected Comparable key;
  protected Object value;
  public Association(Comparable key, Object value){
    this.key = key;
    this.value = value;
  }
  public Association(Comparable key){
    this(key,null);
  }
  public Comparable getKey(){
    return key;
  }
  public Object getValue(){
    return value;
  }
  protected int compareTo(Comparable object){
    Association association = (Association) object;
    return key.compare(association.getKey());
  }
  public String toString(){
    String result = "Association{" + key;
    if(value != null)
      result +="," + value;
    return result + "}";
  }
}
