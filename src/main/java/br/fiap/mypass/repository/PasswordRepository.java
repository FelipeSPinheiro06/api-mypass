package br.fiap.mypass.repository;


import br.fiap.mypass.model.Password;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PasswordRepository extends JpaRepository<Password, Long> {
}
