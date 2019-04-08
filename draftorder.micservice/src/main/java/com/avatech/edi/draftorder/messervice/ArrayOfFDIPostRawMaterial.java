
package com.avatech.edi.draftorder.messervice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfFDIPostRawMaterial complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFDIPostRawMaterial">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FDIPostRawMaterial" type="{http://fanuc.com.cn/}FDIPostRawMaterial" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFDIPostRawMaterial", propOrder = {
    "fdiPostRawMaterial"
})
public class ArrayOfFDIPostRawMaterial {

    @XmlElement(name = "FDIPostRawMaterial", nillable = true)
    protected List<FDIPostRawMaterial> fdiPostRawMaterial;

    /**
     * Gets the value of the fdiPostRawMaterial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fdiPostRawMaterial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFDIPostRawMaterial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FDIPostRawMaterial }
     * 
     * 
     */
    public List<FDIPostRawMaterial> getFDIPostRawMaterial() {
        if (fdiPostRawMaterial == null) {
            fdiPostRawMaterial = new ArrayList<FDIPostRawMaterial>();
        }
        return this.fdiPostRawMaterial;
    }

}
