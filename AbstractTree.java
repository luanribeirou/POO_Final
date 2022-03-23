public abstract class AbstractTree
    extends AbstractContainer
    implements Tree
{
    public void depthFirstTraversal (PrePostVisitor visitor)
    {
	if (visitor.isDone ())
	    return;
	if (!isEmpty ())
	{
	    visitor.preVisit (getKey ());
	    for (int i = 0; i < getDegree (); ++i)
		getSubtree (i).depthFirstTraversal (visitor);
	    visitor.postVisit (getKey ());
	}
    }
    
    public void breadthFirstTraversal (Visitor visitor)
    {
	Queue queue = new QueueAsLinkedList ();
	if (!isEmpty ())
	    queue.enqueue (this);
	while (!queue.isEmpty () && !visitor.isDone ())
	{
	    Tree head = (Tree) queue.dequeue ();
	    visitor.visit (head.getKey ());
	    for (int i = 0; i < head.getDegree (); ++i)
	    {
		Tree child = head.getSubtree (i);
		if (!child.isEmpty ())
		    queue.enqueue (child);
	    }
	}
    }
}
