package com.kgc.news.dao;


import com.kgc.news.entity.News_detail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface News_detailDao {
    /**
     * 新闻表分页全查
     * @return
     */
    public List<News_detail> query(@Param("start") Integer start,
                                   @Param("title") String title);

    /**
     * 计算总数
     * @return
     */
    public int count(String title);
    /**
     * 删除
     */
    int delNew(@Param("id") int id);
    List<News_detail> getquary();


}
