<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Add Player</title>
    <style>
        .error{
          color: red;
          font-style: italic;
        }
    </style>
</head>
<body>
<h2>Player Form</h2>
<hr>
<form:form action="processPlayerForm" modelAttribute="athlete">

    <br><br>
    First Name: <form:input path="firstName"/>

    <br><br>
    Last Name *: <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>

    <br><br>
    Country: <form:select path="country">
    <form:option value="AUT" label="Austria"/>
    <form:option value="FRA" label="France"/>
    <form:option value="SRB" label="Serbia"/>
    <form:option value="SUI" label="Switzerland"/>
    <form:option value="USA" label="United States of America"/>
    </form:select>

    <br><br>
    Handedness: &emsp;
    Left-handed: <form:radiobutton path="handedness" value="Left-Handed"/>&emsp;
    Right-handed:<form:radiobutton path="handedness" value="Right-Handed"/>&emsp;
    Ambidextrous:<form:radiobutton path="handedness" value="Ambidextrous"/>&emsp;

    <br><br>
    Grand Slam Titles Won:
    Australian Open <form:checkbox path="grandSlams" value="Australian Open"/>
    French Open <form:checkbox path="grandSlams" value="French Open"/>
    Wimbledon <form:checkbox path="grandSlams" value="Wimbledon"/>
    US Open <form:checkbox path="grandSlams" value="US Open"/>

    <br><br>
    Current Rank *: <form:input path="rank"/>
    <form:errors path="rank" cssClass="error"/>


    <br><br>
    Last Won (dd-mm-yyyy): <form:input path="lastWon"/>
    <form:errors path="lastWon" cssClass="error"/>

    <br><br>

    Prize Money(USD): <form:input path="prizeMoney" placeholder="$#,###,###"/>
    <form:errors path="prizeMoney" cssClass="error"/>

    <input type="submit" value="Add Player"/>
</form:form>
</body>
</html>