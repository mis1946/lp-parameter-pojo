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
@Table(name="Promo_Discount")

public class UnitPromoDiscount implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sDiscIDxx")
    private String sDiscIDxx;
    
    @Column(name = "sDescript")
    private String sDescript;
    
    @Id
    @Basic(optional = false)
    @Column(name = "nDiscRate")
    private Number nDiscRate;
    
    @Id
    @Basic(optional = false)
    @Column(name = "nAddDiscx")
    private Number nAddDiscx;
    
    @Basic(optional = false)
    @Column(name = "dDateFrom")
    @Temporal(TemporalType.DATE)
    private Date dDateFrom;
    
    @Basic(optional = false)
    @Column(name = "dDateThru")
    @Temporal(TemporalType.DATE)
    private Date dDateThru;
    
    @Column(name = "cRecdStat")
    private String cRecdStat;
    
    @Column(name = "sModified")
    private String sModified;
    
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;
    
    public UnitPromoDiscount(){
        this.sDiscIDxx = "";
        this.sDescript = "";
        this.nDiscRate = 0.00;
        this.nAddDiscx = 0.00;
        this.cRecdStat = RecordStatus.ACTIVE;
        
        laColumns = new LinkedList();
        laColumns.add("sDiscIDxx");
        laColumns.add("sDescript");
        laColumns.add("nDiscRate");
        laColumns.add("nAddDiscx");
        laColumns.add("dDateFrom");
        laColumns.add("dDateThru");
        laColumns.add("cRecdStat");
        laColumns.add("sModified");
        laColumns.add("dModified");
    }
    
    public void setDiscountID(String sDiscIDxx){
        this.sDiscIDxx = sDiscIDxx;
    }
    public String getDiscountID(){
        return sDiscIDxx;
    }
    
    public void setDescription(String sDescript){
        this.sDescript = sDescript;
    }
    public String getDescription(){
        return sDescript;
    }
    
    public void setDiscountRate(Number nDiscRate){
        this.nDiscRate = nDiscRate;
    }
    public Number getDiscountRate(){
        return nDiscRate;
    }
    
    public void setAddDisc(Number nAddDiscx){
        this.nAddDiscx = nAddDiscx;
    }
    public Number getAddDisc(){
        return nAddDiscx;
    }
    
    public void setDateFrom(Date dDateFrom){
        this.dDateFrom = dDateFrom;
    }
    public Date getDateFrom(){
        return dDateFrom;
    }
    
    public void setDateThru(Date dDateThru){
        this.dDateThru = dDateThru;
    }
    public Date getDateThru(){
        return dDateThru;
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
        hash += (sDiscIDxx != null ? sDiscIDxx.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnitPromoDiscount)) {
            return false;
        }
        UnitPromoDiscount other = (UnitPromoDiscount) object;
        if ((this.sDiscIDxx == null && other.sDiscIDxx != null) || (this.sDiscIDxx != null && !this.sDiscIDxx.equals(other.sDiscIDxx))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "org.rmj.parameter.pojo.UnitPromoDiscount[sDiscIDxx=" + sDiscIDxx + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sDiscIDxx;
            case 2: return sDescript;
            case 3: return nDiscRate;
            case 4: return nAddDiscx;
            case 5: return dDateFrom;
            case 6: return dDateThru;
            case 7: return cRecdStat;
            case 8: return sModified;
            case 9: return dModified;
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
        return "Promo_Discount";
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
            case 1:
                sDiscIDxx = (String) foValue; break;
            case 2:
                sDescript = (String) foValue; break;
            case 3:
                nDiscRate = (Number) foValue; break;
            case 4:
                nAddDiscx = (Number) foValue; break;     
            case 5:
                dDateFrom = (Date) foValue; break;         
            case 6:
                dDateThru = (Date) foValue; break;     
            case 7:
                cRecdStat = (String) foValue; break;
            case 8:
                sModified = (String) foValue; break;
            case 9:
                dModified = (Date) foValue; break;
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
