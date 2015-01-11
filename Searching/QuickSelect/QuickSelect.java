class QuickSelect {
  public static int select(int[] a, int k) {
      print(a);
      
    if (k > a.length || k <= 0) {
      return -1; // invalid index
    }
    
    int left = 0; // initialize
    int right = a.length - 1;
    int index;
    
    while (left < right) { // saleft can be equal to right
      System.out.println("left: " + left);
      System.out.println("right: " + right);
      index = partition(a, left, right);
      System.out.println("index: " + index);
      if (index > k - 1) {
        right = index - 1;
      } else if (index < k - 1) {
        left = index + 1;
      } else {
        return a[index];
      } 
    }
      return a[left];
  }
  
  static void print(int[] num) {
      for (int a : num) {
          System.out.print(a + ", ");
      }
      System.out.println();
  }
  
  public static void main(String[] args) {
      int[] a = {21, 3, 34, 5, 13, 8, 2, 55, 1, 19};
      System.out.println(partition(a, 0, 9));
      print(a);
      System.out.println(partition(a, 0, 6));
      print(a);
      System.out.println(partition(a, 0, 5));
      print(a);
      
  }
  
  /**
   * wront partition
   */
  private static int partition(int[] a, int left, int right) {
    // int pivot = a[left + (right - left) / 2];
    int pivot = a[left];
    // System.out.println("pivotIndex: " + (left + (right - left) / 2));
    // System.out.println("pivot: " + pivot);
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
  
    // private static int partition(int[] a, int left, int right) {
    //     int pivot = a[left];
    //     int start = left;
    //
    //     while (left <= right) {
    //         while (a[left] < pivot) left++;
    //         while (a[right] > pivot) right--;
    //         if (left <= right) {
    //             int temp = a[left];
    //             a[left] = a[right];
    //             a[right] = temp;
    //             left++;
    //             right--;
    //         }
    //     }
    //     int temp2 = a[left];
    //     a[left] = pivot;
    //     a[start] = temp2;
    //     return left;
    // }
}
