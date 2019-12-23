<title>Registration Form</title>
<head>
<style><%@include file="static/style.css"%></style>

</head>

<body>
<link rel="stylesheet" href="${pageContext.request.contextPath}static/style.css">
<div class="form-group">

<!--form action="api/registration" method="post">
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
            <td><input type="number" name="weight" /></td>
        </tr>
        <tr>
            <td>Sex</td>
            <td><input type="text" name="sex" /></td>
        </tr>
        <tr>
            <td>Activity level</td>
            <td><input type="number" name="activityLevel" /></td>
        </tr>
    </table>

    <input type="submit" value="Submit" /></form-->

</div>
<form action="api/registration" method="post">
    <div class="form-group">
        <label for="exampleInputEmail1">Email address</label>
        <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"
               placeholder="Enter email" name="login">

    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">Password</label>
        <input type="password" class="form-control"
               id="exampleInputPassword1" placeholder="Password" name="password">
    </div>
    <div class="form-group">
        <label for="exampleInputEmail1">Weigh</label>
        <input type="number" class="form-control" placeholder="Enter your weigh" name="weight">
    </div>
    <div class="form-group">
        <label for="exampleInputEmail1">Sex</label>
        <input type="text" class="form-control"
                placeholder="Enter your sex" name="sex">
    </div>
    <div class="form-group">
        <label for="exampleInputEmail1">Activity level 1-10</label>
        <input type="number" class="form-control"  placeholder="1-10" name="activityLevel">
    </div>

    <button type="submit" class="btn btn-primary">Submit</button>
</form>

</body>
</html>
