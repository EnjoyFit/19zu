package com.qfedu.entity;

public class Jstrain {
    private Integer id;

    private String xlclass;

    private String stime;

    private String hdo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getXlclass() {
        return xlclass;
    }

    public void setXlclass(String xlclass) {
        this.xlclass = xlclass == null ? null : xlclass.trim();
    }

    public String getStime() {
        return stime;
    }

    public void setStime(String stime) {
        this.stime = stime == null ? null : stime.trim();
    }

    public String getHdo() {
        return hdo;
    }

    public void setHdo(String hdo) {
        this.hdo = hdo == null ? null : hdo.trim();
    }
}