import httpClient.HttpClient;
import nasaApi.ParseNasaJson;

import java.io.*;

import static nasaApi.NasaApi.getFullRequest;

public class Main {
    private static final String SEPARATOR = File.separator;         // Для корректной работы на Linux/Win

    public static void main(String[] args) {
        HttpClient client = HttpClient.getInstance();
        String responseJS = client.getHttpResponse(getFullRequest());
        String nasaUrl = ParseNasaJson.getObjectsList(responseJS).getUrl();
        String imgName = ParseNasaJson.getImgName(nasaUrl);
        imgName = "exitFile"+SEPARATOR+imgName;
        client.saveImg(nasaUrl, imgName);
    }
}
