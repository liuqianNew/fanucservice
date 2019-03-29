
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
 *         &lt;element name="mFDIGetRawMaterialDetail" type="{http://fanuc.com.cn/}FDIGetRawMaterialDetail" minOccurs="0"/>
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
    "mfdiGetRawMaterialDetail"
})
@XmlRootElement(name = "UpdateFDIGetRawMaterialDetail")
public class UpdateFDIGetRawMaterialDetail {

    @XmlElement(name = "mFDIGetRawMaterialDetail")
    protected FDIGetRawMaterialDetail mfdiGetRawMaterialDetail;

    /**
     * 获取mfdiGetRawMaterialDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FDIGetRawMaterialDetail }
     *     
     */
    public FDIGetRawMaterialDetail getMFDIGetRawMaterialDetail() {
        return mfdiGetRawMaterialDetail;
    }

    /**
     * 设置mfdiGetRawMaterialDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FDIGetRawMaterialDetail }
     *     
     */
    public void setMFDIGetRawMaterialDetail(FDIGetRawMaterialDetail value) {
        this.mfdiGetRawMaterialDetail = value;
    }

}
