package com.watchforstock.evohome;

public class AuthInfo {
private String accessToken;
private String tokenType;
private String refreshToken;
private int expiresIn;
private String scope;
public String getAccessToken() {
	return accessToken;
}
public void setAccessToken(String accessToken) {
	this.accessToken = accessToken;
}
public String getTokenType() {
	return tokenType;
}
public void setTokenType(String tokenType) {
	this.tokenType = tokenType;
}
public String getRefreshToken() {
	return refreshToken;
}
public void setRefreshToken(String refreshToken) {
	this.refreshToken = refreshToken;
}
public int getExpiresIn() {
	return expiresIn;
}
public void setExpiresIn(int expiresIn) {
	this.expiresIn = expiresIn;
}
public String getScope() {
	return scope;
}
public void setScope(String scope) {
	this.scope = scope;
}

public String toString() {
	return accessToken;
}

}
