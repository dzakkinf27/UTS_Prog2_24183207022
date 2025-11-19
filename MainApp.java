import java.util.ArrayList;
import java.util.Scanner;
public class MainApp{
private static ArrayList<Pegawai> listPegawai = new ArrayList<>();//array untuk menyimpan data Pegawai
private static Scanner scanner = new Scanner(System.in);

public static void main(String[] args) {
    int pilihan; //variabel untuk menampilkan opsi pilihan
    do {
        tampilkanMenu();//langsung menampilkan menu di awal
        pilihan = scanner.nextInt(); 
        scanner.nextLine();//scanner untuk user melakukan input opsi

        if (pilihan == 1) { //Menambah data
                tambahDataPegawai();
            } else if (pilihan == 2) { //Menampilkan semua data
                tampilkanSemuaData();
            } else if (pilihan == 3) { //Keluar dari program
                System.out.println("Terima kasih! Program selesai.");
            } else { // Pengganti 'default': Pilihan tidak valid
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
    } 
    while (pilihan != 3);//untuk menutup scanner   
    scanner.close();
}

private static void tampilkanMenu() {//method untuk menampilkan menu opsi
        System.out.println("--- Pengelolaan Data Pegawai ---");
        System.out.println("1. Tambah Data Pegawai");
        System.out.println("2. Tampilkan Semua Data Pegawai");
        System.out.println("3. Keluar");
        System.out.print("Pilih menu (1-3): ");
}

private static void tambahDataPegawai() {//method untuk menambahkan data pegawai
        System.out.println("--- Tambah Data Pegawai ---");
        String nip; 
        String nama;
        String jabatan;
        String gajiPokok;

        System.out.print("Masukkan NIP: ");
        nip = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        nama = scanner.nextLine();
        System.out.print("Masukkan Jabatan: ");
        jabatan = scanner.nextLine();
        System.out.print("Masukkan Gaji Pokok: ");
        gajiPokok = scanner.nextLine();
       
        Pegawai newPegawai = new Pegawai(nip, nama, jabatan, gajiPokok); 
        listPegawai.add(newPegawai); //menyimpan data pada array
        System.out.println("Data Pegawai berhasil ditambahkan!");
}

private static void tampilkanSemuaData() {//method untuk menampilkan semua data
        System.out.println("--- Data Seluruh Pegawai (" + listPegawai.size()+ " data) ---");
        if (listPegawai.isEmpty()) {
            System.out.println("Belum ada data pegawai yang tersimpan.");
            return;
        }
        for (Pegawai pegawai : listPegawai) { 
            pegawai.tampilkanData(); 
        }
    }
}