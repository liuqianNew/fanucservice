
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
 *         &lt;element name="GetFDIGetMaterialInfoByPageResult" type="{http://fanuc.com.cn/}ArrayOfFDIGetMaterialInfo" minOccurs="0"/>
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
    "getFDIGetMaterialInfoByPageResult"
})
@XmlRootElement(name = "GetFDIGetMaterialInfoByPageResponse")
public class GetFDIGetMaterialInfoByPageResponse {

    @XmlElement(name = "GetFDIGetMaterialInfoByPageResult")
    protected ArrayOfFDIGetMaterialInfo getFDIGetMaterialInfoByPageResult;

    /**
     * 获取getFDIGetMaterialInfoByPageResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFDIGetMaterialInfo }
     *     
     */
    public ArrayOfFDIGetMaterialInfo getGetFDIGetMaterialInfoByPageResult() {
        return getFDIGetMaterialInfoByPageResult;
    }

    /**
     * 设置getFDIGetMaterialInfoByPageResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFDIGetMaterialInfo }
     *     
     */
    public void setGetFDIGetMaterialInfoByPageResult(ArrayOfFDIGetMaterialInfo value) {
        this.getFDIGetMaterialInfoByPageResult = value;
    }

}
