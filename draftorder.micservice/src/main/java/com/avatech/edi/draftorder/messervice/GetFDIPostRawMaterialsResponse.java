
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
 *         &lt;element name="GetFDIPostRawMaterialsResult" type="{http://fanuc.com.cn/}ArrayOfFDIPostRawMaterial" minOccurs="0"/>
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
    "getFDIPostRawMaterialsResult"
})
@XmlRootElement(name = "GetFDIPostRawMaterialsResponse")
public class GetFDIPostRawMaterialsResponse {

    @XmlElement(name = "GetFDIPostRawMaterialsResult")
    protected ArrayOfFDIPostRawMaterial getFDIPostRawMaterialsResult;

    /**
     * 获取getFDIPostRawMaterialsResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFDIPostRawMaterial }
     *     
     */
    public ArrayOfFDIPostRawMaterial getGetFDIPostRawMaterialsResult() {
        return getFDIPostRawMaterialsResult;
    }

    /**
     * 设置getFDIPostRawMaterialsResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFDIPostRawMaterial }
     *     
     */
    public void setGetFDIPostRawMaterialsResult(ArrayOfFDIPostRawMaterial value) {
        this.getFDIPostRawMaterialsResult = value;
    }

}
