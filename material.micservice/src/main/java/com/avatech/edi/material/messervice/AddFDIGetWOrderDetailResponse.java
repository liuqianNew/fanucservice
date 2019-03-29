
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
 *         &lt;element name="AddFDIGetWOrderDetailResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "addFDIGetWOrderDetailResult"
})
@XmlRootElement(name = "AddFDIGetWOrderDetailResponse")
public class AddFDIGetWOrderDetailResponse {

    @XmlElement(name = "AddFDIGetWOrderDetailResult")
    protected boolean addFDIGetWOrderDetailResult;

    /**
     * 获取addFDIGetWOrderDetailResult属性的值。
     * 
     */
    public boolean isAddFDIGetWOrderDetailResult() {
        return addFDIGetWOrderDetailResult;
    }

    /**
     * 设置addFDIGetWOrderDetailResult属性的值。
     * 
     */
    public void setAddFDIGetWOrderDetailResult(boolean value) {
        this.addFDIGetWOrderDetailResult = value;
    }

}
