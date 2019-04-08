
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
 *         &lt;element name="GetFDIPostWOIssueByPageResult" type="{http://fanuc.com.cn/}ArrayOfFDIPostWOIssue" minOccurs="0"/>
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
    "getFDIPostWOIssueByPageResult"
})
@XmlRootElement(name = "GetFDIPostWOIssueByPageResponse")
public class GetFDIPostWOIssueByPageResponse {

    @XmlElement(name = "GetFDIPostWOIssueByPageResult")
    protected ArrayOfFDIPostWOIssue getFDIPostWOIssueByPageResult;

    /**
     * 获取getFDIPostWOIssueByPageResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFDIPostWOIssue }
     *     
     */
    public ArrayOfFDIPostWOIssue getGetFDIPostWOIssueByPageResult() {
        return getFDIPostWOIssueByPageResult;
    }

    /**
     * 设置getFDIPostWOIssueByPageResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFDIPostWOIssue }
     *     
     */
    public void setGetFDIPostWOIssueByPageResult(ArrayOfFDIPostWOIssue value) {
        this.getFDIPostWOIssueByPageResult = value;
    }

}
