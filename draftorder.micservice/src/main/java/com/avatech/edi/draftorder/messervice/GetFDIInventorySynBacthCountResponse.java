
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
 *         &lt;element name="GetFDIInventorySynBacthCountResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "getFDIInventorySynBacthCountResult"
})
@XmlRootElement(name = "GetFDIInventorySynBacthCountResponse")
public class GetFDIInventorySynBacthCountResponse {

    @XmlElement(name = "GetFDIInventorySynBacthCountResult")
    protected int getFDIInventorySynBacthCountResult;

    /**
     * 获取getFDIInventorySynBacthCountResult属性的值。
     * 
     */
    public int getGetFDIInventorySynBacthCountResult() {
        return getFDIInventorySynBacthCountResult;
    }

    /**
     * 设置getFDIInventorySynBacthCountResult属性的值。
     * 
     */
    public void setGetFDIInventorySynBacthCountResult(int value) {
        this.getFDIInventorySynBacthCountResult = value;
    }

}
