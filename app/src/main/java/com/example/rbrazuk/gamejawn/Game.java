package com.example.rbrazuk.gamejawn;

import com.orm.SugarRecord;

public class Game extends SugarRecord {
    private String mTitle;
    private String mSystem;
    private int mYear;
    private String mGenre;
    private String mImagepath;

    public Game() {

    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getSystem() {
        return mSystem;
    }

    public void setSystem(String system) {
        mSystem = system;
    }

    public int getYear() {
        return mYear;
    }

    public void setYear(int year) {
        mYear = year;
    }

    public String getGenre() {
        return mGenre;
    }

    public void setGenre(String genre) {
        mGenre = genre;
    }

    public String getImagepath() {
        return mImagepath;
    }

    public void setImagepath(String imagepath) {
        mImagepath = imagepath;
    }
}
