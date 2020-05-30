package com.kgc.news.service.impl;

import com.kgc.news.dao.News_detailDao;
import com.kgc.news.entity.News_detail;
import com.kgc.news.entity.Page;
import com.kgc.news.entity.ResponseResult;
import com.kgc.news.service.News_detailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("news_detailService")
public class News_detailServiceImpl implements News_detailService {
    @Autowired
   private News_detailDao dao;
    @Override
    public Page<News_detail> quary(Integer pageon , String title) {

            Page<News_detail> p= new Page<News_detail>();
            p.setPageon(pageon);
            int i=dao.count(title);
            p.setCount(i);
            if(i%5==0){
                p.setPages(i/5);
            }else{
                p.setPages((i/5)+1);
            }
            int start =(pageon-1)*5;
            p.setLi(dao.query(start,title));
        List<News_detail>  list= dao.query(start,title);
        for (News_detail n:list
             ) {
            System.out.println(n.getTitle());

        }
            return p;
        }

    @Override
    public ResponseResult delNews(int id) {
        ResponseResult rs= new ResponseResult();
        int flag=dao.delNew(id);
        if(flag>0){
            rs.setFlag(1);
            rs.setResult(true);

        }else {
            rs.setFlag(0);

        }
        return rs;
    }

}
