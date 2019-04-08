
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
 *         &lt;element name="GetFDIPostWOIssueDetailByIdResult" type="{http://fanuc.com.cn/}FDIPostWOIssueDetail" minOccurs="0"/>
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
    "getFDIPostWOIssueDetailByIdResult"
})
@XmlRootElement(name = "GetFDIPostWOIssueDetailByIdResponse")
public class GetFDIPostWOIssueDetailByIdResponse {

    @XmlElement(name = "GetFDIPostWOIssueDetailByIdResult")
    protected FDIPostWOIssueDetail getFDIPostWOIssueDetailByIdResult;

    /**
     * 获取getFDIPostWOIssueDetailByIdResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FDIPostWOIssueDetail }
     *     
     */
    public FDIPostWOIssueDetail getGetFDIPostWOIssueDetailByIdResult() {
        return getFDIPostWOIssueDetailByIdResult;
    }

    /**
     * 设置getFDIPostWOIssueDetailByIdResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FDIPostWOIssueDetail }
     *     
     */
    public void setGetFDIPostWOIssueDetailByIdResult(FDIPostWOIssueDetail value) {
        this.getFDIPostWOIssueDetailByIdResult = value;
    }

}
