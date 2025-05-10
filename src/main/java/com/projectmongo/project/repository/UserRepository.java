package com.projectmongo.project.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.projectmongo.project.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}