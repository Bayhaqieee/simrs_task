import java.util.*;
class SIMRS {
    List<Pasien> pasienList = new ArrayList<>();
    List<Dokter> dokterList = new ArrayList<>();
    List<Pembayaran> pembayaranList = new ArrayList<>();
    Farmasi farmasi = new Farmasi();
    
    public void tambahPasien(Pasien pasien) {
        pasienList.add(pasien);
    }
    
    public void tambahDokter(Dokter dokter) {
        dokterList.add(dokter);
    }
    
    public void tambahPembayaran(Pembayaran pembayaran) {
        pembayaranList.add(pembayaran);
    }
    
    public void tampilkanSemuaPasien() {
        for (Pasien p : pasienList) {
            System.out.println(p);
        }
    }
    
    public void tampilkanSemuaDokter() {
        for (Dokter d : dokterList) {
            System.out.println(d);
        }
    }
    
    public void tampilkanSemuaPembayaran() {
        for (Pembayaran p : pembayaranList) {
            System.out.println(p);
        }
    }
}