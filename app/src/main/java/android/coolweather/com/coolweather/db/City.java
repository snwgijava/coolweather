package android.coolweather.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by ybyan on 2017/2/26.
 * 市的信息
 */

public class City extends DataSupport{

    private int id;
    private String cityName;    //市的名字
    private int cityCode;       //市的代号
    private int provinceId;     //当前所属省的id

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
