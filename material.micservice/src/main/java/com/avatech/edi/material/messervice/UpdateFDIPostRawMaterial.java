
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
 *         &lt;element name="mFDIPostRawMaterial" type="{http://fanuc.com.cn/}FDIPostRawMaterial" minOccurs="0"/>
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
    "mfdiPostRawMaterial"
})
@XmlRootElement(name = "UpdateFDIPostRawMaterial")
public class UpdateFDIPostRawMaterial {

    @XmlElement(name = "mFDIPostRawMaterial")
    protected FDIPostRawMaterial mfdiPostRawMaterial;

    /**
     * 获取mfdiPostRawMaterial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FDIPostRawMaterial }
     *     
     */
    public FDIPostRawMaterial getMFDIPostRawMaterial() {
        return mfdiPostRawMaterial;
    }

    /**
     * 设置mfdiPostRawMaterial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FDIPostRawMaterial }
     *     
     */
    public void setMFDIPostRawMaterial(FDIPostRawMaterial value) {
        this.mfdiPostRawMaterial = value;
    }

}
