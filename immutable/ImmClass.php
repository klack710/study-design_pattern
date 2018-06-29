 <?php

class ImmClass {
    private $str;
    private $num;

    public function __construct($str, $num)
    {
        $this->str = $str;
        $this->num = $num;
    }

    public function getStr()
    {
        return $this->str;
    }

    public function getNum()
    {
        return $this->num;
    }

    public function setValue($str)
    {
        return new ImmClass($str, $this->num);
    }

    public function setNum($num)
    {
        return new ImmClass($this->str, $num);
    }
}