package com.example.Store.repository.users;

import com.example.Store.entity.users.ERole;
import com.example.Store.entity.users.TbRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<TbRole,String> {
    Optional<TbRole> findByName(ERole name);
}
