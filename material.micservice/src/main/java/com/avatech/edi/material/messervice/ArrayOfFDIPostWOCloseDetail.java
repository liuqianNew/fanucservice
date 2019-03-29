
package com.avatech.edi.material.messervice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfFDIPostWOCloseDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFDIPostWOCloseDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FDIPostWOCloseDetail" type="{http://fanuc.com.cn/}FDIPostWOCloseDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFDIPostWOCloseDetail", propOrder = {
    "fdiPostWOCloseDetail"
})
public class ArrayOfFDIPostWOCloseDetail {

    @XmlElement(name = "FDIPostWOCloseDetail", nillable = true)
    protected List<FDIPostWOCloseDetail> fdiPostWOCloseDetail;

    /**
     * Gets the value of the fdiPostWOCloseDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fdiPostWOCloseDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFDIPostWOCloseDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FDIPostWOCloseDetail }
     * 
     * 
     */
    public List<FDIPostWOCloseDetail> getFDIPostWOCloseDetail() {
        if (fdiPostWOCloseDetail == null) {
            fdiPostWOCloseDetail = new ArrayList<FDIPostWOCloseDetail>();
        }
        return this.fdiPostWOCloseDetail;
    }

}
