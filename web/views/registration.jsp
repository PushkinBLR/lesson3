<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>

<body>
<div>
    <h1>Registration new user</h1>
</div>

<div>
    <%
        if (request.getAttribute("login") != null) {
            out.println("<p>User '" + request.getAttribute("login") + "' added!</p>");
        }
    %>
    <div>
        <div>
            <h2>Add user</h2>
        </div>

        <form method="post">
            <label>Id:
                <input type="int" name="id"><br />
            </label>
            <label>Name:
                <input type="text" name="name"><br />
            </label>
            <label>Section:
                <input type="text" name="section"><br />
            <input type="submit" value="Save"/>
        </form>
    </div>
</div>

<div>
    <button onclick="location.href='/'">Back to main</button>
</div>
</body>
</html>