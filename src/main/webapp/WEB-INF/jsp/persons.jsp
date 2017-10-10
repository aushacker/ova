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
<h2>All Persons:</h2>
<table class="table table-hover">
  <thead class="thead-inverse">
    <tr>
      <th>#</th>
      <th>Name</th>
      <th>Email</th>
      <th>Phone</th>
      <th></th>
    </tr>
  </thead>
  <tbody id="pd1">
    <c:forEach items="${persons}" var="person">
    <tr>
    <th scope="row">${person.id}</th>
    <td>${person.name}</td>
    <td>${person.email}</td>
    <td>${person.phone}</td>
    <td>
      <c:if test="${person.hasClaims}">
        <button type="button" class="btn btn-dark" data-toggle="modal" data-target="#claimsDlg" data-pid="${person.id}">View Claims</button>
      </c:if>
    </td>
    </tr>
    </c:forEach> 
  </tbody>
</table>
<div class="modal fade" id="claimsDlg" tabindex="-1" role="dialog" aria-labelledby="modalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="modalLabel">Claims:</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <table id="modalTable" class="table">
          <thead class="thead-inverse">
            <tr>
              <th>#</th>
              <th>Description</th>
              <th>Amount</th>
            </tr>
          </thead>
          <tbody></tbody>
        </table>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-primary" data-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.2.1.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"></script>
<script>
$('#claimsDlg').on('show.bs.modal', function (event) {
	  var button = $(event.relatedTarget) // Button that triggered the modal
	  var pId = button.data('pid') // Extract info from data-* attributes
	  // If necessary, you could initiate an AJAX request here (and then do the updating in a callback).
	  // Update the modal's content. We'll use jQuery here, but you could use a data binding library or other methods instead.
	  var modal = $(this)
      $.getJSON( "claim", { pid: pId }, function( data ) {
          var content = "";
          for (var i = 0; i < data.length; i++) {
              content += "<tr><th scope='row'>";
              content += data[i].id;
              content += "</th><td>";
              content += data[i].description;
              content += "</td><td>";
              content += CurrencyFormatted(data[i].amount);
              content += "</td></tr>";
          }
          $('#modalTable tbody').html(content);
      });    	  
});
function CurrencyFormatted(amount) {
    var i = parseFloat(amount);
    if(isNaN(i)) { i = 0.00; }
    var minus = '';
    if(i < 0) { minus = '-'; }
    i = Math.abs(i);
    i = parseInt((i + .005) * 100);
    i = i / 100;
    s = new String(i);
    if(s.indexOf('.') < 0) { s += '.00'; }
    if(s.indexOf('.') == (s.length - 2)) { s += '0'; }
    s = minus + s;
    return s;
}
</script>
</body>
</html>