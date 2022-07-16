<%--
  Created by IntelliJ IDEA.
  User: julio
  Date: 15/07/2022
  Time: 07:01 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../../templates/head.jsp"></jsp:include>
    <title>salas</title>
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8"/>
</head>
<body>
<jsp:include page="../../templates/navbar.jsp"></jsp:include>
<div class="container">
    <c:if test="${param['result']}">
        <p><c:out value="${param['message']}"></c:out></p>
    </c:if>
    <a href="create-sala" class="btn btn-outline-success btn-sm">Registrar Sala</a>
    <table class="table">
        <thead>
        <tr>
            <th>#</th>
            <th>Nombre</th>
            <th>Capacidad</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="sala" items="${salas}" varStatus="status">
            <tr>
                <td>
                    <c:out value="${status.count}"></c:out>
                </td>
                <td>
                    <c:out value="${sala.nombre_sala}"></c:out>
                </td>
                <td>
                    <c:out value="${sala.capacidad_sala}"></c:out>
                </td>

                <td>
                    <a href="get-sala?id=${sala.id}" class="btn btn-warning btn-sm">EDITAR</a>
                    <a href="delete-sala?id=${sala.id}" class="btn btn-danger btn-sm">ELIMINAR</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>
