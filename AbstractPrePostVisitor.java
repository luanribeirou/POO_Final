public class AbstractPrePostVisitor implements PrePostVisitor{
MatchingVisitor visitor;
public void preVisit(Object obj){
  visitor.visit(obj);
}
public void  inVisit(Object obj){
   visitor.visit(obj);
 }
public void postVisit(Object obj){
  visitor.visit(obj);
}
public boolean isDone(){
  return visitor.isDone();
}
}
