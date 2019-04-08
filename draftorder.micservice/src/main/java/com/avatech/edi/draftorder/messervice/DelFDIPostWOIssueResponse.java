
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
 *         &lt;element name="DelFDIPostWOIssueResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "delFDIPostWOIssueResult"
})
@XmlRootElement(name = "DelFDIPostWOIssueResponse")
public class DelFDIPostWOIssueResponse {

    @XmlElement(name = "DelFDIPostWOIssueResult")
    protected boolean delFDIPostWOIssueResult;

    /**
     * 获取delFDIPostWOIssueResult属性的值。
     * 
     */
    public boolean isDelFDIPostWOIssueResult() {
        return delFDIPostWOIssueResult;
    }

    /**
     * 设置delFDIPostWOIssueResult属性的值。
     * 
     */
    public void setDelFDIPostWOIssueResult(boolean value) {
        this.delFDIPostWOIssueResult = value;
    }

}
