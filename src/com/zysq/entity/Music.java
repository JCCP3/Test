package com.zysq.entity;

/**
 * Created by rose_sunshine on 16/3/21.
 */
public class Music {
    private String Title;
    private String Description;
    private String MusicUrl;
    private String HqMusicUrl;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getMusicUrl() {
        return MusicUrl;
    }

    public void setMusicUrl(String musicUrl) {
        MusicUrl = musicUrl;
    }

    public String getHqMusicUrl() {
        return HqMusicUrl;
    }

    public void setHqMusicUrl(String hqMusicUrl) {
        HqMusicUrl = hqMusicUrl;
    }
}
