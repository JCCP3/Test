package com.zysq.entity.responseEntity;

import com.zysq.entity.Music;

/**
 * Created by rose_sunshine on 16/3/21.
 */
public class MusicMessage extends ResBaseMessage {

    private Music Music;

    public com.zysq.entity.Music getMusic() {
        return Music;
    }

    public void setMusic(com.zysq.entity.Music music) {
        Music = music;
    }
}
