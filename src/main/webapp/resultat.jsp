<%@ page import="com.example.tp4.Client" %>
<%@ page session="true" %>

<html>
<head>
  <title>Résultat</title>
</head>
<body>

<%
  // Récupérer l'objet client de la session
  Client client = (Client) session.getAttribute("client");
  if (client != null) {
%>
<h2>Vos identifiants ont été bien enregistrés</h2>
<table>
  <tr><th>Nom</th><td><%= client.getNom() %></td></tr>
  <tr><th>Prénom</th><td><%= client.getPrenom() %></td></tr>
  <tr><th>Sexe</th><td><%= client.getSexe() %></td></tr>

  <%
    String[] transports = client.getTransports();
    if (transports != null && transports.length > 0 && !(transports.length == 1 && transports[0].isEmpty())) {
      if (transports.length == 1) {
  %>
  <tr><th>Transport</th><td><%= transports[0] %></td></tr>
  <%
  } else {
  %>
  <tr><th>Transport</th><td><%= transports[0] %></td></tr>
  <%
    for (int i = 1; i < transports.length; i++) {
  %>
  <tr><td></td><td><%= transports[i] %></td></tr>
  <%
        }
      }
    }
  %>
  <tr><th>Code Postal</th><td><%= client.getCodePostal() %></td></tr>
</table>
<% } else { %>
<p>Aucune information disponible dans la session.</p>
<% } %>

</body>
</html>



