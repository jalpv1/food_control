<title>Registration Form</title>
<head>
    <style><%@include file="static/style.css"%></style>

</head>

<body>
<form action="api/addmeal" method="post">

    <table style="with: 50%">
        <h1> Add new meal</h1>
        <h3> Enter informaion about meal per 100 gramms</h3>
        <tr>
            <td>Meal Name</td>
            <td><input type="text"  name="meal_name"/></td>
        </tr>
        <tr>
            <td>Category</td>
            <td><input type="password" name="category"/></td>
        </tr>
        <tr>
            <td>Amound of calories</td>
            <td><input type="text" name="kkal"/></td>
        </tr>
        <tr>
            <td>Amound of fats</td>
            <td><input type="text" name="fats"/></td>
        </tr>
        <tr>
            <td>Amound of proteins</td>
            <td><input type="text" name="proteins"/></td>
        </tr>
        <tr>
            <td>Amound of carbones</td>
            <td><input type="text" name="carbones"/></td>
        </tr>
    </table>
    <input type="submit" value="Submit"/></form>
</body>
</html>
