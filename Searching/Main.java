class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        //System.out.println(BinarySearch.binarySearch(array, 2));
        //System.out.println(BinarySearch.binarySearchRecursive(array, 9, 0, array.length - 1));
        //System.out.println(BinarySearch1.binarySearch(array, 2));
        //System.out.println(BinarySearch1.binarySearchRecursive(array, 9, 0, array.length - 1));
        //System.out.println(BinarySearch2.binarySearch(array, 2));
        //System.out.println(BinarySearch2.binarySearchRecursive(array, 9, 0, array.length - 1));
        //System.out.println(BinarySearch3.binarySearch(array, 2));
        //System.out.println(BinarySearch3.binarySearchRecursive(array, 9, 0, array.length - 1));
        System.out.println(BinarySearch4.binarySearch(array, 2));
        System.out.println(BinarySearch4.binarySearchRecursive(array, 9, 0, array.length - 1));
    }
}
