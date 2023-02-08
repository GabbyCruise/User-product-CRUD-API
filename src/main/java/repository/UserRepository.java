package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {
	
	//TODO: Implement CRUD operation for user

}
