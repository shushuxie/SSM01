<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String basePath = request.getScheme()+"://"+
        request.getServerName()+":"+request.getServerPort()+
        request.getContextPath()+"/";
%>
<html>
<head>
    <title>ssm整合</title>
    <base href="<%=basePath%>"/>
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<%--    <script type="text/javascript" src="<%=basePath%>/js/jquery-3.4.1.min.js"></script>--%>
    <script type="text/javascript" src="<%=basePath%>/js/menu/js/menu.js"></script>
</head>
<body>

    <p>hello tomcat!!!</p>
    <div align="center">
        <table>
            <tr>
                <td><a href="addStudent.jsp">注册学生</a></td>
            </tr>
            <tr>
                <td><a href="addUser.jsp">注册用户</a></td>
            </tr>
            <tr>
                <td><a href="studentList.jsp">查看学生</a></td>
            </tr>
            <tr>
                <td><a href="transaction.jsp">测试事务</a></td>
            </tr>
            <tr>
                <td><button id="ajaxTest">测试ajax</button></td>
            </tr>
            <tr>
                <td><a href="<%=basePath%>/download.do">下载文件</a></td>
            </tr>
            <tr>
                <form action="test01.do" method="post">
                    <input name="name" type="text">
                    <input name="age" type="text">
                    <input type="submit" value="提交">
                </form>
            </tr>
        </table>

    </div>

<
</body>
<input id="path" type="hidden" value="<%=basePath%>">

</html>
