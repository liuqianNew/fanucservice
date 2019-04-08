
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
 *         &lt;element name="mFDIPostWOClose" type="{http://fanuc.com.cn/}FDIPostWOClose" minOccurs="0"/>
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
    "mfdiPostWOClose"
})
@XmlRootElement(name = "UpdateFDIPostWOClose")
public class UpdateFDIPostWOClose {

    @XmlElement(name = "mFDIPostWOClose")
    protected FDIPostWOClose mfdiPostWOClose;

    /**
     * 获取mfdiPostWOClose属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FDIPostWOClose }
     *     
     */
    public FDIPostWOClose getMFDIPostWOClose() {
        return mfdiPostWOClose;
    }

    /**
     * 设置mfdiPostWOClose属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FDIPostWOClose }
     *     
     */
    public void setMFDIPostWOClose(FDIPostWOClose value) {
        this.mfdiPostWOClose = value;
    }

}
