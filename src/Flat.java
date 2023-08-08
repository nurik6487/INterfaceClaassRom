public class Flat implements People {
    private String PayMent;

    public Flat() {

    }

    public String getPayMent() {
        return PayMent;
    }

    public void setPayMent(String payMent) {
        PayMent = payMent;
    }

    @Override
    public void user() {
        System.out.println("Daniel, EURO");

    }

    @Override
    public String toString() {
        return "Flat:" + "\n" +
                "PayMent:" + PayMent;
    }
}
