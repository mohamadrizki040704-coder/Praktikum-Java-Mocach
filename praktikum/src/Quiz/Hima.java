package Quiz;

public class Hima extends AnggotaOrmawa {

    public Hima(String nama, String nim, String prodi, int tahunMasuk, String namaOrganisasi, String Jabatan, int tahunbergabung) {
        super(nama, nim, prodi, tahunMasuk, namaOrganisasi, Jabatan, tahunbergabung);
    }

    @Override // METHOD OVERRIDING: Mengganti method tampilkanProker() dengan proker spesifik HIMA
    public void TampilkanProker() {
        System.out.println(); 
        System.out.println("[ Program Kerja HIMA ]");
        System.out.println("1. Mengadakan kegiatan akademik");
        System.out.println("2. Mengadakan seminar dan workshop");
        System.out.println("3. Mengadakan lomba dan kompetisi\n");
    }
    
}
