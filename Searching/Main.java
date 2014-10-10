class Main {
  public static void main(String[] args) {
    int[] a         = {21, 3, 34, 5, 13, 8, 2, 55, 1, 19};
    int expResult[] = {1, 2, 3, 5, 8, 13, 19, 21, 34, 55};
    int k           = 1;
    for (int exp:expResult) {
      System.out.println(exp);
      System.out.println(QuickSelect.select(a, k++));
      System.out.println("---");
    }
  }
}
