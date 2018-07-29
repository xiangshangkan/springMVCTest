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
     * handleRequest��Controller�ӿڱ���ʵ�ֵķ�����
     * �÷����Ĳ�����Ӧ�����HttpServletRequest ��HttpServletResponse����
     * �÷������뷵��һ��������ͼ������ͼ����ģ�͵�ModelAndView����
     * */
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        logger.info("������");
        //����׼�����ص�ModelAndView���󣬸ö���ͨ�������˷�����ͼ����ģ�͵������Լ�ģ�Ͷ���
        ModelAndView mv = new ModelAndView();
        //���ģ������,�����������pojo����
        mv.addObject("message","Hello World");
        //�����߼���ͼ������ͼ����������ݸ����ֽ������������ͼҳ��
        mv.setViewName("hello/hello");
        return mv;
    }
}
