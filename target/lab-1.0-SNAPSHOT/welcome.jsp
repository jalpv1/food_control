<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<%@ page import="entity.User" %>
<%@ page import="java.util.Optional" %>
<%@ page import="java.util.List" %>
<%@ page import="entity.Meal" %>
<%@ page import="java.util.Enumeration" %>
<%@ page import="java.util.Map" %>
<%@ page import="controllers.LogIn" %><%--
  Created by IntelliJ IDEA.
  User: julia
  Date: 21.12.2019
  Time: 19:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style><%@include file="static/style.css"%></style>
<style><%@include file="static/bootstrap.min.css"%></style>

<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/style.css">
    <script type="text" src="${pageContext.request.contextPath}/static/style.css"></script>

    <title>Hello</title>
</head>
<body>
DISABLED
CopyCopy
<nav class="navbar navbar-expand-lg bg-primary">
    <div class="container">
        <a class="navbar-brand" href="#">Navbar</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-bar navbar-kebab"></span>
            <span class="navbar-toggler-bar navbar-kebab"></span>
            <span class="navbar-toggler-bar navbar-kebab"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/registration.jsp">Registration</a>
                </li>
                <%
                    if(session.getAttribute("user") != null){
                %>
                <li class="nav-item">
                    <a class="nav-link"href="${pageContext.request.contextPath}/login.jsp">Log Out</a>
                </li>
                <%
                    }
                %>
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/login.jsp">Log In</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<a href="${pageContext.request.contextPath}/registration.jsp">Registration</a>
<a href="${pageContext.request.contextPath}/login.jsp">Log in</a>
<%
    Optional<User> user = (Optional<User>) session.getAttribute("user");
    if (user == null) {

%>

<h1>My status in system is false</h1>

<%
    }
%>
<%
    if (user != null) {
%>
<h1>Welcome, dear <%=user.get().getLogin()%>
</h1>
<div class="marginTable" data-count="5">
    <p>Your norm of calories: <%=user.get().getKkalNorm()%>
    </p>
    <p>Your current calories: <%=session.getAttribute("kkal")%>
    </p>
    <%
        if ((Integer) session.getAttribute("kkal") <= 0) {
         int limit =   Math.abs((Integer) session.getAttribute("kkal"));
    %>
    <div class="alert alert-danger" role="alert">
        Your limit is off <%= limit%>
    </div>
    <%

        }
    %>
</div>
<h1>MEAL LIST</h1>
<a href="${pageContext.request.contextPath}/registrateMeal.jsp">Add Meal</a>

<div>
    <!--%=meal.getName()%>
    <a href="lsdfs/{id}"<!%=meal.getName()%>
    <form action="addmeal"><input type="kkals" value="Submit"/>
        <!% session.setAttribute("updatekkals",meal.getAmoundOfKkal());

        %>
        <input type="submit" value="Submit"/>Add
    </form-->
    <%
        //    }

    %>
</div>
<div class="table-responsive">
<table  class="table"> <thead class=" text-primary">
    <tr>
        <th>Name</th>
        <th>Count of Kkals</th>
        <th>Add</th>
    </tr>
</thead>
    <% List<Meal> meals = (List<Meal>) session.getAttribute("meal");
        for (Meal u : meals) {
    %>
    <!--c:forEach items="${meals}"  var="u"-->
    <tr>
        <td><%=u.getName()%>
        </td>
        <td><%=u.getAmoundOfKkal()%>
        </td>
        <td>
            <form method="post" action="api/updatekkal" class="inline">
                <input type="hidden" name="kkal" placeholder="Enter amount" value="<%=u.getAmoundOfKkal()%>">
                <input type="text" name="amount">

                <button type="submit" name="Add" class="link-button">
                    <i>add</i>
                </button>
            </form>
        </td>
    </tr>
    <%
        } // endfor
    %>
    <!--/--c:forEach-->
</table></div>
<%
        //end if
    }
%>

</body>
</html>
