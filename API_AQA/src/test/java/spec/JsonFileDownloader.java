package spec;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class JsonFileDownloader {
    public static String fileUrl;
    public static String localFilePath ="C:\\Users\\User\\Documents\\GIT\\Study\\API_AQA\\src\\test\\resources\\schema.json"; // Путь и имя локального файла, куда сохранить

    public String getFileUrl() {
        return fileUrl;
    }
    public void setFileUrl(String fileUrl) {
        JsonFileDownloader.fileUrl = fileUrl;
    }

    public static void run() {
        try {
            downloadAndSaveJsonFile(fileUrl, localFilePath);
            System.out.println("JSON файл успешно загружен и сохранен.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void downloadAndSaveJsonFile(String fileUrl, String localFilePath) throws IOException {
        URL url = new URL(fileUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/json");

        int responseCode = connection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            try (InputStream inputStream = connection.getInputStream()) {
                Files.copy(inputStream, Path.of(localFilePath), StandardCopyOption.REPLACE_EXISTING);
            }
        } else {
            throw new IOException("Failed to download JSON file. HTTP Response Code: " + responseCode);
        }
    }


}