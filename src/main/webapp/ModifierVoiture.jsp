<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modifier une Voiture</title>
</head>


<body>
    <form action="VoitureServlet" method="POST">
            <input type="submit" name="afficherVoiture" value="Afficher la liste de voitures"> &nbsp; &nbsp;<br>          
        </form> 
    <form action="VoitureServlet" method="POST">
            
             <br>
             ID<input id="id" type="text" name="id"><br>            
             Nom<input id="nom" type="text" name="nom"><br>
             Matricule<input id="mat" type="text" name="mat"><br>
             
            <button type="submit" id="modifiervoiture" name="modifiervoiture"> Modifier</button> <br> <br>
            
            
</form>
</body>

</html>