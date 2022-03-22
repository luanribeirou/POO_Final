package com.mycompany.graph.POO_Final;

public class MatchingVisitor implements Visitor{
    private Object target;
    private Object found;

    public MatchingVisitor (Object target)
	{ this.target = target; }

    public void visit (Object object)
    {
	if (!isDone () && object.equals (target))
            found = object;
    }

    public boolean isDone (){
      return found != null; 
      }
}
