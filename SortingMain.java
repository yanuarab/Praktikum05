public class SortingMain {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        Sorting dataurut1 = new Sorting(a, a.length);

        System.out.println("Data Awal:");
        dataurut1.tampil();

        dataurut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC):");
        dataurut1.tampil();
    }
}

