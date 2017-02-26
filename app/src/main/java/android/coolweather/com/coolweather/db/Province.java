package android.coolweather.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by ybyan on 2017/2/26.
 * 省的信息
 */

public class Province extends DataSupport{
    private int id;
    private String provinceName;    //省的名字
    private  int provinceCode;      //省的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}
