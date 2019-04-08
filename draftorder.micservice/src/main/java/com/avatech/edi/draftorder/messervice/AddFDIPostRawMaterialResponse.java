
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
 *         &lt;element name="AddFDIPostRawMaterialResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "addFDIPostRawMaterialResult"
})
@XmlRootElement(name = "AddFDIPostRawMaterialResponse")
public class AddFDIPostRawMaterialResponse {

    @XmlElement(name = "AddFDIPostRawMaterialResult")
    protected boolean addFDIPostRawMaterialResult;

    /**
     * 获取addFDIPostRawMaterialResult属性的值。
     * 
     */
    public boolean isAddFDIPostRawMaterialResult() {
        return addFDIPostRawMaterialResult;
    }

    /**
     * 设置addFDIPostRawMaterialResult属性的值。
     * 
     */
    public void setAddFDIPostRawMaterialResult(boolean value) {
        this.addFDIPostRawMaterialResult = value;
    }

}
