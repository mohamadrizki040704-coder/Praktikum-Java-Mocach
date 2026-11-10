package latihan1; 

class Mahasiswa {
    String nama;
    String alamat;
    int umur;
    int nim;
    

    void tampilkanBiodata() {
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Umur : " + umur);
        System.out.println("NIM : " + nim);
    }

}

public class main {

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();


        mhs.nama = "Mohamad Rizki";
        mhs.alamat = "Jl. Blok Benda";
        mhs.umur = 19;
        mhs.nim = 2509025;
   
        mhs.tampilkanBiodata();
    }
}