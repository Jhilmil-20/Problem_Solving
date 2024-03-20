public static int kthElement(int[] array1, int[] array2, int k) {
        int[] mergedArray = new int[array1.length + array2.length];
        int index1 = 0, index2 = 0, index = 0;
        while (index1 < array1.length && index2 < array2.length) {
            if (array1[index1] < array2[index2]) {
                mergedArray[index++] = array1[index1++];
            } else {
                mergedArray[index++] = array2[index2++];
            }
        }
        while (index1 < array1.length) {
            mergedArray[index++] = array1[index1++];
        }
        while (index2 < array2.length) {
            mergedArray[index++] = array2[index2++];
        }
        Arrays.sort(mergedArray);
        return mergedArray[k - 1];
    }
