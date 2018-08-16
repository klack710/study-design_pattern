<?php

class ImmClass {
    private $str;
    private $num;
    // フィールドにインスタンスを持ったときに
    // 複製したImmClassのフィールドのインスタンスは独立しているか？
    private $object;

    public function __construct($str, $num, $object)
    {
        $this->str = $str;
        $this->num = $num;
        $this->object = clone $object;
    }

    public function getStr()
    {
        return $this->str;
    }

    public function getNum()
    {
        return $this->num;
    }

    public function getObject()
    {
        return $this->object;
    }

    public function setStr($str)
    {
        return new ImmClass($str, $this->num, $this->object);
    }

    public function setNum($num)
    {
        return new ImmClass($this->str, $num, $this->object);
    }

    public function setObject($object)
    {
        return new ImmClass($this->str, $this->num, $object);
    }

}