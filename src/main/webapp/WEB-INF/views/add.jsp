<html>
<head>
<title>${title}</title>
</head>
<body>
    <jsp:include page="menu.jsp" />
     <h3>Enter user name:</h3>  
     
   <form name='userForm' action="${pageContext.request.contextPath}/insert" method='POST'>
      <table>
         <tr>
            <td>User:</td>
            <td><input type='text' name='userName'></td>
         </tr>
         <tr>
            <td><input name="submit" type="submit" value="Add User" /></td>
         </tr>
      </table>
  </form>
    
</body>
</html>