package com.stone.entity.enums;

/**
 * 百度地图url
 * Created by zhaoc on 2017/4/21.
 */
public enum UrlEnum {
    PLACE("1", "http://api.map.baidu.com/place/v2/search"),//v2 place区域检索POI服务
    PLACESUGGESTION("2", "http://api.map.baidu.com/place/v2/suggestion/"),
    GEOCODING("3", "http://api.map.baidu.com/geocoder/v2/"),
    DIRECTION("4", "https://api.map.baidu.com/direction/v2/transit");

    UrlEnum(String code, String url) {
        this.code = code;
        this.url = url;
    }

    private String code;
    private String url;

    public String getCode() {
        return code;
    }

    public String getUrl() {
        return url;
    }
}
