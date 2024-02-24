/**
 * <TUGAS 3 Object Class Encapsulation>
 * Author  : Nobby Dharma Khaulid
 * NIM     : 231524020
 * Tanggal : 22 Februari 2024
 */


//Class MenuMakanan merepresentasikan sebuah menu makanan dengan attributes nama, harga, dan stok
class MenuMakanan {
    private String nama; //Nama menu
    private double harga; //Harga menu
    private int stok; //Stok menu

    //Konstruktor untuk membuat objek MenuMakanan dengan nama, harga, dan stok tertentu
    public MenuMakanan(String nama, double harga, int stok) {
        this.nama = nama; //Inisialisasi nama menu
        this.harga = harga; //Inisialisasi harga menu
        this.stok = stok; //Inisialisasi stok menu
    }

    //Untuk mendapatkan nama menu
    public String getNama() {
        return nama;
    }

    //Untuk mendapatkan harga menu
    public double getHarga() {
        return harga;
    }

    //Untuk mendapatkan stok menu
    public int getStok() {
        return stok;
    }

    //Fungsi untuk Memeriksa apakah stok Makanan habis
    public boolean isOutOfStock() {
        return stok == 0;
    }
    
    public void kurangiStok(int jumlah) {    //Prosedur Untuk Mengurangi stok makanan setelah pembelian
        stok -= jumlah;
    }
}
