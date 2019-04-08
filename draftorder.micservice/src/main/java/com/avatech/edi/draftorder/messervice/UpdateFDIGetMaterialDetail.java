
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
 *         &lt;element name="mFDIGetMaterialDetail" type="{http://fanuc.com.cn/}FDIGetMaterialDetail" minOccurs="0"/>
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
    "mfdiGetMaterialDetail"
})
@XmlRootElement(name = "UpdateFDIGetMaterialDetail")
public class UpdateFDIGetMaterialDetail {

    @XmlElement(name = "mFDIGetMaterialDetail")
    protected FDIGetMaterialDetail mfdiGetMaterialDetail;

    /**
     * 获取mfdiGetMaterialDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FDIGetMaterialDetail }
     *     
     */
    public FDIGetMaterialDetail getMFDIGetMaterialDetail() {
        return mfdiGetMaterialDetail;
    }

    /**
     * 设置mfdiGetMaterialDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FDIGetMaterialDetail }
     *     
     */
    public void setMFDIGetMaterialDetail(FDIGetMaterialDetail value) {
        this.mfdiGetMaterialDetail = value;
    }

}
