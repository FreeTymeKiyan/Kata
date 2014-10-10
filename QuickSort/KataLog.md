# This is the KATA log of Quick Sort Implementation

## Goal  
  
### First round  
  
1. To implement quick sort in Java in less than 4min.
2. Update: be correct in a row for 10 times  
  
Achieved
Accuracy: 19 / 25 = 76.00%
  
###Second round  
  
1. less than 3min
2. be correct in a row for 10 times
  
## Log

| Filename           | isRight    | Time |
| ------------------ |:----------:|:----:|
| QuickSort.java     |√           |05m11s|
| QuickSort1.java    |x           |04m33s|
| QuickSort2.java    |x           |04m14s|
| QuickSort3.java    |√           |03m58s|
| QuickSort4.java    |x           |03m23s|
| QuickSort5.java    |x           |03m33s|
| QuickSort6.java    |x           |03m35s|
| QuickSort7.java    |√           |03m20s|
| QuickSort8.java    |x           |03m05s|
| QuickSort9.java    |√           |02m37s|
| QuickSort10.java   |√           |02m43s|
| QuickSort11.java   |√           |02m35s|
| QuickSort12.java   |√           |03m09s|
| QuickSort13.java   |√           |02m41s|
| QuickSort14.java   |√           |02m42s|
| QuickSort15.java   |√           |02m24s|
| QuickSort16.java   |√           |02m48s|
| QuickSort17.java   |√           |02m31s|
| QuickSort18.java   |√           |02m30s|
| QuickSort19.java   |√           |02m48s|
| QuickSort20.java   |√           |02m16s|
| QuickSort21.java   |√           |02m18s|
| QuickSort22.java   |√           |02m39s|
| QuickSort23.java   |√           |02m46s|
| QuickSort24.java   |√           |02m57s|
| QuickSort25.java   |√           |------|
| QuickSort26.java   |√           |03m16s|
| QuickSort27.java   |√           |02m43s|

## Accuracy
  
2 / 2 = 100%
  
## Reasons for wrong:  
  
1. if(left < right) is not right. Should be if(left <= right). Last step is not swapped. To make it simple, just remember, while(left <= right), if(left <= right), if these two are not the same, when left == right, it would be in the loop forever.
2. missing return statement for partition() method.
3. ; was typed as :
4. the return value of swap is int. I think it might be better to cancel the swap method.
5. do not forget semi colon.
  
