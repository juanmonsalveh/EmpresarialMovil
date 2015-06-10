
package model;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;

public class CurricularProgramVO implements KvmSerializable {

    private Long idCurricularProgramVO;
    private String nameCurricularProgramVO;
    private int totalCreditsCurricularProgramVO;
    private Long idDepartmentVO;
    private Long idInternshipAUVO;
    private LongList idConvocatoryVOs;
    private LongList idAgreementVOs;
    private LongList idConvocatorysPublicationVOs;
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
    public LongList getIdConvocatorysPublicationVOs() {
        return idConvocatorysPublicationVOs;
    }

    public void setIdConvocatorysPublicationVOs(LongList idConvocatorysPublicationVOs) {
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

    public LongList getIdConvocatoryVOs() {
        return idConvocatoryVOs;
    }

    public void setIdConvocatoryVOs(LongList idConvocatoryVOs) {
        this.idConvocatoryVOs = idConvocatoryVOs;
    }

    public LongList getIdAgreementVOs() {
        return idAgreementVOs;
    }

    public void setIdAgreementVOs(LongList idAgreementVOs) {
        this.idAgreementVOs = idAgreementVOs;
    }


    public Boolean getHasInnerProcessConvocatory() {
        return hasInnerProcessConvocatory;
    }

    public void setHasInnerProcessConvocatory(Boolean hasInnerProcessConvocatory) {
        this.hasInnerProcessConvocatory = hasInnerProcessConvocatory;
    }


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
    //</editor-fold>

    @Override
    public Object getProperty(int i) {

        switch (i) {
            case 0:
                return this.idCurricularProgramVO;
            case 1:
                return this.nameCurricularProgramVO;
            case 2:
                return this.totalCreditsCurricularProgramVO;
            case 3:
                return this.idDepartmentVO;
            case 4:
                return this.idInternshipAUVO;
            case 5:
                return this.idConvocatoryVOs;
            case 6:
                return this.idAgreementVOs;
            case 7:
                return this.idConvocatorysPublicationVOs;
            case 8:
                return this.isActiveConvocatory;
            case 9:
                return this.isRejectedConvocatory;
            case 10:
                return this.revisionConvocatoryDate;
            case 11:
                return this.rejectedReasonConvocatory;
            case 12:
                return this.statusConvocatory;
            case 13:
                return this.hasInnerProcessConvocatory;
            case 14:
                return this.hasAgreement;
            case 15:
                return this.inReview;
            case 16:
                return this.concerned;
            case 17:
                return this.noSelected;
            case 18:
                return this.preselected;
            case 19:
                return this.selected;
            case 20:
                return this.noApproved;

            default:
                break;
        }
        return null;
    }

    @Override
    public int getPropertyCount() {
        return 21;
    }

    @Override
    public void setProperty(int i, Object value) {
        switch (i) {

            case 0:
                this.idCurricularProgramVO = Long.parseLong(value.toString());
                break;
            case 1:
                this.nameCurricularProgramVO = value.toString();
                break;
            case 2:
                this.totalCreditsCurricularProgramVO = Integer.parseInt(value.toString());
                break;
            case 3:
                this.idDepartmentVO = Long.parseLong(value.toString());
                break;
            case 4:
                this.idInternshipAUVO = Long.parseLong(value.toString());
                break;
            case 5:
                this.idConvocatoryVOs = (LongList)value;
                break;
            case 6:
                this.idAgreementVOs = (LongList)value;
                break;
            case 7:
                this.idConvocatorysPublicationVOs = (LongList)value;
                break;
            case 8:
                this.isActiveConvocatory = Boolean.parseBoolean(value.toString());
                break;
            case 9:
                this.isRejectedConvocatory = Boolean.parseBoolean(value.toString());
                break;
            case 10:
                this.revisionConvocatoryDate = new Date(value.toString());
                break;
            case 11:
                this.rejectedReasonConvocatory = value.toString();
                break;
            case 12:
                this.statusConvocatory = value.toString();
                break;
            case 13:
                this.hasInnerProcessConvocatory = Boolean.parseBoolean(value.toString());
                break;
            case 14:
                this.hasAgreement = Boolean.parseBoolean(value.toString());
                break;
            case 15:
                this.inReview = Integer.parseInt(value.toString());
                break;
            case 16:
                this.concerned = Integer.parseInt(value.toString());
                break;
            case 17:
                this.noSelected = Integer.parseInt(value.toString());
                break;
            case 18:
                this.preselected = Integer.parseInt(value.toString());
                break;
            case 19:
                this.selected = Integer.parseInt(value.toString());
                break;
            case 20:
                this.noApproved = Integer.parseInt(value.toString());
                break;
            default:
                break;
        }
    }

    @Override
    public void getPropertyInfo(int i, Hashtable hashtable, PropertyInfo info) {

        switch (i) {
            case 0:
                info.type = PropertyInfo.LONG_CLASS;
                info.name = "idCurricularProgramVO";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "nameCurricularProgramVO";
                break;
            case 2:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "totalCreditsCurricularProgramVO";
                break;
            case 3:
                info.type = PropertyInfo.LONG_CLASS;
                info.name = "idDepartmentVO";
                break;
            case 4:
                info.type = PropertyInfo.LONG_CLASS;
                info.name = "idInternshipAUVO";
                break;
            case 5:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "idConvocatoryVOs";
                break;
            case 6:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "idAgreementVOs";
                break;
            case 7:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "idConvocatorysPublicationVOs";
                break;
            case 8:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "isActiveConvocatory";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "isRejectedConvocatory";
                break;
            case 10:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "revisionConvocatoryDate";
                break;
            case 11:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "rejectedReasonConvocatory";
                break;
            case 12:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "statusConvocatory";
                break;
            case 13:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "hasInnerProcessConvocatory";
                break;
            case 14:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "hasAgreement";
                break;
            case 15:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "inReview";
                break;
            case 16:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "concerned";
                break;
            case 17:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "noSelected";
                break;
            case 18:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "preselected";
                break;
            case 19:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "selected";
                break;
            case 20:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "noApproved";
                break;
        }
    }
}
