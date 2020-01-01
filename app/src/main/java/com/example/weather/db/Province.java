package com.example.weather.db;

import org.litepal.crud.DataSupport;

/**
 * 省的实体
 * id 是每个实体类中都应该有的字段，
 * provinceName 记录省的名 字，
 * provinceCode 记录省的代号。
 * LitePal中的每一个实体类都是 必须要继承自DataSupport类的
 */
public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
