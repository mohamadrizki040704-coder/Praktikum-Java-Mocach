package Quiz;

public class MPM extends AnggotaOrmawa {

    public MPM(String nama, String nim, String prodi, int tahunMasuk, String namaOrganisasi, String Jabatan, int tahunbergabung) {
        super(nama, nim, prodi, tahunMasuk, namaOrganisasi, Jabatan, tahunbergabung);
    }

    @Override
    public void TampilkanProker() {
        System.out.println(); 
        System.out.println("[ Program Kerja MPM ]");
        System.out.println("1. Mengadakan rapat koordinasi dengan organisasi mahasiswa");
        System.out.println("2. Mengawasi kegiatan organisasi mahasiswa");
        System.out.println("3. Menyusun laporan kegiatan organisasi mahasiswa\n");
    }
    
}
