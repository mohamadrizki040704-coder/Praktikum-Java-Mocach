package praktikum2;

public class Main {

    public static void main(String[] args) {
       
        Mahasiswa mhs1 = new Mahasiswa();

        
        mhs1.nama = "Mohamad Rizki";
        mhs1.nim = "2504025";

        
        mhs1.tampilkandata();
        mhs1.sapa(mhs1.nama);

       
        int nilai = mhs1.hitungNilaiAkhir(80, 90, 85);
        System.out.println("Nilai Akhir    : " + nilai);

        String grade = mhs1.tentukanGrade(nilai);
        System.out.println("Grade          : " + grade);
    }
    
}