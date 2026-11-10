package praktikum2.tugas2;

public class Mahasiswa {
    String nama;
    String nim;

    
    double hitungNilaiAkhir(double tugas, double uts, double uas) {
        return (tugas * 0.3) + (uts * 0.3) + (uas * 0.4);
    }

    
    String tentukanGrade(double nilaiAkhir) {
        if (nilaiAkhir >= 80) {
            return "A";
        } else if (nilaiAkhir >= 70) {
            return "B";
        } else if (nilaiAkhir >= 60) {
            return "C";
        } else if (nilaiAkhir >= 50) {
            return "D";
        } else {
            return "E";
        }
    }

    String tentukanStatus(double nilaiAkhir) {
        if (nilaiAkhir >= 60) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }
}