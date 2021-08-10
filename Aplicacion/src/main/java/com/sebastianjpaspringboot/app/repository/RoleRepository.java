package com.sebastianjpaspringboot.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.sebastianjpaspringboot.app.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

}
