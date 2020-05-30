package com.kgc.news.service;


import com.kgc.news.entity.News_comment;
import com.kgc.news.entity.ResponseResult;

import java.util.List;

public interface News_commentService {

    /**
     * 根据id查看评论信息
     * @param id
     * @return
     */
    List<News_comment> getbyId(int id);

    /**
     * 添加记录
     * @param comment
     * @return
     */

    ResponseResult addComnent(News_comment comment);
}
