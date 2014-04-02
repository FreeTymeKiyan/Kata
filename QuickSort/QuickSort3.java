class QuickSort3 {
    public static void sort(int[] array, int left, int right) {
        int index = partition(array, left, right);
        if(left < index - 1) sort(array, left, index - 1);
        if(right > index) sort(array, index, right);
    }

    private static void partition(int[] array, int left, int right) {
        int pivot = array[(left + right) / 2];
        while(left <= right) {
            while(array[left] < pivot) left++;
            while(array[right] > pivot) right--;
            if(left <= right) {
                swap(array, left, right);
                right--;
                left++;
            }
        }
        return left;
    }

    private static void swap(array, left, right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
