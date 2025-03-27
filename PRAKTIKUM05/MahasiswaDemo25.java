package PRAKTIKUM05;
import java.util.Scanner; 
 
public class MahasiswaDemo25 { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        System.out.print("Masukkan jumlah mahasiswa: "); 
        int jumlahMahasiswa = scanner.nextInt(); 
        scanner.nextLine();  
        MahasiswaBerprestasi25 list = new 
MahasiswaBerprestasi25(jumlahMahasiswa); 
 
        for (int i = 0; i < jumlahMahasiswa; i++) { 
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + 
":"); 
 
            System.out.print("NIM: "); 
            String nim = scanner.nextLine(); 
 
            System.out.print("Nama: "); 
            String nama = scanner.nextLine(); 
 
            System.out.print("Kelas: "); 
            String kelas = scanner.nextLine(); 
 
            System.out.print("IPK: "); 
            double ipk = scanner.nextDouble(); 
            scanner.nextLine();  
            System.out.println("--------------------"); 
            list.tambah(new Mahasiswa25(nim, nama, kelas, ipk)); 
        } 
        list.tampil(); 
 
        System.out.println("-----------------------------");   
        System.out.println("Pencarian data"); 
        System.out.println("-----------------------------"); 
        System.out.println("Masukkan IPK mahasiswa yang dicari: "); 
        System.out.print("IPK: "); 
        double cari = scanner.nextDouble(); 
 
        System.out.println("menggunakan sequential searching"); 
        double posisi = list.sequentialSearching(cari); 
        int pss = (int) posisi; 
        list.tampilPosisi(cari, pss); 
        list.tampilDataSearch(cari, pss); 
        scanner.close(); 
    } 
} 
