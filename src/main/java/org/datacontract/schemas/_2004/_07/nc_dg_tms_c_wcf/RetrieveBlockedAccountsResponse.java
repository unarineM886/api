
package org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveBlockedAccountsResponse complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RetrieveBlockedAccountsResponse">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS}NIWSResponseContainer">
 *       <sequence>
 *         <element name="BlockedAccounts" type="{http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS}ArrayOfBlockedAccount" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveBlockedAccountsResponse", propOrder = {
    "blockedAccounts"
})
public class RetrieveBlockedAccountsResponse
    extends NIWSResponseContainer
{

    @XmlElementRef(name = "BlockedAccounts", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfBlockedAccount> blockedAccounts;

    /**
     * Gets the value of the blockedAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBlockedAccount }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBlockedAccount> getBlockedAccounts() {
        return blockedAccounts;
    }

    /**
     * Sets the value of the blockedAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBlockedAccount }{@code >}
     *     
     */
    public void setBlockedAccounts(JAXBElement<ArrayOfBlockedAccount> value) {
        this.blockedAccounts = value;
    }

}
