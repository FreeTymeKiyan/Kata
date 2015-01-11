class Main {
  public static void main(String[] args) {
    int k           = 1;
    int expResult[] = {1, 2, 3, 5, 8, 13, 19, 21, 34, 55};

    for (int exp:expResult) {
      int[] a = {21, 3, 34, 5, 13, 8, 2, 55, 1, 19};
      System.out.println(k);
      System.out.println(exp);
      System.out.println(QuickSelect.select(a, k++));
      System.out.println("---");
    }
  }
}
