package app;

public class watchMovie {

    private PopcornPopper popcorn = new PopcornPopper("Popcorn Popper");
    private TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
    private Screen screen = new Screen("Theater Screen");
    private Amplifier amp = new Amplifier("Top-O-Line Amplifier");
    private DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
    private Projector projector = new Projector("Top-O-Line Projector", dvd);

    public void startMovie() {
        popcorn.on();
        popcorn.pop();

        lights.dim(20);

        screen.down();

        projector.on();
        projector.wideScreenMode();

        amp.on();

        dvd.insert();

        amp.setSurroundSound();
        amp.setVolume(5);

        dvd.on();
        dvd.play("New Kids Turbo");
    }

    public void stopMovie() {
        popcorn.off();

        lights.on();

        screen.up();

        projector.off();

        amp.off();

        dvd.stop();
        dvd.eject();
        dvd.off();
    }
}
