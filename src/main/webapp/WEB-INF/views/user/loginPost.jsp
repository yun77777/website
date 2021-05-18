<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <script>
    if('${user}'==null){
    	alert("아이디와 비밀번호를 확인해주세요.");
        self.location = "/user/login.do";
    }else{
    	alert("successfully login")
    }
        
    </script>
</body>
</html>
