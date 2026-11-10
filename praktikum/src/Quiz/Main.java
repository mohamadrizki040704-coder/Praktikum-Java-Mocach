package Quiz;

public class Main {
    public static void main(String[] args) {
        
        AnggotaOrmawa bem = new Bem("Roronoa", "25090100", "Teknologi Rekayasa Komputer", 2024, "BEM", "Ketua", 2025);
        AnggotaOrmawa hima = new Hima("Yami", "25090101", "Data Science", 2024, "HIMA", "Ketua", 2025);
        AnggotaOrmawa ukm = new UKM("Sanji", "25090103", "Teknologi Rekayasa Komputer", 2024, "UKM", "Ketua", 2025);
        AnggotaOrmawa mpm = new MPM("Zoro", "25090102", "Teknologi Rekayasa Komputer", 2024, "MPM", "Ketua", 2025);
        AnggotaOrmawa forumKomunikasi = new Forumkomunikasi("Nami", "25090104", "Teknologi Rekayasa Komputer", 2024, "Forum Komunikasi", "Ketua", 2025);

        bem.tampilkanData(); 
        bem.TampilkanProker();

        System.out.println(); 
        hima.tampilkanData();
        hima.TampilkanProker();

        System.out.println(); 
        mpm.tampilkanData();
        mpm.TampilkanProker();

        System.out.println(); 
        ukm.tampilkanData();
        ukm.TampilkanProker();

        System.out.println();
        forumKomunikasi.tampilkanData();
        forumKomunikasi.TampilkanProker();
    }
}