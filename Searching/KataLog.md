# This is the kata log of implementing binary searching 

## Goal
To implement binary search using loop and recursively in Java in less than 3min.
Be correct in a row for 10 times

## Log

| Filename           | isRight    | Time |
| ------------------ |:----------:|:----:|
| BinarySearch1.java |x           |05m40s|

## Accuracy
0 / 1 = 00.00%

## Reasons for wrong:
1. variable names mid and middle were used for one variable
2. while(low < high) should be <= because there can be single element array at the end of the search
3. if a[mid] > x, that means x should be in the left part, so high = middle - 1. 
4. don't forget the return statement
