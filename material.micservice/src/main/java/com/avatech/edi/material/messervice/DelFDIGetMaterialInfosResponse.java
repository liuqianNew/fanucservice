
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
 *         &lt;element name="DelFDIGetMaterialInfosResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "delFDIGetMaterialInfosResult"
})
@XmlRootElement(name = "DelFDIGetMaterialInfosResponse")
public class DelFDIGetMaterialInfosResponse {

    @XmlElement(name = "DelFDIGetMaterialInfosResult")
    protected boolean delFDIGetMaterialInfosResult;

    /**
     * 获取delFDIGetMaterialInfosResult属性的值。
     * 
     */
    public boolean isDelFDIGetMaterialInfosResult() {
        return delFDIGetMaterialInfosResult;
    }

    /**
     * 设置delFDIGetMaterialInfosResult属性的值。
     * 
     */
    public void setDelFDIGetMaterialInfosResult(boolean value) {
        this.delFDIGetMaterialInfosResult = value;
    }

}
