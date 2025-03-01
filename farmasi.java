import java.util.HashMap;
import java.util.Map;

public class farmasi {
    Map<String, Integer> stokObat = new HashMap<>();

    public void tambahObat(String nama, int jumlah) {
        stokObat.put(nama, stokObat.getOrDefault(nama, 0) + jumlah);
    }

    public void kurangiObat(String nama, int jumlah) {
        if (stokObat.containsKey(nama) && stokObat.get(nama) >= jumlah) {
            stokObat.put(nama, stokObat.get(nama) - jumlah);
        }
    }

    public String toString() {
        return "Stok Obat: " + stokObat;
    }
}
