package com.example.client.mapper;

import com.example.client.model.Client;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ClientMapper {
    @Insert("INSERT INTO cliente (id_cliente, primer_nombre, segundo_nombre, apell_paterno, apell_materno, direccion) " +
            "VALUES (#{id_cliente}, #{primer_nombre}, #{segundo_nombre}, #{apell_paterno}, #{apell_materno}, #{direccion})")
    void insertClient(Client client);

    @Select("SELECT * FROM cliente")
    List<Client> findAllClients();

    @Select("SELECT * FROM cliente WHERE id_cliente = #{id}")
    Client findClientById(int id);
}
