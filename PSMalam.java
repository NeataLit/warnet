import java.util.Scanner;

public class PSMalam extends Layanan implements Admin {

    Scanner read = new Scanner(System.in);

    public void paketMalam() {
        System.out.println("=======================");
        System.out.println("1. 1 jam = 12000");
        System.out.println("2. 2 jam = 20000");
        System.out.println("3. 3 jam = 35000");
        System.out.println("4. 5 jam = 50000");
        System.out.println("5. Masukan pilihan lain");
        System.out.println("=======================");
        System.out.print("Masukan Kode Paket : ");
        paket = read.nextInt();
        switch (paket) {
            case 1:
                PS = 12000;
                harga = PS;
                break;
            case 2:
                PS = 20000;
                harga = PS;
                break;
            case 3:
                PS = 35000;
                harga = PS;
                break;
            case 4:
                PS = 50000;
                harga = PS;
            break;
            case 5:
                jam();
                harga = jam * 12000;
            break;
            default:
            System.out.println("Tolong pilih antara 1 sampai 5");
            paketMalam();
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
