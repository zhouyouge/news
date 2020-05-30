package com.kgc.news.controller;

import com.alibaba.fastjson.JSON;

import com.kgc.news.entity.News_comment;
import com.kgc.news.entity.News_detail;
import com.kgc.news.entity.Page;
import com.kgc.news.entity.ResponseResult;
import com.kgc.news.service.News_commentService;
import com.kgc.news.service.News_detailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class News_detailController {
    @Autowired
 private News_detailService service;

    @Autowired
    private News_commentService commentService;

    @RequestMapping("quan")
    @ResponseBody
    public Page<News_detail> quary(Integer pageon,
                                   @RequestParam(value = "title",required = false)
                                           String title){
        Page<News_detail> list=    service.quary(pageon,title);

        return list;
    }

    /**
     * 删除新闻
     * @param id
     * @return
     */
    @RequestMapping(value = "delNews" ,method = RequestMethod.GET)
    @ResponseBody
    public Object delNews(@RequestParam("id") int id) {
        ResponseResult rs= null;
        rs=service.delNews(id);
        return JSON.toJSONString(rs);


    }
@ResponseBody
@RequestMapping( value = "byId",method = RequestMethod.GET)
    public Object getCom (@RequestParam("id")Integer id, HttpSession session){
        return commentService.getbyId(id);


    }


    /**
     * 添加评论
     */
@ResponseBody
   @RequestMapping(value = "addCom",method = RequestMethod.POST)
public String addComment(News_comment comment, HttpSession session) {
    System.out.println(comment.getNewsid());
    comment.setNewsid(comment.getNewsid());
    ResponseResult rs= new  ResponseResult ();
    if(!StringUtils.isEmpty(comment)){
           rs=commentService.addComnent(comment);

       }
    return JSON.toJSONString(rs);




}

/**
 * 返回 页面
 */

@RequestMapping(value = "aa")
    public String aa(int id){
    return "add";
}


    @RequestMapping(value = "bb")
    public String bb(int id){



        return "pinglun";
    }
    @RequestMapping(value = "index")
    public String index(){



        return "index";
    }

}
