
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PersonalInfoVO implements Serializable {

    private Long idPersonalInfoVO;
    private String firstNamePersonalInfoVO = "";
    private String lastNamePersonalInfoVO = "";
    private String addressPersonalInfoVO;
    private String phonePersonalInfoVO;
    private String celphonePersonalInfoVO;
    private String emailPersonalInfoVO;
    private List<Long> idOtherPersonalInfoVOs = new ArrayList<Long>();
    private Long idLoginVO;
    private String phoneExtensionPersonalInfoVO;
    private String celphoneExtensionPersonalInfoVO;

    @Override
    public String toString() {
        return firstNamePersonalInfoVO + " " + lastNamePersonalInfoVO;
    }

    //<editor-fold defaultstate="collapsed" desc="getters and setters">
    public String getAddressPersonalInfoVO() {
        return addressPersonalInfoVO;
    }

    public void setAddressPersonalInfoVO(String addressPersonalInfoVO) {
        this.addressPersonalInfoVO = addressPersonalInfoVO;
    }

    public String getCelphonePersonalInfoVO() {
        return celphonePersonalInfoVO;
    }

    public void setCelphonePersonalInfoVO(String celphonePersonalInfoVO) {
        this.celphonePersonalInfoVO = celphonePersonalInfoVO;
    }

    public String getEmailPersonalInfoVO() {
        return emailPersonalInfoVO;
    }

    public void setEmailPersonalInfoVO(String emailPersonalInfoVO) {
        this.emailPersonalInfoVO = emailPersonalInfoVO;
    }

    public String getFirstNamePersonalInfoVO() {
        return firstNamePersonalInfoVO;
    }

    public void setFirstNamePersonalInfoVO(String firstNamePersonalInfoVO) {
        this.firstNamePersonalInfoVO = firstNamePersonalInfoVO;
    }

    public Long getIdLoginVO() {
        return idLoginVO;
    }

    public void setIdLoginVO(Long idLoginVO) {
        this.idLoginVO = idLoginVO;
    }

    public List<Long> getIdOtherPersonalInfoVOs() {
        return idOtherPersonalInfoVOs;
    }

    public void setIdOtherPersonalInfoVOs(List<Long> idOtherPersonalInfoVOs) {
        this.idOtherPersonalInfoVOs = idOtherPersonalInfoVOs;
    }

    public Long getIdPersonalInfoVO() {
        return idPersonalInfoVO;
    }

    public void setIdPersonalInfoVO(Long idPersonalInfoVO) {
        this.idPersonalInfoVO = idPersonalInfoVO;
    }

    public String getLastNamePersonalInfoVO() {
        return lastNamePersonalInfoVO;
    }

    public void setLastNamePersonalInfoVO(String lastNamePersonalInfoVO) {
        this.lastNamePersonalInfoVO = lastNamePersonalInfoVO;
    }

    public String getPhonePersonalInfoVO() {
        return phonePersonalInfoVO;
    }

    public void setPhonePersonalInfoVO(String phonePersonalInfoVO) {
        this.phonePersonalInfoVO = phonePersonalInfoVO;
    }

    public String getCelphoneExtensionPersonalInfoVO() {
        return celphoneExtensionPersonalInfoVO;
    }

    public void setCelphoneExtensionPersonalInfoVO(String celphoneExtensionPersonalInfoVO) {
        this.celphoneExtensionPersonalInfoVO = celphoneExtensionPersonalInfoVO;
    }

    public String getPhoneExtensionPersonalInfoVO() {
        return phoneExtensionPersonalInfoVO;
    }

    public void setPhoneExtensionPersonalInfoVO(String phoneExtensionPersonalInfoVO) {
        this.phoneExtensionPersonalInfoVO = phoneExtensionPersonalInfoVO;
    }
    //</editor-fold>
}
