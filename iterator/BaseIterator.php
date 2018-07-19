<?php

abstract class BaseIterator
{
    private $values;
    private $index;
    abstract public function next();
    abstract public function hasNext();
}