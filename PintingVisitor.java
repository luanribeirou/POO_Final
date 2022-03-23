public class PrintingVisitor
    implements Visitor
{
    public void visit (Object object)
        { System.out.println (object); }
    // ...
}
