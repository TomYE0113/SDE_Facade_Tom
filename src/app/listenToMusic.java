package app;

public class listenToMusic {

    private TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
    private Amplifier amp = new Amplifier("Top-O-Line Amplifier");
    private CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);

    public void startMusic () {
        lights.on();

        amp.on();
        amp.setVolume(5);

        cd.inject();

        amp.setStereoSound();

        cd.on();
        cd.play("Raise and Revolt by Angerfist");
    }

    public void stopMusic() {
        amp.off();
        amp.setCd(cd);

        cd.eject();
        cd.off();
    }
}
