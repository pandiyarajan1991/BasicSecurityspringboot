<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>This is view page</title>
</head>
<body>

<script>
$(document).ready(function(){
	myfun();
   function myfun(){
	   
	   $.ajax({
			   type:'GET',
			   url:'/profile',
		       dataType:'json',
		       success: function(response){
		    	   var tableHead="";
		    	   var over="";
		    	   
		    	   
		    	   tableHead = '<table border=1>'+
		    	    '<thead>'+
		    	        '<tr>'+
		    	        '<th>Name</th>'+
		    	        '<th>email</th>'+
		    	        '<th>password</th>'+
		    	        '</tr>'+
		    	    '</thead>';
		    	  
		    	    $.each(response,function(i,val){
		    	    	  over=over+'<tbody>'+
		    	           ' <tr>'+
		    	           ' <td>'+val.email+'</td>'+
		    	           ' <td>'+val.name+'</td>'+
		    	            '<td>'+val.password+'</td>'+
		    	            '</tr>'+
		    	    '</tbody>';
		    	    });
		    	    $("#overAll").html(tableHead+over+ '</table>');
		       }
			   
   		})
	   
   }
});
</script>
<div id="overAll">

</div>
<form action="/">
<button type="submit">Logout</button>
</form>

</body>
</html>