class MergeSort4 {
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

        int helperLeft = low;
        int helperRight = middle + 1;
        int curIdx = low;

        while(helperLeft <= middle && helperRight <= high) {
            if(helper[helperLeft] <= helper[helperRight]) {
                array[curIdx++] = helper[helperLeft++];
            } else {
                array[curIdx++] = helper[helperRight++];
            }
        }

        int remain = middle - helperLeft;
        for(int i = 0; i <= remain; i++) {
            array[curIdx + i] = helper[helperLeft + i];
        }
    }
}
