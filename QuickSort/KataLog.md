# This is the kata log of implementing quick sort

## Goal
To implement quick sort in Java in less than 4min.

## Log

| Filename           | isRight    | Time |
| ------------------ |:----------:|:----:|
| QuickSort.java     |√           |05m11s|
| QuickSort1.java    |x           |04m33s|
| QuickSort2.java    |x           |04m14s|
| QuickSort3.java    |√           |03m58s|
| QuickSort4.java    |x           |03m23s|

## Reasons for wrong:
1. if(left < right) is not right. Should be if(left <= right). Last step is not swapped. To make it simple, just remember, while(left <= right), if(left <= right), if these two are not the same, when left == right, it would be in the loop forever.

