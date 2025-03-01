import java.util.ArrayList;
import java.util.List;

public class dokter {
    int id;
    String nama;
    String spesialis;
    List<String> jadwal = new ArrayList<>();

    public dokter(int id, String nama, String spesialis) {
        this.id = id;
        this.nama = nama;
        this.spesialis = spesialis;
    }

    public void tambahJadwal(String hari, String waktu) {
        jadwal.add(hari + " " + waktu);
    }

    public String toString() {
        return "ID: " + id + ", Nama: " + nama + ", Spesialis: " + spesialis + ", Jadwal: " + jadwal;
    }
}