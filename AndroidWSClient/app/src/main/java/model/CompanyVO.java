/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class CompanyVO implements Serializable {

    private Long idCompanyVO;
    private Long nitCompanyVO;
    private String addressCompanyVO;
    private String nameCompanyVO = "";
    private String postalCodCompanyVO;
    private Integer areaCompanyVO;
    private String phoneCompanyVO;
    private String webpageCompanyVO;
    private String descriptionCompanyVO;
    private byte[] cameAndComerCompanyVO;
    private byte[] rutCompanyVO;
    private String faxCompanyVO;
    private Boolean activeCompanyVO;
    private List<String> employeesCompanyVO = new ArrayList<String>();
    private Long idCityVO;
    private Long idCompanyAUVO;
    private List<Long> idCompanyUserVOs = new ArrayList<Long>();
    private String typeCompanyVO;
    private List<Long> idConvocatoryVOs = new ArrayList<Long>();
    private List<Long> idAgreementVOs = new ArrayList<Long>();
    private List<Long> idConcreteModalityVOs;
    private Date registrationDateCompanyVO;

    @Override
    public String toString() {
        return nameCompanyVO;
    }

    //<editor-fold defaultstate="collapsed" desc="getters and setters">
    public Date getRegistrationDateCompanyVO() {
        return registrationDateCompanyVO;
    }

    public void setRegistrationDateCompanyVO(Date registrationDateCompanyVO) {
        this.registrationDateCompanyVO = registrationDateCompanyVO;
    }

    public List<Long> getIdConcreteModalityVOs() {
        return idConcreteModalityVOs;
    }

    public void setIdConcreteModalityVOs(List<Long> idConcreteModalityVOs) {
        this.idConcreteModalityVOs = idConcreteModalityVOs;
    }

    public Long getNitCompanyVO() {
        return nitCompanyVO;
    }

    public void setNitCompanyVO(Long nitCompanyVO) {
        this.nitCompanyVO = nitCompanyVO;
    }

    public List<Long> getIdConvocatoryVOs() {
        return idConvocatoryVOs;
    }

    public void setIdConvocatoryVOs(List<Long> idConvocatoryVOs) {
        this.idConvocatoryVOs = idConvocatoryVOs;
    }

    public String getTypeCompanyVO() {
        return typeCompanyVO;
    }

    public void setTypeCompanyVO(String typeCompanyVO) {
        this.typeCompanyVO = typeCompanyVO;
    }

    public Long getIdCompanyVO() {
        return idCompanyVO;
    }

    public Boolean getActiveCompanyVO() {
        return activeCompanyVO;
    }

    public void setActiveCompanyVO(Boolean activeCompanyVO) {
        this.activeCompanyVO = activeCompanyVO;
    }

    public void setIdCompanyVO(Long idCompanyVO) {
        this.idCompanyVO = idCompanyVO;
    }

    public String getAddressCompanyVO() {
        return addressCompanyVO;
    }

    public void setAddressCompanyVO(String addressCompanyVO) {
        this.addressCompanyVO = addressCompanyVO;
    }

    public Integer getAreaCompanyVO() {
        return areaCompanyVO;
    }

    public void setAreaCompanyVO(Integer areaCompanyVO) {
        this.areaCompanyVO = areaCompanyVO;
    }

    public String getNameCompanyVO() {
        return nameCompanyVO;
    }

    public void setNameCompanyVO(String nameCompanyVO) {
        this.nameCompanyVO = nameCompanyVO.toUpperCase();
    }

    public String getPhoneCompanyVO() {
        return phoneCompanyVO;
    }

    public void setPhoneCompanyVO(String phoneCompanyVO) {
        this.phoneCompanyVO = phoneCompanyVO;
    }

    public Long getIdCityVO() {
        return idCityVO;
    }

    public void setIdCityVO(Long idCityVO) {
        this.idCityVO = idCityVO;
    }

    public Long getIdCompanyAUVO() {
        return idCompanyAUVO;
    }

    public void setIdCompanyAUVO(Long idCompanyAUVO) {
        this.idCompanyAUVO = idCompanyAUVO;
    }

    public String getDescriptionCompanyVO() {
        return descriptionCompanyVO;
    }

    public void setDescriptionCompanyVO(String descriptionCompanyVO) {
        this.descriptionCompanyVO = descriptionCompanyVO;
    }

    public List<String> getEmployeesCompanyVO() {
        return employeesCompanyVO;
    }

    public void setEmployeesCompanyVO(List<String> employeesCompanyVO) {
        this.employeesCompanyVO = employeesCompanyVO;
    }

    public String getWebpageCompanyVO() {
        return webpageCompanyVO;
    }

    public void setWebpageCompanyVO(String webpageCompanyVO) {
        this.webpageCompanyVO = webpageCompanyVO;
    }

    public String getFaxCompanyVO() {
        return faxCompanyVO;
    }

    public void setFaxCompanyVO(String faxCompanyVO) {
        this.faxCompanyVO = faxCompanyVO;
    }

    public List<Long> getIdCompanyUserVOs() {
        return idCompanyUserVOs;
    }

    public void setIdCompanyUserVOs(List<Long> idCompanyUserVOs) {
        this.idCompanyUserVOs = idCompanyUserVOs;
    }

    public List<Long> getIdAgreementVOs() {
        return idAgreementVOs;
    }

    public void setIdAgreementVOs(List<Long> idAgreementVOs) {
        this.idAgreementVOs = idAgreementVOs;
    }

    public String getPostalCodCompanyVO() {
        return postalCodCompanyVO;
    }

    public void setPostalCodCompanyVO(String postalCodCompanyVO) {
        this.postalCodCompanyVO = postalCodCompanyVO;
    }

    public byte[] getCameAndComerCompanyVO() {
        return cameAndComerCompanyVO;
    }

    public void setCameAndComerCompanyVO(byte[] cameAndComerCompanyVO) {
        this.cameAndComerCompanyVO = cameAndComerCompanyVO.clone();
    }

    public byte[] getRutCompanyVO() {
        return rutCompanyVO;
    }

    public void setRutCompanyVO(byte[] rutCompanyVO) {
        this.rutCompanyVO = rutCompanyVO.clone();
    }
    //</editor-fold>
}
