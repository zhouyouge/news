package com.kgc.news.service.impl;

import com.kgc.news.dao.News_commentDao;
import com.kgc.news.dao.News_detailDao;
import com.kgc.news.entity.News_comment;
import com.kgc.news.entity.ResponseResult;
import com.kgc.news.service.News_commentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service("news_commentService")
public class News_commentServiceImpl implements News_commentService {
    @Autowired
    private News_commentDao commentDao;
    @Autowired
    private News_detailDao dao;
    @Override
    public List<News_comment> getbyId(int id) {
        return commentDao.getbyId(id);
    }

    @Override
    public ResponseResult addComnent(News_comment comment) {


        ResponseResult rs=new ResponseResult();
        if (StringUtils.isEmpty(comment)){
            rs.setFlag(0);
            rs.setData("传参为空");
        }
        if (StringUtils.isEmpty(comment.getContent())){
            rs.setFlag(1);
            rs.setData("评论内容为空");
        }
        if (StringUtils.isEmpty(comment.getAuthor())){
            rs.setFlag(2);
            rs.setData("评论人为空");
        }

        int flag= commentDao.addComment(comment);
        if(flag>0){
            rs.setFlag(3);
            rs.setResult(true);
        }else{
            rs.setFlag(4);
        }
        return rs;
    }
    }
