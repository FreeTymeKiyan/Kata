class QuickSort28 {
  public static void sort(int[] a, int left, int right) {
    int index = partition(a, left, right);
    if(left < index - 1) sort(a, left, index - 1);
    if(index < right) sort(a, index, right);
  }
  
  public static int partition(int[] a, int left, int right) {
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