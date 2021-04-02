package homework4.task3;

public class Player implements Playable, Recodable {

    public void play() {
        System.out.println("Playing music");
    }

    public void record() {
        System.out.println("Recording music");
    }

    public void pause() {
        System.out.println("Pause music");
    }

    public void stop() {
        System.out.println("Stop music");
    }
}
