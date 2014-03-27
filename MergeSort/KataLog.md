# This is the kata log of implementing merge sort

## Goal
To implement merge sort in Java in less than 5min.

## Log

| Filename           | isRight    | Time |
| ------------------ |:----------:|:----:|
|   MergeSort.java   |x           |20m   |
|   MergeSort1.java  |x           |10m58s|
|   MergeSort2.java  |√           |<10m  |
| MergeSort3.java    |x           |6m59s |
| MergeSort4.java    |√           |6m20s |
| MergeSort5.java    |√           |5m7s  |
| MergeSort6.java    |x           |5m8s  |
| MergeSort7.java    |√           |5m11s |
| MergeSort8.java    |√           |5m13s |

## Reasons for wrong:
1. forget the equal sign between < & remaining
2. didn't copy from helper int array to array
3. wrong index for copying the remaining elements
4. int helperRight = middle + 1; not high or middle

