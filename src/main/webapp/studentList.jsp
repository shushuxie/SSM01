<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String basePath = request.getScheme()+"://"+
        request.getServerName()+":"+request.getServerPort()+
        request.getContextPath()+"/";
%>
<%--<script src="${pageContext.request.contextPath}/scripts/jquery-1.9.1.min.js">--%>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.4.1.min.js"></script>
<script>
   $(function () {
       //页面加载完成之后立即加载数据
       loadStudent();
    $("#btnLoader").click(function () {
        loadStudent();
    })
   })
    function loadStudent() {
        $.ajax({
            url:"queryStudent.do",
            type:"get",
            dataType:"json",
            success:function (data) {
                //清空旧的数据
                $("#info").html("")
                $.each(data,function (i,n) {
                    //增加新的数据
                    $("#info").append("<tr>")
                        .append("<td>"+n.id+"</td>")
                        .append("<td>"+n.sname+"</td>")
                        .append("<td>"+n.email+"</td>")
                        .append("<td>"+n.age+"</td>")
                        .append("</tr>")
                })
            }
        })
    }
</script>
<html>
<head>
    <title>学生列表</title>
    <base href="<%=basePath%>"/>
</head>
<body>
    <div align="center">
        <table width="10px">
            <thead>
                <tr>
                    <td>学号</td>
                    <td>姓名</td>
                    <td>email</td>
                    <td>年龄</td>
                </tr>
            </thead>
            <tbody id="info">

            </tbody>
        </table>
       <input type="button" id="btnLoader" value="查询数据">
    </div>

</body>
</html>
