<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<style type="text/css">

.fo{
       background-color:rgba(0,0,0,0.5);
       
       padding: 30px;
       border-radius:10%;
       box-shadow: 0px 0px 10px 0px #000;
      
       
    
    
    }
    body{
    background-color: #00DBDE;
background-image: linear-gradient(90deg, #00DBDE 0%, #FC00FF 100%);

      
    }
</style>
<!--<meta charset="UTF-8" http-equiv="refresh" content="10;url=../connect">-->
<title>admin_login</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

</head>
<body>

   <form class=" fo w-50 p-3 row   mx-auto  text-light  needs-validation " method="post" style="margin-top:150px; ">
   
   
    <div class="col-md-12 mt-2">
    <label for="inputEmail4"  class="form-label">Username</label>
      <input type="text"  name="username"  class="form-control" id="inputAddress" placeholder="Username" required="required">
  </div>
  <div class="col-md-12 mt-2">
    <label for="inputPassword4"  class="form-label">Password</label>
    <input type="password"  name="password" class="form-control"  placeholder="Password"  id="inputPassword4" required="required">
  </div>
  <div class="col-3 mx-auto   mt-2 btn btn-outline-danger   ">
  <input type="submit" class="btn btn-danger" value="Access">
  </div>
</form>



<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
</body>
</html>