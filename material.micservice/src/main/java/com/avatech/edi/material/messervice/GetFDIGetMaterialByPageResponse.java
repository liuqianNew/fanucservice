
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
 *         &lt;element name="GetFDIGetMaterialByPageResult" type="{http://fanuc.com.cn/}ArrayOfFDIGetMaterial" minOccurs="0"/>
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
    "getFDIGetMaterialByPageResult"
})
@XmlRootElement(name = "GetFDIGetMaterialByPageResponse")
public class GetFDIGetMaterialByPageResponse {

    @XmlElement(name = "GetFDIGetMaterialByPageResult")
    protected ArrayOfFDIGetMaterial getFDIGetMaterialByPageResult;

    /**
     * 获取getFDIGetMaterialByPageResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFDIGetMaterial }
     *     
     */
    public ArrayOfFDIGetMaterial getGetFDIGetMaterialByPageResult() {
        return getFDIGetMaterialByPageResult;
    }

    /**
     * 设置getFDIGetMaterialByPageResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFDIGetMaterial }
     *     
     */
    public void setGetFDIGetMaterialByPageResult(ArrayOfFDIGetMaterial value) {
        this.getFDIGetMaterialByPageResult = value;
    }

}
