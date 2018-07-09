<?php

abstract class BaseIterator
{
    private $values;
    private $index;
    abstract public function Next();
    abstract public function hasNext();
}