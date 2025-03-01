public class pembayaran {
    int id;
    int idPasien;
    double jumlah;
    String status;
    String metode;

    public pembayaran(int id, int idPasien, double jumlah, String status, String metode) {
        this.id = id;
        this.idPasien = idPasien;
        this.jumlah = jumlah;
        this.status = status;
        this.metode = metode;
    }

    public String toString() {
        return "ID: " + id + ", ID Pasien: " + idPasien + ", Jumlah: " + jumlah + ", Status: " + status + ", Metode: " + metode;
    }
}
