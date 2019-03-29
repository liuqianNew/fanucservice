
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
 *         &lt;element name="DelFDIInventorySynBacthResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "delFDIInventorySynBacthResult"
})
@XmlRootElement(name = "DelFDIInventorySynBacthResponse")
public class DelFDIInventorySynBacthResponse {

    @XmlElement(name = "DelFDIInventorySynBacthResult")
    protected boolean delFDIInventorySynBacthResult;

    /**
     * 获取delFDIInventorySynBacthResult属性的值。
     * 
     */
    public boolean isDelFDIInventorySynBacthResult() {
        return delFDIInventorySynBacthResult;
    }

    /**
     * 设置delFDIInventorySynBacthResult属性的值。
     * 
     */
    public void setDelFDIInventorySynBacthResult(boolean value) {
        this.delFDIInventorySynBacthResult = value;
    }

}
