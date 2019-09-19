<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
<title>Spring Boot</title>
<link rel="stylesheet" href="/resources/css/bootstrap.min.css">
<script src="/resources/js/jquery.min.js"></script>
<script src="/resources/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="content">
        <div class="row">
            <div class="col-lg-12">
                <h1>Contact List</h1>
                <table class="table">
                    <thead>
                    <tr>
                        <th>SN</th>
                        <th>Name</th>
                        <th>Mobile Number</th>
                    </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="contact" items="${contactList}" varStatus="i">
                            <tr>
                                <td>${i.index +1}</td>
                                <td>${contact.name}</td>
                                <td>${contact.mobileNum}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>

</body>
</html>