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
    public void accept (Visitor visitor)
	{ depthFirstTraversal (new PreOrder (visitor)); }
}
public Enumeration getEnumeration ()
	{ return new TreeEnumeration (); }

    protected class TreeEnumeration
	implements Enumeration
    {
	protected Stack stack;

	// ...
    }
    protected class TreeEnumeration
	implements Enumeration
    {
	public TreeEnumeration ()
	{
	    stack = new StackAsLinkedList ();
	    if (!isEmpty ())
		stack.push (AbstractTree.this);
	}
	// ...
    }
    protected class TreeEnumeration
	implements Enumeration
    {
	public boolean hasMoreElements ()
	    { return !stack.isEmpty (); }

	public Object nextElement ()
	{
	    if (stack.isEmpty ())
		throw new NoSuchElementException ();

	    Tree top = (Tree) stack.pop ();
	    for (int i = top.getDegree () - 1; i >= 0; --i)
	    {
		Tree subtree = (Tree) top.getSubtree (i);
		if (!subtree.isEmpty ())
		    stack.push (subtree);
	    }
	    return top.getKey ();
	}
	// ...
    }
    // ...
}
}
