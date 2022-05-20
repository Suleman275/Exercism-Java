class NeedForSpeed {
    // TODO: define the constructor for the 'NeedForSpeed' class

    int speed;
    int batteryDrain;
    int meters;
    int battery;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        meters = 0;
        battery = 100;
    }

    public boolean batteryDrained() {
        //throw new UnsupportedOperationException("Please implement the NeedForSpeed.batteryDrained() method");
        return battery <= 0;
    }

    public int distanceDriven() {
        //throw new UnsupportedOperationException("Please implement the NeedForSpeed.distanceDriven() method");
        return meters;
    }

    public void drive() {
        //throw new UnsupportedOperationException("Please implement the NeedForSpeed.drive() method");
        if (batteryDrained()) {

        }
        else {
            meters += speed;
            battery -= batteryDrain;
        }
        
    }

    public static NeedForSpeed nitro() {
        //throw new UnsupportedOperationException("Please implement the (static) NeedForSpeed.nitro() method");
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    // TODO: define the constructor for the 'RaceTrack' class

    int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean carCanFinish(NeedForSpeed car) {
        //throw new UnsupportedOperationException("Please implement the RaceTrack.carCanFinish() method");
        
        return (float) this.distance/car.speed <= (float) car.battery/car.batteryDrain;
    }
}
