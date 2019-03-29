
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
 *         &lt;element name="mFDIGetMaterialInfo" type="{http://fanuc.com.cn/}FDIGetMaterialInfo" minOccurs="0"/>
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
    "mfdiGetMaterialInfo"
})
@XmlRootElement(name = "UpdateFDIGetMaterialInfo")
public class UpdateFDIGetMaterialInfo {

    @XmlElement(name = "mFDIGetMaterialInfo")
    protected FDIGetMaterialInfo mfdiGetMaterialInfo;

    /**
     * 获取mfdiGetMaterialInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FDIGetMaterialInfo }
     *     
     */
    public FDIGetMaterialInfo getMFDIGetMaterialInfo() {
        return mfdiGetMaterialInfo;
    }

    /**
     * 设置mfdiGetMaterialInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FDIGetMaterialInfo }
     *     
     */
    public void setMFDIGetMaterialInfo(FDIGetMaterialInfo value) {
        this.mfdiGetMaterialInfo = value;
    }

}
