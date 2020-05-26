package data;

public class AutoSalon {
    private static final int CAR_QUANTITY = 5;
    private static final double INTEREST = 0.2;

    private Auto[] places;
    private long balance;

    public AutoSalon(long balance) {
        this.balance = balance;
        places = new Auto[CAR_QUANTITY];
    }

    public void buyAuto(Auto auto) throws Exception {
        int freePlace = getFreePlace();
        if (freePlace < 0) {
            throw new Exception("No Free places, sell an Auto");
            //System.out.println("No Free places, sell an Auto");
            //return;
        }
        this.balance = this.balance - auto.getPrice();
        places[freePlace] = auto;
    }

    private int getFreePlace() {
        for (int i = 0; i < places.length; i++) {
            if (places[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public Auto sellAuto() {
        //TODO HW
        return null;
    }

    public Auto sellAutoByPlace(int place) {
        //TODO HW
        return null;
    }

    public void printReport() {
        //TODO HW
        //Place-price
    }

}
