package praktikum2.tugas2;

public class Main {
    public static void main(String[] args) {
        
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Mai Sakurajimai";
        mhs1.nim = "2301005";

        double nilaiAkhir1 = mhs1.hitungNilaiAkhir(50, 40, 55); 
        String grade1 = mhs1.tentukanGrade(nilaiAkhir1);
        String status1 = mhs1.tentukanStatus(nilaiAkhir1);

        System.out.println("Nama        : " + mhs1.nama);
        System.out.println("NIM         : " + mhs1.nim);
        System.out.println("Nilai Akhir : " + (int) nilaiAkhir1);
        System.out.println("Grade       : " + grade1);
        System.out.println("Status      : " + status1);

        System.out.println("===============================");

        
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nama = "kadal mexico";
        mhs2.nim = "2301010";

        double nilaiAkhir2 = mhs2.hitungNilaiAkhir(80, 80, 85);
        String grade2 = mhs2.tentukanGrade(nilaiAkhir2);
        String status2 = mhs2.tentukanStatus(nilaiAkhir2);

        System.out.println("Nama        : " + mhs2.nama);
        System.out.println("NIM         : " + mhs2.nim);
        System.out.println("Nilai Akhir : " + (int) nilaiAkhir2);
        System.out.println("Grade       : " + grade2);
        System.out.println("Status      : " + status2);
    }
}