<?php
require_once __DIR__.'/Collection.php';
require_once __DIR__.'/OrderIterator.php';
require_once __DIR__.'/Item.php';

class ItemBox implements Collection
{
    public function getIterator()
    {
        return new OrderIterator(
            [
                new Item('Apple'),
                new Item('Grape'),
                new Item('Pine'),
                new Item('Banana')
            ]
        );
    }
}