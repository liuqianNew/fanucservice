
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
 *         &lt;element name="AddFDIGetRawMaterialDetailResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "addFDIGetRawMaterialDetailResult"
})
@XmlRootElement(name = "AddFDIGetRawMaterialDetailResponse")
public class AddFDIGetRawMaterialDetailResponse {

    @XmlElement(name = "AddFDIGetRawMaterialDetailResult")
    protected boolean addFDIGetRawMaterialDetailResult;

    /**
     * 获取addFDIGetRawMaterialDetailResult属性的值。
     * 
     */
    public boolean isAddFDIGetRawMaterialDetailResult() {
        return addFDIGetRawMaterialDetailResult;
    }

    /**
     * 设置addFDIGetRawMaterialDetailResult属性的值。
     * 
     */
    public void setAddFDIGetRawMaterialDetailResult(boolean value) {
        this.addFDIGetRawMaterialDetailResult = value;
    }

}
