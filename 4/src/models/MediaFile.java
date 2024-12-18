package models;

public class MediaFile {
    private final String fileName;
    private final String fileType;

    public MediaFile(String fileName, String fileType) {
        this.fileName = fileName;
        this.fileType = fileType;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileType() {
        return fileType;
    }
}
