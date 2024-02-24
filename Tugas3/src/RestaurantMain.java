/**
 * <TUGAS 3 Object Class Encapsulation>
 * Author  : Nobby Dharma Khaulid
 * NIM     : 231524020
 * Tanggal : 22 Februari 2024
 */

 import java.util.Scanner;

//Class RestaurantMain adalah kelas utama yang berfungsi untuk menjalankan program
public class RestaurantMain {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        // Membuat objek Restaurant dengan total maksimum menu sebanyak 10 menu
        Restaurant menu = new Restaurant(10);
        
        // Menambahkan beberapa menu makanan ke dalam restoran
        menu.tambahMenuMakanan(new MenuMakanan("Bala-Bala", 1_000, 20));
        menu.tambahMenuMakanan(new MenuMakanan("Gehu", 1_000, 20));
        menu.tambahMenuMakanan(new MenuMakanan("Tahu", 1_000, 0));
        menu.tambahMenuMakanan(new MenuMakanan("Molen", 1_000, 20));

        char pesanLagi;
        do {
            System.out.println("\n");
            menu.tampilMenuMakanan(); // Menampilkan menu makanan yang tersedia di restoran
            System.out.println("========================================");
            System.out.print("Masukkan nama menu yang ingin dipesan: ");
            String namaMenu = Input.nextLine();
            System.out.print("Masukkan jumlah yang ingin dipesan: ");
            int jumlahPesan = Input.nextInt();
            Input.nextLine(); // Membersihkan newline di buffer

            menu.pesanMenu(namaMenu, jumlahPesan); // Memesan menu

            System.out.print("Ingin memesan lagi? (y/n): ");
            pesanLagi = Input.nextLine().charAt(0);
        } while (pesanLagi == 'y' || pesanLagi == 'Y');
        System.out.println("Silahkan melakukan pembayaran & Terima kasih telah memesan!\n");
        Input.close();
    }
}
    


