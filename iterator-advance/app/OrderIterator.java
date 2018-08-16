class OrderIterator extends BaseIterator
{
    public OrderIterator(Item[] values)
    {
        this.values = values;
        this.index = -1;
    }

    public Item next()
    {
        return this.values[++this.index];
    }

    public boolean hasNext()
    {
        return (this.values.length-1) > this.index;
    }
}