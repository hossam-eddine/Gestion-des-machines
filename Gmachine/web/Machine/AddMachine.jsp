<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

<meta charset="UTF-8">
<title>AddNewMachine</title>
</head>
<body>
<%@include file="/navbar/navbar.jsp" %>

<section style="margin-left: 20%; margin-right: 20%; height: 200px; padding-top: 3%; margin-top: 5%;">
    <div class="col" style="text-align: center;">
       <h4 style=" font-family: 'Poppins Medium'; font-weight: bold;text-align: center; ">Add Machine</h4>
    </div>
    <center>
       <div style="border: 2px solid #FE6825;  border-width: 5px 50px 5px; width: 5%;"></div>
       <div>  <h4 class="center" style="margin-top: 3%; color: white;"></h4></div>
           </center>

    <form method="POST" style="margin-top: 7%;" >
            <div class="row">
                <div class="col">
                    <input type="text" class="form-control" name="reference" placeholder="Reference"  style="margin-top: 3%;">
                </div>
                <div class="col">
                    <input type="date" class="form-control" name="dateAchat" style="margin-top: 3%;">
                </div>
            </div>
            <div class="row">
                <div class="col">
                 
                    <input type="text" class="form-control" name="prix" placeholder="Price" style="margin-top: 3%;">
               
                </div>
                <div class="col">
                    
                   
                    <select class="form-control" style="margin-top: 3%;" name="marque">
                        <c:forEach var="Marque" items="${AllMarques}">
                            <option value="<c:out value="${Marque.id}"></c:out>"><c:out value="${Marque.libelle}"></c:out></option>
                        </c:forEach>
                    </select>
                    
                                        


                 
                    
               
                </div>
                
            </div>
           
            <center>
                <input  type="submit" class="btn" name="submit" value="BOOK" style="background-color: #FE6825; color: white; font-family: 'Poppins Medium'; margin-top: 4%;">
            </center>
        </form>
    </section>



 <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
 <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
<script src="https://use.fontawesome.com/releases/v5.14.0/js/all.js" data-auto-replace-svg="nest"></script>
 
</body>
</html>