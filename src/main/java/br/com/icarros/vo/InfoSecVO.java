package br.com.icarros.vo;

import java.io.Serializable;

/**
 * Created by vinicius on 07/10/17.
 */
public class InfoSecVO implements Serializable {
    private String infoSec;

    public InfoSecVO(String infoSec) {
        this.infoSec = infoSec;
    }

    public String getInfoSec() {
        return infoSec;
    }

    public void setInfoSec(String infoSec) {
        this.infoSec = infoSec;
    }
}
