package com.example.janino;

import java.util.Map;

public abstract class AbstractSpread {
    public void execute(Map map) {
        try {
            executeSpread(map);
        } catch (Exception e) {

        }
    }

    protected abstract void executeSpread(Map map);

    protected void record() {
        //중간 데이터를 기록
    }
}
