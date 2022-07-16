package mx.edu.utez.sigebuapp_v1sala.controller.sala;

import mx.edu.utez.sigebuapp_v1sala.model.BeanSala;
import mx.edu.utez.sigebuapp_v1sala.service.ServiceSala;
import mx.edu.utez.sigebuapp_v1sala.utils.ResultAction;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet(name = "ServletSala",
urlPatterns = {
        "/get-salas",
        "/add-sala",
        "/create-sala",
        "/save-sala",
        "/get-sala",
})

public class ServletSala extends HttpServlet {
    Logger logger = Logger.getLogger("ServletSala");
    String action;
    String urlRedirect = "/get-salas";
    ServiceSala serviceSala = new ServiceSala();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
        request.setCharacterEncoding("UTF-8");
        action = request.getServletPath();
        logger.log(Level.INFO,"Path-> "+ action);
        switch (action){
            case "/get-salas":
                request.setAttribute("salas",serviceSala.getAll());
                urlRedirect = "/views/sigebu/catalogoSala.jsp";
                break;
            case "/create-sala":
                urlRedirect = "/views/sigebu/registro.jsp";
                break;
            case "/get-sala":
                String id = request.getParameter("id");
                id = (id == null) ? "0" :id;
                try{
                    BeanSala sala = serviceSala.getSala(Integer.parseInt(id));
                    request.setAttribute("sala", sala);
                    urlRedirect = "/views/sigebu/updateSala.jsp";
                }catch (Exception e){
                    urlRedirect = "/get-salas";
                }
                break;
            default:
                request.setAttribute("salas", serviceSala.getAll());
                urlRedirect = "/get-salas";
                break;
        }
        request.getRequestDispatcher(urlRedirect).forward(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        action = request.getServletPath();
        switch (action){
            case "/add-sala":
                String nombre_sala = request.getParameter("nombre_sala");
                String capacidad_sala = request.getParameter("capacidad_sala");
                BeanSala sala = new BeanSala();
                sala.setNombre_sala(nombre_sala);
                sala.setCapacidad_sala(Integer.parseInt(capacidad_sala));
                ResultAction result = serviceSala.save(sala);
                urlRedirect ="/get-salas?result="+
                        result.isResult()+"&message"+result.getMessage()
                        +"&status="+result.getStatus();
                break;
            case "/save-sala" :
                String nombre_sala2 = request.getParameter("nombre_sala");
                String capacidad_sala2 = request.getParameter("capacidad_sala");
                BeanSala sala2 = new BeanSala();
                sala2.setNombre_sala(nombre_sala2);
                sala2.setCapacidad_sala(Integer.parseInt(capacidad_sala2));
                ResultAction result2 = serviceSala.save(sala2);
                urlRedirect ="/get-salas?result="+ result2.isResult()+"&message"+result2.getMessage() +"&status="+result2.getStatus();
                break;
            default:
                urlRedirect = "/get-salas";
                break;
        }
        response.sendRedirect(request.getContextPath()+urlRedirect);
    }

}
