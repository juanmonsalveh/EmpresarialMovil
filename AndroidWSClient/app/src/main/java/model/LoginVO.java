
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LoginVO implements Serializable {

    private Long idLoginVO;
    private String nameLoginVO;
    private String passwordLoginVO;
    private Integer rol;
    private Boolean activeAccountLoginVO;
    private Long idPersonalInfoVO;
    private List<String> prueba  ;

    public LoginVO() {
    }

    public LoginVO(String nameLoginVO, String passwordLoginVO) {
        this.nameLoginVO = nameLoginVO;
        this.passwordLoginVO = passwordLoginVO;
    }

    @Override
    public String toString() {
        return "UserName: " + nameLoginVO;
    }

    // <editor-fold defaultstate="collapsed" desc="getters and setters">
    public Boolean getActiveAccountLoginVO() {
        return activeAccountLoginVO;
    }

    public void setActiveAccountLoginVO(Boolean activeAccountLoginVO) {
        this.activeAccountLoginVO = activeAccountLoginVO;
    }

    public Long getIdLoginVO() {
        return idLoginVO;
    }

    public void setIdLoginVO(Long idLoginVO) {
        this.idLoginVO = idLoginVO;
    }

    public String getNameLoginVO() {
        return nameLoginVO;
    }

    public void setNameLoginVO(String nameLoginVO) {
        this.nameLoginVO = nameLoginVO;
    }

    public String getPasswordLoginVO() {
        return passwordLoginVO;
    }

    public void setPasswordLoginVO(String passwordLoginVO) {
        this.passwordLoginVO = passwordLoginVO;
    }

    public Long getIdPersonalInfoVO() {
        return idPersonalInfoVO;
    }

    public void setIdPersonalInfoVO(Long idPersonalInfoVO) {
        this.idPersonalInfoVO = idPersonalInfoVO;
    }

    public Integer getRol() {
        return rol;
    }

    public void setRol(Integer rol) {
        this.rol = rol;
    }

    public List<String> getPrueba() {
        if (prueba == null) {
            prueba = new ArrayList<String>();
        }
        return this.prueba;
    }
    // </editor-fold>
}
