package com.siddhu.keycloak;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SimpleController {

	private static final Logger LOGGER = LoggerFactory.getLogger(SimpleController.class);
	
    @GetMapping("/public")
    public String publicEndpoint(){
        return "Response from public endpoint";
    }

    @GetMapping("/private/manager")
    String manager(HttpServletRequest request){

		/*
		 * KeycloakAuthenticationToken token = (KeycloakAuthenticationToken)
		 * request.getUserPrincipal(); KeycloakPrincipal principal=(KeycloakPrincipal)
		 * token.getPrincipal(); KeycloakSecurityContext session =
		 * principal.getKeycloakSecurityContext(); AccessToken accessToken =
		 * session.getToken();
		 * 
		 * LOGGER.info("username: {}", accessToken.getPreferredUsername());
		 * LOGGER.info("emailId: {}", accessToken.getEmail());
		 * LOGGER.info("lastname: {}",accessToken.getFamilyName());
		 * LOGGER.info("firstname: {}", accessToken.getGivenName());
		 * LOGGER.info("realmName: {}", accessToken.getIssuer());
		 * 
		 * return "manager";
		 */
    	return "Manager:" + (new Date()).toString();
    }
    
    @GetMapping("/private/user")
    String user(HttpServletRequest request){

		/*
		 * KeycloakAuthenticationToken token = (KeycloakAuthenticationToken)
		 * request.getUserPrincipal(); KeycloakPrincipal principal=(KeycloakPrincipal)
		 * token.getPrincipal(); KeycloakSecurityContext session =
		 * principal.getKeycloakSecurityContext(); AccessToken accessToken =
		 * session.getToken();
		 * 
		 * LOGGER.info("username: {}", accessToken.getPreferredUsername());
		 * LOGGER.info("emailId: {}", accessToken.getEmail());
		 * LOGGER.info("lastname: {}",accessToken.getFamilyName());
		 * LOGGER.info("firstname: {}", accessToken.getGivenName());
		 * LOGGER.info("realmName: {}", accessToken.getIssuer());
		 * 
		 * return "user";
		 */
    	return "User:" + (new Date()).toString();
    }

    
    @GetMapping("/private/employee")
    String employee(HttpServletRequest request){

		/*
		 * KeycloakAuthenticationToken token = (KeycloakAuthenticationToken)
		 * request.getUserPrincipal(); KeycloakPrincipal principal=(KeycloakPrincipal)
		 * token.getPrincipal(); KeycloakSecurityContext session =
		 * principal.getKeycloakSecurityContext(); AccessToken accessToken =
		 * session.getToken();
		 * 
		 * LOGGER.info("username: {}", accessToken.getPreferredUsername());
		 * LOGGER.info("emailId: {}", accessToken.getEmail());
		 * LOGGER.info("lastname: {}",accessToken.getFamilyName());
		 * LOGGER.info("firstname: {}", accessToken.getGivenName());
		 * LOGGER.info("realmName: {}", accessToken.getIssuer());
		 * 
		 * return "employee";
		 */
    	return "Employee:" + (new Date()).toString();
    }



}