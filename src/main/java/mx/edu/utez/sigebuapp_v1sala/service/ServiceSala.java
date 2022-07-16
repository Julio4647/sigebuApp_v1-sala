package mx.edu.utez.sigebuapp_v1sala.service;

import mx.edu.utez.sigebuapp_v1sala.model.BeanSala;
import mx.edu.utez.sigebuapp_v1sala.model.DaoSala;
import mx.edu.utez.sigebuapp_v1sala.utils.ResultAction;

import java.util.List;

public class ServiceSala {
    DaoSala daoSala = new DaoSala();
    public List<BeanSala> getAll(){return daoSala.findAll();}
    
    public ResultAction save(BeanSala sala){
        ResultAction result = new ResultAction();
        if (daoSala.agregar(sala)){
            result.setResult(true);
            result.setMessage("Sala resgistrada correctamente");
            result.setStatus(200);
        }else{
            result.setResult(false);
            result.setMessage("Ocurrio un error al registrarse");
            result.setStatus(400);
        }
        return result;
    }

    public BeanSala getSala(int id){return daoSala.findOne(id);}

    public ResultAction update(BeanSala sala){
        ResultAction result = new ResultAction();
        if (daoSala.agregar(sala)){
            result.setStatus(200);
            result.setResult(false);
            result.setMessage("Sala actualizada correctamente");
        }else{
            result.setStatus(400);
            result.setResult(true);
            result.setMessage("Ocurrio un error");
        }
        return result;
    }
}
