package nasaApi;

public class NasaApi {
    //Параметры запроса для получения информации с NASA
    private final static String GET_URI_RQ = "https://api.nasa.gov/planetary/apod?api_key=";
    private final static String NASA_API_KEY = "PkmPJ6cDufEDsobmF5cFi5LeVZJKT8SfjXAQf3g8";

    private NasaApi() {}
    /**
     * Отдаёт полный GET запрос в NASA
     * @return полный GET запрос
     */
    public static String getFullRequest() {
        return  GET_URI_RQ + NASA_API_KEY;
    }
}
