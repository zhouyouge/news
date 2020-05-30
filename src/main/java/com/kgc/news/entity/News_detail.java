package com.kgc.news.entity;

import java.io.Serializable;
import java.sql.Date;

/**
 * 新闻表
 */

public class News_detail implements Serializable {

  private Integer  id;

    private String title;

    private String summary;
    private String author;
    private Date created;




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }



}
