package com.kgc.news.service;


import com.kgc.news.entity.News_detail;
import com.kgc.news.entity.Page;
import com.kgc.news.entity.ResponseResult;

public interface News_detailService {
    /**
     * 分页查询
     * @param pageon
     * @return
     */
    Page<News_detail> quary(Integer pageon, String title);

    /**
     * 物理删除永久删除
     * @param id
     * @return
     */
    ResponseResult delNews(int id);


}
