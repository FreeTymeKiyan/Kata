class MergeSort10 {
    public static void sort(int[] array, int low, int high) {
        if(low < high) {
            int middle = low + (high - low) / 2;
            sort(array, low, middle);
            sort(array, middle + 1, high);
            merge(array, low, middle, high);
        }
    }

    private static void merge(int[] array, int low, int middle, int high) {
        int[] helper = new int[array.length];
        for(int i = low; i <= high; i++) {
            helper[i] = array[i];
        }

        int left = low;
        int right = middle + 1;
        int curIdx = low;

        while(left <= middle && right <= high) {
            if(helper[left] <= helper[right]) {
                array[curIdx++] = helper[left++];
            } else {
                array[curIdx++] = helper[right++];     
            }
        }

        int remain = middle - left;

        for(int i = 0; i <= remain; i++) {
            array[i + curIdx] = helper[left + i];
        }
    }
}
