class ItemBox implements Collection
{
    public BaseIterator getIterator()
    {
        return new OrderIterator(
            new Item[]
            {
                new Item("Apple"),
                new Item("Grape"),
                new Item("Pine"),
                new Item("Banana")
            }
        );
    }
}