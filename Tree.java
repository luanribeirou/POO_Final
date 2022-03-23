public interface Tree
    extends Container
{
    Object getKey ();
    Tree getSubtree (int i);
    boolean isEmpty ();
    boolean isLeaf ();
    int getDegree ();
    int getHeight ();
    void depthFirstTraversal (PrePostVisitor visitor);
    void breadthFirstTraversal (Visitor visitor);
}
