package br.com.nathanshigaki.v2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.nathanshigaki.v2.Model.User;

public interface UserRepository extends JpaRepository <User, Long>{

}
