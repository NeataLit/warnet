public abstract class Snack {
    protected int menu;
    protected double harga;
    protected double hargaMenu = 0;
    protected int n;
    protected double totalMenu;
    protected double totalHarga;
    protected String pesan = "";

    public abstract void menu();
    public abstract void inputMenu();
    public abstract void pesan();
    
}
