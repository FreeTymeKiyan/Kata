# This is the kata log of implementing tree traversals 

## Goal
To implement tree traversal in Java in less than 3min.
Update: be correct in a row for 10 times

## Log

| Filename           | isRight    | Time |
| ------------------ |:----------:|:----:|
| Traversal.java     |√           |04m05s|
| Traversal1.java    |x           |03m50s|
| Traversal2.java    |√           |02m50s|

## Accuracy
2 / 3 = 66.67%

## Reasons for wrong:
1. getLeftChild() is not defined in Node, use leftNode(). The same goes for getRightChild().
