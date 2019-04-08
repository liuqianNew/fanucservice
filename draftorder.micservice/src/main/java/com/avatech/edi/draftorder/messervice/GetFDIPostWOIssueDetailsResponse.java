
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
 *         &lt;element name="GetFDIPostWOIssueDetailsResult" type="{http://fanuc.com.cn/}ArrayOfFDIPostWOIssueDetail" minOccurs="0"/>
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
    "getFDIPostWOIssueDetailsResult"
})
@XmlRootElement(name = "GetFDIPostWOIssueDetailsResponse")
public class GetFDIPostWOIssueDetailsResponse {

    @XmlElement(name = "GetFDIPostWOIssueDetailsResult")
    protected ArrayOfFDIPostWOIssueDetail getFDIPostWOIssueDetailsResult;

    /**
     * 获取getFDIPostWOIssueDetailsResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFDIPostWOIssueDetail }
     *     
     */
    public ArrayOfFDIPostWOIssueDetail getGetFDIPostWOIssueDetailsResult() {
        return getFDIPostWOIssueDetailsResult;
    }

    /**
     * 设置getFDIPostWOIssueDetailsResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFDIPostWOIssueDetail }
     *     
     */
    public void setGetFDIPostWOIssueDetailsResult(ArrayOfFDIPostWOIssueDetail value) {
        this.getFDIPostWOIssueDetailsResult = value;
    }

}
