package praktikum3.tugas3;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String prodi;
    private double nilaiAkhir;

    
    public Mahasiswa(String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.nilaiAkhir = 0.0;
    }

    public void setNilaiAkhir(double nilaiAkhir) {
        this.nilaiAkhir = nilaiAkhir;
    }

    public String hitungGrade() {
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

    public String cekStatus() {
        if (nilaiAkhir >= 60) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }

    
    public void tampilInformasi() {
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("NIM            : " + nim);
        System.out.println("Program Studi  : " + prodi);
        System.out.println("Nilai Akhir    : " + nilaiAkhir);
        System.out.println("Grade          : " + hitungGrade());
        System.out.println("Status         : " + cekStatus());
    }
}