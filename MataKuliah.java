public class MataKuliah {
    private String Nama;
    private String Hari;
    private String Jam;
    private int Durasi;

    public MataKuliah(String Nama, String Hari, String Jam, int Durasi) {
        this.Nama = Nama;
        this.Hari = Hari;
        this.Jam = Jam;
        this.Durasi = Durasi;
    }

    public String getNama() {
        return Nama;
    }

    public String getHari() {
        return Hari;
    }

    public String getJam() {
        return Jam;
    }

    public int getDurasi() {
        return Durasi;
    }

    public static void main(String[] args) {
        // Membuat objek MataKuliah
        MataKuliah mk1 = new MataKuliah("Pemrograman", "Senin", "08:00", 2);
        MataKuliah mk2 = new MataKuliah("Basis Data", "Selasa", "10:00", 3);
        MataKuliah mk3 = new MataKuliah("Jaringan Komputer", "Rabu", "13:00", 2);

        // Menggunakan TableGenerator untuk mencetak tabel
        MataKuliah[] mataKuliahList = {mk1, mk2, mk3};
        TableGenerator.printTable(mataKuliahList);
    }
}
