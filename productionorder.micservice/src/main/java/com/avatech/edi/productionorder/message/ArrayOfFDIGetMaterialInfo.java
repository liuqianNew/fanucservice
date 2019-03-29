
package com.avatech.edi.productionorder.message;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfFDIGetMaterialInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFDIGetMaterialInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FDIGetMaterialInfo" type="{http://fanuc.com.cn/}FDIGetMaterialInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFDIGetMaterialInfo", propOrder = {
    "fdiGetMaterialInfo"
})
public class ArrayOfFDIGetMaterialInfo {

    @XmlElement(name = "FDIGetMaterialInfo", nillable = true)
    protected List<FDIGetMaterialInfo> fdiGetMaterialInfo;

    /**
     * Gets the value of the fdiGetMaterialInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fdiGetMaterialInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFDIGetMaterialInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FDIGetMaterialInfo }
     * 
     * 
     */
    public List<FDIGetMaterialInfo> getFDIGetMaterialInfo() {
        if (fdiGetMaterialInfo == null) {
            fdiGetMaterialInfo = new ArrayList<FDIGetMaterialInfo>();
        }
        return this.fdiGetMaterialInfo;
    }

}
