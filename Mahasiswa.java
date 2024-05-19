public class Mahasiswa {
    private String nama;
    private String npm;
    private String jurusan;

    public Mahasiswa(){
        
    }

    public Mahasiswa(String nama, String npm, String jurusan) {
        this.nama = nama;
        this.npm = npm;
        this.jurusan = jurusan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public String getJurusan() {
        return jurusan;
    }
}
