<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>


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
<html>
<head>
    <title>Hello</title>
</head>
<body>

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
<h1>Welcome, dear <%=user.get().getLogin()%> </h1>
<div class="marginTable" data-count="5">
    <p>Your norm of calories: <%=user.get().getKkalNorm()%></p>
    <p>Your current calories: <%=session.getAttribute("kkal")%> </p>
</div>
<h1>MEAL LIST</h1>

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
<table border="1" width="90%">
    <tr>
        <th>Name</th>
        <th>Count of Kkals</th>
        <th>Add</th>
    </tr>
    <% List<Meal> meals = (List<Meal>) session.getAttribute("meal");
    for(Meal u:meals) {
    %>
    <!--c:forEach items="${meals}"  var="u"-->
        <tr>
            <td><%=u.getName()%>}</td>
            <td><%=u.getAmoundOfKkal()%></td>
            <td>
                <form method="post" action="api/updatekkal" class="inline">
                    <input type="hidden" name="kkal" value="<%=u.getAmoundOfKkal()%>">
                    <button type="submit" name="Add"class="link-button">
                    </button>
                </form>
            </td>
        </tr>
    <%
    } // endfor
    %>
    <!--/--c:forEach-->
</table>
<%
        //end if
    }
%>

</body>
</html>
