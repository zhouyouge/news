package com.kgc.news.entity;

import java.io.Serializable;

/**
 * 新闻评论表
 */

public class News_comment implements Serializable {
    /**
     * 编号
     *
     */
  private Integer id ;
    /**
     *  新闻编号
     */
    private Integer newsid;
    /**
     * 评论内容
     */
    private  String content;
    /**
     *  评论人
     */
    private String author;
    /**
     * 评论时间
     */
    private  String createdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNewsid() {
        return newsid;
    }

    public void setNewsid(Integer newsid) {
        this.newsid = newsid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }
}
