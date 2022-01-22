<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%@include file="/navbar/navbar.jsp" %>

<section style="background-image:url('images/ma.jpg');background-repeat: no-repeat;background-size: cover;max-width: 100%;height: 800px; margin-top: -2px;">
    </section>

    
    <section>
        
        <div style="text-align: center; margin-top: 5%;">
            <h3 style="color: black; font-family: 'Poppins Medium'; font-weight: bold;">Machines</h3>
            <h1><a href="AddM" style="color: #FE6825;text-decoration: none">+</a></h1>
        </div>
        <center>
            <div style="border: 2px solid #FE6825;  border-width: 5px 30px 5px; width: 5%"></div>
        </center>
    </section>
    <div class="container">
        <div class="row row-cols-1 row-cols-md-2" style="margin-top: 6%;">
            <c:forEach var="Truck" items="${AllMachines }">
                <div class="col mb-4">
                    <div class="card">
                        <img src="images/mach.jpg" class="card-img-top"  style="height: 300px"/>
                        <div class="card-body">
                            <h5 class="card-title" style="color: #fe6825;"><c:out value="${Truck.libelle}"></c:out></h5>
                           
                            <h6 class="card-title" style="color: rgb(169 99 27);"><span style="color: black;">Price :</span><c:out value="${Truck.prix }"></c:out></h6>
                            <h6 class="card-title" style="color: rgb(169 99 27);;"><span style="color: black;">DateAchat :</span> <c:out value="${Truck.dateAchat }"></c:out></h6>
                            
                            
                                <a  href="EditMachines?idm=${Truck.id}&ref=${Truck.reference }&pr=${Truck.prix }&dat=${Truck.dateAchat}" class="btn" style="color: white; background-color: 	#5f4c4c;">Edit</a>
                                                   <a onclick="return confirm('Etes vous sure ?')" href="DeleteMachines?idm=${Truck.id }" class="btn" style="color: white; background-color: 	#5f4c4c;">Delete</a>

                        </div>
                    </div>
                </div>
           </c:forEach>
        </div>
    </div>
</body>

<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
 <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
<script src="https://use.fontawesome.com/releases/v5.14.0/js/all.js" data-auto-replace-svg="nest"></script>
</html>
