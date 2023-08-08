public class Main {
    public static void main(String[] args) {


        Hotel hotel = new Hotel();
        hotel.setRent(300);
        System.out.println(hotel);
        hotel.user();

        Flat flat = new Flat();
        flat.setPayMent("30 euro");
        System.out.println(flat);
        flat.user();

        Dormitory dormitory = new Dormitory();
        dormitory.setRent(90);
        System.out.println(dormitory);
        dormitory.user();
    }
}

