
public class Hotel implements People {
    private int rent;

    public Hotel() {
        this.rent = rent;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    @Override
    public void user() {
        System.out.println("Taksyr, Angelina Joli, Medina Joli, Megan Fox, Rianna ");
    }

    @Override
    public String toString() {
        return "Hotel:" + "\n" +
                "rent:" + rent;
    }
}