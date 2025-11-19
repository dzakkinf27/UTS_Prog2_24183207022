public class Pegawai {
    private String nip; // Nomor Induk Pegawai
    private String nama;
    private String jabatan;
    private String gajiPokok;

    public Pegawai() {//constructor tanpa parameter
        this.nip = "0000";
        this.nama = "Nama Default";
        this.jabatan = "Staf";
        this.gajiPokok = "0";
    }

    public Pegawai(String nip, String nama, String jabatan, String gajiPokok) {//constructor dengan parameter
        this.nip = nip;
        this.nama = nama;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
    }
    //method SET
    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void setGajiPokok(String gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    //method GET
    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public String getGajiPokok() {
        return gajiPokok;
    }

    public void tampilkanData() {
    //method untuk menampilkan opsi pilihan
        System.out.println("---------------------------------");
        System.out.println("NIP     : " + nip);
        System.out.println("Nama    : " + nama);
        System.out.println("Jabatan : " + jabatan);
        System.out.println("Gaji    : Rp "+ gajiPokok); 
        System.out.println("---------------------------------");
    }
}
