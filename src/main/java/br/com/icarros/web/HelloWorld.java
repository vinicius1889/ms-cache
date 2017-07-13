package br.com.icarros.web;

import br.com.icarros.clientesdk.ICarrosServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@CrossOrigin(value = "*")
@Controller
public class HelloWorld {

    @ResponseBody
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public Object receiveToken(){
       return null;
    }


}
