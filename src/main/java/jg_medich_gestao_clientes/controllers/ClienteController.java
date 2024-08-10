package jg_medich_gestao_clientes.controllers;

import jakarta.validation.Valid;
import jg_medich_gestao_clientes.dtos.ClienteDto;
import jg_medich_gestao_clientes.models.ClienteModel;
import jg_medich_gestao_clientes.repositories.ClienteRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @Transactional
    @PostMapping
    public ResponseEntity<ClienteModel> Cadastrar(@RequestBody @Valid ClienteDto dados) {

        var clienteModel = new ClienteModel();
        clienteModel.setNome(dados.nome());
        clienteModel.setEmail(dados.email());
        clienteModel.setTelefone(dados.telefone());
        clienteRepository.save(clienteModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteModel);

    }
}