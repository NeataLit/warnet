import java.util.Scanner;

public class Layanan extends Warnet{
    public int PC;
    public int PS;
    
    static Scanner read = new Scanner(System.in); 

    public void jenis(){
        // int newJenis = 0;
        System.out.println("1. PC");
        System.out.println("2. PS");
        System.out.print("Masukan Kode Ruangan : ");
        jenis = read.nextInt();
        // this.jenis = newJenis;
         switch(jenis){
            case 1:
                System.out.println("Anda memilih PC\n");
            break;
            case 2:
                System.out.println("Anda memilih PS\n");
            break;
            default:
            System.out.println("Tolong pilih antara 1 atau 2");
            jenis();
         }

    }

    public void waktu(){
        // int newWaktu = 0;
        System.out.println("1. Siang");
        System.out.println("2. Malam");
        System.out.print("Masukan Kode Waktu : ");
        waktu = read.nextInt();
        // this.waktu = newWaktu;
         switch(waktu){
            case 1:
                System.out.println("Anda memilih waktu siang\n");
            break;
            case 2:
                System.out.println("Anda memilih waktu malam");
            break;
            default:
            System.out.println("Tolong pilih antara 1 atau 2");
            waktu();
         }
    }

    public void setMeja(){
        System.out.print("Masukan nomor meja : ");
        meja = read.nextInt();
        System.out.println("Anda memilih meja nomor " + meja + "\n");
    }

    public void jam(){
        // int newJam = 0;
        System.out.print("Masukan lama jam main : ");
        jam = read.nextInt();
        // this.jam = jam;
    }


    public void getInfo() {
        System.out.println("=======================");
        if (jenis == 1) {
            System.out.println("Ruangan : PC");
        }
        else if (jenis == 2){
            System.out.println("Ruangan : PS");
        }

        System.out.println("Meja : " + meja);

        if (waktu == 1) {
            System.out.println("Waktu : Siang");
        }
        else if (waktu == 2){
            System.out.println("Waktu : Malam");
        }
    }

    


}
