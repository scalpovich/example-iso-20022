
package id.brainmaster.iso20022.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StructuredRegulatoryReporting3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredRegulatoryReporting3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.07}Max35Text" minOccurs="0"/>
 *         &lt;element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.07}ISODate" minOccurs="0"/>
 *         &lt;element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.07}CountryCode" minOccurs="0"/>
 *         &lt;element name="Cd" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.07}Max10Text" minOccurs="0"/>
 *         &lt;element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.07}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="Inf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.07}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredRegulatoryReporting3", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.07", propOrder = {
    "tp",
    "dt",
    "ctry",
    "cd",
    "amt",
    "inf"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class StructuredRegulatoryReporting3 {

    @XmlElement(name = "Tp", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.07")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String tp;
    @XmlElement(name = "Dt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.07")
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "Ctry", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.07")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String ctry;
    @XmlElement(name = "Cd", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.07")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String cd;
    @XmlElement(name = "Amt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.07")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected ActiveOrHistoricCurrencyAndAmount amt;
    @XmlElement(name = "Inf", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.07")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<String> inf;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTp(String value) {
        this.tp = value;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDt(XMLGregorianCalendar value) {
        this.dt = value;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCtry(String value) {
        this.ctry = value;
    }

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCd(String value) {
        this.cd = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public ActiveOrHistoricCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.amt = value;
    }

    /**
     * Gets the value of the inf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<String> getInf() {
        if (inf == null) {
            inf = new ArrayList<String>();
        }
        return this.inf;
    }

}
