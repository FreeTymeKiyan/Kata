# This is the kata log of implementing merge sort

## Goal
To implement merge sort in Java in less than 5min.
Update: less than 4min
Update: be correct in a row for 10 times
Achieved

## Log

| Filename           | isRight    | Time |
| ------------------ |:----------:|:----:|
|   MergeSort.java   |x           |20m   |
|   MergeSort1.java  |x           |10m58s|
|   MergeSort2.java  |√           |<10m  |
| MergeSort3.java    |x           |6m59s |
| MergeSort4.java    |√           |6m20s |
| MergeSort5.java    |√           |5m07s |
| MergeSort6.java    |x           |5m08s |
| MergeSort7.java    |√           |5m11s |
| MergeSort8.java    |√           |5m13s |
| MergeSort9.java    |x           |5m05s |
| MergeSort10.java   |√           |4m22s |
| MergeSort11.java   |√           |4m09s |
| MergeSort12.java   |√           |4m48s |
| MergeSort13.java   |x           |3m52s |
| MergeSort14.java   |√           |4m29s |
| MergeSort15.java   |x           |4m38s |
| MergeSort16.java   |√           |4m15s |
| MergeSort17.java   |√           |4m02s |
| MergeSort18.java   |√           |3m39s |
| MergeSort19.java   |√           |3m49s |
| MergeSort20.java   |√           |3m37s |
| MergeSort21.java   |√           |4m22s |
| MergeSort22.java   |√           |3m42s |
| MergeSort23.java   |√           |3m32s |
| MergeSort24.java   |√           |3m41s |
| MergeSort25.java   |√           |3m43s |
| MergeSort26.java   |√           |3m48s |
| MergeSort27.java   |√           |3m27s |
| MergeSort28.java   |√           |3m58s |
| MergeSort29.java   |√           |3m16s |
| MergeSort30.java   |√           |3m24s |
| MergeSort31.java   |√           |3m32s |
| MergeSort32.java   |√           |3m25s |

## Accuracy
26 / 33 = 78.79%

## Reasons for wrong:
1. forget the equal sign between < & remaining
2. didn't copy from helper int array to array
3. wrong index for copying the remaining elements
4. int helperRight = middle + 1; not high or middle
5. int remain = middle - helperLeft; not middle - low
6. , was typed into .
7. sort(array, low, middle) not sort(array, low, middle - 1); sort(array, middle + 1, high) not sort(array, middle, high)
8. when comparing, we are comapring helper array, not original one, because original one will be modified during merging.
9. type complete variable name
