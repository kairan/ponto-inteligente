package com.kairantt.pontointeligente.api.repositories;

import com.kairantt.pontointeligente.api.entities.Empresa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface EmpresaRepository extends CrudRepository<Empresa, Long> {
	
	@Transactional(readOnly = true)
	Empresa findByCnpj(String cnpj);

}
