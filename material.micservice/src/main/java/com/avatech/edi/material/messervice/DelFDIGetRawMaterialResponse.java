
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
 *         &lt;element name="DelFDIGetRawMaterialResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "delFDIGetRawMaterialResult"
})
@XmlRootElement(name = "DelFDIGetRawMaterialResponse")
public class DelFDIGetRawMaterialResponse {

    @XmlElement(name = "DelFDIGetRawMaterialResult")
    protected boolean delFDIGetRawMaterialResult;

    /**
     * 获取delFDIGetRawMaterialResult属性的值。
     * 
     */
    public boolean isDelFDIGetRawMaterialResult() {
        return delFDIGetRawMaterialResult;
    }

    /**
     * 设置delFDIGetRawMaterialResult属性的值。
     * 
     */
    public void setDelFDIGetRawMaterialResult(boolean value) {
        this.delFDIGetRawMaterialResult = value;
    }

}
