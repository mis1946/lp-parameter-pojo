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
@Table(name="Department")

public class UnitDepartment implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sDeptIDxx")
    private String sDeptIDxx;
    @Column(name = "sDeptName")
    private String sDeptName;
    @Column(name = "sDeptHead")
    private String sDeptHead;
    @Column(name = "sMobileNo")
    private String sMobileNo;
    @Column(name = "sEMailAdd")
    private String sEMailAdd;
    @Column(name = "sDeptCode")
    private String sDeptCode;
    @Column(name = "sHAssgnID")
    private String sHAssgnID;
    @Column(name = "sSAssgnID")
    private String sSAssgnID;
    @Column(name = "cRecdStat")
    private String cRecdStat;
    @Column(name = "sModified")
    private String sModified;
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;
    
    public UnitDepartment(){
        this.sDeptIDxx = "";
        this.sDeptName = "";
        this.sDeptHead = "";
        this.sMobileNo = "";
        this.sEMailAdd = "";
        this.sDeptCode = "";
        this.sHAssgnID = "";
        this.sSAssgnID = "";
        this.cRecdStat = RecordStatus.ACTIVE;
        
        laColumns = new LinkedList();
        laColumns.add("sDeptIDxx");
        laColumns.add("sDeptName");
        laColumns.add("sDeptHead");
        laColumns.add("sMobileNo");
        laColumns.add("sEMailAdd");
        laColumns.add("sDeptCode");
        laColumns.add("sHAssgnID");
        laColumns.add("sSAssgnID");
        laColumns.add("cRecdStat");
        laColumns.add("sModified");
        laColumns.add("dModified");
    }
    
    public void setDepartmentID(String sDeptIDxx){
        this.sDeptIDxx = sDeptIDxx;
    }
    public String getDepartmentID(){
        return sDeptIDxx;
    }
    
    public void setDepartmentName(String sDeptName){
        this.sDeptName = sDeptName;
    }
    public String getDepartmentName(){
        return sDeptName;
    }
    
    public void setDepartmentHead(String sDeptHead){
        this.sDeptHead = sDeptHead;
    }
    public String getDepartmentHead(){
        return sDeptHead;
    }
    
    public void setMobileNo(String sMobileNo){
        this.sMobileNo = sMobileNo;
    }
    public String getMobileNo(){
        return sMobileNo;
    }
    
    public void setEmailAddress(String sEMailAdd){
        this.sEMailAdd = sEMailAdd;
    }
    public String getEmailAddress(){
        return sEMailAdd;
    }
    
    public void setDepartmentCode(String sDeptCode){
        this.sDeptCode = sDeptCode;
    }
    public String getDepartmentCode(){
        return sDeptCode;
    }
    
    public void setHAssignID(String sHAssgnID){
        this.sHAssgnID = sHAssgnID;
    }
    public String getHAssignID(){
        return sHAssgnID;
    }
    
    public void setSAssignID(String sSAssgnID){
        this.sSAssgnID = sSAssgnID;
    }
    public String getSAssignID(){
        return sSAssgnID;
    }
    
    public void setRecordStat(String cRecdStat){
        this.cRecdStat = cRecdStat;
    }
    public String getRecordStat(){
        return cRecdStat;
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
        hash += (sDeptIDxx != null ? sDeptIDxx.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnitDepartment)) {
            return false;
        }
        UnitDepartment other = (UnitDepartment) object;
        if ((this.sDeptIDxx == null && other.sDeptIDxx != null) || (this.sDeptIDxx != null && !this.sDeptIDxx.equals(other.sDeptIDxx))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "org.rmj.parameter.pojo.UnitDepartment[sDeptIDxx=" + sDeptIDxx + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sDeptIDxx;
            case 2: return sDeptName;
            case 3: return sDeptHead;
            case 4: return sMobileNo;
            case 5: return sEMailAdd;
            case 6: return sDeptCode;
            case 7: return sHAssgnID;
            case 8: return sSAssgnID;
            case 9: return cRecdStat;
            case 10: return sModified;
            case 11: return dModified;
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
        return "Department";
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
            case 1: sDeptIDxx = (String) foValue; break;
            case 2: sDeptName = (String) foValue; break;
            case 3: sDeptHead = (String) foValue; break;
            case 4: sMobileNo = (String) foValue; break;
            case 5: sEMailAdd = (String) foValue; break;
            case 6: sDeptCode = (String) foValue; break;
            case 7: sHAssgnID = (String) foValue; break;
            case 8: sSAssgnID = (String) foValue; break;
            case 9: cRecdStat = (String) foValue; break;
            case 10: sModified = (String) foValue; break;
            case 11: dModified = (Date) foValue; break;
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
