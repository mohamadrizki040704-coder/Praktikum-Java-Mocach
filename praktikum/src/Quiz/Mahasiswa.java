package Quiz;

public class Mahasiswa { //encapsulatiion menggunakan access modifier private
  private String nama;
  private String nim;
  private String prodi;
  private int tahunMasuk;

  public Mahasiswa(String nama, String nim, String prodi, int tahunMasuk) { //consuctor untuk menginisialisasi nilai atribut
    this.nama = nama;
    this.nim = nim;
    this.prodi = prodi;
    this.tahunMasuk = tahunMasuk;

  }

  public void tampilkanDataMahasiswa() {
        System.out.println("DATA ANGGOTA ORMAWA");
        System.out.println("[ Data Mahasiswa ]");
        System.out.println("Nama            : " + this.nama);
        System.out.println("NIM             : " + this.nim);
        System.out.println("Program Studi   : " + this.prodi);
        System.out.println("Tahun Masuk     : " + this.tahunMasuk);
    
  }

  public void tampilkanDataMahasiswa(boolean detail) { //method untuk menampilkan data mahasiswa dengan parameter
   tampilkanDataMahasiswa();
   if (detail) {
    System.out.println("Detail: " + detail);
   }
  }

}

