
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
 *         &lt;element name="mFDIGetRawMaterial" type="{http://fanuc.com.cn/}FDIGetRawMaterial" minOccurs="0"/>
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
    "mfdiGetRawMaterial"
})
@XmlRootElement(name = "UpdateFDIGetRawMaterial")
public class UpdateFDIGetRawMaterial {

    @XmlElement(name = "mFDIGetRawMaterial")
    protected FDIGetRawMaterial mfdiGetRawMaterial;

    /**
     * 获取mfdiGetRawMaterial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FDIGetRawMaterial }
     *     
     */
    public FDIGetRawMaterial getMFDIGetRawMaterial() {
        return mfdiGetRawMaterial;
    }

    /**
     * 设置mfdiGetRawMaterial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FDIGetRawMaterial }
     *     
     */
    public void setMFDIGetRawMaterial(FDIGetRawMaterial value) {
        this.mfdiGetRawMaterial = value;
    }

}
