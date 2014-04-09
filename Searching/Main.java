class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result1 = BinarySearch.binarySearch(array, 2);
        int result2 = BinarySearch.binarySearchRecursive(array, 9, 0, array.length - 1);

        System.out.println(result1);
        System.out.println(result2);
    }
}
