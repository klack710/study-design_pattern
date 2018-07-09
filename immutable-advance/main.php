<?php
require_once __DIR__.'/ImmClass.php';
require_once __DIR__.'/Item.php';

$object = new Item(0);

// 通常生成
$first = new ImmClass('first', 1, $object);
// numだけ変更しても、Objectの参照が変わっているか
$first_2 = $first->setNum(2);
// 同じ参照をsetしても、異なるオブジェクトが生成されているか
$first_3 = $first->setNum(3)->setObject($object);

// 参照元の値を変更する
$object->setValue(1);

// 独立しているので、Valueは変わらない
var_dump($first);
var_dump($first_2);
var_dump($first_3);

// 内部のオブジェクトを呼び出して、値を変更する
$first->getObject()->setValue(1);
$first_2->getObject()->setValue(2);
$first_3->getObject()->setValue(3);

// それぞれの値が変わっている
var_dump($first);
var_dump($first_2);
var_dump($first_3);
