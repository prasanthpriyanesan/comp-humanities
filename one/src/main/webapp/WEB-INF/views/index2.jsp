<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<body>
<h2>Hello World!</h2>

I am feeling: ${mood.feeling}. See <a href="explanation/${mood.feeling}">here</a> to find out why.
</body>
</html>	