package Quiz;

public class Bem extends AnggotaOrmawa {
    public Bem(String nama, String nim, String prodi, int tahunMasuk, String namaOrganisasi, String Jabatan, int tahunbergabung) {
        super(nama, nim, prodi, tahunMasuk, namaOrganisasi, Jabatan, tahunbergabung);
    }

    @Override
    public void TampilkanProker() {
        System.out.println(); 
        System.out.println("[ Program Kerja BEM ]");
        System.out.println("1. Mengadakan kegiatan sosial");
        System.out.println("2. Mengadakan seminar dan workshop");
        System.out.println("3. Mengadakan lomba dan kompetisi\n");
    }
}