package com.macfu.po;

import java.io.Serializable;

/**
 * @Author: liming
 * @Date: 2018/12/27 10:49
 * @Description: 实体类
 */
public class Company implements Serializable {
    private static final long serialVersionUID = -6758170560319799304L;

    private String title;
    private String note;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Company{" +
                "title='" + title + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
