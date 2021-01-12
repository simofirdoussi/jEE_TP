<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ajouter Voiture</title>
    </head>
    <body>
        <div id="Ajouter">
        <h1> Ajouter une voiture </h1>
        <form action="VoitureServlet" method="GET">
            <table>
                <tr>
                    <td> Nom de la voiture: </td>
                    <td><input type="text" name="nom"></td>
                </tr>
                <tr>
                    <td> Matricule de la voiture: </td>
                    <td><input type="text" name="matricule"></td>
                </tr>
                <tr>
                    <td><input type="submit" name="ajoutVoiture" value="Ajouter"></td>
                    
                </tr>
            </table>
        </form>
        </div>
        
        
        <form action="VoitureServlet" method="POST">
            <input type="submit" name="afficherVoiture" value="Afficher"> &nbsp; &nbsp;<br>          
        </form>
    </body>
</html>