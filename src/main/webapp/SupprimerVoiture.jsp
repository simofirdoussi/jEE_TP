<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Supprimer une Voiture</title>
</head>
<body>
 
 
   <form action="VoitureServlet" method="POST">
            ID de la voiture à supprimer <input id="id" type="text" name="id"><br>            
   
            <input type="submit" name="supprimervoiture" value="Supprimer"> &nbsp; &nbsp;<br>          
    </form>   

</body>
</html>