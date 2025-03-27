package PRAKTIKUM05;
import java.util.Scanner;
public class Mahasiswa25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = input.nextInt();
        input.nextLine();

        MahasiswaBerprestasi25 list = new MahasiswaBerprestasi25();

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = input.nextLine();
            System.out.print("Nama  : ");
            String nama = input.nextLine();
            System.out.print("Kelas : ");
            String kelas = input.nextLine();
            System.out.print("IPK   : ");
            double ipk = input.nextDouble();
            input.nextLine();  

            Mahasiswa25 m = new Mahasiswa25(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("\nData mahasiswa sebelum sorting:");
        list.tampil();

        list.bubbleSort();
        System.out.println("\nData mahasiswa setelah sorting berdasarkan IPK (DESC):");
        list.tampil();
    }
    
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa25() {
    }

    Mahasiswa25(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }
}