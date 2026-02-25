public class Restaurant {

    private String[] namaMakanan;
    private double[] hargaMakanan;
    private int[] stok;
    private int id;

    public Restaurant() {
        namaMakanan = new String[10];
        hargaMakanan = new double[10];
        stok = new int[10];
        id = 0;
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        if (stok < 0) {
            System.out.println("Stok tidak boleh negatif!");
            return;
        }

        namaMakanan[id] = nama;
        hargaMakanan[id] = harga;
        this.stok[id] = stok;
        id++;
    }

    public void tampilMenuMakanan() {
        for (int i = 0; i < id; i++) {
            if (!isOutOfStock(i)) {
                System.out.println(
                    namaMakanan[i] + " [" + stok[i] + "] \tRp. " + hargaMakanan[i]
                );
            }
        }
    }

    private boolean isOutOfStock(int index) {
        return stok[index] == 0;
    }

    public void pesanMakanan(String nama, int jumlah) {
        for (int i = 0; i < id; i++) {
            if (namaMakanan[i].equalsIgnoreCase(nama)) {
                if (stok[i] >= jumlah) {
                    stok[i] -= jumlah;
                    System.out.println("Pesanan berhasil!");
                } else {
                    System.out.println("Stok tidak mencukupi!");
                }
                return;
            }
        }
        System.out.println("Menu tidak ditemukan!");
    }
}