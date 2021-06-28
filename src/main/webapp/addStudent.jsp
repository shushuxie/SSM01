<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String basePath = request.getScheme()+"://"+
        request.getServerName()+":"+request.getServerPort()+
        request.getContextPath()+"/";
%>
<html>
<head>
    <title>添加学生</title>
    <base href="<%=basePath%>"/>
</head>
<body>
    <div align="center">
        <form action="register.do">
            <table>
                <tr>
                    <td>姓名</td>
                    <td><input type="text" name="sname"></td>
                </tr>
                <tr>
                    <td>邮箱</td>
                    <td><input type="text" name="email"></td>
                </tr>
                <tr>
                    <td>年龄</td>
                    <td><input type="text" name="age"></td>
                </tr>
                <tr>age
                    <td>&ensp;&ensp;&ensp;&ensp;</td>
                    <td><input type="submit" value="注册"></td>
                </tr>
            </table>

        </form>

    </div>
</body>
</html>
