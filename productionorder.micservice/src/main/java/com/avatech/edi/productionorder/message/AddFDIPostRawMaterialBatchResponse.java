
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
 *         &lt;element name="AddFDIPostRawMaterialBatchResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "addFDIPostRawMaterialBatchResult"
})
@XmlRootElement(name = "AddFDIPostRawMaterialBatchResponse")
public class AddFDIPostRawMaterialBatchResponse {

    @XmlElement(name = "AddFDIPostRawMaterialBatchResult")
    protected boolean addFDIPostRawMaterialBatchResult;

    /**
     * 获取addFDIPostRawMaterialBatchResult属性的值。
     * 
     */
    public boolean isAddFDIPostRawMaterialBatchResult() {
        return addFDIPostRawMaterialBatchResult;
    }

    /**
     * 设置addFDIPostRawMaterialBatchResult属性的值。
     * 
     */
    public void setAddFDIPostRawMaterialBatchResult(boolean value) {
        this.addFDIPostRawMaterialBatchResult = value;
    }

}
