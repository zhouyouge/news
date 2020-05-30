package com.kgc.news.dao;


import com.kgc.news.entity.News_comment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface News_commentDao {
    /**
     * 根据id查看评论信息
     * @param id
     * @return
     */
    List<News_comment> getbyId(int id);

    /**
     * 添加评论
     * @param comment
     * @return
     */
    int  addComment(News_comment comment);
}
