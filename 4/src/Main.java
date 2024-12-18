import adapter.AudioPlayer;
import adapter.VideoPlayer;
import models.MediaFile;

public class Main {
    public static void main(String[] args) {
        MediaFile audioFile = new MediaFile("song.mp3", "mp3");
        MediaFile videoFile = new MediaFile("movie.mp4", "mp4");
        MediaFile unsupportedFile = new MediaFile("document.txt", "txt");

        AudioPlayer audioPlayer = new AudioPlayer();
        VideoPlayer videoPlayer = new VideoPlayer();

        // Воспроизведение аудио
        audioPlayer.play(audioFile.getFileType(), audioFile.getFileName());

        // Воспроизведение видео
        videoPlayer.play(videoFile.getFileType(), videoFile.getFileName());

        // Попытка воспроизведения неподдерживаемого формата
        audioPlayer.play(unsupportedFile.getFileType(), unsupportedFile.getFileName());
        videoPlayer.play(unsupportedFile.getFileType(), unsupportedFile.getFileName());
    }
}
