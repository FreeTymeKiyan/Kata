class MergeSort36 {
  public static void sort(int[] a, int low, int high) {
    if(low < high) {
      int mid = low + (high - low) / 2;
      sort(a, low, mid);
      sort(a, mid + 1, high);
      merge(a, low, mid, high);
    }
  }
  
  public static void merge(int[] a, int low, int mid, int high) {
    int[] helper = new int[a.length];
    for (int i = low; i <= high ; i++) {
      helper[i] = a[i];
    }
    
    int left = low;
    int right = mid + 1;
    int idx = low;
    while(left <= mid && right <= high) {
      if (helper[left] < helper[right]) {
        a[idx++] = helper[left++];
      } else {
        a[idx++] = helper[right++];
      }
    }
    
    int remain = mid - left;
    for (int i = 0; i <= remain; i++) {
      a[idx + i] = helper[left + i];
    }
  }
}