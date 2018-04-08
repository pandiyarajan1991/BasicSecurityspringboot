package com.basicsecurity.springboot.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.basicsecurity.springboot.domain.UserDomain;

public interface PersonReposity extends JpaRepository<UserDomain,String>{

}
