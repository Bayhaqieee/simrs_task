public class pasien {
    int id;
    String nama;
    int umur;
    String alamat;
    
    public pasien(int id, String nama, int umur, String alamat) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }
    
    public String toString() {
        return "ID: " + id + ", Nama: " + nama + ", Umur: " + umur + ", Alamat: " + alamat;
    }
}