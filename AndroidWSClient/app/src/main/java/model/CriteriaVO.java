/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;

public class CriteriaVO implements Serializable {

    private String nameCriteria;
    private String name2Criteria;
    private String userNameCriteria;
    private String cityCriteria;
    private String dependenceCriteria;
    private String areaCriteria;
    private String webPageCriteria;
    private String eMailCriteria;
    private String extraValueCriteria;
    private String activeCriteria;
    private String belongsToCriteria;
    private Integer rolCriteria;
    private Integer codeCriteria;
    private Date firstDateCriteria;
    private Date firstDateCriteriaRange;
    private Date secondDateCriteria;
    private Date secondDateCriteriaRange;
    private String idCriteria;
    private String otherIdCriteria;
    private String otherId2Criteria;
    private String otherId3Criteria;
    private Boolean boolValCriteria = false;
    private Boolean boolVal2Criteria = false;
    private Boolean boolVal3Criteria = false;
    private Boolean exactMatchCriteria = false;

    /**
     *
     */
    public CriteriaVO() {
        this.nameCriteria = "";
        this.name2Criteria = "";
        this.userNameCriteria = "";
        this.rolCriteria = null;
        this.firstDateCriteria = null;
        this.secondDateCriteria = null;
        this.cityCriteria = "";
        this.dependenceCriteria = "";
        this.areaCriteria = "";
        this.webPageCriteria = "";
        this.eMailCriteria = "";
        this.extraValueCriteria = "";
        this.idCriteria = null;
        this.otherIdCriteria = null;
        this.otherId2Criteria = null;
        this.otherId3Criteria = null;
        this.activeCriteria = "";
        this.belongsToCriteria = "";
        this.boolValCriteria = null;
    }

    public String getActiveCriteria() {
        return activeCriteria;
    }

    public void setActiveCriteria(String activeCriteria) {
        this.activeCriteria = activeCriteria;
    }

    public String getAreaCriteria() {
        return areaCriteria;
    }

    public void setAreaCriteria(String areaCriteria) {
        this.areaCriteria = areaCriteria;
    }

    public String getBelongsToCriteria() {
        return belongsToCriteria;
    }

    public void setBelongsToCriteria(String belongsToCriteria) {
        this.belongsToCriteria = belongsToCriteria;
    }

    public String getCityCriteria() {
        return cityCriteria;
    }

    public void setCityCriteria(String cityCriteria) {
        this.cityCriteria = cityCriteria;
    }

    public String getDependenceCriteria() {
        return dependenceCriteria;
    }

    public void setDependenceCriteria(String dependenceCriteria) {
        this.dependenceCriteria = dependenceCriteria;
    }

    public String geteMailCriteria() {
        return eMailCriteria;
    }

    public void seteMailCriteria(String eMailCriteria) {
        this.eMailCriteria = eMailCriteria;
    }

    public String getExtraValueCriteria() {
        return extraValueCriteria;
    }

    public void setExtraValueCriteria(String extraValueCriteria) {
        this.extraValueCriteria = extraValueCriteria;
    }

    public Date getFirstDateCriteria() {
        return firstDateCriteria;
    }

    public void setFirstDateCriteria(Date firstDateCriteria) {
        this.firstDateCriteria = firstDateCriteria;
    }

    public String getIdCriteria() {
        return emptyStringValue(idCriteria);
    }

    public void setIdCriteria(String idCriteria) {
        if (idCriteria != null) {
            this.idCriteria = idCriteria.toString();
        } else {
            this.idCriteria = idCriteria;
        }
    }

    public String getName2Criteria() {
        return name2Criteria;
    }

    public void setName2Criteria(String name2Criteria) {
        this.name2Criteria = name2Criteria;
    }

    public String getNameCriteria() {
        return nameCriteria;
    }

    public void setNameCriteria(String nameCriteria) {
        this.nameCriteria = nameCriteria;
    }

    public String getOtherIdCriteria() {
        return emptyStringValue(otherIdCriteria);
    }

    public void setOtherIdCriteria(String otherIdCriteria) {
        this.otherIdCriteria = otherIdCriteria;
    }

    public Integer getRolCriteria() {
        return rolCriteria;
    }

    public void setRolCriteria(Integer rolCriteria) {
        this.rolCriteria = rolCriteria;
    }

    public Date getSecondDateCriteria() {
        return secondDateCriteria;
    }

    public void setSecondDateCriteria(Date secondDateCriteria) {
        this.secondDateCriteria = secondDateCriteria;
    }

    public String getUserNameCriteria() {
        return userNameCriteria;
    }

    public void setUserNameCriteria(String userNameCriteria) {
        this.userNameCriteria = userNameCriteria;
    }

    public String getWebPageCriteria() {
        return webPageCriteria;
    }

    public void setWebPageCriteria(String webPageCriteria) {
        this.webPageCriteria = webPageCriteria;
    }

    public Date getFirstDateCriteriaRange() {
        return firstDateCriteriaRange;
    }

    public void setFirstDateCriteriaRange(Date firstDateCriteriaRange) {
        this.firstDateCriteriaRange = firstDateCriteriaRange;
    }

    public Date getSecondDateCriteriaRange() {
        return secondDateCriteriaRange;
    }

    public void setSecondDateCriteriaRange(Date secondDateCriteriaRange) {
        this.secondDateCriteriaRange = secondDateCriteriaRange;
    }

    public String getOtherId2Criteria() {
        return emptyStringValue(otherId2Criteria);
    }

    public void setOtherId2Criteria(String otherId2Criteria) {
        this.otherId2Criteria = otherId2Criteria;
    }

    public Integer getCodeCriteria() {
        return codeCriteria;
    }

    public void setCodeCriteria(Integer codeCriteria) {
        this.codeCriteria = codeCriteria;
    }

    public Boolean getBoolValCriteria() {
        return boolValCriteria;
    }

    public void setBoolValCriteria(Boolean boolValCriteria) {
        this.boolValCriteria = boolValCriteria;
    }

    public Boolean getBoolVal2Criteria() {
        return boolVal2Criteria;
    }

    public void setBoolVal2Criteria(Boolean boolVal2Criteria) {
        this.boolVal2Criteria = boolVal2Criteria;
    }

    public String getOtherId3Criteria() {
        return emptyStringValue(otherId3Criteria);
    }

    public void setOtherId3Criteria(String otherId3Criteria) {
        this.otherId3Criteria = otherId3Criteria;
    }

    private String emptyStringValue(String value) {
        if (value != null && !value.trim().isEmpty()) {
            return value;
        }
        return null;
    }

    public Boolean getExactMatchCriteria() {
        return exactMatchCriteria;
    }

    public void setExactMatchCriteria(Boolean exactMatchCriteria) {
        this.exactMatchCriteria = exactMatchCriteria;
    }

    public Boolean getBoolVal3Criteria() {
        return boolVal3Criteria;
    }

    public void setBoolVal3Criteria(Boolean boolVal3Criteria) {
        this.boolVal3Criteria = boolVal3Criteria;
    }

    public static class Builder {

        public Builder() {
            this.item = new CriteriaVO();
        }
        private CriteriaVO item;

        public Builder withNameCriteria(final String nameCriteria) {
            this.item.nameCriteria = nameCriteria;
            return this;
        }

        public Builder withName2Criteria(final String name2Criteria) {
            this.item.name2Criteria = name2Criteria;
            return this;
        }

        public Builder withUserNameCriteria(final String userNameCriteria) {
            this.item.userNameCriteria = userNameCriteria;
            return this;
        }

        public Builder withCityCriteria(final String cityCriteria) {
            this.item.cityCriteria = cityCriteria;
            return this;
        }

        public Builder withDependenceCriteria(final String dependenceCriteria) {
            this.item.dependenceCriteria = dependenceCriteria;
            return this;
        }

        public Builder withAreaCriteria(final String areaCriteria) {
            this.item.areaCriteria = areaCriteria;
            return this;
        }

        public Builder withWebPageCriteria(final String webPageCriteria) {
            this.item.webPageCriteria = webPageCriteria;
            return this;
        }

        public Builder withEMailCriteria(final String eMailCriteria) {
            this.item.eMailCriteria = eMailCriteria;
            return this;
        }

        public Builder withExtraValueCriteria(final String extraValueCriteria) {
            this.item.extraValueCriteria = extraValueCriteria;
            return this;
        }

        public Builder withActiveCriteria(final String activeCriteria) {
            this.item.activeCriteria = activeCriteria;
            return this;
        }

        public Builder withBelongsToCriteria(final String belongsToCriteria) {
            this.item.belongsToCriteria = belongsToCriteria;
            return this;
        }

        public Builder withRolCriteria(final Integer rolCriteria) {
            this.item.rolCriteria = rolCriteria;
            return this;
        }

        public Builder withCodeCriteria(final Integer codeCriteria) {
            this.item.codeCriteria = codeCriteria;
            return this;
        }

        public Builder withFirstDateCriteria(final Date firstDateCriteria) {
            this.item.firstDateCriteria = firstDateCriteria;
            return this;
        }

        public Builder withFirstDateCriteriaRange(final Date firstDateCriteriaRange) {
            this.item.firstDateCriteriaRange = firstDateCriteriaRange;
            return this;
        }

        public Builder withSecondDateCriteria(final Date secondDateCriteria) {
            this.item.secondDateCriteria = secondDateCriteria;
            return this;
        }

        public Builder withSecondDateCriteriaRange(final Date secondDateCriteriaRange) {
            this.item.secondDateCriteriaRange = secondDateCriteriaRange;
            return this;
        }

        public Builder withIdCriteria(final String idCriteria) {
            this.item.idCriteria = idCriteria;
            return this;
        }

        public Builder withOtherIdCriteria(final String otherIdCriteria) {
            this.item.otherIdCriteria = otherIdCriteria;
            return this;
        }

        public Builder withOtherId2Criteria(final String otherId2Criteria) {
            this.item.otherId2Criteria = otherId2Criteria;
            return this;
        }

        public Builder withOtherId3Criteria(final String otherId3Criteria) {
            this.item.otherId3Criteria = otherId3Criteria;
            return this;
        }

        public Builder withBoolValCriteria(final Boolean boolValCriteria) {
            this.item.boolValCriteria = boolValCriteria;
            return this;
        }

        public Builder withBoolVal2Criteria(final Boolean boolVal2Criteria) {
            this.item.boolVal2Criteria = boolVal2Criteria;
            return this;
        }

        public Builder withBoolVal3Criteria(final Boolean boolVal3Criteria) {
            this.item.boolVal3Criteria = boolVal3Criteria;
            return this;
        }

        public Builder withExactMatchCriteria(final Boolean exactMatchCriteria) {
            this.item.exactMatchCriteria = exactMatchCriteria;
            return this;
        }

        public CriteriaVO build() {
            return this.item;
        }
    }
    
}
