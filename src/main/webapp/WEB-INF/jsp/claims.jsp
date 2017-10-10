<!DOCTYPE html>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">
</head>
<body>
<h1>Acme Insurance</h1>
<h2>All Claims:</h2>
<table class="table table-hover">
  <thead class="thead-inverse">
    <tr>
      <th>#</th>
      <th>Claimant</th>
      <th>Description</th>
      <th>Amount</th>
    </tr>
  </thead>
  <tbody id="cd1">
    <c:forEach items="${claims}" var="claim">
    <tr>
    <th scope="row">${claim.id}</th>
    <td>${claim.claimant.name}</td>
    <td>${claim.description}</td>
    <td>${claim.amount}</td>
    </tr>
    </c:forEach> 
  </tbody>
</table>
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.2.1.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"></script>
</body>
</html>