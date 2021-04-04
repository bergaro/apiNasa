package nasaApi;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParseNasaJson {
    /**
     * извлечение из строки объектов JSON,
     * перобразование их в Java Objects класса CatFact
     * и помещение их в список объектов.
     *
     * @param jsString Строка объектов JSON
     * @return отфильтрованный список объектов по полю type.
     */
    public static NasaRsURL getObjectsList(String jsString) {
        NasaRsURL nasaRsURL = new NasaRsURL();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            nasaRsURL = objectMapper.readValue(jsString, NasaRsURL.class);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return nasaRsURL;
    }
    /**
     * из Url стороки получает имя файла
     * @param imgUrl URL строка
     * @return имя файла (file.jpg)
     */
    public static String getImgName(String imgUrl) {
        List<String> imgUrlComponents = new ArrayList<>(Arrays.asList(imgUrl.split("/")));
        return imgUrlComponents.get(imgUrlComponents.size()-1);
    }
}
