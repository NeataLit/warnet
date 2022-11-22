import java.util.Scanner;

public class Main {
    static Scanner read = new Scanner(System.in);
    static double totalAkhir;
    public static void main(String args[]) {

        Layanan lyn = new Layanan();
        PCSiang pcs = new PCSiang();
        PCMalam pcm = new PCMalam();
        PSSiang pss = new PSSiang();
        PSMalam psm = new PSMalam();
        Menu menu = new Menu();

        lyn.jenis();
        lyn.setMeja();
        lyn.waktu();
        if (lyn.jenis == 1 && lyn.waktu == 1) {
            pcs.paketSiang();
            pcs.hitung();
            lyn.getInfo();
            pcs.getInfo();
            menu.pesan();
            totalAkhir = menu.getHarga() + pcs.getHarga();
            System.out.println("Total akhir : "+ totalAkhir);
            System.out.println(pcs.setAdmin());
            System.out.println(pcs.setAdmin("Rizka"));
        } else if (lyn.jenis == 1 && lyn.waktu == 2) {
            pcm.paketMalam();
            pcm.hitung();
            lyn.getInfo();
            pcm.getInfo();
            menu.pesan();
            totalAkhir = menu.getHarga() + pcm.getHarga();
            System.out.println("Total akhir : "+ totalAkhir);
            System.out.println(pcm.setAdmin());
            System.out.println(pcm.setAdmin("Rizka"));
        } else if (lyn.jenis == 2 && lyn.waktu == 1) {
            pss.paketSiang();
            pss.hitung();
            lyn.getInfo();
            pss.getInfo();
            menu.pesan();
            totalAkhir = menu.getHarga() + pss.getHarga();
            System.out.println("Total akhir : "+ totalAkhir);
            System.out.println(pss.setAdmin());
            System.out.println(pss.setAdmin("Rizka"));
        } else if (lyn.jenis == 2 && lyn.waktu == 2) {
            psm.paketMalam();
            psm.hitung();
            lyn.getInfo();
            psm.getInfo();
            menu.pesan();
            totalAkhir = menu.getHarga() + psm.getHarga();
            System.out.println("Total akhir : "+ totalAkhir);
            System.out.println(psm.setAdmin());
            System.out.println(psm.setAdmin("Rizka"));
        }


    }
}
