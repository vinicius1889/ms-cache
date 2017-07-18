package br.com.icarros.web;

import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(value = "*")
@Controller
public class HelloWorld {

    @ResponseBody
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public Object receiveToken(KeycloakAuthenticationToken keycloakAuthenticationToken){
        System.out.println("TESTANDO");
        return null;

    }

//    @ResponseBody
//    @RequestMapping(value="/sso/login",method = RequestMethod.GET)
//    public Object receiveLogin(@RequestParam("state")String state, @RequestParam("code") String code){
//        System.out.println("state = " + state);
//        System.out.println("code = " + code);
//        return null;
//    }

 @ResponseBody
    @RequestMapping(value="/sso/login",method = RequestMethod.GET)
    public Object receiveLogin(){
     System.out.println("sadasdsadadadsa");
        return null;
    }


}
