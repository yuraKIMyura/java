<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
  <!-- Required meta tags -->
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />

  <meta name="description" content="" />
  <meta name="author" content="" />
  <link rel="icon" href="${pageContext.request.contextPath}/resources/img/chat.png" />

  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
    integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous" />

  <title>BLABBER | 글읽기</title>
</head>





<body style="background-color: #fefbe9; ">

  <!--NAVBAR-->
  <header>
    <nav class="navbar navbar-expand-lg navbar-dark fixed-top" style="background-color: #ed7966; font-weight:bold">
      <a class="navbar-brand" href="mainView.do"><img src="${pageContext.request.contextPath}/resources/img/chat.png" alt="logo" style="width: 45px" /></a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault"
        aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item active">
            <a class="nav-link" href="allBoardView.do">전체</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">인기</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">베스트</a>
          </li>
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="http://example.com" id="dropdown01" data-toggle="dropdown"
              aria-haspopup="true" aria-expanded="false">게시판</a>
            <div class="dropdown-menu" aria-labelledby="dropdown01">
              <a class="dropdown-item" href="#">익명게시판</a>
              <a class="dropdown-item" href="#">자유게시판</a>
            </div>
          </li>
        </ul>
        
        <a href="logout.do">
  <button class="btn btn-sm btn-outline-light" style="background-color: #aa2410; border: none">로그아웃</button>
</a>
        

      </div>
    </nav>
  </header>



  <!--main-->
  <main style="padding-top: 10rem; padding-bottom: 10rem;">

    <!--첫째줄-->
    <div class="container col-lg-11" style="background-color: #fefbe9; padding-bottom:5rem">

      <div class="row">
        <!--첫째줄 첫번째 요소-->
        <div class="col-lg-2" style="padding-right: 10rem">

        </div><!--첫째줄 첫번째 요소-->
        <!--첫째줄 두번째 요소-->
        <div class="col-lg-8" style="padding-right: 5rem">


          <div style="padding-top: 2rem;">
          
          <form action="updateForm.do" method="post">
            <input type="hidden" name="boardno" value="${article.boardno}">
            <input type="hidden" name="hits" value="true">
            
            
            <table class="table table-borderless" style="width: 100%">
            
	         <tr>
                <td style="color: #ed7966; text-align: center;">게시판</td>
                <td colspan="3">${article.type}</td>
              </tr>

              <tr scope="row">
                <td style="color: #ed7966; text-align: center;">작성자</td>
                <td style="width: 25%;">${article.writer}</td>
                <td style="color: #ed7966; text-align: center;">작성일</td>
                <td>${article.regtime}</td>
              </tr>

              <tr scope="row">
                <td style="color: #ed7966; text-align: center;">조회수</td>
                <td>${article.hits}</td>
                <td style="color: #ed7966; text-align: center;">추천수</td>
                <td>${article.recommends}</td>
              </tr>

              <tr style="background-color:#ed78661e;">
                <td style="color: #ed7966; font-weight: bolder; text-align: center;">제목</td>
                <td colspan="3">${article.title}</td>

              </tr>

              <tr style="background-color:#ed78661e;">
                <td style="color: #ed7966; font-weight: bolder; text-align: center;">내용</td>
                <td colspan="3">${article.content}</td>
              </tr>

<% if ((Boolean)request.getAttribute("isWriter")) { %>
	
    <tr>
    
        <td colspan="4" style="text-align: center;">
            <button type="submit" class="btn btn-md" style="
                background-color: #de705f;
                border: none;
                color: white;
            ">수정</button>
            &nbsp;
            <a class="btn btn-md" href="delete.do?boardno=${article.boardno}" role="button" style="
                background-color: #de705f;
                border: none;
                color: white;
            ">삭제</a>
        </td>
    </tr>
<% } %>
            </table>
            </form>
          </div>



          <div style="text-align: center; padding-top:2rem;">
            <a class="btn btn-md" href="recommend.do?boardno=${article.boardno}" role="button" style="
          background-color: #de705f;
          border: none;
          color: white;
        ">${isRecommended ? "추천해제": "👍 추천" }</a>
          </div>

<!--           <div style="padding-top: 2rem;">
            <p style="font-weight: bold;">댓글 목록</p>
            <table class="table table-borderless" style="width: 100%; font-size: small;">
              <tr>
                <td>댓글번호</td>
                <td>작성자</td>
                <td>댓글내용</td>
                <td>댓글작성시간</td>
                <td>추천</td>
                <td>비추천</td>
                <td>수정</td>
                <td>삭제</td>
              </tr>

              <tr>
                <td>댓글번호</td>
                <td>작성자</td>
                <td>댓글내용</td>
                <td>댓글작성시간</td>
                <td>추천</td>
                <td>비추천</td>
                <td>수정</td>
                <td>삭제</td>
              </tr>

           
            </table>
          </div> 


         <div class="input-group" style="padding-bottom:2rem;">
            <textarea class="form-control"></textarea>
            <span class="input-group-text" style="background-color: #ed7966; border: none; color:#fefbe9">등록</span>
          </div>
          
          -->

          <a class="btn btn-lg" href="allBoardView.do" role="button" style="
            background-color: #ed7966;
            border: none;
            color: white;
          ">목록</a>


      </div><!--첫째줄 두번째 요소-->

      </div><!--첫째줄-->




  </main>




  <footer class="col-lg-12"
    style="text-align: center ; padding-top: 10px; padding-bottom: 10px; background-color:#ed7966;">

  </footer>



  <!-- Bootstrap core JavaScript
    ================================================== -->
  <!-- Placed at the end of the document so the pages load faster -->
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
    integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
    crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
    integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
    crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
    integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
    crossorigin="anonymous"></script>
</body>

</html>