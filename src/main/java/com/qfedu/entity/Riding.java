package com.qfedu.entity;

public class Riding {
    private Integer id;

    private String issue;

    private String ndo;

    private String imgurl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue == null ? null : issue.trim();
    }

    public String getNdo() {
        return ndo;
    }

    public void setNdo(String ndo) {
        this.ndo = ndo == null ? null : ndo.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }
}