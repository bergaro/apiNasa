package nasaApi;

//{
//        "date": "2021-04-04",
//        "explanation": "Four moons are visible on the featured image -- can you find them all? First -- and farthest in the background -- is Titan, the largest moon of Saturn and one of the larger moons in the Solar System.  The dark feature across the top of this perpetually cloudy world is the north polar hood. The next most obvious moon is bright Dione, visible in the foreground, complete with craters and long ice cliffs. Jutting in from the left are several of Saturn's expansive rings, including Saturn's A ring featuring the dark Encke Gap. On the far right, just outside the rings, is Pandora, a moon only 80-kilometers across that helps shepherd Saturn's F ring. The fourth moon?  If you look closely inside Saturn's rings, in the Encke Gap, you will find a speck that is actually Pan. Although one of Saturn's smallest moons at 35-kilometers across, Pan is massive enough to help keep the Encke gap relatively free of ring particles. After more than a decade of exploration and discovery, the Cassini spacecraft ran low on fuel in 2017 and was directed to enter Saturn's atmosphere, where it surely melted.",
//        "hdurl": "https://apod.nasa.gov/apod/image/2104/fourmoons_cassini_960.jpg",
//        "media_type": "image",
//        "service_version": "v1",
//        "title": "In, Through, and Beyond Saturn's Rings",
//        "url": "https://apod.nasa.gov/apod/image/2104/fourmoons_cassini_960.jpg"
//        }

import java.util.Date;

public class NasaRsURL {
    private Date date;
    private String explanation;
    private String hdurl;
    private String media_type;
    private String service_version;
    private String title;
    private String url;

    public void setDate(Date date) {
        this.date = date;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public void setHdurl(String hdurl) {
        this.hdurl = hdurl;
    }

    public void setMedia_type(String media_type) {
        this.media_type = media_type;
    }

    public void setService_version(String service_version) {
        this.service_version = service_version;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "NasaRsURL{" +
                "date=" + date +
                ", explanation='" + explanation + '\'' +
                ", hdurl='" + hdurl + '\'' +
                ", media_type='" + media_type + '\'' +
                ", service_version='" + service_version + '\'' +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
