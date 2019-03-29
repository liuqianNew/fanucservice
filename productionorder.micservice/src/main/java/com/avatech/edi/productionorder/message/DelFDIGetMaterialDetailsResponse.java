
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
 *         &lt;element name="DelFDIGetMaterialDetailsResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "delFDIGetMaterialDetailsResult"
})
@XmlRootElement(name = "DelFDIGetMaterialDetailsResponse")
public class DelFDIGetMaterialDetailsResponse {

    @XmlElement(name = "DelFDIGetMaterialDetailsResult")
    protected boolean delFDIGetMaterialDetailsResult;

    /**
     * 获取delFDIGetMaterialDetailsResult属性的值。
     * 
     */
    public boolean isDelFDIGetMaterialDetailsResult() {
        return delFDIGetMaterialDetailsResult;
    }

    /**
     * 设置delFDIGetMaterialDetailsResult属性的值。
     * 
     */
    public void setDelFDIGetMaterialDetailsResult(boolean value) {
        this.delFDIGetMaterialDetailsResult = value;
    }

}
