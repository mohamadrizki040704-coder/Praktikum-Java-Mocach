// 1. Kelas Induk (Superclass): Pegawai
class Pegawai {
    protected String nama;
    protected String nomorIdentitas;

    public Pegawai(String nama, String nomorIdentitas) {
        this.nama = nama;
        this.nomorIdentitas = nomorIdentitas;
    }

    public void tampilkanDataPegawai() {
        System.out.println("Nama: " + nama);
        System.out.println("Nomor Identitas: " + nomorIdentitas);
    }
}


class Dosen extends Pegawai {
    private String bidangKeahlian;
    private int jumlahSKS;

    public Dosen(String nama, String nomorIdentitas, String bidangKeahlian, int jumlahSKS) {
       
        super(nama, nomorIdentitas); 
        this.bidangKeahlian = bidangKeahlian;
        this.jumlahSKS = jumlahSKS;
    }

   
    @Override
    public void tampilkanDataPegawai() {
        super.tampilkanDataPegawai();
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println("Jumlah SKS: " + jumlahSKS);
    }
}


class Staf extends Pegawai {
    private String bagianKerja;
    private int jamKerjaPerHari;

    public Staf(String nama, String nomorIdentitas, String bagianKerja, int jamKerjaPerHari) {
       
        super(nama, nomorIdentitas);
        this.bagianKerja = bagianKerja;
        this.jamKerjaPerHari = jamKerjaPerHari;
    }

    
    @Override
    public void tampilkanDataPegawai() {
        super.tampilkanDataPegawai();
        System.out.println("Bagian Kerja: " + bagianKerja);
        System.out.println("Jam Kerja per Hari: " + jamKerjaPerHari);
    }
}


public class Main {
    public static void main(String[] args) {
       
        Dosen dosen1 = new Dosen("Fulan", "D001", "Algoritma Pemrograman", 12);
        Dosen dosen2 = new Dosen("Fulanah", "D002", "Jaringan Komputer", 10);

        
        Staf staf1 = new Staf("Mas A", "S001", "Akademik", 8);
        Staf staf2 = new Staf("Mbak O", "S002", "Keuangan", 8);

        System.out.println("=== DATA DOSEN ===");
        dosen1.tampilkanDataPegawai();
        System.out.println(); 
        dosen2.tampilkanDataPegawai();
        System.out.println();

      
        System.out.println("=== DATA STAF ===");
        staf1.tampilkanDataPegawai();
        System.out.println();
        staf2.tampilkanDataPegawai();
    }
}