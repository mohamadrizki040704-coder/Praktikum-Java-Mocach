package praktikum2;

public class Mahasiswa {
    String nama;
    String nim;

    
    void tampilkandata() {
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("NIM            : " + nim);
    }

    
    void sapa(String nama) {
        System.out.println("Halo, " + nama);
    }

    
    int hitungNilaiAkhir(int tugas, int uts, int uas) {
        int nilaiAkhir = (tugas + uts + uas) / 3;
        return nilaiAkhir;
    }

    String tentukanGrade(int nilaiAkhir) {
        if (nilaiAkhir >= 85) {
            return "A";
        } else if (nilaiAkhir >= 70) {
            return "B";
        } else if (nilaiAkhir >= 55) {
            return "C";
        } else if (nilaiAkhir >= 40) {
            return "D";
        } else {
            return "E";
        }
    }
}