<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Personalized JSP Example</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: cyan;     
            margin-top:20rem;
            justify-content:center;  
            text-align:center; 
            display: flex;
            width:100%;
            height:100%;
           
        }
        h1, h2 {
             color: #333;
        }
        div{
        	
        	border:1px solid grey;
        	border-radius:15px;
        	padding:2rem;
        	
        	width:max-content;
        } 
       .date-time {
            font-size: 1.2em;
            color: #555;
        }
    </style>
</head>
<body>
	<div>
    <h1>Hello, my name is Alan K Anil</h1>
    <%
        // Get the current date and time
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, MMMM d, yyyy 'at' h:mm a");
        String formattedDate = formatter.format(now);
    %>
    <h2>Current Date and Time: <span class="date-time"><%= formattedDate %></span></h2>
    </div>
</body>
</html>
