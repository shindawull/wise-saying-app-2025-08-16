package com.dawull.domain.wiseSaying.service;

import com.dawull.domain.wiseSaying.entity.WiseSaying.WiseSaying;

import java.util.ArrayList;
import java.util.List;

public class WiseSayingService {
    private final ArrayList<WiseSaying> wiseSayings;
    private int lastId;


    public WiseSayingService() {
        this.wiseSayings = new ArrayList<>();
        this.lastId = 0;
    }

    public WiseSaying add(String content, String author) {
        WiseSaying wiseSaying = new WiseSaying(++lastId, content, author);
        wiseSayings.add(wiseSaying);
        return wiseSaying;
    }

    public List<WiseSaying> findAll() {
        return wiseSayings;
    }
}
