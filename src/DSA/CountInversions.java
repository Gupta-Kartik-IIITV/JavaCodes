package DSA;

public class CountInversions {

        static long cnt = 0;

        public static void merge(long[] a, long[] b, long[] arr) {
            int n = a.length;
            int m = b.length;

            int i = 0;
            int j = 0;
            int k = 0;

            while (i < n && j < m) {
                if (a[i] <= b[j]) {
                    arr[k++] = a[i++];
                } else {
                    arr[k++] = b[j++];
                    cnt += n - i;
                }
            }

            while (i < n) {
                arr[k++] = a[i++];
            }

            while (j < m) {
                arr[k++] = b[j++];
            }
        }

        public static void mergeSort(long[] arr) {
            int n = arr.length;

            if (n < 2) {
                return;
            }

            int mid = n / 2;
            long[] a = new long[mid];
            long[] b = new long[n - mid];

            for (int i = 0; i < mid; i++) {
                a[i] = arr[i];
            }

            for (int i = 0; i < n - mid; i++) {
                b[i] = arr[i + mid];
            }

            mergeSort(a);
            mergeSort(b);

            merge(a, b, arr);
        }

        public static long getInversions(long[] arr) {
            cnt = 0;  // Reset count before calculation
            mergeSort(arr);
            return cnt;
        }

        public static void main(String[] args) {
            long[] arr = {1, 20, 6, 4, 5};
            System.out.println("Number of inversions: " + getInversions(arr));
        }
    }


