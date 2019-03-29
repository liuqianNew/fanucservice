
package com.avatech.edi.material.messervice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfFDIGetRawMaterialDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFDIGetRawMaterialDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FDIGetRawMaterialDetail" type="{http://fanuc.com.cn/}FDIGetRawMaterialDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFDIGetRawMaterialDetail", propOrder = {
    "fdiGetRawMaterialDetail"
})
public class ArrayOfFDIGetRawMaterialDetail {

    @XmlElement(name = "FDIGetRawMaterialDetail", nillable = true)
    protected List<FDIGetRawMaterialDetail> fdiGetRawMaterialDetail;

    /**
     * Gets the value of the fdiGetRawMaterialDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fdiGetRawMaterialDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFDIGetRawMaterialDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FDIGetRawMaterialDetail }
     * 
     * 
     */
    public List<FDIGetRawMaterialDetail> getFDIGetRawMaterialDetail() {
        if (fdiGetRawMaterialDetail == null) {
            fdiGetRawMaterialDetail = new ArrayList<FDIGetRawMaterialDetail>();
        }
        return this.fdiGetRawMaterialDetail;
    }

}
