<?php
require_once __DIR__.'/ItemBox.php';

$box = new ItemBox();
$ite_box = $box->getIterator();

while ($ite_box->hasNext())
{
    var_dump($ite_box->next());
}