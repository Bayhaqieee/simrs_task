import java.util.ArrayList;
import java.util.List;

public class simrs {
    List<pasien> pasienList = new ArrayList<>();
    List<dokter> dokterList = new ArrayList<>();
    List<pembayaran> pembayaranList = new ArrayList<>();
    farmasi farmasi = new farmasi();

    public void tambahpasien(pasien pasien) {
        pasienList.add(pasien);
    }

    public void tambahdokter(dokter dokter) {
        dokterList.add(dokter);
    }

    public void tambahpembayaran(pembayaran pembayaran) {
        pembayaranList.add(pembayaran);
    }

    public void tampilkanSemuapasien() {
        for (pasien p : pasienList) {
            System.out.println(p);
        }
    }

    public void tampilkanSemuadokter() {
        for (dokter d : dokterList) {
            System.out.println(d);
        }
    }

    public void tampilkanSemuapembayaran() {
        for (pembayaran p : pembayaranList) {
            System.out.println(p);
        }
    }
}