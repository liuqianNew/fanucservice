
package com.avatech.edi.productionorder.message;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfFDIGetWOrderDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFDIGetWOrderDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FDIGetWOrderDetail" type="{http://fanuc.com.cn/}FDIGetWOrderDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFDIGetWOrderDetail", propOrder = {
    "fdiGetWOrderDetail"
})
public class ArrayOfFDIGetWOrderDetail {

    @XmlElement(name = "FDIGetWOrderDetail", nillable = true)
    protected List<FDIGetWOrderDetail> fdiGetWOrderDetail;

    /**
     * Gets the value of the fdiGetWOrderDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fdiGetWOrderDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFDIGetWOrderDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FDIGetWOrderDetail }
     * 
     * 
     */
    public List<FDIGetWOrderDetail> getFDIGetWOrderDetail() {
        if (fdiGetWOrderDetail == null) {
            fdiGetWOrderDetail = new ArrayList<FDIGetWOrderDetail>();
        }
        return this.fdiGetWOrderDetail;
    }

}
