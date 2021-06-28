<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String basePath = request.getScheme()+"://"+
        request.getServerName()+":"+request.getServerPort()+
        request.getContextPath()+"/";
%>
<html>
<head>
    <title>测试事务</title>
    <base href="<%=basePath%>"/>
</head>
<body>
    <div align="center">
        <form action="transaction.do">
            id:<input type="text" name="id"> <br>
            名字:<input type="text" name="sname"><br>
            年龄:<input type="text" name="age"><br>
            邮箱:<input type="text" name="email"><br>
            <input type="submit" value="提交"><br>
        </form>
        <p>删除学生</p>
        <form action="delete.do">
            id:<input type="text" name="id"><br>
            <input type="submit" value="submit">
        </form>
    </div>
</body>
</html>
