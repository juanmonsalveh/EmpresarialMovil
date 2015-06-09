/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

import java.util.Hashtable;
import java.util.List;


public class CompanyUserVO implements KvmSerializable {

    private Long idCompanyVO;
    private String positionUserVO;
    private String departmentAreaAUVO;
    private Boolean doSelectionUserVO = false;
    private Boolean doTrackingUserVO = false;
    private List<Long> idConcreteModalityVOs;

    //<editor-fold defaultstate="collapsed" desc="getters and setters">
    public List<Long> getIdConcreteModalityVOs() {
        return idConcreteModalityVOs;
    }

    public void setIdConcreteModalityVOs(List<Long> idConcreteModalityVOs) {
        this.idConcreteModalityVOs = idConcreteModalityVOs;
    }

    public Long getIdCompanyVO() {
        return idCompanyVO;
    }

    public void setIdCompanyVO(Long idCompanyVO) {
        this.idCompanyVO = idCompanyVO;
    }

    public String getPositionUserVO() {
        return positionUserVO;
    }

    public void setPositionUserVO(String positionUserVO) {
        this.positionUserVO = positionUserVO;
    }

    public String getDepartmentAreaAUVO() {
        return departmentAreaAUVO;
    }

    public void setDepartmentAreaAUVO(String departmentAreaAUVO) {
        this.departmentAreaAUVO = departmentAreaAUVO;
    }

    public Boolean getDoSelectionUserVO() {
        return doSelectionUserVO;
    }

    public void setDoSelectionUserVO(Boolean doSelectionUserVO) {
        this.doSelectionUserVO = doSelectionUserVO;
    }

    public Boolean getDoTrackingUserVO() {
        return doTrackingUserVO;
    }

    public void setDoTrackingUserVO(Boolean doTrackingUserVO) {
        this.doTrackingUserVO = doTrackingUserVO;
    }

    //</editor-fold>

    @Override
    public Object getProperty(int i) {
        return null;
    }

    @Override
    public int getPropertyCount() {
        return 0;
    }

    @Override
    public void setProperty(int i, Object o) {

    }

    @Override
    public void getPropertyInfo(int i, Hashtable hashtable, PropertyInfo propertyInfo) {

    }
}
