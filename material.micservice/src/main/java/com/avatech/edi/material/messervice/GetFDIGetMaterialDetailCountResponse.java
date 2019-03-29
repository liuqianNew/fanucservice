
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
 *         &lt;element name="GetFDIGetMaterialDetailCountResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "getFDIGetMaterialDetailCountResult"
})
@XmlRootElement(name = "GetFDIGetMaterialDetailCountResponse")
public class GetFDIGetMaterialDetailCountResponse {

    @XmlElement(name = "GetFDIGetMaterialDetailCountResult")
    protected int getFDIGetMaterialDetailCountResult;

    /**
     * 获取getFDIGetMaterialDetailCountResult属性的值。
     * 
     */
    public int getGetFDIGetMaterialDetailCountResult() {
        return getFDIGetMaterialDetailCountResult;
    }

    /**
     * 设置getFDIGetMaterialDetailCountResult属性的值。
     * 
     */
    public void setGetFDIGetMaterialDetailCountResult(int value) {
        this.getFDIGetMaterialDetailCountResult = value;
    }

}
