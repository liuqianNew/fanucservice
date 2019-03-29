
package com.avatech.edi.material.messervice;

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
 *         &lt;element name="GetFDIPostWOIssueDetailCountResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "getFDIPostWOIssueDetailCountResult"
})
@XmlRootElement(name = "GetFDIPostWOIssueDetailCountResponse")
public class GetFDIPostWOIssueDetailCountResponse {

    @XmlElement(name = "GetFDIPostWOIssueDetailCountResult")
    protected int getFDIPostWOIssueDetailCountResult;

    /**
     * 获取getFDIPostWOIssueDetailCountResult属性的值。
     * 
     */
    public int getGetFDIPostWOIssueDetailCountResult() {
        return getFDIPostWOIssueDetailCountResult;
    }

    /**
     * 设置getFDIPostWOIssueDetailCountResult属性的值。
     * 
     */
    public void setGetFDIPostWOIssueDetailCountResult(int value) {
        this.getFDIPostWOIssueDetailCountResult = value;
    }

}
