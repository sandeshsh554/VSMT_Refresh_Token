package com.idbiintech.visitormgmtsystem.serviceimpl;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idbiintech.visitormgmtsystem.model.RefreshToken;
import com.idbiintech.visitormgmtsystem.repo.RefreshTokenRepository;
import com.idbiintech.visitormgmtsystem.service.RefreshTokenService;
import com.idbiintech.visitormgmtsystem.model.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import com.idbiintech.visitormgmtsystem.model.User;


@Service
public class RefreshTokenServiceImpl implements RefreshTokenService 
{
	
	@Autowired
	RefreshTokenRepository refreshrepo;
	
	@Autowired
	RefreshToken refreshtoken;
	  
	
	@Override
	public void createRefreshToken(User user)
	    {
		    Optional<RefreshToken> usrdtls = refreshrepo.findByEmpid(user.getEmpId());
		    if(usrdtls.isPresent())
		    {
		     RefreshToken rfshtok = usrdtls.get();
		     if(rfshtok.getExpiry().compareTo(Instant.now())<0)
		        {
		        	refreshrepo.delete(rfshtok);
		        }
		    }
		    else
		    {
		    LocalDateTime locd = LocalDateTime.now();
	        RefreshToken refreshToken =  RefreshToken.builder().user(user.getFirstName())
	        		                    .token(UUID.randomUUID().toString())
	                                    .expiry(Instant.now().plusSeconds(1800))
	                                    .empid(user.getEmpId())
	                                    .curtime(locd.plusSeconds(1800))
	                                    .emailid(user.getEmail()).build();
	         refreshrepo.save(refreshToken);
		    }
		    
		    
	    }


	    @Override
	    public Optional<RefreshToken> findByToken(String token)
	    {
	        return refreshrepo.findByToken(token);
	    }

	    @Override
	    public RefreshToken verifyExpiration(RefreshToken token)
	    {
	    	if(token.getExpiry().compareTo(Instant.now())<0)
	        {
	        	refreshrepo.delete(token);
	            throw new RuntimeException(token.getToken() + "Refresh Token got expired");
	        }
	        return token;
	    }




	
	
}
