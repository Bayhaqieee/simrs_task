import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        simrs sistem = new simrs();

        while (true) {
            System.out.println("\n=== Sistem Rumah Sakit ===");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Tambah Dokter");
            System.out.println("3. Tampilkan Semua Pasien");
            System.out.println("4. Tampilkan Semua Dokter");
            System.out.println("5. Tambah Obat ke Farmasi");
            System.out.println("6. Tampilkan Stok Obat");
            System.out.println("7. Tambah Pembayaran");
            System.out.println("8. Tampilkan Semua Pembayaran");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan ID Pasien: ");
                    int idPasien = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan Nama Pasien: ");
                    String namaPasien = scanner.nextLine();
                    System.out.print("Masukkan Umur Pasien: ");
                    int umurPasien = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan Alamat Pasien: ");
                    String alamatPasien = scanner.nextLine();
                    sistem.tambahpasien(new pasien(idPasien, namaPasien, umurPasien, alamatPasien));
                    break;
                case 2:
                    System.out.print("Masukkan ID Dokter: ");
                    int idDokter = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan Nama Dokter: ");
                    String namaDokter = scanner.nextLine();
                    System.out.print("Masukkan Spesialis Dokter: ");
                    String spesialisDokter = scanner.nextLine();
                    sistem.tambahdokter(new dokter(idDokter, namaDokter, spesialisDokter));
                    break;
                case 3:
                    sistem.tampilkanSemuapasien();
                    break;
                case 4:
                    sistem.tampilkanSemuadokter();
                    break;
                case 5:
                    System.out.print("Masukkan Nama Obat: ");
                    String namaObat = scanner.nextLine();
                    System.out.print("Masukkan Jumlah Obat: ");
                    int jumlahObat = scanner.nextInt();
                    sistem.farmasi.tambahObat(namaObat, jumlahObat);
                    break;
                case 6:
                    System.out.println(sistem.farmasi);
                    break;
                case 7:
                    System.out.print("Masukkan ID Pembayaran: ");
                    int idBayar = scanner.nextInt();
                    System.out.print("Masukkan ID Pasien: ");
                    int idP = scanner.nextInt();
                    System.out.print("Masukkan Jumlah Pembayaran: ");
                    double jumlah = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Masukkan Status (Lunas/Tidak Lunas/Kredit): ");
                    String status = scanner.nextLine();
                    System.out.print("Masukkan Metode (Cash/Kredit): ");
                    String metode = scanner.nextLine();
                    sistem.tambahpembayaran(new pembayaran(idBayar, idP, jumlah, status, metode));
                    break;
                case 8:
                    sistem.tampilkanSemuapembayaran();
                    break;
                case 0:
                    System.out.println("Keluar dari sistem.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}