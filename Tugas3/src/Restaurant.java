

/**
 * <TUGAS 3 Object Class Encapsulation>
 * Author  : Nobby Dharma Khaulid
 * NIM     : 231524020
 * Tanggal : 22 Februari 2024
 */


 //Class Restaurant untuk merepresentasikan restaurant dengan daftar menu makanan
 class Restaurant {
    private MenuMakanan[] daftarMenu;   //Array untuk menyimpan menu makanan
    private int jumlahMenu; //Jumlah menu makanan yang ditambahkan

    public MenuMakanan[] getDaftarMenu() {
        return daftarMenu;
    }

    public void setDaftarMenu(MenuMakanan[] daftarMenu) {
        this.daftarMenu = daftarMenu;
    }

    public int getJumlahMenu() {
        return jumlahMenu;
    }

    public void setJumlahMenu(int jumlahMenu) {
        this.jumlahMenu = jumlahMenu;
    }

   //Constructor untuk membuat objek Restaurant dengan jumlah maksimum menu tertentu
   public Restaurant(int maxMenu) {
    daftarMenu = new MenuMakanan[maxMenu]; //Inisialisasi array daftarMenu
    jumlahMenu = 0; //Set jumlah menu awal menjadi 0
}

    //Prosedur untuk menambahkan menu makanan ke dalam restoran yang nantinya akan dipanggi oleh RestaurantMain
    public void tambahMenuMakanan(MenuMakanan menu) { 
        //Cek apakah masih ada tempat kosong untuk menambahkan menu baru
        if (jumlahMenu < daftarMenu.length) {
            daftarMenu[jumlahMenu] = menu; //Menambahkan menu ke dalam array
            jumlahMenu++; //Menambahkan jumlah menu
        } else {
            System.out.println("Maaf, jumlah maksimum menu telah tercapai.");
        }
    }

    //Prosedur untuk menampilkan menu makanan yang tersedia di restoran yang nantinya akan dipanggi oleh RestaurantMain
    public void tampilMenuMakanan() {
        System.out.println("\tMenu Makanan ");
        System.out.println("===========================");
        for (int i = 0; i < jumlahMenu; i++) {
            if (!daftarMenu[i].isOutOfStock()) { //Kondisi untuk mengecek apakah stok masih tersedia atau sudah habis
                //menampilkan nama menu, stok, dan harga
                System.out.println(daftarMenu[i].getNama() + "[" + daftarMenu[i].getStok() + "]" + "\tRp. " + daftarMenu[i].getHarga());
            }   
        }
    }

     //Prosedur untuk memesan menu yang nantinya akan dipanggil oleh RestaurantMain
     public void pesanMenu(String namaMenu, int jumlahPesan) {
        for (int i = 0; i < jumlahMenu; i++) {
            if (daftarMenu[i].getNama().equalsIgnoreCase(namaMenu)) {
                if (daftarMenu[i].getStok() >= jumlahPesan) {
                    double totalPembayaran = daftarMenu[i].getHarga() * jumlahPesan; // Menambahkan total pembayaran
                    daftarMenu[i].kurangiStok(jumlahPesan);
                    System.out.println("Pemesanan berhasil!");
                    System.out.println("Total pembayaran : " + totalPembayaran);
                    System.out.println("Stok yang tersedia " +daftarMenu[i].getNama()+ ":" +daftarMenu[i].getStok());
                    return;
                } 
                else {
                    System.out.println("Maaf, stok tidak mencukupi untuk pemesanan ini.");
                    return;
                }
            }
        }
        System.out.println("Menu tidak ditemukan.");
    }
 }


