//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.02 at 05:29:10 PM CET 
//


package com.opnfi.risk.model.jaxb;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * PartyRiskLimitsDefinitionRequestAck can be found in Volume 3 of the
 * 						specification
 * 
 * <p>Java class for PartyRiskLimitsDefinitionRequestAck_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyRiskLimitsDefinitionRequestAck_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{}PartyRiskLimitsDefinitionRequestAckElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}PartyRiskLimitsDefinitionRequestAckAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyRiskLimitsDefinitionRequestAck_message_t", propOrder = {
    "reqPty",
    "ptyRiskLmtAck"
})
public class PartyRiskLimitsDefinitionRequestAckMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "ReqPty")
    protected List<RequestingPartyGrpBlockT> reqPty;
    @XmlElement(name = "PtyRiskLmtAck")
    protected List<PartyRiskLimitsAckGrpBlockT> ptyRiskLmtAck;
    @XmlAttribute(name = "ReqID", required = true)
    protected String reqID;
    @XmlAttribute(name = "ReqRslt")
    protected String reqRslt;
    @XmlAttribute(name = "ReqStat", required = true)
    protected BigInteger reqStat;
    @XmlAttribute(name = "Txt")
    protected String txt;

    /**
     * Gets the value of the reqPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reqPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReqPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestingPartyGrpBlockT }
     * 
     * 
     */
    public List<RequestingPartyGrpBlockT> getReqPty() {
        if (reqPty == null) {
            reqPty = new ArrayList<RequestingPartyGrpBlockT>();
        }
        return this.reqPty;
    }

    /**
     * Gets the value of the ptyRiskLmtAck property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ptyRiskLmtAck property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPtyRiskLmtAck().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyRiskLimitsAckGrpBlockT }
     * 
     * 
     */
    public List<PartyRiskLimitsAckGrpBlockT> getPtyRiskLmtAck() {
        if (ptyRiskLmtAck == null) {
            ptyRiskLmtAck = new ArrayList<PartyRiskLimitsAckGrpBlockT>();
        }
        return this.ptyRiskLmtAck;
    }

    /**
     * Gets the value of the reqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqID() {
        return reqID;
    }

    /**
     * Sets the value of the reqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqID(String value) {
        this.reqID = value;
    }

    /**
     * Gets the value of the reqRslt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqRslt() {
        return reqRslt;
    }

    /**
     * Sets the value of the reqRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqRslt(String value) {
        this.reqRslt = value;
    }

    /**
     * Gets the value of the reqStat property.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigInteger }
     *
     */
    public BigInteger getReqStat() {
        return reqStat;
    }

    /**
     * Sets the value of the reqStat property.
     *
     * @param value
     *     allowed object is
     *     {@link java.math.BigInteger }
     *     
     */
    public void setReqStat(BigInteger value) {
        this.reqStat = value;
    }

    /**
     * Gets the value of the txt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxt() {
        return txt;
    }

    /**
     * Sets the value of the txt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxt(String value) {
        this.txt = value;
    }

}