class DVDPlayer {
    public void turnOn() {
        System.out.println("DVD player is turned on.");
    }

    public void playMovie() {
        System.out.println("Playing movie.");
    }

    public void turnOff() {
        System.out.println("DVD player is turned off.");
    }
}

class Amplifier {
    public void turnOn() {
        System.out.println("Amplifier is turned on.");
    }

    public void setVolume(int volume) {
        System.out.println("Setting volume to " + volume);
    }

    public void turnOff() {
        System.out.println("Amplifier is turned off.");
    }
}

class Projector {
    public void turnOn() {
        System.out.println("Projector is turned on.");
    }

    public void setInput(DVDPlayer dvdPlayer) {
        System.out.println("Setting input to DVD player.");
    }

    public void turnOff() {
        System.out.println("Projector is turned off.");
    }
}


class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Amplifier amplifier;
    private Projector projector;

    public HomeTheaterFacade() {
        dvdPlayer = new DVDPlayer();
        amplifier = new Amplifier();
        projector = new Projector();
    }

    public void watchMovie() {
        dvdPlayer.turnOn();
        amplifier.turnOn();
        projector.turnOn();
        amplifier.setVolume(10);
        projector.setInput(dvdPlayer);
        dvdPlayer.playMovie();
    }

    public void turnOff() {
        projector.turnOff();
        amplifier.turnOff();
        dvdPlayer.turnOff();
    }
}


public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();

        homeTheater.watchMovie();
        System.out.println("-------");
        homeTheater.turnOff();
    }
}
