
interface Engine {
    void start();

    void stop();
}

interface Brakes {
    void brake();

    void release();
}

interface MediaPlayer {
    void play();

    void pause();
}

class Car implements Engine, Brakes, MediaPlayer {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public void brake() {
        System.out.println("Brakes applied");
    }

    @Override
    public void release() {
        System.out.println("Brakes released");
    }

    @Override
    public void play() {
        System.out.println("Media player playing");
    }

    @Override
    public void pause() {
        System.out.println("Media player paused");
    }
}

public class Interface {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.play();
        myCar.brake();
        myCar.pause();
        myCar.stop();
        myCar.release();
    }
}
