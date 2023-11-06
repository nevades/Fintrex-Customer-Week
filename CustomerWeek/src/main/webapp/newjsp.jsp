<%--
    Document   : newjsp
    Created on : Nov 2, 2023, 3:20:32 PM
    Author     : Neva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>


    <script>

        fetch('Test?name=thisara').then(res => res.text())
                .then(res => {
                    alert(res);
                });



    </script>
</html>
