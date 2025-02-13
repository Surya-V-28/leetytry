
class MergeSort {

    static int inversionCount(int arr[]) {
        return mergeSort(arr, 0, arr.length - 1, 0);
    }

    static Integer mergeSort(int[] arr, int l, int r, Integer count) {
        if (l < r) {
            int m = (l + r) / 2;
            count = mergeSort(arr, l, m, count);
            count = mergeSort(arr, m + 1, r, count);
            count = mergeArray(arr, l, m, r, count);
        }
        return count;
    }

    static Integer mergeArray(int[] arr, int l, int m, int r, Integer count) {
        int[] c1 = new int[m - l + 1];
        int[] c2 = new int[r - m];

        for (int i = 0; i < c1.length; i++) {
            c1[i] = arr[i + l];
        }
        for (int i = 0; i < c2.length; i++) {
            c2[i] = arr[i + m + 1];
        }

        int i = 0, j = 0, k = l;
        while (i < c1.length && j < c2.length) {
            if (c1[i] <= c2[j]) {
                arr[k++] = c1[i++]; 
            }else {
                count = count + (c1.length - i);
                arr[k++] = c2[j++];
            }
        }
        while (i < c1.length) {
            arr[k++] = c1[i++];
        }
        while (j < c2.length) {
            arr[k++] = c2[j++];
        }
        return count;
    }
}
