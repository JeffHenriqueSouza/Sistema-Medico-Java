package jg_medich_gestao_clientes.repositories;


import jg_medich_gestao_clientes.models.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteModel,Long>{
}
