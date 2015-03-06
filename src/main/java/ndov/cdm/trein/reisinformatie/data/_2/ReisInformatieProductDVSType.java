//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.07 at 09:16:58 PM CEST 
//


package ndov.cdm.trein.reisinformatie.data._2;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * <p>Java class for ReisInformatieProductDVSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReisInformatieProductDVSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RIPAdministratie" type="{urn:ndov:cdm:trein:reisinformatie:data:2}RIPAdministratieType"/>
 *         &lt;element name="DynamischeVertrekStaat" type="{urn:ndov:cdm:trein:reisinformatie:data:2}DynamischeVertrekStaatType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Versie" type="{urn:ndov:cdm:trein:reisinformatie:data:2}DVSVersieType" default="6.2" />
 *       &lt;attribute name="TimeStamp" use="required" type="{urn:ndov:cdm:trein:reisinformatie:data:2}DVSAanmaaktijdType" />
 *       &lt;anyAttribute processContents='skip' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReisInformatieProductDVSType", propOrder = {
    "ripAdministratie",
    "dynamischeVertrekStaat"
})
public class ReisInformatieProductDVSType {

    @XmlElement(name = "RIPAdministratie", required = true)
    protected RIPAdministratieType ripAdministratie;
    @XmlElement(name = "DynamischeVertrekStaat", required = true)
    protected DynamischeVertrekStaatType dynamischeVertrekStaat;
    @XmlAttribute(name = "Versie")
    protected String versie;
    @XmlAttribute(name = "TimeStamp", required = true)
    protected XMLGregorianCalendar timeStamp;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the ripAdministratie property.
     * 
     * @return
     *     possible object is
     *     {@link ndov.cdm.trein.reisinformatie.data._2.RIPAdministratieType }
     *     
     */
    public RIPAdministratieType getRIPAdministratie() {
        return ripAdministratie;
    }

    /**
     * Sets the value of the ripAdministratie property.
     * 
     * @param value
     *     allowed object is
     *     {@link ndov.cdm.trein.reisinformatie.data._2.RIPAdministratieType }
     *     
     */
    public void setRIPAdministratie(RIPAdministratieType value) {
        this.ripAdministratie = value;
    }

    /**
     * Gets the value of the dynamischeVertrekStaat property.
     * 
     * @return
     *     possible object is
     *     {@link ndov.cdm.trein.reisinformatie.data._2.DynamischeVertrekStaatType }
     *     
     */
    public DynamischeVertrekStaatType getDynamischeVertrekStaat() {
        return dynamischeVertrekStaat;
    }

    /**
     * Sets the value of the dynamischeVertrekStaat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ndov.cdm.trein.reisinformatie.data._2.DynamischeVertrekStaatType }
     *     
     */
    public void setDynamischeVertrekStaat(DynamischeVertrekStaatType value) {
        this.dynamischeVertrekStaat = value;
    }

    /**
     * Gets the value of the versie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersie() {
        if (versie == null) {
            return "6.2";
        } else {
            return versie;
        }
    }

    /**
     * Sets the value of the versie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersie(String value) {
        this.versie = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}