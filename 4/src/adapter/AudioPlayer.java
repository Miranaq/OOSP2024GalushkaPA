package adapter;

public class AudioPlayer implements MediaAdapter {
    @Override
    public void play(String fileType, String fileName) {
        if (fileType.equalsIgnoreCase("mp3")) {
            System.out.println("Воспроизведение аудио файла: " + fileName);
        } else {
            System.out.println("Неподдерживаемый аудиоформат: " + fileType);
        }
    }
}
