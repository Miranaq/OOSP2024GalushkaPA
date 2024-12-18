package adapter;

public class VideoPlayer implements MediaAdapter {
    @Override
    public void play(String fileType, String fileName) {
        if (fileType.equalsIgnoreCase("mp4")) {
            System.out.println("Воспроизведение видео файла: " + fileName);
        } else {
            System.out.println("Неподдерживаемый видеоформат: " + fileType);
        }
    }
}
