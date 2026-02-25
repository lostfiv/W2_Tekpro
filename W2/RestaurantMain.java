public class RestaurantMain {
    public static void main(String[] args) {

        Restaurant menu = new Restaurant();

        menu.tambahMenuMakanan("Pizza", 250000, 20);
        menu.tambahMenuMakanan("Spaghetti", 80000, 20);
        menu.tambahMenuMakanan("Tenderloin Steak", 60000, 30);
        menu.tambahMenuMakanan("Chicken Steak", 45000, 30);

        menu.tampilMenuMakanan();

        System.out.println("\nPesan 5 Pizza");
        menu.pesanMakanan("Pizza", 5);

        menu.tampilMenuMakanan();
    }
}