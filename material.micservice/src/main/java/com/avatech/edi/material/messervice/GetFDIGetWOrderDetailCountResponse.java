
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
 *         &lt;element name="GetFDIGetWOrderDetailCountResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "getFDIGetWOrderDetailCountResult"
})
@XmlRootElement(name = "GetFDIGetWOrderDetailCountResponse")
public class GetFDIGetWOrderDetailCountResponse {

    @XmlElement(name = "GetFDIGetWOrderDetailCountResult")
    protected int getFDIGetWOrderDetailCountResult;

    /**
     * 获取getFDIGetWOrderDetailCountResult属性的值。
     * 
     */
    public int getGetFDIGetWOrderDetailCountResult() {
        return getFDIGetWOrderDetailCountResult;
    }

    /**
     * 设置getFDIGetWOrderDetailCountResult属性的值。
     * 
     */
    public void setGetFDIGetWOrderDetailCountResult(int value) {
        this.getFDIGetWOrderDetailCountResult = value;
    }

}
