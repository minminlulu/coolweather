package android.coolweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

//总的实体类，引用json的实体类
public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    //daily_forecast中包含的是一个数组，因此使用List集合来引用Froecast类。
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
