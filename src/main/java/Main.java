import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String cityCode = RequestHeader.detectCityId("Boston");
        System.out.println(cityCode);
        String foreCast = RequestHeader.getForecast(cityCode);
        System.out.println(foreCast);
        String getOneDay = RequestHeader.getOneDay(cityCode);
        System.out.println(getOneDay);

    }
}
