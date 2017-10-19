package br.com.icarros.web;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin(value = "*")
@Api(value = "Encrypt de cpfs usando aes-cbc",description = "API de cifragem de cpfs")
@RequestMapping("/encrypt")
@RestController
public class Controller {

    @ApiOperation(value = "Testando agora a api de retorno")
    @RequestMapping(value = "/{cpf}",method = RequestMethod.GET)
    public Map encrypt(KeycloakAuthenticationToken keyCloack) throws Exception {
        throw new Exception("Ainda nao implementado");
    }

}
