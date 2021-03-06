package com.example.appBack.Student.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TiporegistroDTO {

    @NotNull
    private String name;

    @NotNull
    private Date last_update;

    @NotNull
    private boolean activo;


    public static TiporegistroDTO getTiporegistroDTO(Tiporegistro tiporegistro){
        return new TiporegistroDTO(tiporegistro.getName(),
                tiporegistro.getLast_update(),
                tiporegistro.isActivo());
    }


    //Implementar el metodo
    public static TiporegistroDTO transformToTiporegistroDTO(Object object){
        if(object.getClass().toString().equalsIgnoreCase("TiporegistroOutputDTO")){

        }

        if(object.getClass().toString().equalsIgnoreCase("TiporegistroSearchDTO")){

        }

        if(object.getClass().toString().equalsIgnoreCase("TiporegistroInputDTO")){

        }
        return null;
    }



    public static List<TiporegistroDTO> getAllTipoRegistroDTO(List<Tiporegistro> listTiporegistro){
        List<TiporegistroDTO> devolver = new ArrayList<>();
        listTiporegistro.forEach(tiporegistro -> devolver.add(getTiporegistroDTO(tiporegistro)));
        return devolver;
    }

}
