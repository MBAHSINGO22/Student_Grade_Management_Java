package Modul_3;

// Mengimpor kelas Pegawai dari paket Modul_2
import Modul_2.Pegawai;

public class ProgramStudiMain {
    // Metode utama yang dijalankan saat program dijalankan
    public static void main(String[] args) {
        
        // Membuat objek Pegawai dengan parameter "123456", "Eugenius Kriswinar Adi Cahya S.Kom, M.Si, Ph.D", 2, true, 2
        Pegawai pegawai = new Pegawai ("123456", "Eugenius Kriswinar Adi Cahya S.Kom, M.Si, Ph.D", 2, true, 2);

        // Membuat objek ProgramStudi dengan parameter "INFO01", "INFORMATIKA", dan objek pegawai yang telah dibuat sebelumnya
        
        ProgramStudi programStudi = new ProgramStudi("INFO01", "INFORMATIKA", pegawai);

        // Mencetak nama program studi
        
        System.out.println("Program Studi: " + programStudi.getnamaprodi());
        // Mencetak nama ketua program studi dan NIP-nya
        System.out.println("Diketuai oleh: " + programStudi.getketuaprodi().getNama() + "   NIP:"+ pegawai.getNIP());
    }
}
