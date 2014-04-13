class BinarySearch5 {
    public static int binarySearch(int[] a, int x) {
        int left = 0;
        int right = a.length - 1;
        int mid;

        while(left <= right) {
            mid = (left + right) / 2;
            if(a[mid] == x) return mid;
            else if (a[mid] > x) right = mid - 1;
            else left = mid + 1;
        }

        return -1;
    }

    public static int binarySearchRecursive(int[] a, int x, int left, int right) {
        int mid = (left + right) / 2;
        if(a[mid] == x) return mid;
        else if(a[mid] > x) return binarySearchRecursive(a, x, left, mid - 1);
        else return binarySearchRecursive(a, x, mid + 1, right);

    }
}
