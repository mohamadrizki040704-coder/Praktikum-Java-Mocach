package Quiz;

public class UKM extends AnggotaOrmawa {
    public UKM(String nama, String nim, String prodi, int tahunMasuk, String namaOrganisasi, String Jabatan, int tahunbergabung) {
        super(nama, nim, prodi, tahunMasuk, namaOrganisasi, Jabatan, tahunbergabung);
    }

    @Override
    public void TampilkanProker() {
        System.out.println(); 
        System.out.println("[ Program Kerja UKM ]");
        System.out.println("1. Mengadakan kegiatan olahraga");
        System.out.println("2. Mengadakan kegiatan seni dan budaya");
        System.out.println("3. Mengadakan kegiatan pengembangan diri\n");
    }
    
}
