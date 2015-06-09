
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CurricularProgramVO implements Serializable {

    private Long idCurricularProgramVO;
    private String nameCurricularProgramVO;
    private int totalCreditsCurricularProgramVO;
    private Long idDepartmentVO;
    private Long idInternshipAUVO;
    private List<Long> idConvocatoryVOs = new ArrayList<Long>();
    private List<Long> idAgreementVOs = new ArrayList<Long>();
    private List<Long> idConvocatorysPublicationVOs = new ArrayList<Long>();
    //Not database columns
    private Boolean isActiveConvocatory = false;
    private Boolean isRejectedConvocatory = false;
    private Date revisionConvocatoryDate;
    private String rejectedReasonConvocatory = null;
    private String statusConvocatory = null;
    private Boolean hasInnerProcessConvocatory = false;
    private Boolean hasAgreement = false;
    private Integer inReview = 0;
    private Integer concerned = 0;
    private Integer noSelected = 0;
    private Integer preselected = 0;
    private Integer selected = 0;
    private Integer noApproved = 0;

    @Override
    public String toString() {
        return nameCurricularProgramVO;
    }

    //<editor-fold defaultstate="collapsed" desc="getters and setters">
    public List<Long> getIdConvocatorysPublicationVOs() {
        return idConvocatorysPublicationVOs;
    }

    public void setIdConvocatorysPublicationVOs(List<Long> idConvocatorysPublicationVOs) {
        this.idConvocatorysPublicationVOs = idConvocatorysPublicationVOs;
    }

    public Long getIdCurricularProgramVO() {
        return idCurricularProgramVO;
    }

    public void setIdCurricularProgramVO(Long idCurricularProgramVO) {
        this.idCurricularProgramVO = idCurricularProgramVO;
    }

    public Long getIdDepartmentVO() {
        return idDepartmentVO;
    }

    public void setIdDepartmentVO(Long idDepartmentVO) {
        this.idDepartmentVO = idDepartmentVO;
    }

    public Long getIdInternshipAUVO() {
        return idInternshipAUVO;
    }

    public void setIdInternshipAUVO(Long idInternshipAUVO) {
        this.idInternshipAUVO = idInternshipAUVO;
    }

    public String getNameCurricularProgramVO() {
        return nameCurricularProgramVO;
    }

    public void setNameCurricularProgramVO(String nameCurricularProgramVO) {
        this.nameCurricularProgramVO = nameCurricularProgramVO;
    }

    public int getTotalCreditsCurricularProgramVO() {
        return totalCreditsCurricularProgramVO;
    }

    public void setTotalCreditsCurricularProgramVO(int totalCreditsCurricularProgramVO) {
        this.totalCreditsCurricularProgramVO = totalCreditsCurricularProgramVO;
    }

    public List<Long> getIdConvocatoryVOs() {
        return idConvocatoryVOs;
    }

    public void setIdConvocatoryVOs(List<Long> idConvocatoryVOs) {
        this.idConvocatoryVOs = idConvocatoryVOs;
    }

    public List<Long> getIdAgreementVOs() {
        return idAgreementVOs;
    }

    public void setIdAgreementVOs(List<Long> idAgreementVOs) {
        this.idAgreementVOs = idAgreementVOs;
    }


    public Boolean getHasInnerProcessConvocatory() {
        return hasInnerProcessConvocatory;
    }

    public void setHasInnerProcessConvocatory(Boolean hasInnerProcessConvocatory) {
        this.hasInnerProcessConvocatory = hasInnerProcessConvocatory;
    }

    //</editor-fold>
    public Boolean getIsActiveConvocatory() {
        return isActiveConvocatory;
    }

    public void setIsActiveConvocatory(Boolean isActiveConvocatory) {
        this.isActiveConvocatory = isActiveConvocatory;
    }

    public Boolean getHasAgreement() {
        return hasAgreement;
    }

    public void setHasAgreement(Boolean hasAgreement) {
        this.hasAgreement = hasAgreement;
    }

    public Boolean getIsRejectedConvocatory() {
        return isRejectedConvocatory;
    }

    public void setIsRejectedConvocatory(Boolean isRejectedConvocatory) {
        this.isRejectedConvocatory = isRejectedConvocatory;
    }

    public String getRejectedReasonConvocatory() {
        return rejectedReasonConvocatory;
    }

    public void setRejectedReasonConvocatory(String rejectedReasonConvocatory) {
        this.rejectedReasonConvocatory = rejectedReasonConvocatory;
    }

    public Date getRevisionConvocatoryDate() {
        return revisionConvocatoryDate;
    }

    public void setRevisionConvocatoryDate(Date revisionConvocatoryDate) {
        this.revisionConvocatoryDate = revisionConvocatoryDate;
    }

    public Integer getConcerned() {
        return concerned;
    }

    public void setConcerned(Integer concerned) {
        this.concerned = concerned;
    }

    public Integer getInReview() {
        return inReview;
    }

    public void setInReview(Integer inReview) {
        this.inReview = inReview;
    }

    public Integer getNoSelected() {
        return noSelected;
    }

    public void setNoSelected(Integer noSelected) {
        this.noSelected = noSelected;
    }

    public Integer getPreselected() {
        return preselected;
    }

    public void setPreselected(Integer preselected) {
        this.preselected = preselected;
    }

    public Integer getSelected() {
        return selected;
    }

    public void setSelected(Integer selected) {
        this.selected = selected;
    }

    public Integer getNoApproved() {
        return noApproved;
    }

    public void setNoApproved(Integer noApproved) {
        this.noApproved = noApproved;
    }

    public String getStatusConvocatory() {
        return statusConvocatory;
    }

    public void setStatusConvocatory(String statusConvocatory) {
        this.statusConvocatory = statusConvocatory;
    }
}
