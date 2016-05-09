<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<title>${title}</title>
</head>
<body>
    <jsp:include page="menu.jsp" />
    	<h1>User List</h1>
    	<c:choose>
	    	<c:when test="${fn:length(userList) == 0}">
	    		<b> Please add a user using add menu</b>
    		</c:when>
    		<c:otherwise>
		    	<c:forEach items="${userList}" var="user" >
					<c:out value="${user}" />
				<br />
				</c:forEach>
    		</c:otherwise>
    	</c:choose>
</body>
</html>