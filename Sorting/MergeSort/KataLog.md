# This is the KATA log of Merge Sort Implementation

## Goal  

###First round

1. To implement merge sort in Java in less than 5min.
2. Update: less than 4min
3. Update: be correct in a row for 10 times
  
Achieved
Accuracy: 27 / 34 = 79.41%

###Second round

1. 5 min
2. be correct in a row for 10 times 
  
## Log
  
| Filename           | isRight    | Time |
| ------------------ |:----------:|:----:|
| MergeSort.java     |x           |20m   |
| MergeSort1.java    |x           |10m58s|
| MergeSort2.java    |√           |<10m  |
| MergeSort3.java    |x           |06m59s|
| MergeSort4.java    |√           |06m20s|
| MergeSort5.java    |√           |05m07s|
| MergeSort6.java    |x           |05m08s|
| MergeSort7.java    |√           |05m11s|
| MergeSort8.java    |√           |05m13s|
| MergeSort9.java    |x           |05m05s|
| MergeSort10.java   |√           |04m22s|
| MergeSort11.java   |√           |04m09s|
| MergeSort12.java   |√           |04m48s|
| MergeSort13.java   |x           |03m52s|
| MergeSort14.java   |√           |04m29s|
| MergeSort15.java   |x           |04m38s|
| MergeSort16.java   |√           |04m15s|
| MergeSort17.java   |√           |04m02s|
| MergeSort18.java   |√           |03m39s|
| MergeSort19.java   |√           |03m49s|
| MergeSort20.java   |√           |03m37s|
| MergeSort21.java   |√           |04m22s|
| MergeSort22.java   |√           |03m42s|
| MergeSort23.java   |√           |03m32s|
| MergeSort24.java   |√           |03m41s|
| MergeSort25.java   |√           |03m43s|
| MergeSort26.java   |√           |03m48s|
| MergeSort27.java   |√           |03m27s|
| MergeSort28.java   |√           |03m58s|
| MergeSort29.java   |√           |03m16s|
| MergeSort30.java   |√           |03m24s|
| MergeSort31.java   |√           |03m32s|
| MergeSort32.java   |√           |03m25s|
| MergeSort33.java   |√           |04m00s|
| MergeSort34.java   |√           |------|
| MergeSort35.java   |x           |05m36s|
| MergeSort36.java   |x           |03m54s|
| MergeSort37.java   |√           |03m25s|
| MergeSort38.java   |x           |03m12s|
| MergeSort39.java   |x           |03m17s|
  
## Accuracy  
  
1 / 5 = 20.0%
  
## Reasons for wrong:  
  
1. forget the equal sign between < & remaining.
2. didn't copy from helper int array to array.
3. wrong index for copying the remaining elements.
4. int helperRight = middle + 1; not high or middle.
5. int remain = middle - helperLeft; not middle - low.
6. "," was typed as "." .
7. sort(array, low, middle) not sort(array, low, middle - 1); sort(array, middle + 1, high) not sort(array, middle, high).
8. when comparing, we are comparing helper array, not original one, because original one will be modified during merging.
9. type complete variable name.
10. a is generic int array. Should be a.length, not a.length().
11. upper bound for helperRight index should be high.
12. copy from helper array to original array at last.
13. remain should be middle - left because only left part can have elements left
14. every time copy an element from helper to original array, we need to move both indices. 
15. missed int mid = low + (high - low) / 2 before sort each half.
  