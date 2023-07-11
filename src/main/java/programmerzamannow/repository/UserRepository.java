package programmerzamannow.repository;

import org.springframework.stereotype.Repository;

import programmerzamannow.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    
}
