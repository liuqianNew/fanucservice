
package com.avatech.edi.productionorder.message;

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
 *         &lt;element name="DelFDIGetWOrderResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "delFDIGetWOrderResult"
})
@XmlRootElement(name = "DelFDIGetWOrderResponse")
public class DelFDIGetWOrderResponse {

    @XmlElement(name = "DelFDIGetWOrderResult")
    protected boolean delFDIGetWOrderResult;

    /**
     * 获取delFDIGetWOrderResult属性的值。
     * 
     */
    public boolean isDelFDIGetWOrderResult() {
        return delFDIGetWOrderResult;
    }

    /**
     * 设置delFDIGetWOrderResult属性的值。
     * 
     */
    public void setDelFDIGetWOrderResult(boolean value) {
        this.delFDIGetWOrderResult = value;
    }

}
