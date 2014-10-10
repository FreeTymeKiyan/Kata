class QuickSelect {
  public static int select(int[] a, int k) {
    if (k > a.length || k <= 0) {
      return -1; // invalid index
    }
    
    int left = 0; // initialize
    int right = a.length - 1;
    int index;
    
    while (left <= right) { // saleft can be equal to right
      index = partition(a, left, right);
      if (index == k) {
        return a[k - 1];
      } else if (index > k) {
        right = index - 1;
      } else {
        left = index;
      }
    }
    
    return -1;
  }
  
  private static int partition(int[] a, int left, int right) {
    int pivot = a[left + (right - left) / 2];
    while(left <= right) {
      while(a[left] < pivot) left++;
      while(a[right] > pivot) right--;
      if (left <= right) {
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
        left++;
        right--;
      }
    }
    return left;
  }
}
