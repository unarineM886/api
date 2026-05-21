
package org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBlockedAccount complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfBlockedAccount">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BlockedAccount" type="{http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS}BlockedAccount" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBlockedAccount", propOrder = {
    "blockedAccount"
})
public class ArrayOfBlockedAccount {

    @XmlElement(name = "BlockedAccount", nillable = true)
    protected List<BlockedAccount> blockedAccount;

    /**
     * Gets the value of the blockedAccount property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blockedAccount property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBlockedAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BlockedAccount }
     * </p>
     * 
     * 
     * @return
     *     The value of the blockedAccount property.
     */
    public List<BlockedAccount> getBlockedAccount() {
        if (blockedAccount == null) {
            blockedAccount = new ArrayList<>();
        }
        return this.blockedAccount;
    }

}
