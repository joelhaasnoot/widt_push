//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.07 at 09:16:58 PM CEST 
//


package ndov.cdm.trein.reisinformatie.data._2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * De regels van Actuele VertrekTijden bestaande uit een aantal administratieve velden plus een aantal  Trein -elementen.
 * 
 * <p>Java class for VertrekInformatieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VertrekInformatieType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RitId" type="{urn:ndov:cdm:trein:reisinformatie:data:2}RitIdType"/>
 *         &lt;element name="ReisInformatieProductID" type="{urn:ndov:cdm:trein:reisinformatie:data:2}ReisInformatieProductIDType"/>
 *         &lt;element name="VerstoringOnderweg" type="{urn:ndov:cdm:trein:reisinformatie:data:2}VerstoringOnderwegType" minOccurs="0"/>
 *         &lt;element name="Trein" type="{urn:ndov:cdm:trein:reisinformatie:data:2}TreinType"/>
 *         &lt;element name="PresentatieOpmerkingen" type="{urn:ndov:cdm:trein:reisinformatie:data:2}MeertaligeUitingenType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VertrekInformatieType", propOrder = {
    "ritId",
    "reisInformatieProductID",
    "verstoringOnderweg",
    "trein",
    "presentatieOpmerkingen"
})
public class VertrekInformatieType {

    @XmlElement(name = "RitId", required = true)
    protected BigInteger ritId;
    @XmlElement(name = "ReisInformatieProductID", required = true)
    protected BigInteger reisInformatieProductID;
    @XmlElement(name = "VerstoringOnderweg")
    protected VerstoringOnderwegType verstoringOnderweg;
    @XmlElement(name = "Trein", required = true)
    protected TreinType trein;
    @XmlElement(name = "PresentatieOpmerkingen")
    protected MeertaligeUitingenType presentatieOpmerkingen;

    /**
     * Gets the value of the ritId property.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigInteger }
     *     
     */
    public BigInteger getRitId() {
        return ritId;
    }

    /**
     * Sets the value of the ritId property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigInteger }
     *     
     */
    public void setRitId(BigInteger value) {
        this.ritId = value;
    }

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
     * Gets the value of the verstoringOnderweg property.
     * 
     * @return
     *     possible object is
     *     {@link VerstoringOnderwegType }
     *     
     */
    public VerstoringOnderwegType getVerstoringOnderweg() {
        return verstoringOnderweg;
    }

    /**
     * Sets the value of the verstoringOnderweg property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerstoringOnderwegType }
     *     
     */
    public void setVerstoringOnderweg(VerstoringOnderwegType value) {
        this.verstoringOnderweg = value;
    }

    /**
     * Gets the value of the trein property.
     * 
     * @return
     *     possible object is
     *     {@link ndov.cdm.trein.reisinformatie.data._2.TreinType }
     *     
     */
    public TreinType getTrein() {
        return trein;
    }

    /**
     * Sets the value of the trein property.
     * 
     * @param value
     *     allowed object is
     *     {@link ndov.cdm.trein.reisinformatie.data._2.TreinType }
     *     
     */
    public void setTrein(TreinType value) {
        this.trein = value;
    }

    /**
     * Gets the value of the presentatieOpmerkingen property.
     * 
     * @return
     *     possible object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public MeertaligeUitingenType getPresentatieOpmerkingen() {
        return presentatieOpmerkingen;
    }

    /**
     * Sets the value of the presentatieOpmerkingen property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public void setPresentatieOpmerkingen(MeertaligeUitingenType value) {
        this.presentatieOpmerkingen = value;
    }

}
