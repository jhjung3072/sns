package com.jaeho.project.sns.repository;

import com.jaeho.project.sns.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserEntityRepository extends JpaRepository<UserEntity,Integer> {
    Optional<UserEntity>findByUserName(String userName);
}
