//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.07 at 09:16:58 PM CEST 
//


package ndov.cdm.trein.reisinformatie.data._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReisTipCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReisTipCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STNS"/>
 *     &lt;enumeration value="STO"/>
 *     &lt;enumeration value="STVA"/>
 *     &lt;enumeration value="STNVA"/>
 *     &lt;enumeration value="STT"/>
 *     &lt;enumeration value="STNT"/>
 *     &lt;enumeration value="STAL"/>
 *     &lt;enumeration value="STN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReisTipCodeType")
@XmlEnum
public enum ReisTipCodeType {

    STNS,
    STO,
    STVA,
    STNVA,
    STT,
    STNT,
    STAL,
    STN;

    public String value() {
        return name();
    }

    public static ReisTipCodeType fromValue(String v) {
        return valueOf(v);
    }

}
