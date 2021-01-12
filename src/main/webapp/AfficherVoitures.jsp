<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste Voitures</title>
</head>
<body>
 
 
 <h3>Liste de Voitures:</h3> <br> 

    <c:forEach items="${voitureList}" var="v">
     ID de la voiture: ${v.id} <br>    
     Nom de la voiture: ${v.nom} <br>
     Matricule de la voiture: ${v.matricule} <br>
     ###################  <br>  <br>
    </c:forEach>
    
    
<a href="Ajoutvoiture.jsp">Ajouter une autre?</a>


</body>
</html>