
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
 *         &lt;element name="mFDIPostWOCloseBatch" type="{http://fanuc.com.cn/}FDIPostWOCloseBatch" minOccurs="0"/>
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
    "mfdiPostWOCloseBatch"
})
@XmlRootElement(name = "AddFDIPostWOCloseBatch")
public class AddFDIPostWOCloseBatch {

    @XmlElement(name = "mFDIPostWOCloseBatch")
    protected FDIPostWOCloseBatch mfdiPostWOCloseBatch;

    /**
     * 获取mfdiPostWOCloseBatch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FDIPostWOCloseBatch }
     *     
     */
    public FDIPostWOCloseBatch getMFDIPostWOCloseBatch() {
        return mfdiPostWOCloseBatch;
    }

    /**
     * 设置mfdiPostWOCloseBatch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FDIPostWOCloseBatch }
     *     
     */
    public void setMFDIPostWOCloseBatch(FDIPostWOCloseBatch value) {
        this.mfdiPostWOCloseBatch = value;
    }

}
