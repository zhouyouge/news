package com.kgc.news.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 分页查询
 */
public class Page<T> implements Serializable {
    private Integer pageon;//当前页
    private Integer pages;//总页数
    private Integer count;//总条数
    private List<T> li;//总条数里面的内容

    public Integer getPageon() {
        return pageon;
    }

    public void setPageon(Integer pageon) {
        this.pageon = pageon;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<T> getLi() {
        return li;
    }

    public void setLi(List<T> li) {
        this.li = li;
    }
}
