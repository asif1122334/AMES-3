<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>
<link rel="stylesheet" href="<c:url value='/chart-style.css'/>">
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
<link href="https://fonts.googleapis.com/css?family=Poppins&display=swap" rel="stylesheet">
</head>
<body>
        <div class="piecharts">
            <div class="title"> 
                <h2>Reporte General </h2>
            </div>

            <div class="charts">
                <div class="estudiante">
                    <div class="name">
                        <div class="details">
                            <div class="left-n">
                                <p>batchCode:</p>
                                <p>associateName:</p>
                            </div>
                            <div class="right-n">
                                <p>${a.batchCode}</p>
                                <p>${a.associateName}</p>
                            </div>
                        </div>
                    </div>
                </div>
                    <div id="piechart" style="width: 600px; height: 400px; margin: auto;">
                        <div id="favor" style="display: none;">${a. assessorMark}</div>
                        <div id="contra" style="display: none;">${a. mentorMark}</div>
                    </div>
            </div>
        </div>
       <script type="text/javascript" src="<c:url value='/chart-script.js'/>"></script>
</body>
</html>