package br.com.icarros.web;


import br.com.icarros.services.EncryptService;
import br.com.icarros.validation.CpfValidation;
import br.com.icarros.vo.InfoSecVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

@CrossOrigin(value = "*")
@Api(value = "Encrypt de cpfs usando aes-cbc",description = "API de cifragem de cpfs")
@RequestMapping("/encrypt")
@RestController
public class EncryptController {

    @Autowired
    private EncryptService encryptService;

    @Autowired
    private CpfValidation cpfValidation;

    @ApiOperation(value = "Retorna o cpf cifrado do usuário")
    @RequestMapping(value = "/{cpf}",method = RequestMethod.GET)
    public InfoSecVO encrypt(@PathVariable("cpf") String cpfInformado){
        Logger logger = LoggerFactory.getLogger(getClass());
        try {
            String cpf = cpfValidation.validation(cpfInformado);
            return new InfoSecVO(encryptService.encrypt(cpf));
        } catch (NoSuchPaddingException | NoSuchAlgorithmException | InvalidAlgorithmParameterException | InvalidKeyException | BadPaddingException |IllegalBlockSizeException e) {
            logger.error("Erro ao buscar o cpf = "+cpfInformado);
            e.printStackTrace();
            throw new IllegalArgumentException("Erro ao tentar criar o hash do cpf informado");
        }
    }

}
