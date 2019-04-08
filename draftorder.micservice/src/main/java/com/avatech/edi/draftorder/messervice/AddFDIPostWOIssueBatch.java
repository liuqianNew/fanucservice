
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
 *         &lt;element name="mFDIPostWOIssueBatch" type="{http://fanuc.com.cn/}FDIPostWOIssueBatch" minOccurs="0"/>
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
    "mfdiPostWOIssueBatch"
})
@XmlRootElement(name = "AddFDIPostWOIssueBatch")
public class AddFDIPostWOIssueBatch {

    @XmlElement(name = "mFDIPostWOIssueBatch")
    protected FDIPostWOIssueBatch mfdiPostWOIssueBatch;

    /**
     * 获取mfdiPostWOIssueBatch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FDIPostWOIssueBatch }
     *     
     */
    public FDIPostWOIssueBatch getMFDIPostWOIssueBatch() {
        return mfdiPostWOIssueBatch;
    }

    /**
     * 设置mfdiPostWOIssueBatch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FDIPostWOIssueBatch }
     *     
     */
    public void setMFDIPostWOIssueBatch(FDIPostWOIssueBatch value) {
        this.mfdiPostWOIssueBatch = value;
    }

}
