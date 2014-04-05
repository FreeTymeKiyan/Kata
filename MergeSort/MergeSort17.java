class MergeSort17 {
    public static void sort(int[] array, int low, int high) {
        if(low < high) {
            int middle = low + (high - low) / 2;
            sort(array, low, middle);
            sort(array, middle + 1, high);
            merge(array, low, middle, high);
        }
    }

    public static void merge(int[] array, int low, int middle, int high) {
        int[] helper = new int[array.length];
        for(int i = low; i <= high; i++) {
            helper[i] = array[i];
        }

        int left = low;
        int right = middle + 1;
        int idx = low;
        while(left <= middle && right <= high) {
            if(helper[left] <= helper[right]) {
                array[idx++] = helper[left++];
            } else {
                array[idx++] = helper[right++];
            }
        }

        int remain = middle - left;
        for(int i = 0; i <= remain; i++) {
            array[idx + i] = helper[left + i];
        }
    }
}
