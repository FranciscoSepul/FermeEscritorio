package com.Ferme.Escritorio;

import Ferme.Dao.ClienteDao;
import Ferme.Dto.Cliente;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EscritorioApplication {  

    public static void main(String[] args) {
        ClienteDao cli = new ClienteDao();
        SpringApplication.run(EscritorioApplication.class, args);
        List<Cliente> datos =cli.Listar();
        System.out.println("Hola we como esta" + datos);
    }

}
