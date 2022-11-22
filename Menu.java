import java.util.Scanner;

public class Menu extends Snack {

    Scanner read = new Scanner(System.in);

    public void menu() {
        System.out.println("1. Mie goreng : Rp 7000");
        System.out.println("2. Mie goreng + telur : Rp 9000");
        System.out.println("3. Mie goreng double : Rp 10000");
        System.out.println("4. Mie goreng double + telur : Rp 12000");
        System.out.println("5. Mie kuah : Rp 7000");
        System.out.println("6. Mie kuah + telur : Rp 9000");
        System.out.println("7. Siomay/Batagor : Rp 5000");
        System.out.println("8. Cimol keju : Rp 8000");
        System.out.println("9. Air putih (free refill) : 5000");
        System.out.println("10. Teh (es/panas) : 6000");
        System.out.println("=======================");
    }

    public void inputMenu() {
        System.out.print("Berapa banyak orderan : ");
        n = read.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Masukan Kode Manu : ");
            menu = read.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Anda memesan mie goreng\n");
                    harga = 7000;
                    hargaMenu = hargaMenu + harga;
                    break;
                case 2:
                    System.out.println("Anda memesan mie goreng + telur\n");
                    harga = 9000;
                    hargaMenu = hargaMenu + harga;
                    break;
                case 3:
                    System.out.println("Anda memesan mie goreng double\n");
                    harga = 10000;
                    hargaMenu = hargaMenu + harga;
                    break;
                case 4:
                    System.out.println("Anda memesan mie goreng double + telur\n");
                    harga = 12000;
                    hargaMenu = hargaMenu + harga;
                    break;
                case 5:
                    System.out.println("Anda memesan mie kuah\n");
                    harga = 7000;
                    hargaMenu = hargaMenu + harga;
                    break;
                case 6:
                    System.out.println("Anda memesan mie kuah + telur\n");
                    harga = 9000;
                    hargaMenu = hargaMenu + harga;
                    break;
                case 7:
                    System.out.println("Anda memesan siomay/batagor\n");
                    harga = 5000;
                    hargaMenu = hargaMenu + harga;
                    break;
                case 8:
                    System.out.println("Anda memesan cimol keju\n");
                    harga = 8000;
                    hargaMenu = hargaMenu + harga;
                    break;
                case 9:
                    System.out.println("Anda memesan air putih\n");
                    harga = 5000;
                    hargaMenu = hargaMenu + harga;
                    break;
                case 10:
                    System.out.println("Anda memesan teh\n");
                    harga = 6000;
                    hargaMenu = hargaMenu + harga;
                    break;
                default:
                    System.out.println("Tolong masukan kode menu dari 1 sampai 10");
                    inputMenu();
            }
        }
        totalMenu = hargaMenu;
    }

    public void pesan(){
        System.out.print("Ingen pesan snack? (Ya/Tidak) \n");
        pesan = read.nextLine();
        if (pesan.equals("Ya")) {
            menu();
            inputMenu();
            total();

        } else if (pesan.equals("Tidak")) {
            System.out.println("Tidak memesan makanan\n");
        }
        else {
            System.out.println("Masukan Ya atau Tidak\n");
            pesan();
        }
    }


    public void total() {
        totalHarga = totalMenu;
        System.out.println("Total harga snack : " + totalHarga);
    }

    public double getHarga(){
        return totalHarga;
    }
}
