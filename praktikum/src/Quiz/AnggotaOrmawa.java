package Quiz;
//inheritance dari class Mahasiswa untuk mewarisi atribut dan method dari class Mahasiswa
public class AnggotaOrmawa extends Mahasiswa { 
    private String namaOrganisasi;
    private String Jabatan;
    private int tahunbergabung;


    public AnggotaOrmawa(String nama, String nim, String prodi, int tahunMasuk, String namaOrganisasi, String Jabatan, int tahunbergabung) {
        super(nama, nim, prodi, tahunMasuk); //memanggil constructor dari class Mahasiswa
        this.namaOrganisasi = namaOrganisasi;
        this.Jabatan = Jabatan;
        this.tahunbergabung = tahunbergabung;
    }

    public void tampilkanData() {
        super.tampilkanDataMahasiswa(); 
        System.out.println(); 
        System.out.println("[ Data Organisasi ]");
        System.out.println("Organisasi      : " + this.namaOrganisasi);
        System.out.println("Jabatan         : " + this.Jabatan);
        System.out.println("Tahun Bergabung : " + this.tahunbergabung);

    }

    public void TampilkanProker(){
    System.out.println("Program Kerja Organisasi: Belum ada Program Kerja Spesifik");


    
    }

}
