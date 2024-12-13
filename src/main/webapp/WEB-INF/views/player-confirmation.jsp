<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
    <title>Player Confirmation</title>
</head>
<body>
    <h2>Player Confirmation</h2>
<hr>
<br><br>
The player has been added.

<br><br>
Name: ${athlete.firstName} ${athlete.lastName}

    <br><br>
Country: ${athlete.country}

    <br><br>
Handedness: ${athlete.handedness}

    <br><br>
Grand Slam Titles:
<ul>
    <c:forEach items="${athlete.grandSlams}" var="title">
        <li>${title}</li>
    </c:forEach>
</ul>

<br><br>
<b>Current Rank</b>: ${athlete.rank}

<br><br>
<b>Last Won</b>: <fmt:formatDate value="${athlete.lastWon}" type="date" pattern="dd-MM-yyyy"/>

<br><br>
<b>Prize Money</b>: ${athlete.prizeMoney}

</body>
</html>