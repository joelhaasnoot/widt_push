//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.07 at 09:16:58 PM CEST 
//


package ndov.cdm.trein.reisinformatie.data._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Geeft een beschrijving van het station. Middels het InfoStatus attribuut wordt de actualiteitsstatus weergegeven (bijv. "Actueel"). 
 * 
 * <p>Java class for StationPlannedActueelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StationPlannedActueelType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ndov:cdm:trein:reisinformatie:data:2}StationType">
 *       &lt;attribute name="InfoStatus" use="required" type="{urn:ndov:cdm:trein:reisinformatie:data:2}infoStatus" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StationPlannedActueelType")
public class StationPlannedActueelType
    extends StationType
{

    @XmlAttribute(name = "InfoStatus", required = true)
    protected InfoStatus infoStatus;

    /**
     * Gets the value of the infoStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ndov.cdm.trein.reisinformatie.data._2.InfoStatus }
     *     
     */
    public InfoStatus getInfoStatus() {
        return infoStatus;
    }

    /**
     * Sets the value of the infoStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ndov.cdm.trein.reisinformatie.data._2.InfoStatus }
     *     
     */
    public void setInfoStatus(InfoStatus value) {
        this.infoStatus = value;
    }

}
