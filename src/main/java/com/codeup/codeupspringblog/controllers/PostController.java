package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {
    @RequestMapping(path="/posts", method = RequestMethod.GET)
    @ResponseBody
    public String getPost() {
      return "posts index page";
    }

    @RequestMapping(path="/posts/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String getPostId(@PathVariable String id) {
        return "view an individual " + id + " post";
    }

//    @RequestMapping(path="/posts/create", method = RequestMethod.GET)
//    @ResponseBody
//    public String getPostCreateGet() {
//        return "view the form creating for a post";
//    }
    @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
    @ResponseBody
    public String getPostCreatePost(@PathVariable String create) {
        return create + "a new post";
    }
    //view an individual create post is being displayed
}
