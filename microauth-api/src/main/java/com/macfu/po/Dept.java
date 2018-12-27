package com.macfu.po;

import java.io.Serializable;

/**
 * @Author: liming
 * @Date: 2018/12/27 10:51
 * @Description: 实体类
 */
public class Dept implements Serializable {
    private static final long serialVersionUID = 6364518388317859807L;

    private Long deptno;
    private String danme;
    private String loc;

    public Long getDeptno() {
        return deptno;
    }

    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    public String getDanme() {
        return danme;
    }

    public void setDanme(String danme) {
        this.danme = danme;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", danme='" + danme + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}
