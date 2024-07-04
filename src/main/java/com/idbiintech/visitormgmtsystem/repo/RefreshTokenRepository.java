package com.idbiintech.visitormgmtsystem.repo;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.idbiintech.visitormgmtsystem.model.RefreshToken;


public interface RefreshTokenRepository extends JpaRepository<RefreshToken,Integer>
{

	 public Optional<RefreshToken> findByToken(String token);
	 
	 public Optional<RefreshToken> findByUser(String user);
	 
	 public Optional<RefreshToken> findByEmpid(Integer empid);
	
}
