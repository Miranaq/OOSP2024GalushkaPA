package adapter;

public class Mp3Player implements AdvancedMediaPlayer {
    @Override
    public void playMp3(String fileName) {
        System.out.println("Воспроизведение MP3 файла: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // MP3 плеер не поддерживает MP4
        System.out.println("MP3 плеер не может воспроизводить MP4 файлы.");
    }
}
