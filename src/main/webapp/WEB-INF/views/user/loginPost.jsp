<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <script>
    var id='${id}';
    var length=id.length;
    if(id==null||length==0){
    	alert("아이디와 비밀번호를 확인해주세요.");
        self.location = "/user/login.do";
    }else{
    	alert("successfully login");
        self.location = "/user/afterLogin.do";
    }
        
    </script>
</body>
</html>
