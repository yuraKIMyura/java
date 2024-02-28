<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax</title>
</head>
<body>

   <div id="target" style="width: 300px; height: 60px; border: solid 1px black;">
        </div>
        <button type="button" onclick="getFromServer()">GET DATA</button>
    
    <script>
        function getFromServer() {
            const xhttp = new XMLHttpRequest();
            xhttp.onload = function () {
                document.getElementById("target").innerHTML =
                    this.responseText;
            }
            xhttp.open("GET", "list.jsp");
            xhttp.send();
        }
    </script>

	<!-- 새로고침하지 않고, 해당 영역만 불러오는 역할 -->

</body>
</html>