package repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import model.UserModel;

public interface DefaultRespository extends JpaRepositoryImplementation<UserModel, Long> {

}
