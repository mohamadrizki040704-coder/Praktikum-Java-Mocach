package praktikum3.tugas3;

public class Main {
    public static void main(String[] args) {
        
        Mahasiswa mhs1 = new Mahasiswa("Moki", "220101001", "Teknik Informatika");
        mhs1.setNilaiAkhir(85);

        Mahasiswa mhs2 = new Mahasiswa("Roronoa", "220101002", "Teknologi Rekayasa Komputer");
        mhs2.setNilaiAkhir(55);

        System.out.println("=== DATA MAHASISWA 1 ===");
        mhs1.tampilInformasi();

        System.out.println("\n=== DATA MAHASISWA 2 ===");
        mhs2.tampilInformasi();
    }
}