package com.idbiintech.visitormgmtsystem.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.idbiintech.visitormgmtsystem.model.RefreshToken;

import com.idbiintech.visitormgmtsystem.model.User;



public interface RefreshTokenService 
{
	
	public void createRefreshToken(User user);
	public Optional<RefreshToken> findByToken(String token);
	public RefreshToken verifyExpiration(RefreshToken token);
}
