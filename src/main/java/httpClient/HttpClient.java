package httpClient;

import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HttpClient {
    private static HttpClient instance;

    private HttpClient() { }
    public static HttpClient getInstance() {
        if(instance == null) {
            instance = new HttpClient();
        }
        return instance;
    }
    /**
     * Настройка httpClient:
     * максимальное время ожидание подключения к серверу: 5000
     * максимальное время ожидания получения данных: 30000
     * возможность следовать редиректу в ответе: false
     * @return настроенный объект CloseableHttpClient
     */
    protected CloseableHttpClient configHttp() {
        CloseableHttpClient httpClient = HttpClientBuilder.create()
                .setDefaultRequestConfig(RequestConfig.custom()
                        .setConnectTimeout(5000)
                        .setSocketTimeout(30000)
                        .setRedirectsEnabled(false)
                        .build())
                .build();
        return httpClient;
    }
    /**
     * Получение response на GET-request.
     * извлечение JSON из response body в строку.
     * @return строка JSON объектов
     */
    public String getHttpResponse(String uri) {
        String bodyRs = null;
        CloseableHttpClient httpClient = configHttp();
        HttpGet request = new HttpGet(uri);
        try(CloseableHttpResponse response = httpClient.execute(request)) {
            HttpEntity entity = response.getEntity();
            bodyRs = EntityUtils.toString(entity);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return bodyRs;
    }
    /**
     * Сохранение картинки по URL в директорию проекта(exitFile)
     * @param url адрес изображения
     * @param pathImg путь для сохраниения изображения
     */
    public void saveImg(String url, String pathImg) {
        try(InputStream in = new URL(url).openStream()){
            Files.copy(in, Paths.get(pathImg));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
