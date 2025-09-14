package Modul_3;

// Mengimpor kelas Pegawai dari paket Modul_2
import Modul_2.Pegawai;

// Mendefinisikan kelas ProgramStudi
public class ProgramStudi {
    // Atribut kelas ProgramStudi
    private String kode_prodi; // Kode program studi
    private String nama_prodi; // Nama program studi
    private Pegawai ketua_prodi; // Objek Pegawai yang menjadi ketua program studi

    // Konstruktor kelas ProgramStudi
    // Menerima parameter kode_prodi, nama_prodi, dan ketua_prodi
    // dan menginisialisasi atribut kelas dengan nilai yang diterima
    public ProgramStudi (String kode_prodi, String nama_prodi, Pegawai ketua_prodi){
        this.kode_prodi = kode_prodi; // Menetapkan nilai kode_prodi
        this.nama_prodi = nama_prodi; // Menetapkan nilai nama_prodi
        this.ketua_prodi = ketua_prodi; // Menetapkan nilai ketua_prodi
    }

    // Metode getter untuk atribut kode_prodi
    // Mengembalikan nilai dari atribut kode_prodi
    public String getkodeprodi(){
        return kode_prodi;
    }

    // Metode getter untuk atribut nama_prodi
    // Mengembalikan nilai dari atribut nama_prodi
    public String getnamaprodi(){
        return nama_prodi;    
    }

    // Metode getter untuk atribut ketua_prodi
    // Mengembalikan objek Pegawai yang merupakan ketua program studi
    public Pegawai getketuaprodi(){
        return ketua_prodi;    
    }
}