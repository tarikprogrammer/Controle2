<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Empoyee Affectation</title>
    <link rel="stylesheet" href="../../../resources/static/css/bootstrap.min.css">
</head>
<body>
 <div class="container">
     <form>
         <h1>Employe Affectation</h1>
         <div class="form-group">
             <label >Employe Name</label>
             <input type="text" class="form-control"  name="name" >
         </div>
         <div class="form-group">
             <label for="exampleFormControlTextarea1">Example textarea</label>
             <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" ></textarea>
         </div>
         <div class="form-group">
             <label >implication</label>
             <input type="text" class="form-control" >
         </div>
         <div >
             <button type="submit">Affecter Project</button>
         </div>
     </form>
 </div>
</body>
</html>