/**
 * @author  Michael Cuison
 */
package org.rmj.cas.parameter.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.rmj.appdriver.constants.RecordStatus;
import org.rmj.appdriver.iface.GEntity;

@Entity
@Table(name="Branch")

public class UnitBranch implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sBranchCd")
    private String sBranchCd;
    @Column(name = "sBranchNm")
    private String sBranchNm;
    @Column(name = "sDescript")
    private String sDescript;
    @Column(name = "sCompnyID")
    private String sCompnyID;
    @Column(name = "sAddressx")
    private String sAddressx;
    @Column(name = "sTownIDxx")
    private String sTownIDxx;
    @Column(name = "sManagerx")
    private String sManagerx;
    @Column(name = "sSellCode")
    private String sSellCode;
    @Column(name = "cWareHous")
    private String cWareHous;
    @Column(name = "sTelNumbr")
    private String sTelNumbr;
    @Column(name = "cRecdStat")
    private String cRecdStat;
    @Column(name = "sContactx")
    private String sContactx;
    @Column(name = "sEMailAdd")
    private String sEMailAdd;
    @Basic(optional = true)
    @Column(name = "dExportxx")
    @Temporal(TemporalType.DATE)
    private Date dExportxx;
    @Column(name = "cSrvcCntr")
    private String cSrvcCntr;
    @Column(name = "cAutomate")
    private String cAutomate;
    @Column(name = "cMainOffc")
    private String cMainOffc;
    @Column(name = "sModified")
    private String sModified;
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;
    
    public UnitBranch(){
        this.sBranchCd = "";
        this.sBranchNm = "";
        this.sDescript = "";
        this.sCompnyID = "";
        this.sAddressx = "";
        this.sTownIDxx = "";
        this.sManagerx = "";
        this.sSellCode = "";
        this.cWareHous = "";
        this.sTelNumbr = "";
        this.cRecdStat = RecordStatus.ACTIVE;
        this.sContactx = "";
        this.sEMailAdd = "";
        this.dExportxx = null;
        this.cSrvcCntr = "";
        this.cAutomate = "";
        this.cMainOffc = "";
        
        laColumns = new LinkedList();
        laColumns.add("sBranchCd");
        laColumns.add("sBranchNm");
        laColumns.add("sDescript");
        laColumns.add("sCompnyID");
        laColumns.add("sAddressx");
        laColumns.add("sTownIDxx");
        laColumns.add("sManagerx");
        laColumns.add("sSellCode");
        laColumns.add("cWareHous");
        laColumns.add("sTelNumbr");
        laColumns.add("cRecdStat");
        laColumns.add("sContactx");
        laColumns.add("sEMailAdd");
        laColumns.add("dExportxx");
        laColumns.add("cSrvcCntr");
        laColumns.add("cAutomate");
        laColumns.add("cMainOffc");
        laColumns.add("sModified");
        laColumns.add("dModified");
    }
    
    public void setBranchCode(String sBranchCd){
        this.sBranchCd = sBranchCd;
    }
    public String getBranchCode(){
        return sBranchCd;
    }
    
    public void setBranchName(String sBranchNm){
        this.sBranchNm = sBranchNm;
    }
    public String getBranchName(){
        return sBranchNm;
    }
    
    public void setDescription(String sDescript){
        this.sDescript = sDescript;
    }
    public String getDescription(){
        return sDescript;
    }
    
    public void setCompanyID(String sCompnyID){
        this.sCompnyID = sCompnyID;
    }
    public String getCompanyID(){
        return sCompnyID;
    }
    
    public void setAddress(String sAddressx){
        this.sAddressx = sAddressx;
    }
    public String getAddress(){
        return sAddressx;
    }
    
    public void setTownID(String sTownIDxx){
        this.sTownIDxx = sTownIDxx;
    }
    public String getTownID(){
        return sTownIDxx;
    }
    
    public void setSellCode(String sSellCode){
        this.sSellCode = sSellCode;
    }
    public String getSellCode(){
        return sSellCode;
    }
    
    public void isWarehouse(String cWareHous){
        this.cWareHous = cWareHous;
    }
    public String isWarehouse(){
        return cWareHous;
    }
    
    public void setTelephone(String sTelNumbr){
        this.sTelNumbr = sTelNumbr;
    }
    public String getTelephone(){
        return sTelNumbr;
    }
    
    public void setRecordStat(String cRecdStat){
        this.cRecdStat = cRecdStat;
    }
    public String getRecordStat(){
        return cRecdStat;
    }
    
    public void setContactPerson(String sContactx){
        this.sContactx = sContactx;
    }
    public String getContactPerson(){
        return sContactx;
    }
    
    public void setEmailAddress(String sEMailAdd){
        this.sEMailAdd = sEMailAdd;
    }
    public String getEmailAddress(){
        return sEMailAdd;
    }
    
    public void setExport(Date dExportxx){
        this.dExportxx = dExportxx;
    }
    public Date getExport(){
        return dExportxx;
    }
    
    public void isServiceCenter(String cSrvcCntr){
        this.cSrvcCntr = cSrvcCntr;
    }
    public String isServiceCenter(){
        return cSrvcCntr;
    }
    
    public void isAutomated(String cAutomate){
        this.cAutomate = cAutomate;
    }
    public String isAutomated(){
        return cAutomate;
    }
    
    public void isMainOffice(String cMainOffc){
        this.cMainOffc = cMainOffc;
    }
    public String isMainOffice(){
        return cMainOffc;
    }
    
    public void setModifiedBy(String sModified){
        this.sModified = sModified;
    }
    public String getModifiedBy(){
        return sModified;
    }
    
    public void setDateModified(Date dModified){
        this.dModified = dModified;
    }
    public Date getDateModified(){
        return dModified;
    }
    
    @Override
    public int hashCode(){
        int hash = 0;
        hash += (sBranchCd != null ? sBranchCd.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnitBranch)) {
            return false;
        }
        UnitBranch other = (UnitBranch) object;
        if ((this.sBranchCd == null && other.sBranchCd != null) || (this.sBranchCd != null && !this.sBranchCd.equals(other.sBranchCd))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "org.rmj.parameter.pojo.UnitBrand[sBranchCd=" + sBranchCd + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sBranchCd;
            case 2: return sBranchNm;
            case 3: return sDescript;
            case 4: return sCompnyID;
            case 5: return sAddressx;
            case 6: return sTownIDxx;
            case 7: return sManagerx;
            case 8: return sSellCode;
            case 9: return cWareHous;
            case 10: return sTelNumbr;
            case 11: return cRecdStat;
            case 12: return sContactx;
            case 13: return sEMailAdd;
            case 14: return dExportxx;
            case 15: return cSrvcCntr;
            case 16: return cAutomate;
            case 17: return cMainOffc;
            case 18: return sModified;
            case 19: return dModified;
            default: return null;
        }
    }

    @Override
    public Object getValue(String fsColumn) {
        int lnCol = getColumn(fsColumn);
        
        if (lnCol > 0){
            return getValue(lnCol);
        } else
            return null;
    }

    @Override
    public String getTable() {
        return "Branch";
    }

    @Override
    public String getColumn(int fnCol) {
        if (laColumns.size() < fnCol){
            return "";
        } else 
            return (String) laColumns.get(fnCol - 1);
    }

    @Override
    public int getColumn(String fsCol) {
        return laColumns.indexOf(fsCol) + 1;
    }

    @Override
    public void setValue(int fnColumn, Object foValue) {
        switch(fnColumn){
            case 1: sBranchCd = (String) foValue; break;
            case 2: sBranchNm = (String) foValue; break;
            case 3: sDescript = (String) foValue; break;
            case 4: sCompnyID = (String) foValue; break;
            case 5: sAddressx = (String) foValue; break;
            case 6: sTownIDxx = (String) foValue; break;
            case 7: sManagerx = (String) foValue; break;
            case 8: sSellCode = (String) foValue; break;
            case 9: cWareHous = (String) foValue; break;
            case 10: sTelNumbr = (String) foValue; break;
            case 11: cRecdStat = (String) foValue; break;
            case 12: sContactx = (String) foValue; break;
            case 13: sEMailAdd = (String) foValue; break;
            case 14: dExportxx = (Date) foValue; break;
            case 15: cSrvcCntr = (String) foValue; break;
            case 16: cAutomate = (String) foValue; break;
            case 17: cMainOffc = (String) foValue; break;
            case 18: sModified = (String) foValue; break;
            case 19: dModified = (Date) foValue;
        }    
    }

    @Override
    public void setValue(String fsColumn, Object foValue) {
        int lnCol = getColumn(fsColumn);
        if (lnCol > 0){
            setValue(lnCol, foValue);
        }
    }

    @Override
    public int getColumnCount() {
        return laColumns.size();
    }

    @Override
    public void list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
