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
import javax.xml.datatype.Duration;
import org.w3c.dom.Element;


/**
 * Het element Trein bevat alle informatie op Treinniveau. Een trein is een (geplande/uitgevoerde) vervoersbeweging over spoorse infrastructuur met spoors materieel, aangeduid met een treinnummer.
 * 
 * <p>Java class for TreinType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TreinType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TreinNummer" type="{urn:ndov:cdm:trein:reisinformatie:data:2}treinnummer"/>
 *         &lt;element name="TreinNaam" type="{urn:ndov:cdm:trein:reisinformatie:data:2}TreinNaamType" minOccurs="0"/>
 *         &lt;element name="TreinSoort" type="{urn:ndov:cdm:trein:reisinformatie:data:2}TreinSoortType" minOccurs="0"/>
 *         &lt;element name="TreinFormule" type="{urn:ndov:cdm:trein:reisinformatie:data:2}TreinFormuleType" minOccurs="0"/>
 *         &lt;element name="TreinStatus" type="{urn:ndov:cdm:trein:reisinformatie:data:2}TreinStatusType" minOccurs="0"/>
 *         &lt;element name="LijnNummer" type="{urn:ndov:cdm:trein:reisinformatie:data:2}LijnNummerType" minOccurs="0"/>
 *         &lt;element name="Vervoerder" type="{urn:ndov:cdm:trein:reisinformatie:data:2}VervoerderType" minOccurs="0"/>
 *         &lt;element name="Reserveren" type="{urn:ndov:cdm:trein:reisinformatie:data:2}ReserverenType"/>
 *         &lt;element name="PresentatieReserveren" type="{urn:ndov:cdm:trein:reisinformatie:data:2}MeertaligeUitingenType" minOccurs="0"/>
 *         &lt;element name="Toeslag" type="{urn:ndov:cdm:trein:reisinformatie:data:2}ToeslagType"/>
 *         &lt;element name="PresentatieToeslag" type="{urn:ndov:cdm:trein:reisinformatie:data:2}MeertaligeUitingenType" minOccurs="0"/>
 *         &lt;element name="NietInstappen" type="{urn:ndov:cdm:trein:reisinformatie:data:2}NietInstappenType" minOccurs="0"/>
 *         &lt;element name="PresentatieNietInstappen" type="{urn:ndov:cdm:trein:reisinformatie:data:2}MeertaligeUitingenType" minOccurs="0"/>
 *         &lt;element name="AchterBlijvenAchtersteTreinDeel" type="{urn:ndov:cdm:trein:reisinformatie:data:2}AchterBlijvenAchtersteTreinDeelType"/>
 *         &lt;element name="RangeerBeweging" type="{urn:ndov:cdm:trein:reisinformatie:data:2}RangeerBewegingType"/>
 *         &lt;element name="SpeciaalKaartje" type="{urn:ndov:cdm:trein:reisinformatie:data:2}SpeciaalKaartjeType"/>
 *         &lt;element name="PresentatieSpeciaalKaartje" type="{urn:ndov:cdm:trein:reisinformatie:data:2}MeertaligeUitingenType" minOccurs="0"/>
 *         &lt;element name="InstapTip" type="{urn:ndov:cdm:trein:reisinformatie:data:2}InstapTipType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PresentatieInstapTip" type="{urn:ndov:cdm:trein:reisinformatie:data:2}MeertaligeUitingenType" minOccurs="0"/>
 *         &lt;element name="OverstapTip" type="{urn:ndov:cdm:trein:reisinformatie:data:2}OverstapTipType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PresentatieOverstapTip" type="{urn:ndov:cdm:trein:reisinformatie:data:2}MeertaligeUitingenType" minOccurs="0"/>
 *         &lt;element name="ReisTip" type="{urn:ndov:cdm:trein:reisinformatie:data:2}ReisTipType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PresentatieReisTip" type="{urn:ndov:cdm:trein:reisinformatie:data:2}MeertaligeUitingenType" minOccurs="0"/>
 *         &lt;element name="TreinEindBestemming" type="{urn:ndov:cdm:trein:reisinformatie:data:2}StationPlannedActueelType" maxOccurs="unbounded" minOccurs="2"/>
 *         &lt;element name="PresentatieTreinEindBestemming" type="{urn:ndov:cdm:trein:reisinformatie:data:2}MeertaligeUitingenType" minOccurs="0"/>
 *         &lt;element name="VertrekTijd" type="{urn:ndov:cdm:trein:reisinformatie:data:2}AankomstOfVertrekTijdType" maxOccurs="2" minOccurs="2"/>
 *         &lt;element name="ExacteVertrekVertraging" type="{urn:ndov:cdm:trein:reisinformatie:data:2}ExacteVertragingType"/>
 *         &lt;element name="PresentatieVertrekVertraging" type="{urn:ndov:cdm:trein:reisinformatie:data:2}MeertaligeUitingenType" minOccurs="0"/>
 *         &lt;element name="GedempteVertrekVertraging" type="{urn:ndov:cdm:trein:reisinformatie:data:2}GedempteVertragingType"/>
 *         &lt;element name="TreinVertrekSpoor" type="{urn:ndov:cdm:trein:reisinformatie:data:2}SpoorPlannedActueelType" maxOccurs="4" minOccurs="2"/>
 *         &lt;element name="PresentatieTreinVertrekSpoor" type="{urn:ndov:cdm:trein:reisinformatie:data:2}MeertaligeUitingenType" minOccurs="0"/>
 *         &lt;element name="VertrekRichting" type="{urn:ndov:cdm:trein:reisinformatie:data:2}VertrekRichtingType"/>
 *         &lt;element name="AfstandPerronEindKopVertrekTrein" type="{urn:ndov:cdm:trein:reisinformatie:data:2}AfstandPerronEindKopVertrekTreinType"/>
 *         &lt;element name="VerkorteRoute" type="{urn:ndov:cdm:trein:reisinformatie:data:2}VerkorteRouteType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="PresentatieVerkorteRoute" type="{urn:ndov:cdm:trein:reisinformatie:data:2}MeertaligeUitingenType" minOccurs="0"/>
 *         &lt;element name="TreinVleugel" type="{urn:ndov:cdm:trein:reisinformatie:data:2}TreinVleugelType" maxOccurs="unbounded"/>
 *         &lt;element name="VertrekPositieKop" type="{urn:ndov:cdm:trein:reisinformatie:data:2}VertrekPositieKopType" minOccurs="0"/>
 *         &lt;element name="TreinNummer2Treinen1Fase" type="{urn:ndov:cdm:trein:reisinformatie:data:2}treinnummer" minOccurs="0"/>
 *         &lt;element name="Wijziging" type="{urn:ndov:cdm:trein:reisinformatie:data:2}WijzigingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PresentatieWijziging" type="{urn:ndov:cdm:trein:reisinformatie:data:2}MeertaligeUitingenType" minOccurs="0"/>
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
@XmlType(name = "TreinType", propOrder = {
    "treinNummer",
    "treinNaam",
    "treinSoort",
    "treinFormule",
    "treinStatus",
    "lijnNummer",
    "vervoerder",
    "reserveren",
    "presentatieReserveren",
    "toeslag",
    "presentatieToeslag",
    "nietInstappen",
    "presentatieNietInstappen",
    "achterBlijvenAchtersteTreinDeel",
    "rangeerBeweging",
    "speciaalKaartje",
    "presentatieSpeciaalKaartje",
    "instapTip",
    "presentatieInstapTip",
    "overstapTip",
    "presentatieOverstapTip",
    "reisTip",
    "presentatieReisTip",
    "treinEindBestemming",
    "presentatieTreinEindBestemming",
    "vertrekTijd",
    "exacteVertrekVertraging",
    "presentatieVertrekVertraging",
    "gedempteVertrekVertraging",
    "treinVertrekSpoor",
    "presentatieTreinVertrekSpoor",
    "vertrekRichting",
    "afstandPerronEindKopVertrekTrein",
    "verkorteRoute",
    "presentatieVerkorteRoute",
    "treinVleugel",
    "vertrekPositieKop",
    "treinNummer2Treinen1Fase",
    "wijziging",
    "presentatieWijziging",
    "any"
})
public class TreinType {

    @XmlElement(name = "TreinNummer")
    protected int treinNummer;
    @XmlElement(name = "TreinNaam")
    protected String treinNaam;
    @XmlElement(name = "TreinSoort")
    protected TreinSoortType treinSoort;
    @XmlElement(name = "TreinFormule")
    protected BigInteger treinFormule;
    @XmlElement(name = "TreinStatus")
    protected String treinStatus;
    @XmlElement(name = "LijnNummer")
    protected String lijnNummer;
    @XmlElement(name = "Vervoerder")
    protected String vervoerder;
    @XmlElement(name = "Reserveren", required = true)
    protected Indicatie reserveren;
    @XmlElement(name = "PresentatieReserveren")
    protected MeertaligeUitingenType presentatieReserveren;
    @XmlElement(name = "Toeslag", required = true)
    protected Indicatie toeslag;
    @XmlElement(name = "PresentatieToeslag")
    protected MeertaligeUitingenType presentatieToeslag;
    @XmlElement(name = "NietInstappen")
    protected NietInstappenType nietInstappen;
    @XmlElement(name = "PresentatieNietInstappen")
    protected MeertaligeUitingenType presentatieNietInstappen;
    @XmlElement(name = "AchterBlijvenAchtersteTreinDeel", required = true)
    protected Indicatie achterBlijvenAchtersteTreinDeel;
    @XmlElement(name = "RangeerBeweging", required = true)
    protected Indicatie rangeerBeweging;
    @XmlElement(name = "SpeciaalKaartje", required = true)
    protected Indicatie speciaalKaartje;
    @XmlElement(name = "PresentatieSpeciaalKaartje")
    protected MeertaligeUitingenType presentatieSpeciaalKaartje;
    @XmlElement(name = "InstapTip")
    protected List<InstapTipType> instapTip;
    @XmlElement(name = "PresentatieInstapTip")
    protected MeertaligeUitingenType presentatieInstapTip;
    @XmlElement(name = "OverstapTip")
    protected List<OverstapTipType> overstapTip;
    @XmlElement(name = "PresentatieOverstapTip")
    protected MeertaligeUitingenType presentatieOverstapTip;
    @XmlElement(name = "ReisTip")
    protected List<ReisTipType> reisTip;
    @XmlElement(name = "PresentatieReisTip")
    protected MeertaligeUitingenType presentatieReisTip;
    @XmlElement(name = "TreinEindBestemming", required = true)
    protected List<StationPlannedActueelType> treinEindBestemming;
    @XmlElement(name = "PresentatieTreinEindBestemming")
    protected MeertaligeUitingenType presentatieTreinEindBestemming;
    @XmlElement(name = "VertrekTijd", required = true)
    protected List<AankomstOfVertrekTijdType> vertrekTijd;
    @XmlElement(name = "ExacteVertrekVertraging", required = true)
    protected Duration exacteVertrekVertraging;
    @XmlElement(name = "PresentatieVertrekVertraging")
    protected MeertaligeUitingenType presentatieVertrekVertraging;
    @XmlElement(name = "GedempteVertrekVertraging", required = true)
    protected Duration gedempteVertrekVertraging;
    @XmlElement(name = "TreinVertrekSpoor", required = true)
    protected List<SpoorPlannedActueelType> treinVertrekSpoor;
    @XmlElement(name = "PresentatieTreinVertrekSpoor")
    protected MeertaligeUitingenType presentatieTreinVertrekSpoor;
    @XmlElement(name = "VertrekRichting", required = true)
    protected VertrekRichtingType vertrekRichting;
    @XmlElement(name = "AfstandPerronEindKopVertrekTrein", required = true)
    protected BigInteger afstandPerronEindKopVertrekTrein;
    @XmlElement(name = "VerkorteRoute")
    protected List<VerkorteRouteType> verkorteRoute;
    @XmlElement(name = "PresentatieVerkorteRoute")
    protected MeertaligeUitingenType presentatieVerkorteRoute;
    @XmlElement(name = "TreinVleugel", required = true)
    protected List<TreinVleugelType> treinVleugel;
    @XmlElement(name = "VertrekPositieKop")
    protected BigInteger vertrekPositieKop;
    @XmlElement(name = "TreinNummer2Treinen1Fase")
    protected Integer treinNummer2Treinen1Fase;
    @XmlElement(name = "Wijziging")
    protected List<WijzigingType> wijziging;
    @XmlElement(name = "PresentatieWijziging")
    protected MeertaligeUitingenType presentatieWijziging;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the treinNummer property.
     * 
     */
    public int getTreinNummer() {
        return treinNummer;
    }

    /**
     * Sets the value of the treinNummer property.
     * 
     */
    public void setTreinNummer(int value) {
        this.treinNummer = value;
    }

    /**
     * Gets the value of the treinNaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreinNaam() {
        return treinNaam;
    }

    /**
     * Sets the value of the treinNaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreinNaam(String value) {
        this.treinNaam = value;
    }

    /**
     * Gets the value of the treinSoort property.
     * 
     * @return
     *     possible object is
     *     {@link TreinSoortType }
     *     
     */
    public TreinSoortType getTreinSoort() {
        return treinSoort;
    }

    /**
     * Sets the value of the treinSoort property.
     * 
     * @param value
     *     allowed object is
     *     {@link TreinSoortType }
     *     
     */
    public void setTreinSoort(TreinSoortType value) {
        this.treinSoort = value;
    }

    /**
     * Gets the value of the treinFormule property.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigInteger }
     *     
     */
    public BigInteger getTreinFormule() {
        return treinFormule;
    }

    /**
     * Sets the value of the treinFormule property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigInteger }
     *     
     */
    public void setTreinFormule(BigInteger value) {
        this.treinFormule = value;
    }

    /**
     * Gets the value of the treinStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreinStatus() {
        return treinStatus;
    }

    /**
     * Sets the value of the treinStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreinStatus(String value) {
        this.treinStatus = value;
    }

    /**
     * Gets the value of the lijnNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLijnNummer() {
        return lijnNummer;
    }

    /**
     * Sets the value of the lijnNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLijnNummer(String value) {
        this.lijnNummer = value;
    }

    /**
     * Gets the value of the vervoerder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVervoerder() {
        return vervoerder;
    }

    /**
     * Sets the value of the vervoerder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVervoerder(String value) {
        this.vervoerder = value;
    }

    /**
     * Gets the value of the reserveren property.
     * 
     * @return
     *     possible object is
     *     {@link ndov.cdm.trein.reisinformatie.data._2.Indicatie }
     *     
     */
    public Indicatie getReserveren() {
        return reserveren;
    }

    /**
     * Sets the value of the reserveren property.
     * 
     * @param value
     *     allowed object is
     *     {@link ndov.cdm.trein.reisinformatie.data._2.Indicatie }
     *     
     */
    public void setReserveren(Indicatie value) {
        this.reserveren = value;
    }

    /**
     * Gets the value of the presentatieReserveren property.
     * 
     * @return
     *     possible object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public MeertaligeUitingenType getPresentatieReserveren() {
        return presentatieReserveren;
    }

    /**
     * Sets the value of the presentatieReserveren property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public void setPresentatieReserveren(MeertaligeUitingenType value) {
        this.presentatieReserveren = value;
    }

    /**
     * Gets the value of the toeslag property.
     * 
     * @return
     *     possible object is
     *     {@link ndov.cdm.trein.reisinformatie.data._2.Indicatie }
     *     
     */
    public Indicatie getToeslag() {
        return toeslag;
    }

    /**
     * Sets the value of the toeslag property.
     * 
     * @param value
     *     allowed object is
     *     {@link ndov.cdm.trein.reisinformatie.data._2.Indicatie }
     *     
     */
    public void setToeslag(Indicatie value) {
        this.toeslag = value;
    }

    /**
     * Gets the value of the presentatieToeslag property.
     * 
     * @return
     *     possible object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public MeertaligeUitingenType getPresentatieToeslag() {
        return presentatieToeslag;
    }

    /**
     * Sets the value of the presentatieToeslag property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public void setPresentatieToeslag(MeertaligeUitingenType value) {
        this.presentatieToeslag = value;
    }

    /**
     * Gets the value of the nietInstappen property.
     * 
     * @return
     *     possible object is
     *     {@link NietInstappenType }
     *     
     */
    public NietInstappenType getNietInstappen() {
        return nietInstappen;
    }

    /**
     * Sets the value of the nietInstappen property.
     * 
     * @param value
     *     allowed object is
     *     {@link NietInstappenType }
     *     
     */
    public void setNietInstappen(NietInstappenType value) {
        this.nietInstappen = value;
    }

    /**
     * Gets the value of the presentatieNietInstappen property.
     * 
     * @return
     *     possible object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public MeertaligeUitingenType getPresentatieNietInstappen() {
        return presentatieNietInstappen;
    }

    /**
     * Sets the value of the presentatieNietInstappen property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public void setPresentatieNietInstappen(MeertaligeUitingenType value) {
        this.presentatieNietInstappen = value;
    }

    /**
     * Gets the value of the achterBlijvenAchtersteTreinDeel property.
     * 
     * @return
     *     possible object is
     *     {@link ndov.cdm.trein.reisinformatie.data._2.Indicatie }
     *     
     */
    public Indicatie getAchterBlijvenAchtersteTreinDeel() {
        return achterBlijvenAchtersteTreinDeel;
    }

    /**
     * Sets the value of the achterBlijvenAchtersteTreinDeel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ndov.cdm.trein.reisinformatie.data._2.Indicatie }
     *     
     */
    public void setAchterBlijvenAchtersteTreinDeel(Indicatie value) {
        this.achterBlijvenAchtersteTreinDeel = value;
    }

    /**
     * Gets the value of the rangeerBeweging property.
     * 
     * @return
     *     possible object is
     *     {@link ndov.cdm.trein.reisinformatie.data._2.Indicatie }
     *     
     */
    public Indicatie getRangeerBeweging() {
        return rangeerBeweging;
    }

    /**
     * Sets the value of the rangeerBeweging property.
     * 
     * @param value
     *     allowed object is
     *     {@link ndov.cdm.trein.reisinformatie.data._2.Indicatie }
     *     
     */
    public void setRangeerBeweging(Indicatie value) {
        this.rangeerBeweging = value;
    }

    /**
     * Gets the value of the speciaalKaartje property.
     * 
     * @return
     *     possible object is
     *     {@link ndov.cdm.trein.reisinformatie.data._2.Indicatie }
     *     
     */
    public Indicatie getSpeciaalKaartje() {
        return speciaalKaartje;
    }

    /**
     * Sets the value of the speciaalKaartje property.
     * 
     * @param value
     *     allowed object is
     *     {@link ndov.cdm.trein.reisinformatie.data._2.Indicatie }
     *     
     */
    public void setSpeciaalKaartje(Indicatie value) {
        this.speciaalKaartje = value;
    }

    /**
     * Gets the value of the presentatieSpeciaalKaartje property.
     * 
     * @return
     *     possible object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public MeertaligeUitingenType getPresentatieSpeciaalKaartje() {
        return presentatieSpeciaalKaartje;
    }

    /**
     * Sets the value of the presentatieSpeciaalKaartje property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public void setPresentatieSpeciaalKaartje(MeertaligeUitingenType value) {
        this.presentatieSpeciaalKaartje = value;
    }

    /**
     * Gets the value of the instapTip property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instapTip property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstapTip().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstapTipType }
     * 
     * 
     */
    public List<InstapTipType> getInstapTip() {
        if (instapTip == null) {
            instapTip = new ArrayList<InstapTipType>();
        }
        return this.instapTip;
    }

    /**
     * Gets the value of the presentatieInstapTip property.
     * 
     * @return
     *     possible object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public MeertaligeUitingenType getPresentatieInstapTip() {
        return presentatieInstapTip;
    }

    /**
     * Sets the value of the presentatieInstapTip property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public void setPresentatieInstapTip(MeertaligeUitingenType value) {
        this.presentatieInstapTip = value;
    }

    /**
     * Gets the value of the overstapTip property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overstapTip property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverstapTip().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OverstapTipType }
     * 
     * 
     */
    public List<OverstapTipType> getOverstapTip() {
        if (overstapTip == null) {
            overstapTip = new ArrayList<OverstapTipType>();
        }
        return this.overstapTip;
    }

    /**
     * Gets the value of the presentatieOverstapTip property.
     * 
     * @return
     *     possible object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public MeertaligeUitingenType getPresentatieOverstapTip() {
        return presentatieOverstapTip;
    }

    /**
     * Sets the value of the presentatieOverstapTip property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public void setPresentatieOverstapTip(MeertaligeUitingenType value) {
        this.presentatieOverstapTip = value;
    }

    /**
     * Gets the value of the reisTip property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reisTip property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReisTip().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReisTipType }
     * 
     * 
     */
    public List<ReisTipType> getReisTip() {
        if (reisTip == null) {
            reisTip = new ArrayList<ReisTipType>();
        }
        return this.reisTip;
    }

    /**
     * Gets the value of the presentatieReisTip property.
     * 
     * @return
     *     possible object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public MeertaligeUitingenType getPresentatieReisTip() {
        return presentatieReisTip;
    }

    /**
     * Sets the value of the presentatieReisTip property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public void setPresentatieReisTip(MeertaligeUitingenType value) {
        this.presentatieReisTip = value;
    }

    /**
     * Gets the value of the treinEindBestemming property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the treinEindBestemming property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTreinEindBestemming().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StationPlannedActueelType }
     * 
     * 
     */
    public List<StationPlannedActueelType> getTreinEindBestemming() {
        if (treinEindBestemming == null) {
            treinEindBestemming = new ArrayList<StationPlannedActueelType>();
        }
        return this.treinEindBestemming;
    }

    /**
     * Gets the value of the presentatieTreinEindBestemming property.
     * 
     * @return
     *     possible object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public MeertaligeUitingenType getPresentatieTreinEindBestemming() {
        return presentatieTreinEindBestemming;
    }

    /**
     * Sets the value of the presentatieTreinEindBestemming property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public void setPresentatieTreinEindBestemming(MeertaligeUitingenType value) {
        this.presentatieTreinEindBestemming = value;
    }

    /**
     * Gets the value of the vertrekTijd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vertrekTijd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVertrekTijd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AankomstOfVertrekTijdType }
     * 
     * 
     */
    public List<AankomstOfVertrekTijdType> getVertrekTijd() {
        if (vertrekTijd == null) {
            vertrekTijd = new ArrayList<AankomstOfVertrekTijdType>();
        }
        return this.vertrekTijd;
    }

    /**
     * Gets the value of the exacteVertrekVertraging property.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.Duration }
     *     
     */
    public Duration getExacteVertrekVertraging() {
        return exacteVertrekVertraging;
    }

    /**
     * Sets the value of the exacteVertrekVertraging property.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.Duration }
     *     
     */
    public void setExacteVertrekVertraging(Duration value) {
        this.exacteVertrekVertraging = value;
    }

    /**
     * Gets the value of the presentatieVertrekVertraging property.
     * 
     * @return
     *     possible object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public MeertaligeUitingenType getPresentatieVertrekVertraging() {
        return presentatieVertrekVertraging;
    }

    /**
     * Sets the value of the presentatieVertrekVertraging property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public void setPresentatieVertrekVertraging(MeertaligeUitingenType value) {
        this.presentatieVertrekVertraging = value;
    }

    /**
     * Gets the value of the gedempteVertrekVertraging property.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.Duration }
     *     
     */
    public Duration getGedempteVertrekVertraging() {
        return gedempteVertrekVertraging;
    }

    /**
     * Sets the value of the gedempteVertrekVertraging property.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.Duration }
     *     
     */
    public void setGedempteVertrekVertraging(Duration value) {
        this.gedempteVertrekVertraging = value;
    }

    /**
     * Gets the value of the treinVertrekSpoor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the treinVertrekSpoor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTreinVertrekSpoor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpoorPlannedActueelType }
     * 
     * 
     */
    public List<SpoorPlannedActueelType> getTreinVertrekSpoor() {
        if (treinVertrekSpoor == null) {
            treinVertrekSpoor = new ArrayList<SpoorPlannedActueelType>();
        }
        return this.treinVertrekSpoor;
    }

    /**
     * Gets the value of the presentatieTreinVertrekSpoor property.
     * 
     * @return
     *     possible object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public MeertaligeUitingenType getPresentatieTreinVertrekSpoor() {
        return presentatieTreinVertrekSpoor;
    }

    /**
     * Sets the value of the presentatieTreinVertrekSpoor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public void setPresentatieTreinVertrekSpoor(MeertaligeUitingenType value) {
        this.presentatieTreinVertrekSpoor = value;
    }

    /**
     * Gets the value of the vertrekRichting property.
     * 
     * @return
     *     possible object is
     *     {@link VertrekRichtingType }
     *     
     */
    public VertrekRichtingType getVertrekRichting() {
        return vertrekRichting;
    }

    /**
     * Sets the value of the vertrekRichting property.
     * 
     * @param value
     *     allowed object is
     *     {@link VertrekRichtingType }
     *     
     */
    public void setVertrekRichting(VertrekRichtingType value) {
        this.vertrekRichting = value;
    }

    /**
     * Gets the value of the afstandPerronEindKopVertrekTrein property.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigInteger }
     *     
     */
    public BigInteger getAfstandPerronEindKopVertrekTrein() {
        return afstandPerronEindKopVertrekTrein;
    }

    /**
     * Sets the value of the afstandPerronEindKopVertrekTrein property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigInteger }
     *     
     */
    public void setAfstandPerronEindKopVertrekTrein(BigInteger value) {
        this.afstandPerronEindKopVertrekTrein = value;
    }

    /**
     * Gets the value of the verkorteRoute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verkorteRoute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerkorteRoute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerkorteRouteType }
     * 
     * 
     */
    public List<VerkorteRouteType> getVerkorteRoute() {
        if (verkorteRoute == null) {
            verkorteRoute = new ArrayList<VerkorteRouteType>();
        }
        return this.verkorteRoute;
    }

    /**
     * Gets the value of the presentatieVerkorteRoute property.
     * 
     * @return
     *     possible object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public MeertaligeUitingenType getPresentatieVerkorteRoute() {
        return presentatieVerkorteRoute;
    }

    /**
     * Sets the value of the presentatieVerkorteRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public void setPresentatieVerkorteRoute(MeertaligeUitingenType value) {
        this.presentatieVerkorteRoute = value;
    }

    /**
     * Gets the value of the treinVleugel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the treinVleugel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTreinVleugel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TreinVleugelType }
     * 
     * 
     */
    public List<TreinVleugelType> getTreinVleugel() {
        if (treinVleugel == null) {
            treinVleugel = new ArrayList<TreinVleugelType>();
        }
        return this.treinVleugel;
    }

    /**
     * Gets the value of the vertrekPositieKop property.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigInteger }
     *     
     */
    public BigInteger getVertrekPositieKop() {
        return vertrekPositieKop;
    }

    /**
     * Sets the value of the vertrekPositieKop property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigInteger }
     *     
     */
    public void setVertrekPositieKop(BigInteger value) {
        this.vertrekPositieKop = value;
    }

    /**
     * Gets the value of the treinNummer2Treinen1Fase property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTreinNummer2Treinen1Fase() {
        return treinNummer2Treinen1Fase;
    }

    /**
     * Sets the value of the treinNummer2Treinen1Fase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTreinNummer2Treinen1Fase(Integer value) {
        this.treinNummer2Treinen1Fase = value;
    }

    /**
     * Gets the value of the wijziging property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wijziging property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWijziging().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WijzigingType }
     * 
     * 
     */
    public List<WijzigingType> getWijziging() {
        if (wijziging == null) {
            wijziging = new ArrayList<WijzigingType>();
        }
        return this.wijziging;
    }

    /**
     * Gets the value of the presentatieWijziging property.
     * 
     * @return
     *     possible object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public MeertaligeUitingenType getPresentatieWijziging() {
        return presentatieWijziging;
    }

    /**
     * Sets the value of the presentatieWijziging property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeertaligeUitingenType }
     *     
     */
    public void setPresentatieWijziging(MeertaligeUitingenType value) {
        this.presentatieWijziging = value;
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
