package ru.Geekbrains.lesson2;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        int[] a = {0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) a[i] = 1;
            else a[i] = 0;
            System.out.println(a[i]);
        }
    }
    public static void Two() {
        System.out.println("Задание №2");
        int[] a = new int[8];
        for (int b = 0, c = 0; b < a.length; b++, c += 3) {
            a[b] = c;
            System.out.println(a[b]);
        }
    }
    public static void Three() {
        System.out.println("Задание №3");
    int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6) { a[i] *= 2;
        }
            System.out.println(a[i]);
    }
}
    public static void Four() {
        int[][] a = new int[6][6];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == j || i == (a.length - 1 - j)) a[i][j] = 1;
                System.out.print(a[i][j]);
            }
            System.out.print("\r\n");
        }
    }
        public static void Five() {
        int[] a = {2, 4, 7, 87, 3, 9, 6, 1};
        int max = a[0];
        int min = a[0];
        for (int i : a) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
    private static boolean Six(int[] arrParam) {
        int lSum, rSum;

        for (int i = 0; i < arrParam.length + 1; i++) {
            lSum = 0;
            rSum = 0;

            for (int j = 0; j < i; j++) {
                lSum += arrParam[j];
            }

            for (int j = i; j < arrParam.length; j++) {
                rSum += arrParam[j];
            }

            if (lSum == rSum) return true;
        }
        return false;
    }
    private static void Seven(int[] arrParam, int n) {
        //посмотрим матрицу до сдвига
        for (int i : arrParam) System.out.print(i + " ");
        System.out.println("\r\n");
        if (n > 0) {
            for (int x = 0; x < n; x++) {
                int buf = arrParam[arrParam.length - 1];
                if (arrParam.length - 1 >= 0) System.arraycopy(arrParam, 0, arrParam, 1, arrParam.length - 1);
                arrParam[0] = buf;
                //смотрим матрицу после каждого сдвига
                for (int i : arrParam) System.out.print(i + " ");
                System.out.println();
            }
        }
        if (n < 0) {
            for (int x = 0; x > n; x--) {
                int buf = arrParam[0];
                System.arraycopy(arrParam, 1, arrParam, 0, arrParam.length - 1);
                arrParam[arrParam.length - 1] = buf;
                //смотрим матрицу после каждого сдвига
                for (int i : arrParam) System.out.print(i + " ");
                System.out.print("\r\n");
            }
        }
    }
}