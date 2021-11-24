$(function () {
var path = $('#path').val();
    $('#ajaxTest').on('click',function () {
        console.log("进入了click方法")
        // doAjax();
        doAjax2();

    })
    function doAjax2(){
        var path = $('#path').val();
        $.ajax({
            url:path+"ajax.do",
            type:"get",
            sync:true,
            success:function (data) {
                alert("成功ajax")
            }
        })
    }

    function doAjax() {
        /*Ajax使用步骤*/
        //1.创建对象
        var xmlHttp = new XMLHttpRequest();
        //2.绑定事件
        xmlHttp.onreadystatechange = function () {
            //当正确返回数据时，执行函数
            if(xmlHttp.readyState==0){
                console.log("ajax执行--0")
            }
            if(xmlHttp.readyState==1){
                console.log("ajax执行--1")
            }
            if(xmlHttp.readyState==2){
                console.log("ajax执行--2")
            }
            if(xmlHttp.readyState==3){
                console.log("ajax执行--3")
            }
            if(xmlHttp.readyState==4){
                console.log("ajax执行--4")
            }
            if(xmlHttp.readyState === 4 && xmlHttp.status === 200){
                var data = xmlHttp.responseText;
                alert("ajax执行成功")
                console.log("ajax执行ok"+data);
            }
        }
        //3.初始请求数据
        xmlHttp.open("get",path+"/ajax.do",true);
        //4.发起请求
        xmlHttp.send(null);
    }

})