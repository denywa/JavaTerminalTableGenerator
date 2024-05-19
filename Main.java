public class Main {
    public static void main(String[] args) {
        // Membuat objek MataKuliah
        MataKuliah mk1 = new MataKuliah("Pemrograman", "Senin", "08:00", 2);
        MataKuliah mk2 = new MataKuliah("Basis Data", "Selasa", "10:00", 3);
        MataKuliah mk3 = new MataKuliah("Jaringan Komputer", "Rabu", "13:00", 2);

        // Menggunakan TableGenerator untuk mencetak tabel MataKuliah
        MataKuliah[] mataKuliahList = {mk1, mk2, mk3};
        TableGenerator.printTable(mataKuliahList);

        // Membuat objek Mahasiswa
        Mahasiswa m1 = new Mahasiswa("Andi", "12345", "Informatika");
        Mahasiswa m2 = new Mahasiswa("Budi", "67890", "Sistem Informasi");
        Mahasiswa m3 = new Mahasiswa("Citra", "11223", "Teknik Elektro");
        
        // Membuat ojek Mahasiswa dengan atribull null
        Mahasiswa m4 = new Mahasiswa();
        m4.setNama("Deny");

        // Menggunakan TableGenerator untuk mencetak tabel Mahasiswa
        Mahasiswa[] mahasiswaList = {m1, m2, m3, m4};
        TableGenerator.printTable(mahasiswaList);
    }
}
