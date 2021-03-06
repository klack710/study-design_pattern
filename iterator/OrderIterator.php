<?php
require_once __DIR__.'/BaseIterator.php';

class OrderIterator extends BaseIterator
{
    public function __construct($values)
    {
        $this->values = $values;
        $this->index = -1;
    }

    public function next()
    {
        return $this->values[++$this->index];
    }

    public function hasNext()
    {
        return isset($this->values[$this->index + 1]);
    }
}