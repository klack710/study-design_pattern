<?php
require_once __DIR__.'/ImmClass.php';

$first = new ImmClass('first', 1);
$first_2 = $first->setNum(2);

echo 'first: str->' . $first->getStr() . ', Num->' . $first->getNum() . PHP_EOL;
echo 'first_2: str->' . $first_2->getStr() . ', Num->' . $first_2->getNum() . PHP_EOL;
