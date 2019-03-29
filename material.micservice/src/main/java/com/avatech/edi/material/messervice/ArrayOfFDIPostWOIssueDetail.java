
package com.avatech.edi.material.messervice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfFDIPostWOIssueDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFDIPostWOIssueDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FDIPostWOIssueDetail" type="{http://fanuc.com.cn/}FDIPostWOIssueDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFDIPostWOIssueDetail", propOrder = {
    "fdiPostWOIssueDetail"
})
public class ArrayOfFDIPostWOIssueDetail {

    @XmlElement(name = "FDIPostWOIssueDetail", nillable = true)
    protected List<FDIPostWOIssueDetail> fdiPostWOIssueDetail;

    /**
     * Gets the value of the fdiPostWOIssueDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fdiPostWOIssueDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFDIPostWOIssueDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FDIPostWOIssueDetail }
     * 
     * 
     */
    public List<FDIPostWOIssueDetail> getFDIPostWOIssueDetail() {
        if (fdiPostWOIssueDetail == null) {
            fdiPostWOIssueDetail = new ArrayList<FDIPostWOIssueDetail>();
        }
        return this.fdiPostWOIssueDetail;
    }

}
