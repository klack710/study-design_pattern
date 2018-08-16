abstract class BaseIterator
{
    protected Item[] values;
    protected int index;
    abstract public Item next();
    abstract public boolean hasNext();
}