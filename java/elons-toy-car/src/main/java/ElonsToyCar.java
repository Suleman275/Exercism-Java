public class ElonsToyCar {
    int battery;
    int meters;

    ElonsToyCar() {
        battery = 100;
        meters = 0;
    }

    public static ElonsToyCar buy() {
        //throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.buy()  method");
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        // throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.distanceDisplay()  method");
        return "Driven " + meters + " meters";
    }

    public String batteryDisplay() {
        // throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.batteryDisplay()  method");
        if (battery > 0) {
            return "Battery at " + battery + "%";
        }
        else {
            return "Battery empty";
        }
    }

    public void drive() {
        // throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.drive()  method");
        if (battery > 0) {
            this.meters += 20;
            this.battery -= 1;
        }
        else {
            System.out.println("Battery empty");
        }
    }
}
