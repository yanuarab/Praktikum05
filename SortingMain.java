public class SortingMain {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        int b [] = {30,20, 2, 8, 14};
        int c [] = {40, 10, 4, 9, 3};
        Sorting dataurut1 = new Sorting(a, a.length);
        Sorting dataurut2 = new Sorting(b, b.length);
        Sorting dataurut3 = new Sorting(c, c.length);

        System.out.println("Data Awal:");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC):");
        dataurut1.tampil();

        System.out.println("Data Awal 2");
        dataurut2.tampil();
        dataurut2.SelectionSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC):");
        dataurut2.tampil();

        System.out.println("Data Awal 3");
        dataurut3.tampil();
        dataurut3.insertionSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC):");
        dataurut3.tampil();

    }
}

