
public class Dormitory implements People {
    private int rent;

    public Dormitory() {
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    @Override
    public void user() {
        System.out.println("Babur, Nuraym");
    }

    @Override
    public String toString() {
        return "Dormitory:" + "\n" +
                "rent:" + rent;

    }
}
