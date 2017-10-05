package br.com.icarros.configs;


import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken;
import org.keycloak.representations.AccessToken;
import org.springframework.context.annotation.Configuration;

public class KeycloakBean {

    public AccessToken getKeyCloakToken(KeycloakAuthenticationToken keycloakAuthenticationToken){
        return keycloakAuthenticationToken.getAccount().getKeycloakSecurityContext().getToken();
    }


}
