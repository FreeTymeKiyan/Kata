// main class of kata mergesort
class Main {

    static int[] array = {17, 
        16,
        17,
        17,
        18,
        3,
        20,
        1,
        2,
        16,
        11,
        17,
        17,
        5,
        7,
        11,
        18,
        1,
        20,
        10
    };

    public static void main(String args[]) {
        printArr(array);  
        //QuickSort.sort(array, 0, array.length - 1);
        //QuickSort1.sort(array, 0, array.length - 1);
        //QuickSort2.sort(array, 0, array.length - 1);
        //QuickSort3.sort(array, 0, array.length - 1);
        //QuickSort4.sort(array, 0, array.length - 1);
        //QuickSort5.sort(array, 0, array.length - 1);
        //QuickSort6.sort(array, 0, array.length - 1);
        //QuickSort7.sort(array, 0, array.length - 1);
        //QuickSort8.sort(array, 0, array.length - 1);
        //QuickSort9.sort(array, 0, array.length - 1);
        //QuickSort10.sort(array, 0, array.length - 1);
        QuickSort11.sort(array, 0, array.length - 1);
        printArr(array);
    }

    private static void printArr(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }    
        System.out.println();
    }
}
