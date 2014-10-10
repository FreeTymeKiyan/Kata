// first merge sort
class MergeSort {

    public static void sort(int[] array, int low, int high) {
        if(low < high) {
            int middle = low + (high - low) / 2;
            sort(array, low, middle);
            sort(array, middle + 1, high);
            merge(array, low, middle, high);
        }
    }

    public static void merge(int[] array, int low, int middle, int high) {
        int[] helperArr = new int[array.length];
        for(int i = low; i <= high; i++) {
            helperArr[i] = array[i];
        }
        
        int helperLeft = low;
        int helperRight = middle + 1;
        int curIdx = low;

        while(helperLeft <= middle && helperRight <= high) {
            if(helperArr[helperLeft] <= helperArr[helperRight]) {
                array[curIdx] = helperArr[helperLeft];
                helperLeft++;
            } else {
                array[curIdx] = helperArr[helperRight];
                helperRight++;
            }
            curIdx++;
        }

        int remaining = middle - helperLeft;
        for(int i = 0; i <= remaining; i++) {
            array[curIdx + i] = helperArr[helperLeft + i];    
        } 
    }
}
