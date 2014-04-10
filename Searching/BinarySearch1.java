class BinarySearch1 {

    public static int binarySearch(int[] a, int x) {
        int low = 0;
        int high = a.length - 1;
        int middle;

        while(low <= high) {
            middle = (low + high) / 2;
            if(a[middle] == x) return middle;
            else if(a[middle] > x) high = middle - 1;
            else if(a[middle] < x) low = middle + 1;
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] a, int x, int low, int high) {
        if(low > high) return -1;
        int mid = (low + high) / 2;
        if(a[mid] == x) return x;
        else if(a[mid] > x) return binarySearchRecursive(a, x, low, mid -1);
        else return binarySearchRecursive(a, x, mid + 1, high);
    }
}
