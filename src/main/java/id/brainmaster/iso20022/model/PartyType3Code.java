
package id.brainmaster.iso20022.model;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PartyType3Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OPOI"/>
 *     &lt;enumeration value="MERC"/>
 *     &lt;enumeration value="ACCP"/>
 *     &lt;enumeration value="ITAG"/>
 *     &lt;enumeration value="ACQR"/>
 *     &lt;enumeration value="CISS"/>
 *     &lt;enumeration value="DLIS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PartyType3Code", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-06-01T07:49:03+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum PartyType3Code {

    OPOI,
    MERC,
    ACCP,
    ITAG,
    ACQR,
    CISS,
    DLIS;

    public String value() {
        return name();
    }

    public static PartyType3Code fromValue(String v) {
        return valueOf(v);
    }

}