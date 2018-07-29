<%--
  Created by IntelliJ IDEA.
  User: zh
  Date: 2018/7/29
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8"%>
<%
    //得到当前页面的全路径
    String requestURI = request.getRequestURI();
    String schme = request.getScheme();
    String serverName = request.getServerName();
    Integer serverPort = request.getServerPort();
    //得到工程名
    String contextPath = request.getContextPath();
    String basePath = schme+"://"+serverName+":"+serverPort+contextPath;
%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <table>
      <tr><td><label>request.getRequestURI()</label><span><%=requestURI%></span></td></tr>
      <tr><td><label>request.getScheme()</label><span><%=schme%></span></td></tr>
      <tr><td><label>request.getServerName()</label><span><%=serverName%></span></td></tr>
      <tr><td><label>request.getServerPort()</label><span><%=serverPort%></span></td></tr>
      <tr><td><label>request.getContextPath()</label><span><%=contextPath%></span></td></tr>
      <tr><td><label>basePath</label><span><%=basePath%></span></td></tr>






  </table>
  <label>当前路径</label><span>${path}</span>
     <input type="button" onclick="to_xmlHello()" value="xmlhello"/>

     <script type="text/javascript" src="<%= contextPath%>/js/jquery/jquery-3.3.1.min.js"></script>
     <script>
         function to_xmlHello(){
             location.href="<%= basePath%>/xmlHello";
         }
     </script>
  </body>
</html>
