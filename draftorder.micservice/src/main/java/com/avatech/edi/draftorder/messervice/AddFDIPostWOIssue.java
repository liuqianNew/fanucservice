
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
 *         &lt;element name="mFDIPostWOIssue" type="{http://fanuc.com.cn/}FDIPostWOIssue" minOccurs="0"/>
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
    "mfdiPostWOIssue"
})
@XmlRootElement(name = "AddFDIPostWOIssue")
public class AddFDIPostWOIssue {

    @XmlElement(name = "mFDIPostWOIssue")
    protected FDIPostWOIssue mfdiPostWOIssue;

    /**
     * 获取mfdiPostWOIssue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FDIPostWOIssue }
     *     
     */
    public FDIPostWOIssue getMFDIPostWOIssue() {
        return mfdiPostWOIssue;
    }

    /**
     * 设置mfdiPostWOIssue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FDIPostWOIssue }
     *     
     */
    public void setMFDIPostWOIssue(FDIPostWOIssue value) {
        this.mfdiPostWOIssue = value;
    }

}
