package Day4.Interface;

public class BikeCls implements BikeI{

    @Override
    public void model() {
        System.out.println("Bike Model R15");
    }

    @Override
    public void status() {
        System.out.println("Bike in Active status.");
    }

    public static void main(String[] args) {
        BikeI bc = new BikeCls();

        bc.model();
        bc.status();
    }
}

