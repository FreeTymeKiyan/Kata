# This is the kata log of implementing binary searching 

## Goal
To implement binary search using loop and recursively in Java in less than 3min.
Be correct in a row for 10 times

## Log

| Filename           | isRight    | Time |
| ------------------ |:----------:|:----:|
| BinarySearch1.java |x           |05m40s|
| BinarySearch2.java |x           |03m51s|
| BinarySearch3.java |√           |02m54s|
| BinarySearch4.java |√           |02m49s|
| BinarySearch5.java |√           |02m48s|
| BinarySearch6.java |√           |02m45s|
| BinarySearch7.java |√           |02m41s|

## Accuracy
5 / 7 = 71.43%

## Reasons for wrong:
1. variable names mid and middle were used for one variable
2. while(low < high) should be <= because there can be single element array at the end of the search
3. if a[mid] > x, that means x should be in the left part, so high = middle - 1. 
4. don't forget the return statement. But recursive method needs no return at the end because it won't be reachable.
