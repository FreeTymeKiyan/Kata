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

## Reasons for wrong:
1. if(left < right) is not right. Should be if(left <= right). Last step is not swapped.

