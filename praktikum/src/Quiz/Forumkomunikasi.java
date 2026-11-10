package Quiz;

public class Forumkomunikasi extends AnggotaOrmawa {

    public Forumkomunikasi(String nama, String nim, String prodi, int tahunMasuk, String namaOrganisasi, String Jabatan, int tahunbergabung) {
        super(nama, nim, prodi, tahunMasuk, namaOrganisasi, Jabatan, tahunbergabung);
    }

    @Override
    public void TampilkanProker() {
        System.out.println(); 
        System.out.println("[ Program Kerja Forum Komunikasi ]");
        System.out.println("1. Mengadakan diskusi dan forum diskusi");
        System.out.println("2. Mengelola media sosial organisasi");
        System.out.println("3. Menyelenggarakan acara komunikasi\n");
    }
    
}
