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
    // ...
}
