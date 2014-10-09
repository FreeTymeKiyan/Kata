# This is the KATA log of Binary Searching Implementation  

## Goal  

###First round  
  
1. To implement binary search using loop and recursively in Java in less than 3min.
2. Be correct in a row for 10 times
  
Achieved
Accuracy: 10 / 13 = 76.92%

###Second round  
  
1. less than 3min.
2. Be correct in a row for 10 times.
  
## Log  
  
| Filename           | isRight    | Time |
|:------------------ |:----------:|:----:|
| BinarySearch1.java |x           |05m40s|
| BinarySearch2.java |x           |03m51s|
| BinarySearch3.java |√           |02m54s|
| BinarySearch4.java |√           |02m49s|
| BinarySearch5.java |√           |02m48s|
| BinarySearch6.java |√           |02m45s|
| BinarySearch7.java |√           |02m41s|
| BinarySearch8.java |√           |02m48s|
| BinarySearch9.java |√           |02m32s|
| BinarySearch10.java|√           |02m35s|
| BinarySearch11.java|√           |02m50s|
| BinarySearch12.java|x           |03m10s|
| BinarySearch13.java|√           |02m50s|
| BinarySearch14.java|√           |------|
| BinarySearch15.java|x           |03m19s|
  
## Accuracy  
  
0 / 1 = 0%

## Reasons for wrong  

1. variable names mid and middle were used for one variable
2. while(low < high) should be <= because there can be single element array at the end of the search
3. if a[mid] > x, that means x should be in the left part, so high = middle - 1. 
4. don't forget the return statement. But recursive method needs no return at the end because it won't be reachable.
5. recursive algorithm needs an ending point at the beginning of the method, e.g, if(left > right) return -1; otherwise, stackoverflow would cause.
6. the iteration of a[mid] < x should be, binarySearchRecursive(a, x, mid + 1, right);, not only mid
7. spell binary wrong as bianry
8. upper bound should be a.length - 1 instead of a.length, because it's the last element.   
  