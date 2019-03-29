
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
 *         &lt;element name="DelFDIGetWOrdersResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "delFDIGetWOrdersResult"
})
@XmlRootElement(name = "DelFDIGetWOrdersResponse")
public class DelFDIGetWOrdersResponse {

    @XmlElement(name = "DelFDIGetWOrdersResult")
    protected boolean delFDIGetWOrdersResult;

    /**
     * 获取delFDIGetWOrdersResult属性的值。
     * 
     */
    public boolean isDelFDIGetWOrdersResult() {
        return delFDIGetWOrdersResult;
    }

    /**
     * 设置delFDIGetWOrdersResult属性的值。
     * 
     */
    public void setDelFDIGetWOrdersResult(boolean value) {
        this.delFDIGetWOrdersResult = value;
    }

}
