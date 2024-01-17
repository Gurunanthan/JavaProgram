interface Engine {
    void start();
    void stop();
}

interface Brakes {
    void brake();
    void release();
}

interface MediaPlayer {
    void start();
    void stop();
}

class PetrolEngine implements Engine, Brakes {
    @Override
    public void start() {
        System.out.println("Start PetrolEngine");
    }

    @Override
    public void stop() {
        System.out.println("Stop PetrolEngine");
    }

    @Override
    public void brake() {
        System.out.println("Brake PetrolEngine");
    }

    @Override
    public void release() {
        System.out.println("Release PetrolEngine");
    }
}

class DieselEngine implements Engine, Brakes {
    @Override
    public void start() {
        System.out.println("Start DieselEngine");
    }

    @Override
    public void stop() {
        System.out.println("Stop DieselEngine");
    }

    @Override
    public void brake() {
        System.out.println("Brake DieselEngine");
    }

    @Override
    public void release() {
        System.out.println("Release DieselEngine");
    }
}

class MusicPlayer implements MediaPlayer {
    @Override
    public void start() {
        System.out.println("Music player start");
    }

    @Override
    public void stop() {
        System.out.println("Music player stop");
    }
}

class EngineCreator {
    private Engine engine;

    public void createPetrolEngine() {
        engine = new PetrolEngine();
    }

    public void createDieselEngine() {
        engine = new DieselEngine();
    }

    public Engine getEngine() {
        return engine;
    }
}

class EngineFunction {
    private Engine engine;
    private Brakes brakes; 

    public EngineFunction(Engine engine) {
        this.engine = engine;
        if (engine instanceof Brakes) {
            this.brakes = (Brakes) engine;
        }
    }

    public void engineStart() {
        engine.start();
    }

    public void engineStop() {
        engine.stop();
    }

    public void engineBrake() {
        if (brakes != null) {
            brakes.brake();
        } else {
            System.out.println("This engine does not have brakes.");
        }
    }

    public void engineRelease() {
        if (brakes != null) {
            brakes.release();
        } else {
            System.out.println("This engine does not have brakes.");
        }
    }
}

public class EngineExampleInterface {
    public static void main(String[] args) {
        EngineCreator creator = new EngineCreator();
        MusicPlayer musicPlayer = new MusicPlayer();
        EngineFunction function = new EngineFunction(creator.getEngine());
        creator.createPetrolEngine();

        function.engineStart();
        function.engineBrake();
        function.engineStop();
        function.engineRelease();

        musicPlayer.start();
        musicPlayer.stop();
    }
}

