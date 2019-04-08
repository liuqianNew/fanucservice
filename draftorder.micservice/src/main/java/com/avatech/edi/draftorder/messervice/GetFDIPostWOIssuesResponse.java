
package com.avatech.edi.draftorder.messervice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetFDIPostWOIssuesResult" type="{http://fanuc.com.cn/}ArrayOfFDIPostWOIssue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getFDIPostWOIssuesResult"
})
@XmlRootElement(name = "GetFDIPostWOIssuesResponse")
public class GetFDIPostWOIssuesResponse {

    @XmlElement(name = "GetFDIPostWOIssuesResult")
    protected ArrayOfFDIPostWOIssue getFDIPostWOIssuesResult;

    /**
     * 获取getFDIPostWOIssuesResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFDIPostWOIssue }
     *     
     */
    public ArrayOfFDIPostWOIssue getGetFDIPostWOIssuesResult() {
        return getFDIPostWOIssuesResult;
    }

    /**
     * 设置getFDIPostWOIssuesResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFDIPostWOIssue }
     *     
     */
    public void setGetFDIPostWOIssuesResult(ArrayOfFDIPostWOIssue value) {
        this.getFDIPostWOIssuesResult = value;
    }

}
