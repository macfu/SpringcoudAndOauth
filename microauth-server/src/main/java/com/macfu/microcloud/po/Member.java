package com.macfu.microcloud.po;

import java.io.Serializable;

/**
 * @Author: liming
 * @Date: 2018/12/28 15:12
 * @Description: po
 */
public class Member implements Serializable {
    private static final long serialVersionUID = 3523810800079942755L;

    private String mid;
    private String name;
    private String password;
    private String locked;

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
        this.locked = locked;
    }
}
