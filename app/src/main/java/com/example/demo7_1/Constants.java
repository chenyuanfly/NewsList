package com.example.demo7_1;

public final class Constants {
    private Constants() {
    }

    static final int NEWS_NUM = 10;
    static String SERVER_URL = "http://api.tianapi.com/esports/";
    static String ALL_NEWS_PATH = "allnews/";
    static String GENERAL_NEWS_PATH = "index";

    public static String API_KEY = "b3c7acabf42b1267b58c98552f16a4f6";

    public static String ALL_NEWS_URL = SERVER_URL + ALL_NEWS_PATH;
    public static String GENERAL_NEWS_URL = SERVER_URL + GENERAL_NEWS_PATH;

    public static int NEWS_COL5 = 5;
    public static int NEWS_COL7 = 7;
    public static int NEWS_COL8 = 8;
    public static int NEWS_COL10 = 10;
    public static int NEWS_COL11 = 11;

    public static String NEWS_DETAIL_URL_KEY = "news_detail_url_key";
}
