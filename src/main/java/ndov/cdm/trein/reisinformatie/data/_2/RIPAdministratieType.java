//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.07 at 09:16:58 PM CEST 
//


package ndov.cdm.trein.reisinformatie.data._2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Element;


/**
 * De gegevens benodigd voor de identificatie van het bericht met een reisinformatieproduct
 * 
 * <p>Java class for RIPAdministratieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RIPAdministratieType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReisInformatieProductID" type="{urn:ndov:cdm:trein:reisinformatie:data:2}ReisInformatieProductIDType"/>
 *         &lt;element name="AbonnementId" type="{urn:ndov:cdm:trein:reisinformatie:data:2}AbonnementIdType"/>
 *         &lt;element name="ReisInformatieTijdstip" type="{urn:ndov:cdm:trein:reisinformatie:data:2}ReisInformatieTijdstipType"/>
 *         &lt;any processContents='skip' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RIPAdministratieType", propOrder = {
    "reisInformatieProductID",
    "abonnementId",
    "reisInformatieTijdstip",
    "any"
})
public class RIPAdministratieType {

    @XmlElement(name = "ReisInformatieProductID", required = true)
    protected BigInteger reisInformatieProductID;
    @XmlElement(name = "AbonnementId", required = true)
    protected BigInteger abonnementId;
    @XmlElement(name = "ReisInformatieTijdstip", required = true)
    protected XMLGregorianCalendar reisInformatieTijdstip;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the reisInformatieProductID property.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigInteger }
     *     
     */
    public BigInteger getReisInformatieProductID() {
        return reisInformatieProductID;
    }

    /**
     * Sets the value of the reisInformatieProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigInteger }
     *     
     */
    public void setReisInformatieProductID(BigInteger value) {
        this.reisInformatieProductID = value;
    }

    /**
     * Gets the value of the abonnementId property.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigInteger }
     *     
     */
    public BigInteger getAbonnementId() {
        return abonnementId;
    }

    /**
     * Sets the value of the abonnementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigInteger }
     *     
     */
    public void setAbonnementId(BigInteger value) {
        this.abonnementId = value;
    }

    /**
     * Gets the value of the reisInformatieTijdstip property.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReisInformatieTijdstip() {
        return reisInformatieTijdstip;
    }

    /**
     * Sets the value of the reisInformatieTijdstip property.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public void setReisInformatieTijdstip(XMLGregorianCalendar value) {
        this.reisInformatieTijdstip = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.w3c.dom.Element }
     * 
     * 
     */
    public List<Element> getAny() {
        if (any == null) {
            any = new ArrayList<Element>();
        }
        return this.any;
    }

}