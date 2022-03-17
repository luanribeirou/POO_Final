package POO_Final;

import POO_Final.MatchingVisitor;
import java.lang.reflect.Array;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.lang.model.element.Element;

public abstract class Conteiner implements Comparable, Container {

    protected int count;

    public int getCount() {
        return count;
    }

    public boolean isEmpty() {
        return getCount() == 0;
    }

    public boolean isFull() {
        return false;
    }

    public void purge() {
        Element head;
        Element tail;
        head = null;
        tail = null;
    }

    public void accept(MatchingVisitor visitor) {
        if (visitor != null) {
            MatchingVisitor.visit(visitor);
        }
        count++;
    }

    Enumeration getEnumeration() {
        Object array[] = null;
        return new Enumeration() {
            protected int position = 0;
            boolean haMoreElements() {
                return position < getCount();
            }
            public Object nextElement() {
                if (position >= getCount()) {
                    throw new NoSuchElementException();
                }
                return array[position++];
            }
            @Override
            public Iterator asIterator() {
                return Enumeration.super.asIterator(); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean hasMoreElements() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }
}
