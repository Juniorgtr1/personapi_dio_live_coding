/*
* INTERFACE RESPONSAVEL POR GERNECIAR ABERTURA E FECHAMENTO DE CONEXÕES COM BANCO DE DADOS,
* ENTRE OUTRAS OPERAÇOES BASICAS DE BANCO DE DADOS.
* */

package one.digitalinnovation.personapi.repository;

import one.digitalinnovation.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
