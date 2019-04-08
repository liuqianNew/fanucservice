
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
 *         &lt;element name="GetFDIPostRawMaterialByPageResult" type="{http://fanuc.com.cn/}ArrayOfFDIPostRawMaterial" minOccurs="0"/>
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
    "getFDIPostRawMaterialByPageResult"
})
@XmlRootElement(name = "GetFDIPostRawMaterialByPageResponse")
public class GetFDIPostRawMaterialByPageResponse {

    @XmlElement(name = "GetFDIPostRawMaterialByPageResult")
    protected ArrayOfFDIPostRawMaterial getFDIPostRawMaterialByPageResult;

    /**
     * 获取getFDIPostRawMaterialByPageResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFDIPostRawMaterial }
     *     
     */
    public ArrayOfFDIPostRawMaterial getGetFDIPostRawMaterialByPageResult() {
        return getFDIPostRawMaterialByPageResult;
    }

    /**
     * 设置getFDIPostRawMaterialByPageResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFDIPostRawMaterial }
     *     
     */
    public void setGetFDIPostRawMaterialByPageResult(ArrayOfFDIPostRawMaterial value) {
        this.getFDIPostRawMaterialByPageResult = value;
    }

}
