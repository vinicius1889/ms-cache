package br.com.icarros.web;

import br.com.icarros.configs.KeycloakBean;
import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin(value = "*")
@RestController
public class HelloWorld {

    @Autowired
    private KeycloakBean keyCloack;


    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public Object receiveToken(KeycloakAuthenticationToken keycloakAuthenticationToken){
        Map<String,Object> mapa = new HashMap<>();
        mapa.put("issuedFor",keycloakAuthenticationToken.getAccount().getKeycloakSecurityContext().getToken().getIssuedFor());

        return keyCloack.getKeyCloakToken(keycloakAuthenticationToken);

    }

//    @ResponseBody
//    @RequestMapping(value="/sso/login",method = RequestMethod.GET)
//    public Object receiveLogin(@RequestParam("state")String state, @RequestParam("code") String code){
//        System.out.println("state = " + state);
//        System.out.println("code = " + code);
//        return null;
//    }
//
// @ResponseBody
//    @RequestMapping(value="/sso/login",method = RequestMethod.GET)
//    public Object receiveLogin(){
//     System.out.println("sadasdsadadadsa");
//        return null;
//    }


}
