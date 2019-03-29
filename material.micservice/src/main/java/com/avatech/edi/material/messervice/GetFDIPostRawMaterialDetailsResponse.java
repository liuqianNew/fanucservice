
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
 *         &lt;element name="GetFDIPostRawMaterialDetailsResult" type="{http://fanuc.com.cn/}ArrayOfFDIPostRawMaterialDetail" minOccurs="0"/>
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
    "getFDIPostRawMaterialDetailsResult"
})
@XmlRootElement(name = "GetFDIPostRawMaterialDetailsResponse")
public class GetFDIPostRawMaterialDetailsResponse {

    @XmlElement(name = "GetFDIPostRawMaterialDetailsResult")
    protected ArrayOfFDIPostRawMaterialDetail getFDIPostRawMaterialDetailsResult;

    /**
     * 获取getFDIPostRawMaterialDetailsResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFDIPostRawMaterialDetail }
     *     
     */
    public ArrayOfFDIPostRawMaterialDetail getGetFDIPostRawMaterialDetailsResult() {
        return getFDIPostRawMaterialDetailsResult;
    }

    /**
     * 设置getFDIPostRawMaterialDetailsResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFDIPostRawMaterialDetail }
     *     
     */
    public void setGetFDIPostRawMaterialDetailsResult(ArrayOfFDIPostRawMaterialDetail value) {
        this.getFDIPostRawMaterialDetailsResult = value;
    }

}
