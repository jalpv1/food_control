<title>Registration Form</title>
<head>
<style><%@include file="static/style.css"%></style>

</head>

<body>
<link rel="stylesheet" href="${pageContext.request.contextPath}static/style.css">
<div class="form-group">

<form action="api/registration" method="post">

    <table style="with: 50%">

        <tr>
            <td>Login</td>
            <td><input type="text" name="login"
                       required pattern ="^(?=\D)+\w*$"/></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="password" name="password" /></td>
        </tr>
        <tr>
            <td>Weight</td>
            <td><input type="text" name="weight" /></td>
        </tr>
        <tr>
            <td>Sex</td>
            <td><input type="text" name="sex" /></td>
        </tr>
        <tr>
            <td>Activity level</td>
            <td><input type="text" name="activityLevel" /></td>
        </tr>
    </table>
    <input type="submit" value="Submit" /></form>
</div>

</body>
</html>
