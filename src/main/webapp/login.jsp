<title>Log In</title>
<head>
    <style><%@include file="static/style.css"%></style>

</head>

<body>
<!--form action="api/login" method="post">

    <table style="with: 50%">

        <tr>
            <td>Login</td>
            <td><input type="text" name="login" /></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="password" name="password" /></td>
        </tr>

    </table>
    <input type="submit" value="Submit" /></form-->
<h1>Log In</h1>

<form action="api/login" method="post">
    <div class="form-group">
        <label for="exampleInputEmail1">Email address</label>
        <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"
               placeholder="Enter login" name="login">
        <small id="emailHelp" class="form-text text-muted">We'll never share your login with anyone else.</small>
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">Password</label>
        <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password"  name="password">
    </div>

    <button type="submit" class="btn btn-primary">Submit</button>
</form>

</body>
</html>
