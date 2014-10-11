class BinarySearch17 {
  public static int binarySearch(int[] a, int x) {
    int left = 0;
    int right = a.length - 1;
    int mid;
    
    while(left <= right) {
      mid = left + (right - left) / 2;
      if(a[mid] == x) return mid; // mid not a[mid], return its index
      else if (a[mid] > x) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    
    return -1;
  }
  
  public static int binarySearchRecursive(int[] a, int x, int left, int right) {
    if(left > right) return -1;
    int mid = left + (right - left) / 2;
    if(a[mid] == x) return a[mid];
    else if (a[mid] > x) {
      return binarySearchRecursive(a, x, left, mid - 1);
    } else {
      return binarySearchRecursive(a, x, mid + 1, right);
    }
  }
}