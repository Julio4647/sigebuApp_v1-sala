<%--
  Created by IntelliJ IDEA.
  User: julio
  Date: 15/07/2022
  Time: 07:02 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="../../js/javascript.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
          crossorigin="anonymous">
    <title>Actualizar</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-12">
            <div class="card mt-5">
                <div class="card-header">ACTUALIZAR SALA</div>
                <div class="card-body">
                    <div class="card-body">
                        <div class="row">
                            <div class="col-12">
                                <form class="needs-validation" novalidate action="save-sala" method="POST">
                                    <div class="form-group mb-3">
                                        <div class="row">
                                            <div class="col">
                                                <label class="fw-bold" for="sala">Nombre</label>
                                                <input name="sala" id="sala" required
                                                       class="form-control" value="${sala.nombre_sala}"/>
                                                <div class="invalid-feedback">Campo Obligatorio</div>
                                                <input type="hidden" name="id" value="${sala.id}">
                                            </div>
                                            <div class="col">
                                                <label class="fw-bold" for="capacidad_sala">Capacidad</label>
                                                <input name="capacidad_sala" id="capacidad_sala" required
                                                       class="form-control" value="${sala.capacidad_sala}"/>
                                                <div class="invalid-feedback">Campo Obligatorio</div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group mb-3">
                                            <div class="col">
                                                <button type="button" class="btn btn-danger btn-sm">Cancelar</button>
                                                <button type="submit" class="btn btn-warning btn-sm">Actualizar</button>
                                            </div>

                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
