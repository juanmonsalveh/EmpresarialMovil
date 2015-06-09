
package model;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

public class ConvocatoryVO implements KvmSerializable {

    private Long idConvoVO;
    private String titleConvoVO;
    private String descriptionConvoVO;
    private String requirementConvoVO;
    private Integer salaryConvoVO = Integer.valueOf("0");
    private String sectorConvoVO;
    private String subSectorConvoVO;
    private String positionConvoVO;
    private int vacanciesConvoVO = 1;
    private String scheduleTypeConvoVO;
    private boolean isConfidentialConvoVO;
    private boolean flexibleScheduleConvoVO;
    private boolean innerConvoVO;
    private String otherBenefitsConvoVO;
    private Date closingDateConvoVO;
    private Date startDateConvoVO;
    private Date publicationDateConvoVO;
    private Long idCityConvoVO;
    private Long idCompanyVO;
    private Integer phaseConvoVO;
    private LongList idApplicationStatusVOs;
    private LongList idConcreteModalityVOs;
    private LongList idConvocatorysPublicationVOs;
    private String requiredProfileVO;
    private String typeContractVO;
    private Date originalClosingDate;

    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public Date getClosingDateConvoVO() {
        return closingDateConvoVO;
    }
    
    public void setClosingDateConvoVO(Date closingDateConvoVO) {
        this.closingDateConvoVO = closingDateConvoVO;
    }
    
    public String getDescriptionConvoVO() {
        return descriptionConvoVO;
    }
    
    public void setDescriptionConvoVO(String descriptionConvoVO) {
        this.descriptionConvoVO = descriptionConvoVO;
    }
    
    public boolean isFlexibleScheduleConvoVO() {
        return flexibleScheduleConvoVO;
    }
    
    public void setFlexibleScheduleConvoVO(boolean flexibleScheduleConvoVO) {
        this.flexibleScheduleConvoVO = flexibleScheduleConvoVO;
    }
    
    public Long getIdCityConvoVO() {
        return idCityConvoVO;
    }
    
    public void setIdCityConvoVO(Long idCityConvoVO) {
        this.idCityConvoVO = idCityConvoVO;
    }
    
    public Long getIdCompanyVO() {
        return idCompanyVO;
    }
    
    public void setIdCompanyVO(Long idCompanyVO) {
        this.idCompanyVO = idCompanyVO;
    }
    
    public Long getIdConvoVO() {
        return idConvoVO;
    }
    
    public void setIdConvoVO(Long idConvoVO) {
        this.idConvoVO = idConvoVO;
    }
    
    public boolean isInnerConvoVO() {
        return innerConvoVO;
    }
    
    public void setInnerConvoVO(boolean innerConvoVO) {
        this.innerConvoVO = innerConvoVO;
    }
    
    public String getOtherBenefitsConvoVO() {
        return otherBenefitsConvoVO;
    }
    
    public void setOtherBenefitsConvoVO(String otherBenefitsConvoVO) {
        this.otherBenefitsConvoVO = otherBenefitsConvoVO;
    }
    
    public Date getPublicationDateConvoVO() {
        return publicationDateConvoVO;
    }
    
    public void setPublicationDateConvoVO(Date publicationDateConvoVO) {
        this.publicationDateConvoVO = publicationDateConvoVO;
    }
    
    public String getRequirementConvoVO() {
        return requirementConvoVO;
    }
    
    public void setRequirementConvoVO(String requirementConvoVO) {
        this.requirementConvoVO = requirementConvoVO;
    }
    
    public Integer getSalaryConvoVO() {
        return salaryConvoVO;
    }
    
    public void setSalaryConvoVO(Integer salaryConvoVO) {
        this.salaryConvoVO = salaryConvoVO;
    }
    
    public String getScheduleTypeConvoVO() {
        return scheduleTypeConvoVO;
    }
    
    public void setScheduleTypeConvoVO(String scheduleTypeConvoVO) {
        this.scheduleTypeConvoVO = scheduleTypeConvoVO;
    }
    
    public String getSectorConvoVO() {
        return sectorConvoVO;
    }
    
    public void setSectorConvoVO(String sectorConvoVO) {
        this.sectorConvoVO = sectorConvoVO;
    }
    
    public Date getStartDateConvoVO() {
        return startDateConvoVO;
    }
    
    public void setStartDateConvoVO(Date startDateConvoVO) {
        this.startDateConvoVO = startDateConvoVO;
    }
    
    public String getSubSectorConvoVO() {
        return subSectorConvoVO;
    }
    
    public void setSubSectorConvoVO(String subSectorConvoVO) {
        this.subSectorConvoVO = subSectorConvoVO;
    }
    
    public String getTitleConvoVO() {
        return titleConvoVO;
    }
    
    public void setTitleConvoVO(String titleConvoVO) {
        this.titleConvoVO = titleConvoVO;
    }
    
    public int getVacanciesConvoVO() {
        return vacanciesConvoVO;
    }
    
    public void setVacanciesConvoVO(int vacanciesConvoVO) {
        this.vacanciesConvoVO = vacanciesConvoVO;
    }
    
    public List<Long> getIdConvocatorysPublicationVOs() {
        return idConvocatorysPublicationVOs;
    }
    
    public void setIdConvocatorysPublicationVOs(LongList idConvocatorysPublicationVOs) {
        this.idConvocatorysPublicationVOs = idConvocatorysPublicationVOs;
    }
    
    public List<Long> getIdApplicationStatusVOs() {
        return idApplicationStatusVOs;
    }
    
    public void setIdApplicationStatusVOs(LongList idApplicationStatusVOs) {
        this.idApplicationStatusVOs = idApplicationStatusVOs;
    }
    
    public String getPositionConvoVO() {
        return positionConvoVO;
    }
    
    public void setPositionConvoVO(String positionConvoVO) {
        this.positionConvoVO = positionConvoVO;
    }
    
    public Integer getPhaseConvoVO() {
        return phaseConvoVO;
    }
    
    public void setPhaseConvoVO(Integer phaseConvoVO) {
        this.phaseConvoVO = phaseConvoVO;
    }
    
    public List<Long> getIdConcreteModalityVOs() {
        return idConcreteModalityVOs;
    }
    
    public void setIdConcreteModalityVOs(LongList idConcreteModalityVOs) {
        this.idConcreteModalityVOs = idConcreteModalityVOs;
    }
    
    public String getRequiredProfileVO() {
        return requiredProfileVO;
    }
    
    public void setRequiredProfileVO(String requiredProfileVO) {
        this.requiredProfileVO = requiredProfileVO;
    }
    
    public boolean isIsConfidentialConvoVO() {
        return isConfidentialConvoVO;
    }
    
    public void setIsConfidentialConvoVO(boolean isConfidentialConvoVO) {
        this.isConfidentialConvoVO = isConfidentialConvoVO;
    }
    
    public String getTypeContractVO() {
        return typeContractVO;
    }
    
    public void setTypeContractVO(String typeContractVO) {
        this.typeContractVO = typeContractVO;
    }

    public Date getOriginalClosingDate() {
        return originalClosingDate;
    }

    public void setOriginalClosingDate(Date originalClosingDate) {
        this.originalClosingDate = originalClosingDate;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="methods vo">
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ConvocatoryVO && ((ConvocatoryVO) obj).idConvoVO == idConvoVO) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 2;
        hash = 2 * hash + (this.idConvoVO != null ? this.idConvoVO.hashCode() : 0);
        return hash;
    }

    public static class Builder {

        private ConvocatoryVO item;
        
        public Builder() {
            this.item = new ConvocatoryVO();
        }

        public Builder withIdConvoVO(final Long idConvoVO) {
            this.item.idConvoVO = idConvoVO;
            return this;
        }

        public Builder withTitleConvoVO(final String titleConvoVO) {
            this.item.titleConvoVO = titleConvoVO;
            return this;
        }

        public Builder withDescriptionConvoVO(final String descriptionConvoVO) {
            this.item.descriptionConvoVO = descriptionConvoVO;
            return this;
        }

        public Builder withRequirementConvoVO(final String requirementConvoVO) {
            this.item.requirementConvoVO = requirementConvoVO;
            return this;
        }

        public Builder withSalaryConvoVO(final Integer salaryConvoVO) {
            this.item.salaryConvoVO = salaryConvoVO;
            return this;
        }

        public Builder withSectorConvoVO(final String sectorConvoVO) {
            this.item.sectorConvoVO = sectorConvoVO;
            return this;
        }

        public Builder withSubSectorConvoVO(final String subSectorConvoVO) {
            this.item.subSectorConvoVO = subSectorConvoVO;
            return this;
        }

        public Builder withPositionConvoVO(final String positionConvoVO) {
            this.item.positionConvoVO = positionConvoVO;
            return this;
        }

        public Builder withVacanciesConvoVO(final int vacanciesConvoVO) {
            this.item.vacanciesConvoVO = vacanciesConvoVO;
            return this;
        }

        public Builder withScheduleTypeConvoVO(final String scheduleTypeConvoVO) {
            this.item.scheduleTypeConvoVO = scheduleTypeConvoVO;
            return this;
        }

        public Builder withIsConfidentialConvoVO(final boolean isConfidentialConvoVO) {
            this.item.isConfidentialConvoVO = isConfidentialConvoVO;
            return this;
        }

        public Builder withFlexibleScheduleConvoVO(final boolean flexibleScheduleConvoVO) {
            this.item.flexibleScheduleConvoVO = flexibleScheduleConvoVO;
            return this;
        }

        public Builder withInnerConvoVO(final boolean innerConvoVO) {
            this.item.innerConvoVO = innerConvoVO;
            return this;
        }

        public Builder withOtherBenefitsConvoVO(final String otherBenefitsConvoVO) {
            this.item.otherBenefitsConvoVO = otherBenefitsConvoVO;
            return this;
        }

        public Builder withClosingDateConvoVO(final Date closingDateConvoVO) {
            this.item.closingDateConvoVO = closingDateConvoVO;
            return this;
        }

        public Builder withStartDateConvoVO(final Date startDateConvoVO) {
            this.item.startDateConvoVO = startDateConvoVO;
            return this;
        }

        public Builder withPublicationDateConvoVO(final Date publicationDateConvoVO) {
            this.item.publicationDateConvoVO = publicationDateConvoVO;
            return this;
        }

        public Builder withIdCityConvoVO(final Long idCityConvoVO) {
            this.item.idCityConvoVO = idCityConvoVO;
            return this;
        }

        public Builder withIdCompanyVO(final Long idCompanyVO) {
            this.item.idCompanyVO = idCompanyVO;
            return this;
        }

        public Builder withPhaseConvoVO(final Integer phaseConvoVO) {
            this.item.phaseConvoVO = phaseConvoVO;
            return this;
        }

        public Builder withIdApplicationStatusVOs(LongList idApplicationStatusVOs) {
            this.item.idApplicationStatusVOs = idApplicationStatusVOs;
            return this;
        }

        public Builder withIdConcreteModalityVOs(LongList idConcreteModalityVOs) {
            this.item.idConcreteModalityVOs = idConcreteModalityVOs;
            return this;
        }

        public Builder withIdConvocatorysPublicationVOs(LongList idConvocatorysPublicationVOs) {
            this.item.idConvocatorysPublicationVOs = idConvocatorysPublicationVOs;
            return this;
        }

        public Builder withRequiredProfileVO(final String requiredProfileVO) {
            this.item.requiredProfileVO = requiredProfileVO;
            return this;
        }

        public Builder withTypeContractVO(final String typeContractVO) {
            this.item.typeContractVO = typeContractVO;
            return this;
        }

        public Builder withOriginalClosingDate(final Date originalClosingDate) {
            this.item.originalClosingDate = originalClosingDate;
            return this;
        }

        public ConvocatoryVO build() {
            return this.item;
        }
    }
    //</editor-fold>

    @Override
    public Object getProperty(int i) {
        switch (i) {
            case 0:
                return this.idConvoVO;
            case 1:
                return this.titleConvoVO;
            case 2:
                return this.descriptionConvoVO;
            case 3:
                return this.requirementConvoVO;
            case 4:
                return this.salaryConvoVO;
            case 5:
                return this.sectorConvoVO;
            case 6:
                return this.subSectorConvoVO;
            case 7:
                return this.positionConvoVO;
            case 8:
                return this.vacanciesConvoVO;
            case 9:
                return this.scheduleTypeConvoVO;
            case 10:
                return this.isConfidentialConvoVO;
            case 11:
                return this.flexibleScheduleConvoVO;
            case 12:
                return this.innerConvoVO;
            case 13:
                return this.otherBenefitsConvoVO;
            case 14:
                return this.closingDateConvoVO;
            case 15:
                return this.startDateConvoVO;
            case 16:
                return this.publicationDateConvoVO;
            case 17:
                return this.idCityConvoVO;
            case 18:
                return this.idCompanyVO;
            case 19:
                return this.phaseConvoVO;
            case 20:
                return this.idApplicationStatusVOs;
            case 21:
                return this.idConcreteModalityVOs;
            case 22:
                return this.idConvocatorysPublicationVOs;
            case 23:
                return this.requiredProfileVO;
            case 24:
                return this.typeContractVO;
            case 25:
                return this.originalClosingDate;

            default:
                break;

        }

        return null;
    }

    @Override
    public int getPropertyCount() {
        return 26;
    }

    @Override
    public void setProperty(int i, Object value) {
        switch (i) {
            case 0:
                this.idConvoVO = Long.parseLong(value.toString());
                break;
            case 1:
                this.titleConvoVO = value.toString();
                break;
            case 2:
                this.descriptionConvoVO = value.toString();
                break;
            case 3:
                this.requirementConvoVO = value.toString();
                break;
            case 4:
                this.salaryConvoVO = Integer.parseInt(value.toString());
                break;
            case 5:
                this.sectorConvoVO = value.toString();
                break;
            case 6:
                this.subSectorConvoVO = value.toString();
                break;
            case 7:
                this.positionConvoVO = value.toString();
                break;
            case 8:
                this.vacanciesConvoVO = Integer.parseInt(value.toString());
                break;
            case 9:
                this.scheduleTypeConvoVO = value.toString();
                break;
            case 10:
                this.isConfidentialConvoVO = Boolean.parseBoolean(value.toString());
                break;
            case 11:
                this.flexibleScheduleConvoVO = Boolean.parseBoolean(value.toString());
                break;
            case 12:
                this.innerConvoVO = Boolean.parseBoolean(value.toString());
                break;
            case 13:
                this.otherBenefitsConvoVO = value.toString();
                break;
            case 14:
                this.closingDateConvoVO = new Date(value.toString());
                break;
            case 15:
                this.startDateConvoVO = new Date(value.toString());
                break;
            case 16:
                this.publicationDateConvoVO = new Date(value.toString());
                break;
            case 17:
                this.idCityConvoVO = Long.parseLong(value.toString());
                break;
            case 18:
                this.idCompanyVO = Long.parseLong(value.toString());
                break;
            case 19:
                this.phaseConvoVO = Integer.parseInt(value.toString());
                break;
            case 20:
                this.idApplicationStatusVOs = (LongList)value;
                break;
            case 21:
                this.idConcreteModalityVOs = (LongList)value;
                break;
            case 22:
                this.idConvocatorysPublicationVOs = (LongList)value;
                break;
            case 23:
                this.requiredProfileVO = value.toString();
                break;
            case 24:
                this.typeContractVO = value.toString();
                break;
            case 25:
                this.originalClosingDate = new Date(value.toString());
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
                info.name = "idConvoVO";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "titleConvoVO";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "descriptionConvoVO";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "requirementConvoVO";
                break;
            case 4:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "salaryConvoVO";
                break;
            case 5:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "sectorConvoVO";
                break;
            case 6:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "subSectorConvoVO";
                break;
            case 7:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "positionConvoVO";
                break;
            case 8:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "vacanciesConvoVO";
                break;
            case 9:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "scheduleTypeConvoVO";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "isConfidentialConvoVO";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "flexibleScheduleConvoVO";
                break;
            case 12:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "innerConvoVO";
                break;
            case 13:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "otherBenefitsConvoVO";
                break;
            case 14:
                info.type = PropertyInfo.STRING_CLASS;//date
                info.name = "closingDateConvoVO";
                break;
            case 15:
                info.type = PropertyInfo.STRING_CLASS;//date
                info.name = "startDateConvoVO";
                break;
            case 16:
                info.type = PropertyInfo.STRING_CLASS;//date
                info.name = "publicationDateConvoVO";
                break;
            case 17:
                info.type = PropertyInfo.LONG_CLASS;
                info.name = "idCityConvoVO";
                break;
            case 18:
                info.type = PropertyInfo.LONG_CLASS;
                info.name = "idCompanyVO";
                break;
            case 19:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "phaseConvoVO";
                break;
            case 20:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "idApplicationStatusVOs";
                break;
            case 21:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "idConcreteModalityVOs";
                break;
            case 22:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "idConvocatorysPublicationVOs";
                break;
            case 23:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "requiredProfileVO";
                break;
            case 24:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "typeContractVO";
                break;
            case 25:
                info.type = PropertyInfo.STRING_CLASS;//date
                info.name = "originalClosingDate";
                break;

            default:
                break;

        }
    }
}
