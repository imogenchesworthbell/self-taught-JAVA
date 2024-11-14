package ScooterApp.src;

public class Scooter {
    private String station;
    private User user;
    private int serial;
    private static int nextSerial = 1;
    private int charge;
    private boolean isBroken;

    public Scooter(String station){
        this.station = station;
        this.user = user;
        this.serial = nextSerial++ ;
        this.charge = charge;
        this.isBroken = false;
    }

    public void rent(User user){
        if(this.charge <= 20){
            throw new IllegalStateException("Scooter needs charging.");
        }
        if(this.isBroken){
            throw new IllegalStateException("Scooter is broken.");
        }
        this.user = user;
        System.out.println("This Scooter has been rented from " + this.station + " by user, " + user.getUsername());
        this.station = null;
    }

    public void dock(String station){
        this.station = station;
        this.user = null;
        System.out.println("Scooter is docked at " + station +"." );
    }

    /* BONUS METHODS
        - `recharge()`: A bonus method to recharge the scooter gradually.
        - `requestRepair()`: A bonus method to request a repair after a delay.
    */
}


