
package com.avatech.edi.productionorder.message;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfFDIGetMaterialDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFDIGetMaterialDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FDIGetMaterialDetail" type="{http://fanuc.com.cn/}FDIGetMaterialDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFDIGetMaterialDetail", propOrder = {
    "fdiGetMaterialDetail"
})
public class ArrayOfFDIGetMaterialDetail {

    @XmlElement(name = "FDIGetMaterialDetail", nillable = true)
    protected List<FDIGetMaterialDetail> fdiGetMaterialDetail;

    /**
     * Gets the value of the fdiGetMaterialDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fdiGetMaterialDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFDIGetMaterialDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FDIGetMaterialDetail }
     * 
     * 
     */
    public List<FDIGetMaterialDetail> getFDIGetMaterialDetail() {
        if (fdiGetMaterialDetail == null) {
            fdiGetMaterialDetail = new ArrayList<FDIGetMaterialDetail>();
        }
        return this.fdiGetMaterialDetail;
    }

}
