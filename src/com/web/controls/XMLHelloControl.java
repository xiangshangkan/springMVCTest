package com.web.controls;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XMLHelloControl implements Controller {
    private static final Log logger = LogFactory.getLog(XMLHelloControl.class);
    private static class Enum {

    }
    /**
     * handleRequest是Controller接口必须实现的方法。
     * 该方法的参数对应请求的HttpServletRequest 和HttpServletResponse对象
     * 该方法必须返回一个包含视图名或视图名和模型的ModelAndView对象
     * */
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        logger.info("被调用");
        //创建准备返回的ModelAndView对象，该对象通常包含了返回视图名、模型的名称以及模型对象
        ModelAndView mv = new ModelAndView();
        //添加模型数据,可以是任意的pojo对象
        mv.addObject("message","Hello World");
        //设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
        mv.setViewName("hello/hello");
        return mv;
    }
}
