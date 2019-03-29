
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
 *         &lt;element name="mFDIPostRawMaterialDetail" type="{http://fanuc.com.cn/}FDIPostRawMaterialDetail" minOccurs="0"/>
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
    "mfdiPostRawMaterialDetail"
})
@XmlRootElement(name = "UpdateFDIPostRawMaterialDetail")
public class UpdateFDIPostRawMaterialDetail {

    @XmlElement(name = "mFDIPostRawMaterialDetail")
    protected FDIPostRawMaterialDetail mfdiPostRawMaterialDetail;

    /**
     * 获取mfdiPostRawMaterialDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FDIPostRawMaterialDetail }
     *     
     */
    public FDIPostRawMaterialDetail getMFDIPostRawMaterialDetail() {
        return mfdiPostRawMaterialDetail;
    }

    /**
     * 设置mfdiPostRawMaterialDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FDIPostRawMaterialDetail }
     *     
     */
    public void setMFDIPostRawMaterialDetail(FDIPostRawMaterialDetail value) {
        this.mfdiPostRawMaterialDetail = value;
    }

}
