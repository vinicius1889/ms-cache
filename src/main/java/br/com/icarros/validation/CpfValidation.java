package br.com.icarros.validation;


public class CpfValidation {

    public String validation(String cpf){
        if(cpf==null)
            throw new IllegalArgumentException("CPF inválido");
        String aux  = null;
        aux=cpf.trim().replaceAll("\\D+", "");;
        if(aux.length()!=11)
            throw new IllegalArgumentException("Por favor, informe um cpf válido");
        return aux;
    }

}
