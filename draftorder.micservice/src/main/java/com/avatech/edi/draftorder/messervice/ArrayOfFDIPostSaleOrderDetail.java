
package com.avatech.edi.draftorder.messervice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfFDIPostSaleOrderDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFDIPostSaleOrderDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FDIPostSaleOrderDetail" type="{http://fanuc.com.cn/}FDIPostSaleOrderDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFDIPostSaleOrderDetail", propOrder = {
    "fdiPostSaleOrderDetail"
})
public class ArrayOfFDIPostSaleOrderDetail {

    @XmlElement(name = "FDIPostSaleOrderDetail", nillable = true)
    protected List<FDIPostSaleOrderDetail> fdiPostSaleOrderDetail;

    /**
     * Gets the value of the fdiPostSaleOrderDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fdiPostSaleOrderDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFDIPostSaleOrderDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FDIPostSaleOrderDetail }
     * 
     * 
     */
    public List<FDIPostSaleOrderDetail> getFDIPostSaleOrderDetail() {
        if (fdiPostSaleOrderDetail == null) {
            fdiPostSaleOrderDetail = new ArrayList<FDIPostSaleOrderDetail>();
        }
        return this.fdiPostSaleOrderDetail;
    }

}
