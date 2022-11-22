import java.util.Scanner;

public class PSSiang extends Layanan implements Admin {

    Scanner read = new Scanner(System.in);

    public void paketSiang() {
        System.out.println("=======================");
        System.out.println("1. 1 jam = 10000");
        System.out.println("2. 2 jam = 18000");
        System.out.println("3. 3 jam = 25000");
        System.out.println("4. 5 jam = 45000");
        System.out.println("5. Masukan pilihan lain");
        System.out.println("=======================");
        System.out.print("Masukan Kode Paket : ");
        paket = read.nextInt();
        switch (paket) {
            case 1:
                PS = 10000;
                harga = PS;
                break;
            case 2:
                PS = 18000;
                harga = PS;
                break;
            case 3:
                PS = 25000;
                harga = PS;
                break;
            case 4:
                PS = 45000;
                harga = PS;
            break;
            case 5:
                jam();
                harga = jam * 10000;
            break;
            default:
            System.out.println("Tolong pilih antara 1 sampai 5");
            paketSiang();
        }
    }

    public void hitung() {
        System.out.println("Total harga adalah " + harga + "\n");
    }

    public double getHarga(){
        return harga;
    }

    public String setAdmin(){
        return "\nInformasi berikut diinput oleh admin";
    }

    public String setAdmin(String nama){
        return "Admin : " + nama + "\n";
    }

    public void getInfo() {
        System.out.println("Kode Paket : " + paket);
        System.out.println("Total harga : " + harga);
        System.out.println("=======================");
    }

}
