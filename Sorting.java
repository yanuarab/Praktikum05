public class Sorting {
    int[] data;
    int jumlahData;

    Sorting(int Data[], int jmlData) {
        jumlahData = jmlData;
        data = new int[jumlahData];
        for (int i = 0; i < jumlahData; i++) {
            data[i] = Data[i];
        }
    }

    void tampil() {
        for (int i = 0; i < jumlahData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    void bubbleSort() {
        int temp;
        for (int i = 0; i < jumlahData - 1; i++) {
            for (int j = 0; j < jumlahData - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }
}
