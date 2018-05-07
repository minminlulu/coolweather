package android.coolweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;
//天气信息的json数据的basic实体类
public class Basic {
    //由于json中的一些字段不太适合直接作为java字段来命名，
    //因此使用了@SerializedName注解的方式来让json字段和
    //java字段之间建立映射关系。
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
