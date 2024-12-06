<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Add Player</title>
</head>
<body>
<h2>Player Form</h2>
<hr>
<form:form action="processPlayerForm" modelAttribute="athlete">
    <br><br>
    Name: <form:input path="lastName"/>

    <br><br>
    <input type="submit" value="Add Player"/>
</form:form>
</body>
</html>