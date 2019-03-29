<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://fanuc.com.cn/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" targetNamespace="http://fanuc.com.cn/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://fanuc.com.cn/">
      <s:element name="GetRawMaterial">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="jsMaterialMain" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="jsMaterialDetail" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetRawMaterialResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetRawMaterialResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetMaterialInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="jsMaterialInfo" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetMaterialInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetMaterialInfoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetWorkOrder">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="jsWOMain" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="jsWODetail" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetWorkOrderResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetWorkOrderResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetDNOrder">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="jsDNMain" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="jsDNDetail" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetDNOrderResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetDNOrderResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="PostWOClose">
        <s:complexType />
      </s:element>
      <s:element name="PostWOCloseResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="PostWOCloseResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="PostWOIssue">
        <s:complexType />
      </s:element>
      <s:element name="PostWOIssueResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="PostWOIssueResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="PostDNOrder">
        <s:complexType />
      </s:element>
      <s:element name="PostDNOrderResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="PostDNOrderResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="PostRawMaterial">
        <s:complexType />
      </s:element>
      <s:element name="PostRawMaterialResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="PostRawMaterialResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="PostInventorySyn">
        <s:complexType />
      </s:element>
      <s:element name="PostInventorySynResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="PostInventorySynResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIInventorySynBacthByPage">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="pageSize" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="pageIndex" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="isAsc" type="s:boolean" />
            <s:element minOccurs="0" maxOccurs="1" name="orderField" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIInventorySynBacthByPageResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIInventorySynBacthByPageResult" type="tns:ArrayOfFDIInventorySynBacth" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfFDIInventorySynBacth">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="FDIInventorySynBacth" nillable="true" type="tns:FDIInventorySynBacth" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="FDIInventorySynBacth">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="PKNO" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocEntry" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemLineId" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="LineNum" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemCode" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Quantity" nillable="true" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="BatchNum" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf4" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf5" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Flag_In" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="DateTimeIn" type="s:dateTime" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetFDIInventorySynBacthCount">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIInventorySynBacthCountResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetFDIInventorySynBacthCountResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIInventorySynBacth">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIInventorySynBacth" type="tns:FDIInventorySynBacth" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIInventorySynBacthResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AddFDIInventorySynBacthResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIInventorySynBacth">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIInventorySynBacth" type="tns:FDIInventorySynBacth" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIInventorySynBacthResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateFDIInventorySynBacthResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIInventorySynBacths">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Ids" type="tns:ArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfString">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="string" nillable="true" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="DelFDIInventorySynBacthsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIInventorySynBacthsResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIInventorySynBacth">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIInventorySynBacthResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIInventorySynBacthResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIInventorySynBacths">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIInventorySynBacthsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIInventorySynBacthsResult" type="tns:ArrayOfFDIInventorySynBacth" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIInventorySynBacthById">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIInventorySynBacthByIdResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIInventorySynBacthByIdResult" type="tns:FDIInventorySynBacth" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIInventorySynByPage">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="pageSize" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="pageIndex" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="isAsc" type="s:boolean" />
            <s:element minOccurs="0" maxOccurs="1" name="orderField" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIInventorySynByPageResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIInventorySynByPageResult" type="tns:ArrayOfFDIInventorySyn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfFDIInventorySyn">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="FDIInventorySyn" nillable="true" type="tns:FDIInventorySyn" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="FDIInventorySyn">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="PKNO" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemName" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Quantity" nillable="true" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="WhsCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="BatchNum" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="UserSign" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocTime" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocDate" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf4" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf5" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Flag_In" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="DateTimeIn" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="Batchs" type="tns:ArrayOfFDIInventorySynBacth" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetFDIInventorySynCount">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIInventorySynCountResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetFDIInventorySynCountResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIInventorySyn">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIInventorySyn" type="tns:FDIInventorySyn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIInventorySynResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AddFDIInventorySynResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIInventorySyn">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIInventorySyn" type="tns:FDIInventorySyn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIInventorySynResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateFDIInventorySynResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIInventorySyns">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Ids" type="tns:ArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIInventorySynsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIInventorySynsResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIInventorySyn">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIInventorySynResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIInventorySynResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIInventorySyns">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIInventorySynsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIInventorySynsResult" type="tns:ArrayOfFDIInventorySyn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIInventorySynById">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIInventorySynByIdResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIInventorySynByIdResult" type="tns:FDIInventorySyn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostRawMaterialBatchByPage">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="pageSize" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="pageIndex" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="isAsc" type="s:boolean" />
            <s:element minOccurs="0" maxOccurs="1" name="orderField" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostRawMaterialBatchByPageResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIPostRawMaterialBatchByPageResult" type="tns:ArrayOfFDIPostRawMaterialBatch" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfFDIPostRawMaterialBatch">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="FDIPostRawMaterialBatch" nillable="true" type="tns:FDIPostRawMaterialBatch" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="FDIPostRawMaterialBatch">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="PKNO" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocEntry" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemLineId" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="LineNum" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemCode" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Quantity" nillable="true" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="BatchNum" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf4" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf5" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Flag_In" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="DateTimeIn" type="s:dateTime" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetFDIPostRawMaterialBatchCount">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostRawMaterialBatchCountResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetFDIPostRawMaterialBatchCountResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIPostRawMaterialBatch">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIPostRawMaterialBatch" type="tns:FDIPostRawMaterialBatch" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIPostRawMaterialBatchResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AddFDIPostRawMaterialBatchResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIPostRawMaterialBatch">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIPostRawMaterialBatch" type="tns:FDIPostRawMaterialBatch" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIPostRawMaterialBatchResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateFDIPostRawMaterialBatchResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostRawMaterialBatchs">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Ids" type="tns:ArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostRawMaterialBatchsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIPostRawMaterialBatchsResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostRawMaterialBatch">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostRawMaterialBatchResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIPostRawMaterialBatchResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostRawMaterialBatchs">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostRawMaterialBatchsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIPostRawMaterialBatchsResult" type="tns:ArrayOfFDIPostRawMaterialBatch" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostRawMaterialBatchById">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostRawMaterialBatchByIdResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIPostRawMaterialBatchByIdResult" type="tns:FDIPostRawMaterialBatch" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostRawMaterialDetailByPage">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="pageSize" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="pageIndex" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="isAsc" type="s:boolean" />
            <s:element minOccurs="0" maxOccurs="1" name="orderField" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostRawMaterialDetailByPageResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIPostRawMaterialDetailByPageResult" type="tns:ArrayOfFDIPostRawMaterialDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfFDIPostRawMaterialDetail">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="FDIPostRawMaterialDetail" nillable="true" type="tns:FDIPostRawMaterialDetail" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="FDIPostRawMaterialDetail">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="PKNO" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocEntry" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="LineId" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemName" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Quantity" nillable="true" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="WhsCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="BaseEntry" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="BaseLine" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="unitMsr" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf4" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf5" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Flag_In" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="DateTimeIn" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="Batchs" type="tns:ArrayOfFDIPostRawMaterialBatch" />
          <s:element minOccurs="0" maxOccurs="1" name="Batchs3" type="tns:ArrayOfFDIPostRawMaterialBatch" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetFDIPostRawMaterialDetailCount">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostRawMaterialDetailCountResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetFDIPostRawMaterialDetailCountResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIPostRawMaterialDetail">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIPostRawMaterialDetail" type="tns:FDIPostRawMaterialDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIPostRawMaterialDetailResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AddFDIPostRawMaterialDetailResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIPostRawMaterialDetail">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIPostRawMaterialDetail" type="tns:FDIPostRawMaterialDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIPostRawMaterialDetailResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateFDIPostRawMaterialDetailResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostRawMaterialDetails">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Ids" type="tns:ArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostRawMaterialDetailsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIPostRawMaterialDetailsResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostRawMaterialDetail">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostRawMaterialDetailResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIPostRawMaterialDetailResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostRawMaterialDetails">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostRawMaterialDetailsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIPostRawMaterialDetailsResult" type="tns:ArrayOfFDIPostRawMaterialDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostRawMaterialDetailById">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostRawMaterialDetailByIdResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIPostRawMaterialDetailByIdResult" type="tns:FDIPostRawMaterialDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostRawMaterialByPage">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="pageSize" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="pageIndex" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="isAsc" type="s:boolean" />
            <s:element minOccurs="0" maxOccurs="1" name="orderField" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostRawMaterialByPageResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIPostRawMaterialByPageResult" type="tns:ArrayOfFDIPostRawMaterial" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfFDIPostRawMaterial">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="FDIPostRawMaterial" nillable="true" type="tns:FDIPostRawMaterial" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="FDIPostRawMaterial">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="PKNO" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CardCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CardName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocType" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocDate" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocStatus" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocEntry" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="UserSign" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Comments" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocTime" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf4" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf5" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Flag_In" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="DateTimeIn" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="Details" type="tns:ArrayOfFDIPostRawMaterialDetail" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetFDIPostRawMaterialCount">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostRawMaterialCountResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetFDIPostRawMaterialCountResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIPostRawMaterial">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIPostRawMaterial" type="tns:FDIPostRawMaterial" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIPostRawMaterialResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AddFDIPostRawMaterialResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIPostRawMaterial">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIPostRawMaterial" type="tns:FDIPostRawMaterial" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIPostRawMaterialResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateFDIPostRawMaterialResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostRawMaterials">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Ids" type="tns:ArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostRawMaterialsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIPostRawMaterialsResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostRawMaterial">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostRawMaterialResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIPostRawMaterialResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostRawMaterials">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostRawMaterialsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIPostRawMaterialsResult" type="tns:ArrayOfFDIPostRawMaterial" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostRawMaterialById">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostRawMaterialByIdResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIPostRawMaterialByIdResult" type="tns:FDIPostRawMaterial" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostSaleOrderBatchByPage">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="pageSize" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="pageIndex" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="isAsc" type="s:boolean" />
            <s:element minOccurs="0" maxOccurs="1" name="orderField" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostSaleOrderBatchByPageResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIPostSaleOrderBatchByPageResult" type="tns:ArrayOfFDIPostSaleOrderBatch" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfFDIPostSaleOrderBatch">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="FDIPostSaleOrderBatch" nillable="true" type="tns:FDIPostSaleOrderBatch" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="FDIPostSaleOrderBatch">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="PKNO" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocEntry" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemLineId" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="LineNum" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemCode" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Quantity" nillable="true" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="BatchNum" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf4" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf5" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Flag_In" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="DateTimeIn" type="s:dateTime" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetFDIPostSaleOrderBatchCount">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostSaleOrderBatchCountResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetFDIPostSaleOrderBatchCountResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIPostSaleOrderBatch">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIPostSaleOrderBatch" type="tns:FDIPostSaleOrderBatch" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIPostSaleOrderBatchResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AddFDIPostSaleOrderBatchResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIPostSaleOrderBatch">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIPostSaleOrderBatch" type="tns:FDIPostSaleOrderBatch" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIPostSaleOrderBatchResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateFDIPostSaleOrderBatchResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostSaleOrderBatchs">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Ids" type="tns:ArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostSaleOrderBatchsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIPostSaleOrderBatchsResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostSaleOrderBatch">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostSaleOrderBatchResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIPostSaleOrderBatchResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostSaleOrderBatchs">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostSaleOrderBatchsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIPostSaleOrderBatchsResult" type="tns:ArrayOfFDIPostSaleOrderBatch" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostSaleOrderBatchById">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostSaleOrderBatchByIdResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIPostSaleOrderBatchByIdResult" type="tns:FDIPostSaleOrderBatch" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostSaleOrderDetailByPage">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="pageSize" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="pageIndex" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="isAsc" type="s:boolean" />
            <s:element minOccurs="0" maxOccurs="1" name="orderField" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostSaleOrderDetailByPageResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIPostSaleOrderDetailByPageResult" type="tns:ArrayOfFDIPostSaleOrderDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfFDIPostSaleOrderDetail">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="FDIPostSaleOrderDetail" nillable="true" type="tns:FDIPostSaleOrderDetail" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="FDIPostSaleOrderDetail">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="PKNO" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocEntry" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="LineId" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemName" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Quantity" nillable="true" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="WhsCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="BaseEntry" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="BaseLine" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="unitMsr" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf4" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf5" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Flag_In" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="DateTimeIn" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="Batchs" type="tns:ArrayOfFDIPostSaleOrderBatch" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetFDIPostSaleOrderDetailCount">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostSaleOrderDetailCountResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetFDIPostSaleOrderDetailCountResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIPostSaleOrderDetail">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIPostSaleOrderDetail" type="tns:FDIPostSaleOrderDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIPostSaleOrderDetailResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AddFDIPostSaleOrderDetailResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIPostSaleOrderDetail">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIPostSaleOrderDetail" type="tns:FDIPostSaleOrderDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIPostSaleOrderDetailResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateFDIPostSaleOrderDetailResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostSaleOrderDetails">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Ids" type="tns:ArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostSaleOrderDetailsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIPostSaleOrderDetailsResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostSaleOrderDetail">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostSaleOrderDetailResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIPostSaleOrderDetailResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostSaleOrderDetails">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostSaleOrderDetailsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIPostSaleOrderDetailsResult" type="tns:ArrayOfFDIPostSaleOrderDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostSaleOrderDetailById">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostSaleOrderDetailByIdResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIPostSaleOrderDetailByIdResult" type="tns:FDIPostSaleOrderDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostSaleOrderByPage">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="pageSize" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="pageIndex" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="isAsc" type="s:boolean" />
            <s:element minOccurs="0" maxOccurs="1" name="orderField" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostSaleOrderByPageResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIPostSaleOrderByPageResult" type="tns:ArrayOfFDIPostSaleOrder" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfFDIPostSaleOrder">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="FDIPostSaleOrder" nillable="true" type="tns:FDIPostSaleOrder" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="FDIPostSaleOrder">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="PKNO" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CardCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CardName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Shiptocode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Address3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Phone1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CntctCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocType" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocDate" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocStatus" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocEntry" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Comments" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="UserSign" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="PayType" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DeliveryNum" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocTime" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf4" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf5" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Flag_In" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="DateTimeIn" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="Details" type="tns:ArrayOfFDIPostSaleOrderDetail" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetFDIPostSaleOrderCount">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostSaleOrderCountResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetFDIPostSaleOrderCountResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIPostSaleOrder">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIPostSaleOrder" type="tns:FDIPostSaleOrder" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIPostSaleOrderResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AddFDIPostSaleOrderResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIPostSaleOrder">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIPostSaleOrder" type="tns:FDIPostSaleOrder" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIPostSaleOrderResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateFDIPostSaleOrderResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostSaleOrders">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Ids" type="tns:ArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostSaleOrdersResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIPostSaleOrdersResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostSaleOrder">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostSaleOrderResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIPostSaleOrderResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostSaleOrders">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostSaleOrdersResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIPostSaleOrdersResult" type="tns:ArrayOfFDIPostSaleOrder" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostSaleOrderById">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostSaleOrderByIdResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIPostSaleOrderByIdResult" type="tns:FDIPostSaleOrder" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOIssueBatchByPage">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="pageSize" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="pageIndex" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="isAsc" type="s:boolean" />
            <s:element minOccurs="0" maxOccurs="1" name="orderField" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOIssueBatchByPageResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIPostWOIssueBatchByPageResult" type="tns:ArrayOfFDIPostWOIssueBatch" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfFDIPostWOIssueBatch">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="FDIPostWOIssueBatch" nillable="true" type="tns:FDIPostWOIssueBatch" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="FDIPostWOIssueBatch">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="PKNO" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocEntry" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemLineId" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="LineNum" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemCode" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Quantity" nillable="true" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="BatchNum" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf4" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf5" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Flag_In" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="DateTimeIn" type="s:dateTime" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetFDIPostWOIssueBatchCount">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOIssueBatchCountResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetFDIPostWOIssueBatchCountResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIPostWOIssueBatch">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIPostWOIssueBatch" type="tns:FDIPostWOIssueBatch" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIPostWOIssueBatchResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AddFDIPostWOIssueBatchResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIPostWOIssueBatch">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIPostWOIssueBatch" type="tns:FDIPostWOIssueBatch" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIPostWOIssueBatchResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateFDIPostWOIssueBatchResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostWOIssueBatchs">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Ids" type="tns:ArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostWOIssueBatchsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIPostWOIssueBatchsResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostWOIssueBatch">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostWOIssueBatchResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIPostWOIssueBatchResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOIssueBatchs">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOIssueBatchsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIPostWOIssueBatchsResult" type="tns:ArrayOfFDIPostWOIssueBatch" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOIssueBatchById">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOIssueBatchByIdResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIPostWOIssueBatchByIdResult" type="tns:FDIPostWOIssueBatch" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOIssueDetailByPage">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="pageSize" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="pageIndex" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="isAsc" type="s:boolean" />
            <s:element minOccurs="0" maxOccurs="1" name="orderField" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOIssueDetailByPageResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIPostWOIssueDetailByPageResult" type="tns:ArrayOfFDIPostSaleOrderDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOIssueDetailCount">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOIssueDetailCountResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetFDIPostWOIssueDetailCountResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIPostWOIssueDetail">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIPostWOIssueDetail" type="tns:FDIPostSaleOrderDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIPostWOIssueDetailResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AddFDIPostWOIssueDetailResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIPostWOIssueDetail">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIPostWOIssueDetail" type="tns:FDIPostSaleOrderDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIPostWOIssueDetailResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateFDIPostWOIssueDetailResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostWOIssueDetails">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Ids" type="tns:ArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostWOIssueDetailsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIPostWOIssueDetailsResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostWOIssueDetail">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostWOIssueDetailResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIPostWOIssueDetailResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOIssueDetails">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOIssueDetailsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIPostWOIssueDetailsResult" type="tns:ArrayOfFDIPostSaleOrderDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOIssueDetailById">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOIssueDetailByIdResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIPostWOIssueDetailByIdResult" type="tns:FDIPostSaleOrderDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOIssueByPage">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="pageSize" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="pageIndex" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="isAsc" type="s:boolean" />
            <s:element minOccurs="0" maxOccurs="1" name="orderField" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOIssueByPageResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIPostWOIssueByPageResult" type="tns:ArrayOfFDIPostWOIssue" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfFDIPostWOIssue">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="FDIPostWOIssue" nillable="true" type="tns:FDIPostWOIssue" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="FDIPostWOIssue">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="PKNO" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocDate" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocEntry" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Comments" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="UserSign" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocTime" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf4" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf5" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Flag_In" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="DateTimeIn" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="Details" type="tns:ArrayOfFDIPostWOIssueDetail" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfFDIPostWOIssueDetail">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="FDIPostWOIssueDetail" nillable="true" type="tns:FDIPostWOIssueDetail" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="FDIPostWOIssueDetail">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="PKNO" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocEntry" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="LineId" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemName" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Quantity" nillable="true" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="WhsCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="BaseEntry" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="BaseLine" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="unitMsr" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf4" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf5" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Flag_In" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="DateTimeIn" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="Batchs" type="tns:ArrayOfFDIPostWOIssueBatch" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetFDIPostWOIssueCount">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOIssueCountResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetFDIPostWOIssueCountResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIPostWOIssue">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIPostWOIssue" type="tns:FDIPostWOIssue" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIPostWOIssueResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AddFDIPostWOIssueResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIPostWOIssue">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIPostWOIssue" type="tns:FDIPostWOIssue" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIPostWOIssueResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateFDIPostWOIssueResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostWOIssues">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Ids" type="tns:ArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostWOIssuesResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIPostWOIssuesResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostWOIssue">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostWOIssueResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIPostWOIssueResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOIssues">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOIssuesResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIPostWOIssuesResult" type="tns:ArrayOfFDIPostWOIssue" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOIssueById">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOIssueByIdResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIPostWOIssueByIdResult" type="tns:FDIPostWOIssue" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOCloseBatchByPage">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="pageSize" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="pageIndex" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="isAsc" type="s:boolean" />
            <s:element minOccurs="0" maxOccurs="1" name="orderField" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOCloseBatchByPageResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIPostWOCloseBatchByPageResult" type="tns:ArrayOfFDIPostWOCloseBatch" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfFDIPostWOCloseBatch">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="FDIPostWOCloseBatch" nillable="true" type="tns:FDIPostWOCloseBatch" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="FDIPostWOCloseBatch">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="PKNO" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocEntry" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemLineId" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="LineNum" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemCode" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Quantity" nillable="true" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="BatchNum" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf4" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf5" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Flag_In" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="DateTimeIn" type="s:dateTime" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetFDIPostWOCloseBatchCount">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOCloseBatchCountResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetFDIPostWOCloseBatchCountResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIPostWOCloseBatch">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIPostWOCloseBatch" type="tns:FDIPostWOCloseBatch" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIPostWOCloseBatchResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AddFDIPostWOCloseBatchResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIPostWOCloseBatch">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIPostWOCloseBatch" type="tns:FDIPostWOCloseBatch" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIPostWOCloseBatchResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateFDIPostWOCloseBatchResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostWOCloseBatchs">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Ids" type="tns:ArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostWOCloseBatchsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIPostWOCloseBatchsResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostWOCloseBatch">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostWOCloseBatchResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIPostWOCloseBatchResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOCloseBatchs">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOCloseBatchsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIPostWOCloseBatchsResult" type="tns:ArrayOfFDIPostWOCloseBatch" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOCloseBatchById">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOCloseBatchByIdResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIPostWOCloseBatchByIdResult" type="tns:FDIPostWOCloseBatch" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOCloseDetailByPage">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="pageSize" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="pageIndex" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="isAsc" type="s:boolean" />
            <s:element minOccurs="0" maxOccurs="1" name="orderField" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOCloseDetailByPageResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIPostWOCloseDetailByPageResult" type="tns:ArrayOfFDIPostWOCloseDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfFDIPostWOCloseDetail">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="FDIPostWOCloseDetail" nillable="true" type="tns:FDIPostWOCloseDetail" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="FDIPostWOCloseDetail">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="PKNO" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocEntry" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="LineNum" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemName" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Qty" nillable="true" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="WareHouse" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Project" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="BaseREF" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="BaseEntry" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="BaseLine" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="OcrCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="OcrCode2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="OcrCode3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="OcrCode4" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="OcrCode5" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="WorkTime" nillable="true" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="BatchNum" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf4" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf5" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Flag_In" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="Batchs" type="tns:ArrayOfFDIPostWOCloseBatch" />
          <s:element minOccurs="1" maxOccurs="1" name="DateTimeIn" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="Batchs0" type="tns:ArrayOfFDIPostWOCloseBatch" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetFDIPostWOCloseDetailCount">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOCloseDetailCountResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetFDIPostWOCloseDetailCountResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIPostWOCloseDetail">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIPostWOCloseDetail" type="tns:FDIPostWOCloseDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIPostWOCloseDetailResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AddFDIPostWOCloseDetailResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIPostWOCloseDetail">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIPostWOCloseDetail" type="tns:FDIPostWOCloseDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIPostWOCloseDetailResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateFDIPostWOCloseDetailResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostWOCloseDetails">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Ids" type="tns:ArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostWOCloseDetailsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIPostWOCloseDetailsResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostWOCloseDetail">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostWOCloseDetailResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIPostWOCloseDetailResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOCloseDetails">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOCloseDetailsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIPostWOCloseDetailsResult" type="tns:ArrayOfFDIPostWOCloseDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOCloseDetailById">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOCloseDetailByIdResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIPostWOCloseDetailByIdResult" type="tns:FDIPostWOCloseDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOCloseByPage">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="pageSize" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="pageIndex" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="isAsc" type="s:boolean" />
            <s:element minOccurs="0" maxOccurs="1" name="orderField" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOCloseByPageResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIPostWOCloseByPageResult" type="tns:ArrayOfFDIPostWOClose" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfFDIPostWOClose">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="FDIPostWOClose" nillable="true" type="tns:FDIPostWOClose" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="FDIPostWOClose">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="PKNO" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocDate" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Docentry" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Comments" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Status" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="UserSign" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocTime" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf4" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf5" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Flag_In" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="DateTimeIn" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="Details" type="tns:ArrayOfFDIPostWOCloseDetail" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetFDIPostWOCloseCount">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOCloseCountResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetFDIPostWOCloseCountResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIPostWOClose">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIPostWOClose" type="tns:FDIPostWOClose" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIPostWOCloseResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AddFDIPostWOCloseResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIPostWOClose">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIPostWOClose" type="tns:FDIPostWOClose" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIPostWOCloseResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateFDIPostWOCloseResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostWOCloses">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Ids" type="tns:ArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostWOClosesResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIPostWOClosesResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostWOClose">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIPostWOCloseResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIPostWOCloseResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOCloses">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOClosesResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIPostWOClosesResult" type="tns:ArrayOfFDIPostWOClose" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOCloseById">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIPostWOCloseByIdResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIPostWOCloseByIdResult" type="tns:FDIPostWOClose" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetMaterialInfoByPage">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="pageSize" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="pageIndex" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="isAsc" type="s:boolean" />
            <s:element minOccurs="0" maxOccurs="1" name="orderField" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetMaterialInfoByPageResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIGetMaterialInfoByPageResult" type="tns:ArrayOfFDIGetMaterialInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfFDIGetMaterialInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="FDIGetMaterialInfo" nillable="true" type="tns:FDIGetMaterialInfo" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="FDIGetMaterialInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="PKNO" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="FrgnName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Spec" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItmsGrpName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItmsGrpCod" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="PrchseItem" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="SellItem" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="InvntItem" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DfltWH" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CardCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="BuyUnitMsr" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="SalUnitMsr" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ManSerNum" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ManBtchNum" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="validFor" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="INUoMEntry" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="PrcrmntMtd" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="BVolume" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Length" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Width" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Thickness" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Weight" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Material" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Diameter" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf4" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf5" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Flag_In" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="DateTimeIn" type="s:dateTime" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetFDIGetMaterialInfoCount">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetMaterialInfoCountResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetFDIGetMaterialInfoCountResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIGetMaterialInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIGetMaterialInfo" type="tns:FDIGetMaterialInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIGetMaterialInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AddFDIGetMaterialInfoResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIGetMaterialInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIGetMaterialInfo" type="tns:FDIGetMaterialInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIGetMaterialInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateFDIGetMaterialInfoResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIGetMaterialInfos">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Ids" type="tns:ArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIGetMaterialInfosResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIGetMaterialInfosResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIGetMaterialInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIGetMaterialInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIGetMaterialInfoResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetMaterialInfos">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetMaterialInfosResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIGetMaterialInfosResult" type="tns:ArrayOfFDIGetMaterialInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetMaterialInfoById">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetMaterialInfoByIdResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIGetMaterialInfoByIdResult" type="tns:FDIGetMaterialInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetSaleOrderDetailByPage">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="pageSize" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="pageIndex" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="isAsc" type="s:boolean" />
            <s:element minOccurs="0" maxOccurs="1" name="orderField" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetSaleOrderDetailByPageResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIGetSaleOrderDetailByPageResult" type="tns:ArrayOfFDIGetSaleOrderDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfFDIGetSaleOrderDetail">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="FDIGetSaleOrderDetail" nillable="true" type="tns:FDIGetSaleOrderDetail" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="FDIGetSaleOrderDetail">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="PKNO" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocEntry" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="LineId" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemName" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Quantity" nillable="true" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="WhsCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="BaseEntry" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="BaseLine" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="unitMsr" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf4" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf5" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Flag_In" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="DateTimeIn" type="s:dateTime" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetFDIGetSaleOrderDetailCount">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetSaleOrderDetailCountResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetFDIGetSaleOrderDetailCountResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIGetSaleOrderDetail">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIGetSaleOrderDetail" type="tns:FDIGetSaleOrderDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIGetSaleOrderDetailResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AddFDIGetSaleOrderDetailResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIGetSaleOrderDetail">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIGetSaleOrderDetail" type="tns:FDIGetSaleOrderDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIGetSaleOrderDetailResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateFDIGetSaleOrderDetailResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIGetSaleOrderDetails">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Ids" type="tns:ArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIGetSaleOrderDetailsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIGetSaleOrderDetailsResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIGetSaleOrderDetail">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIGetSaleOrderDetailResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIGetSaleOrderDetailResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetSaleOrderDetails">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetSaleOrderDetailsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIGetSaleOrderDetailsResult" type="tns:ArrayOfFDIGetSaleOrderDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetSaleOrderDetailById">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetSaleOrderDetailByIdResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIGetSaleOrderDetailByIdResult" type="tns:FDIGetSaleOrderDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetSaleOrderByPage">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="pageSize" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="pageIndex" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="isAsc" type="s:boolean" />
            <s:element minOccurs="0" maxOccurs="1" name="orderField" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetSaleOrderByPageResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIGetSaleOrderByPageResult" type="tns:ArrayOfFDIGetSaleOrder" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfFDIGetSaleOrder">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="FDIGetSaleOrder" nillable="true" type="tns:FDIGetSaleOrder" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="FDIGetSaleOrder">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="PKNO" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CardCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CardName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ShiptoCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Address3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Phone1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CntctCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocType" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocDate" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocStatus" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocEntry" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Comments" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="UserSign" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="PayType" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DeliveryNum" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocTime" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf4" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf5" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Flag_In" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="DateTimeIn" type="s:dateTime" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetFDIGetSaleOrderCount">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetSaleOrderCountResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetFDIGetSaleOrderCountResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIGetSaleOrder">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIGetSaleOrder" type="tns:FDIGetSaleOrder" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIGetSaleOrderResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AddFDIGetSaleOrderResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIGetSaleOrder">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIGetSaleOrder" type="tns:FDIGetSaleOrder" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIGetSaleOrderResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateFDIGetSaleOrderResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIGetSaleOrders">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Ids" type="tns:ArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIGetSaleOrdersResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIGetSaleOrdersResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIGetSaleOrder">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIGetSaleOrderResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIGetSaleOrderResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetSaleOrders">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetSaleOrdersResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIGetSaleOrdersResult" type="tns:ArrayOfFDIGetSaleOrder" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetSaleOrderById">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetSaleOrderByIdResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIGetSaleOrderByIdResult" type="tns:FDIGetSaleOrder" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetWOrderDetailByPage">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="pageSize" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="pageIndex" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="isAsc" type="s:boolean" />
            <s:element minOccurs="0" maxOccurs="1" name="orderField" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetWOrderDetailByPageResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIGetWOrderDetailByPageResult" type="tns:ArrayOfFDIGetWOrderDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfFDIGetWOrderDetail">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="FDIGetWOrderDetail" nillable="true" type="tns:FDIGetWOrderDetail" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="FDIGetWOrderDetail">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="PKNO" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocEntry" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="LineNum" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemCode" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="BaseQty" nillable="true" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="PlannedQty" nillable="true" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="WareHouse" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Project" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="OcrCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="OcrCode2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="OcrCode3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="OcrCode4" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="OcrCode5" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf4" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf5" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Flag_In" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="DateTimeIn" type="s:dateTime" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetFDIGetWOrderDetailCount">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetWOrderDetailCountResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetFDIGetWOrderDetailCountResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIGetWOrderDetail">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIGetWOrderDetail" type="tns:FDIGetWOrderDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIGetWOrderDetailResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AddFDIGetWOrderDetailResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIGetWOrderDetail">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIGetWOrderDetail" type="tns:FDIGetWOrderDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIGetWOrderDetailResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateFDIGetWOrderDetailResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIGetWOrderDetails">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Ids" type="tns:ArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIGetWOrderDetailsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIGetWOrderDetailsResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIGetWOrderDetail">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIGetWOrderDetailResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIGetWOrderDetailResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetWOrderDetails">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetWOrderDetailsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIGetWOrderDetailsResult" type="tns:ArrayOfFDIGetWOrderDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetWOrderDetailById">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetWOrderDetailByIdResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIGetWOrderDetailByIdResult" type="tns:FDIGetWOrderDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetWOrderByPage">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="pageSize" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="pageIndex" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="isAsc" type="s:boolean" />
            <s:element minOccurs="0" maxOccurs="1" name="orderField" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetWOrderByPageResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIGetWOrderByPageResult" type="tns:ArrayOfFDIGetWOrder" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfFDIGetWOrder">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="FDIGetWOrder" nillable="true" type="tns:FDIGetWOrder" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="FDIGetWOrder">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="PKNO" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocEntry" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Status" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Type" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="PlannedQty" nillable="true" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="Comments" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="RlsDate" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Warehouse" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Project" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="OcrCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="OcrCode2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="OcrCode3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="OcrCode4" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="OcrCode5" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="OriginNum" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Cardcode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="UserSign" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="StartDate" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DueDate" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocTime" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf4" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf5" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Flag_In" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="DateTimeIn" type="s:dateTime" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetFDIGetWOrderCount">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetWOrderCountResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetFDIGetWOrderCountResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIGetWOrder">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIGetWOrder" type="tns:FDIGetWOrder" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIGetWOrderResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AddFDIGetWOrderResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIGetWOrder">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIGetWOrder" type="tns:FDIGetWOrder" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIGetWOrderResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateFDIGetWOrderResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIGetWOrders">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Ids" type="tns:ArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIGetWOrdersResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIGetWOrdersResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIGetWOrder">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIGetWOrderResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIGetWOrderResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetWOrders">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetWOrdersResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIGetWOrdersResult" type="tns:ArrayOfFDIGetWOrder" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetWOrderById">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetWOrderByIdResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIGetWOrderByIdResult" type="tns:FDIGetWOrder" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetRawMaterialDetailByPage">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="pageSize" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="pageIndex" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="isAsc" type="s:boolean" />
            <s:element minOccurs="0" maxOccurs="1" name="orderField" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetRawMaterialDetailByPageResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIGetRawMaterialDetailByPageResult" type="tns:ArrayOfFDIGetRawMaterialDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfFDIGetRawMaterialDetail">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="FDIGetRawMaterialDetail" nillable="true" type="tns:FDIGetRawMaterialDetail" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="FDIGetRawMaterialDetail">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="PKNO" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocEntry" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="LineId" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemName" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Quantity" nillable="true" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="WhsCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="BaseEntry" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="BaseLine" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="unitMsr" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf4" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf5" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Flag_In" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="DateTimeIn" type="s:dateTime" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetFDIGetRawMaterialDetailCount">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetRawMaterialDetailCountResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetFDIGetRawMaterialDetailCountResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIGetRawMaterialDetail">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIGetRawMaterialDetail" type="tns:FDIGetRawMaterialDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIGetRawMaterialDetailResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AddFDIGetRawMaterialDetailResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIGetRawMaterialDetail">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIGetRawMaterialDetail" type="tns:FDIGetRawMaterialDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIGetRawMaterialDetailResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateFDIGetRawMaterialDetailResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIGetRawMaterialDetails">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Ids" type="tns:ArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIGetRawMaterialDetailsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIGetRawMaterialDetailsResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIGetRawMaterialDetail">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIGetRawMaterialDetailResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIGetRawMaterialDetailResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetRawMaterialDetails">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetRawMaterialDetailsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIGetRawMaterialDetailsResult" type="tns:ArrayOfFDIGetRawMaterialDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetRawMaterialDetailById">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetRawMaterialDetailByIdResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIGetRawMaterialDetailByIdResult" type="tns:FDIGetRawMaterialDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetRawMaterialByPage">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="pageSize" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="pageIndex" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="isAsc" type="s:boolean" />
            <s:element minOccurs="0" maxOccurs="1" name="orderField" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetRawMaterialByPageResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIGetRawMaterialByPageResult" type="tns:ArrayOfFDIGetRawMaterial" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfFDIGetRawMaterial">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="FDIGetRawMaterial" nillable="true" type="tns:FDIGetRawMaterial" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="FDIGetRawMaterial">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="PKNO" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CardCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CardName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocType" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocDate" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocStatus" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocEntry" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="UserSign" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Comments" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocTime" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf4" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Udf5" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Flag_In" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="DateTimeIn" type="s:dateTime" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetFDIGetRawMaterialCount">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetRawMaterialCountResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetFDIGetRawMaterialCountResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIGetRawMaterial">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIGetRawMaterial" type="tns:FDIGetRawMaterial" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIGetRawMaterialResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AddFDIGetRawMaterialResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIGetRawMaterial">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIGetRawMaterial" type="tns:FDIGetRawMaterial" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIGetRawMaterialResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateFDIGetRawMaterialResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIGetRawMaterials">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Ids" type="tns:ArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIGetRawMaterialsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIGetRawMaterialsResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIGetRawMaterial">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIGetRawMaterialResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIGetRawMaterialResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetRawMaterials">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetRawMaterialsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIGetRawMaterialsResult" type="tns:ArrayOfFDIGetRawMaterial" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetRawMaterialById">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetRawMaterialByIdResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIGetRawMaterialByIdResult" type="tns:FDIGetRawMaterial" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetMaterialDetailByPage">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="pageSize" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="pageIndex" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="isAsc" type="s:boolean" />
            <s:element minOccurs="0" maxOccurs="1" name="orderField" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetMaterialDetailByPageResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIGetMaterialDetailByPageResult" type="tns:ArrayOfFDIGetMaterialDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfFDIGetMaterialDetail">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="FDIGetMaterialDetail" nillable="true" type="tns:FDIGetMaterialDetail" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="FDIGetMaterialDetail">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="PKNO" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ReciverID" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="LineId" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ItemName" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Quantity" nillable="true" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="Whscode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="PurchaseOrder" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="PurchaseLinerId" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="UnitMsr" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="BatchNo" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Flag_In" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="DateTimeIn" type="s:dateTime" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetFDIGetMaterialDetailCount">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetMaterialDetailCountResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetFDIGetMaterialDetailCountResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIGetMaterialDetail">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIGetMaterialDetail" type="tns:FDIGetMaterialDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIGetMaterialDetailResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AddFDIGetMaterialDetailResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIGetMaterialDetail">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIGetMaterialDetail" type="tns:FDIGetMaterialDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIGetMaterialDetailResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateFDIGetMaterialDetailResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIGetMaterialDetails">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Ids" type="tns:ArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIGetMaterialDetailsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIGetMaterialDetailsResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIGetMaterialDetail">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIGetMaterialDetailResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIGetMaterialDetailResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetMaterialDetails">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetMaterialDetailsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIGetMaterialDetailsResult" type="tns:ArrayOfFDIGetMaterialDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetMaterialDetailById">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetMaterialDetailByIdResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIGetMaterialDetailByIdResult" type="tns:FDIGetMaterialDetail" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetMaterialByPage">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="pageSize" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="pageIndex" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="isAsc" type="s:boolean" />
            <s:element minOccurs="0" maxOccurs="1" name="orderField" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetMaterialByPageResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIGetMaterialByPageResult" type="tns:ArrayOfFDIGetMaterial" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfFDIGetMaterial">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="FDIGetMaterial" nillable="true" type="tns:FDIGetMaterial" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="FDIGetMaterial">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="PKNO" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="SupplierCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="SupplierName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocType" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DocDate" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="DocStatus" nillable="true" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="ReciverID" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Creater" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Remark" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Flag_In" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="DateTimeIn" type="s:dateTime" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetFDIGetMaterialCount">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetMaterialCountResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetFDIGetMaterialCountResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIGetMaterial">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIGetMaterial" type="tns:FDIGetMaterial" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFDIGetMaterialResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AddFDIGetMaterialResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIGetMaterial">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mFDIGetMaterial" type="tns:FDIGetMaterial" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFDIGetMaterialResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateFDIGetMaterialResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIGetMaterials">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Ids" type="tns:ArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIGetMaterialsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIGetMaterialsResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIGetMaterial">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelFDIGetMaterialResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="DelFDIGetMaterialResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetMaterials">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sWhere" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetMaterialsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIGetMaterialsResult" type="tns:ArrayOfFDIGetMaterial" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetMaterialById">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFDIGetMaterialByIdResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFDIGetMaterialByIdResult" type="tns:FDIGetMaterial" />
          </s:sequence>
        </s:complexType>
      </s:element>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="GetRawMaterialSoapIn">
    <wsdl:part name="parameters" element="tns:GetRawMaterial" />
  </wsdl:message>
  <wsdl:message name="GetRawMaterialSoapOut">
    <wsdl:part name="parameters" element="tns:GetRawMaterialResponse" />
  </wsdl:message>
  <wsdl:message name="GetMaterialInfoSoapIn">
    <wsdl:part name="parameters" element="tns:GetMaterialInfo" />
  </wsdl:message>
  <wsdl:message name="GetMaterialInfoSoapOut">
    <wsdl:part name="parameters" element="tns:GetMaterialInfoResponse" />
  </wsdl:message>
  <wsdl:message name="GetWorkOrderSoapIn">
    <wsdl:part name="parameters" element="tns:GetWorkOrder" />
  </wsdl:message>
  <wsdl:message name="GetWorkOrderSoapOut">
    <wsdl:part name="parameters" element="tns:GetWorkOrderResponse" />
  </wsdl:message>
  <wsdl:message name="GetDNOrderSoapIn">
    <wsdl:part name="parameters" element="tns:GetDNOrder" />
  </wsdl:message>
  <wsdl:message name="GetDNOrderSoapOut">
    <wsdl:part name="parameters" element="tns:GetDNOrderResponse" />
  </wsdl:message>
  <wsdl:message name="PostWOCloseSoapIn">
    <wsdl:part name="parameters" element="tns:PostWOClose" />
  </wsdl:message>
  <wsdl:message name="PostWOCloseSoapOut">
    <wsdl:part name="parameters" element="tns:PostWOCloseResponse" />
  </wsdl:message>
  <wsdl:message name="PostWOIssueSoapIn">
    <wsdl:part name="parameters" element="tns:PostWOIssue" />
  </wsdl:message>
  <wsdl:message name="PostWOIssueSoapOut">
    <wsdl:part name="parameters" element="tns:PostWOIssueResponse" />
  </wsdl:message>
  <wsdl:message name="PostDNOrderSoapIn">
    <wsdl:part name="parameters" element="tns:PostDNOrder" />
  </wsdl:message>
  <wsdl:message name="PostDNOrderSoapOut">
    <wsdl:part name="parameters" element="tns:PostDNOrderResponse" />
  </wsdl:message>
  <wsdl:message name="PostRawMaterialSoapIn">
    <wsdl:part name="parameters" element="tns:PostRawMaterial" />
  </wsdl:message>
  <wsdl:message name="PostRawMaterialSoapOut">
    <wsdl:part name="parameters" element="tns:PostRawMaterialResponse" />
  </wsdl:message>
  <wsdl:message name="PostInventorySynSoapIn">
    <wsdl:part name="parameters" element="tns:PostInventorySyn" />
  </wsdl:message>
  <wsdl:message name="PostInventorySynSoapOut">
    <wsdl:part name="parameters" element="tns:PostInventorySynResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIInventorySynBacthByPageSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIInventorySynBacthByPage" />
  </wsdl:message>
  <wsdl:message name="GetFDIInventorySynBacthByPageSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIInventorySynBacthByPageResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIInventorySynBacthCountSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIInventorySynBacthCount" />
  </wsdl:message>
  <wsdl:message name="GetFDIInventorySynBacthCountSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIInventorySynBacthCountResponse" />
  </wsdl:message>
  <wsdl:message name="AddFDIInventorySynBacthSoapIn">
    <wsdl:part name="parameters" element="tns:AddFDIInventorySynBacth" />
  </wsdl:message>
  <wsdl:message name="AddFDIInventorySynBacthSoapOut">
    <wsdl:part name="parameters" element="tns:AddFDIInventorySynBacthResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIInventorySynBacthSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateFDIInventorySynBacth" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIInventorySynBacthSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateFDIInventorySynBacthResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIInventorySynBacthsSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIInventorySynBacths" />
  </wsdl:message>
  <wsdl:message name="DelFDIInventorySynBacthsSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIInventorySynBacthsResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIInventorySynBacthSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIInventorySynBacth" />
  </wsdl:message>
  <wsdl:message name="DelFDIInventorySynBacthSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIInventorySynBacthResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIInventorySynBacthsSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIInventorySynBacths" />
  </wsdl:message>
  <wsdl:message name="GetFDIInventorySynBacthsSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIInventorySynBacthsResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIInventorySynBacthByIdSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIInventorySynBacthById" />
  </wsdl:message>
  <wsdl:message name="GetFDIInventorySynBacthByIdSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIInventorySynBacthByIdResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIInventorySynByPageSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIInventorySynByPage" />
  </wsdl:message>
  <wsdl:message name="GetFDIInventorySynByPageSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIInventorySynByPageResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIInventorySynCountSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIInventorySynCount" />
  </wsdl:message>
  <wsdl:message name="GetFDIInventorySynCountSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIInventorySynCountResponse" />
  </wsdl:message>
  <wsdl:message name="AddFDIInventorySynSoapIn">
    <wsdl:part name="parameters" element="tns:AddFDIInventorySyn" />
  </wsdl:message>
  <wsdl:message name="AddFDIInventorySynSoapOut">
    <wsdl:part name="parameters" element="tns:AddFDIInventorySynResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIInventorySynSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateFDIInventorySyn" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIInventorySynSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateFDIInventorySynResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIInventorySynsSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIInventorySyns" />
  </wsdl:message>
  <wsdl:message name="DelFDIInventorySynsSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIInventorySynsResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIInventorySynSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIInventorySyn" />
  </wsdl:message>
  <wsdl:message name="DelFDIInventorySynSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIInventorySynResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIInventorySynsSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIInventorySyns" />
  </wsdl:message>
  <wsdl:message name="GetFDIInventorySynsSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIInventorySynsResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIInventorySynByIdSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIInventorySynById" />
  </wsdl:message>
  <wsdl:message name="GetFDIInventorySynByIdSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIInventorySynByIdResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostRawMaterialBatchByPageSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostRawMaterialBatchByPage" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostRawMaterialBatchByPageSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostRawMaterialBatchByPageResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostRawMaterialBatchCountSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostRawMaterialBatchCount" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostRawMaterialBatchCountSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostRawMaterialBatchCountResponse" />
  </wsdl:message>
  <wsdl:message name="AddFDIPostRawMaterialBatchSoapIn">
    <wsdl:part name="parameters" element="tns:AddFDIPostRawMaterialBatch" />
  </wsdl:message>
  <wsdl:message name="AddFDIPostRawMaterialBatchSoapOut">
    <wsdl:part name="parameters" element="tns:AddFDIPostRawMaterialBatchResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIPostRawMaterialBatchSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateFDIPostRawMaterialBatch" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIPostRawMaterialBatchSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateFDIPostRawMaterialBatchResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostRawMaterialBatchsSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIPostRawMaterialBatchs" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostRawMaterialBatchsSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIPostRawMaterialBatchsResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostRawMaterialBatchSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIPostRawMaterialBatch" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostRawMaterialBatchSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIPostRawMaterialBatchResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostRawMaterialBatchsSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostRawMaterialBatchs" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostRawMaterialBatchsSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostRawMaterialBatchsResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostRawMaterialBatchByIdSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostRawMaterialBatchById" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostRawMaterialBatchByIdSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostRawMaterialBatchByIdResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostRawMaterialDetailByPageSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostRawMaterialDetailByPage" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostRawMaterialDetailByPageSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostRawMaterialDetailByPageResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostRawMaterialDetailCountSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostRawMaterialDetailCount" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostRawMaterialDetailCountSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostRawMaterialDetailCountResponse" />
  </wsdl:message>
  <wsdl:message name="AddFDIPostRawMaterialDetailSoapIn">
    <wsdl:part name="parameters" element="tns:AddFDIPostRawMaterialDetail" />
  </wsdl:message>
  <wsdl:message name="AddFDIPostRawMaterialDetailSoapOut">
    <wsdl:part name="parameters" element="tns:AddFDIPostRawMaterialDetailResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIPostRawMaterialDetailSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateFDIPostRawMaterialDetail" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIPostRawMaterialDetailSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateFDIPostRawMaterialDetailResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostRawMaterialDetailsSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIPostRawMaterialDetails" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostRawMaterialDetailsSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIPostRawMaterialDetailsResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostRawMaterialDetailSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIPostRawMaterialDetail" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostRawMaterialDetailSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIPostRawMaterialDetailResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostRawMaterialDetailsSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostRawMaterialDetails" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostRawMaterialDetailsSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostRawMaterialDetailsResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostRawMaterialDetailByIdSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostRawMaterialDetailById" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostRawMaterialDetailByIdSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostRawMaterialDetailByIdResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostRawMaterialByPageSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostRawMaterialByPage" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostRawMaterialByPageSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostRawMaterialByPageResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostRawMaterialCountSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostRawMaterialCount" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostRawMaterialCountSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostRawMaterialCountResponse" />
  </wsdl:message>
  <wsdl:message name="AddFDIPostRawMaterialSoapIn">
    <wsdl:part name="parameters" element="tns:AddFDIPostRawMaterial" />
  </wsdl:message>
  <wsdl:message name="AddFDIPostRawMaterialSoapOut">
    <wsdl:part name="parameters" element="tns:AddFDIPostRawMaterialResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIPostRawMaterialSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateFDIPostRawMaterial" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIPostRawMaterialSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateFDIPostRawMaterialResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostRawMaterialsSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIPostRawMaterials" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostRawMaterialsSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIPostRawMaterialsResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostRawMaterialSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIPostRawMaterial" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostRawMaterialSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIPostRawMaterialResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostRawMaterialsSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostRawMaterials" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostRawMaterialsSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostRawMaterialsResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostRawMaterialByIdSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostRawMaterialById" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostRawMaterialByIdSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostRawMaterialByIdResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostSaleOrderBatchByPageSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostSaleOrderBatchByPage" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostSaleOrderBatchByPageSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostSaleOrderBatchByPageResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostSaleOrderBatchCountSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostSaleOrderBatchCount" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostSaleOrderBatchCountSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostSaleOrderBatchCountResponse" />
  </wsdl:message>
  <wsdl:message name="AddFDIPostSaleOrderBatchSoapIn">
    <wsdl:part name="parameters" element="tns:AddFDIPostSaleOrderBatch" />
  </wsdl:message>
  <wsdl:message name="AddFDIPostSaleOrderBatchSoapOut">
    <wsdl:part name="parameters" element="tns:AddFDIPostSaleOrderBatchResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIPostSaleOrderBatchSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateFDIPostSaleOrderBatch" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIPostSaleOrderBatchSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateFDIPostSaleOrderBatchResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostSaleOrderBatchsSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIPostSaleOrderBatchs" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostSaleOrderBatchsSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIPostSaleOrderBatchsResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostSaleOrderBatchSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIPostSaleOrderBatch" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostSaleOrderBatchSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIPostSaleOrderBatchResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostSaleOrderBatchsSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostSaleOrderBatchs" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostSaleOrderBatchsSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostSaleOrderBatchsResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostSaleOrderBatchByIdSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostSaleOrderBatchById" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostSaleOrderBatchByIdSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostSaleOrderBatchByIdResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostSaleOrderDetailByPageSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostSaleOrderDetailByPage" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostSaleOrderDetailByPageSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostSaleOrderDetailByPageResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostSaleOrderDetailCountSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostSaleOrderDetailCount" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostSaleOrderDetailCountSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostSaleOrderDetailCountResponse" />
  </wsdl:message>
  <wsdl:message name="AddFDIPostSaleOrderDetailSoapIn">
    <wsdl:part name="parameters" element="tns:AddFDIPostSaleOrderDetail" />
  </wsdl:message>
  <wsdl:message name="AddFDIPostSaleOrderDetailSoapOut">
    <wsdl:part name="parameters" element="tns:AddFDIPostSaleOrderDetailResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIPostSaleOrderDetailSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateFDIPostSaleOrderDetail" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIPostSaleOrderDetailSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateFDIPostSaleOrderDetailResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostSaleOrderDetailsSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIPostSaleOrderDetails" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostSaleOrderDetailsSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIPostSaleOrderDetailsResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostSaleOrderDetailSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIPostSaleOrderDetail" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostSaleOrderDetailSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIPostSaleOrderDetailResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostSaleOrderDetailsSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostSaleOrderDetails" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostSaleOrderDetailsSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostSaleOrderDetailsResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostSaleOrderDetailByIdSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostSaleOrderDetailById" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostSaleOrderDetailByIdSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostSaleOrderDetailByIdResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostSaleOrderByPageSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostSaleOrderByPage" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostSaleOrderByPageSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostSaleOrderByPageResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostSaleOrderCountSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostSaleOrderCount" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostSaleOrderCountSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostSaleOrderCountResponse" />
  </wsdl:message>
  <wsdl:message name="AddFDIPostSaleOrderSoapIn">
    <wsdl:part name="parameters" element="tns:AddFDIPostSaleOrder" />
  </wsdl:message>
  <wsdl:message name="AddFDIPostSaleOrderSoapOut">
    <wsdl:part name="parameters" element="tns:AddFDIPostSaleOrderResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIPostSaleOrderSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateFDIPostSaleOrder" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIPostSaleOrderSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateFDIPostSaleOrderResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostSaleOrdersSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIPostSaleOrders" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostSaleOrdersSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIPostSaleOrdersResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostSaleOrderSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIPostSaleOrder" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostSaleOrderSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIPostSaleOrderResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostSaleOrdersSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostSaleOrders" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostSaleOrdersSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostSaleOrdersResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostSaleOrderByIdSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostSaleOrderById" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostSaleOrderByIdSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostSaleOrderByIdResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOIssueBatchByPageSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOIssueBatchByPage" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOIssueBatchByPageSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOIssueBatchByPageResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOIssueBatchCountSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOIssueBatchCount" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOIssueBatchCountSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOIssueBatchCountResponse" />
  </wsdl:message>
  <wsdl:message name="AddFDIPostWOIssueBatchSoapIn">
    <wsdl:part name="parameters" element="tns:AddFDIPostWOIssueBatch" />
  </wsdl:message>
  <wsdl:message name="AddFDIPostWOIssueBatchSoapOut">
    <wsdl:part name="parameters" element="tns:AddFDIPostWOIssueBatchResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIPostWOIssueBatchSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateFDIPostWOIssueBatch" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIPostWOIssueBatchSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateFDIPostWOIssueBatchResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostWOIssueBatchsSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIPostWOIssueBatchs" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostWOIssueBatchsSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIPostWOIssueBatchsResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostWOIssueBatchSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIPostWOIssueBatch" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostWOIssueBatchSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIPostWOIssueBatchResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOIssueBatchsSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOIssueBatchs" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOIssueBatchsSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOIssueBatchsResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOIssueBatchByIdSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOIssueBatchById" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOIssueBatchByIdSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOIssueBatchByIdResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOIssueDetailByPageSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOIssueDetailByPage" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOIssueDetailByPageSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOIssueDetailByPageResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOIssueDetailCountSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOIssueDetailCount" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOIssueDetailCountSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOIssueDetailCountResponse" />
  </wsdl:message>
  <wsdl:message name="AddFDIPostWOIssueDetailSoapIn">
    <wsdl:part name="parameters" element="tns:AddFDIPostWOIssueDetail" />
  </wsdl:message>
  <wsdl:message name="AddFDIPostWOIssueDetailSoapOut">
    <wsdl:part name="parameters" element="tns:AddFDIPostWOIssueDetailResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIPostWOIssueDetailSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateFDIPostWOIssueDetail" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIPostWOIssueDetailSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateFDIPostWOIssueDetailResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostWOIssueDetailsSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIPostWOIssueDetails" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostWOIssueDetailsSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIPostWOIssueDetailsResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostWOIssueDetailSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIPostWOIssueDetail" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostWOIssueDetailSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIPostWOIssueDetailResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOIssueDetailsSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOIssueDetails" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOIssueDetailsSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOIssueDetailsResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOIssueDetailByIdSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOIssueDetailById" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOIssueDetailByIdSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOIssueDetailByIdResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOIssueByPageSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOIssueByPage" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOIssueByPageSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOIssueByPageResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOIssueCountSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOIssueCount" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOIssueCountSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOIssueCountResponse" />
  </wsdl:message>
  <wsdl:message name="AddFDIPostWOIssueSoapIn">
    <wsdl:part name="parameters" element="tns:AddFDIPostWOIssue" />
  </wsdl:message>
  <wsdl:message name="AddFDIPostWOIssueSoapOut">
    <wsdl:part name="parameters" element="tns:AddFDIPostWOIssueResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIPostWOIssueSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateFDIPostWOIssue" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIPostWOIssueSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateFDIPostWOIssueResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostWOIssuesSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIPostWOIssues" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostWOIssuesSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIPostWOIssuesResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostWOIssueSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIPostWOIssue" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostWOIssueSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIPostWOIssueResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOIssuesSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOIssues" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOIssuesSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOIssuesResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOIssueByIdSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOIssueById" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOIssueByIdSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOIssueByIdResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOCloseBatchByPageSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOCloseBatchByPage" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOCloseBatchByPageSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOCloseBatchByPageResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOCloseBatchCountSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOCloseBatchCount" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOCloseBatchCountSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOCloseBatchCountResponse" />
  </wsdl:message>
  <wsdl:message name="AddFDIPostWOCloseBatchSoapIn">
    <wsdl:part name="parameters" element="tns:AddFDIPostWOCloseBatch" />
  </wsdl:message>
  <wsdl:message name="AddFDIPostWOCloseBatchSoapOut">
    <wsdl:part name="parameters" element="tns:AddFDIPostWOCloseBatchResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIPostWOCloseBatchSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateFDIPostWOCloseBatch" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIPostWOCloseBatchSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateFDIPostWOCloseBatchResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostWOCloseBatchsSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIPostWOCloseBatchs" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostWOCloseBatchsSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIPostWOCloseBatchsResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostWOCloseBatchSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIPostWOCloseBatch" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostWOCloseBatchSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIPostWOCloseBatchResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOCloseBatchsSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOCloseBatchs" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOCloseBatchsSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOCloseBatchsResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOCloseBatchByIdSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOCloseBatchById" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOCloseBatchByIdSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOCloseBatchByIdResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOCloseDetailByPageSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOCloseDetailByPage" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOCloseDetailByPageSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOCloseDetailByPageResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOCloseDetailCountSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOCloseDetailCount" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOCloseDetailCountSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOCloseDetailCountResponse" />
  </wsdl:message>
  <wsdl:message name="AddFDIPostWOCloseDetailSoapIn">
    <wsdl:part name="parameters" element="tns:AddFDIPostWOCloseDetail" />
  </wsdl:message>
  <wsdl:message name="AddFDIPostWOCloseDetailSoapOut">
    <wsdl:part name="parameters" element="tns:AddFDIPostWOCloseDetailResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIPostWOCloseDetailSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateFDIPostWOCloseDetail" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIPostWOCloseDetailSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateFDIPostWOCloseDetailResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostWOCloseDetailsSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIPostWOCloseDetails" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostWOCloseDetailsSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIPostWOCloseDetailsResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostWOCloseDetailSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIPostWOCloseDetail" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostWOCloseDetailSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIPostWOCloseDetailResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOCloseDetailsSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOCloseDetails" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOCloseDetailsSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOCloseDetailsResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOCloseDetailByIdSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOCloseDetailById" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOCloseDetailByIdSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOCloseDetailByIdResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOCloseByPageSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOCloseByPage" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOCloseByPageSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOCloseByPageResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOCloseCountSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOCloseCount" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOCloseCountSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOCloseCountResponse" />
  </wsdl:message>
  <wsdl:message name="AddFDIPostWOCloseSoapIn">
    <wsdl:part name="parameters" element="tns:AddFDIPostWOClose" />
  </wsdl:message>
  <wsdl:message name="AddFDIPostWOCloseSoapOut">
    <wsdl:part name="parameters" element="tns:AddFDIPostWOCloseResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIPostWOCloseSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateFDIPostWOClose" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIPostWOCloseSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateFDIPostWOCloseResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostWOClosesSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIPostWOCloses" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostWOClosesSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIPostWOClosesResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostWOCloseSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIPostWOClose" />
  </wsdl:message>
  <wsdl:message name="DelFDIPostWOCloseSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIPostWOCloseResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOClosesSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOCloses" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOClosesSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOClosesResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOCloseByIdSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOCloseById" />
  </wsdl:message>
  <wsdl:message name="GetFDIPostWOCloseByIdSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIPostWOCloseByIdResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetMaterialInfoByPageSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIGetMaterialInfoByPage" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetMaterialInfoByPageSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIGetMaterialInfoByPageResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetMaterialInfoCountSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIGetMaterialInfoCount" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetMaterialInfoCountSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIGetMaterialInfoCountResponse" />
  </wsdl:message>
  <wsdl:message name="AddFDIGetMaterialInfoSoapIn">
    <wsdl:part name="parameters" element="tns:AddFDIGetMaterialInfo" />
  </wsdl:message>
  <wsdl:message name="AddFDIGetMaterialInfoSoapOut">
    <wsdl:part name="parameters" element="tns:AddFDIGetMaterialInfoResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIGetMaterialInfoSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateFDIGetMaterialInfo" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIGetMaterialInfoSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateFDIGetMaterialInfoResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIGetMaterialInfosSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIGetMaterialInfos" />
  </wsdl:message>
  <wsdl:message name="DelFDIGetMaterialInfosSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIGetMaterialInfosResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIGetMaterialInfoSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIGetMaterialInfo" />
  </wsdl:message>
  <wsdl:message name="DelFDIGetMaterialInfoSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIGetMaterialInfoResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetMaterialInfosSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIGetMaterialInfos" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetMaterialInfosSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIGetMaterialInfosResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetMaterialInfoByIdSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIGetMaterialInfoById" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetMaterialInfoByIdSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIGetMaterialInfoByIdResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetSaleOrderDetailByPageSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIGetSaleOrderDetailByPage" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetSaleOrderDetailByPageSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIGetSaleOrderDetailByPageResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetSaleOrderDetailCountSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIGetSaleOrderDetailCount" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetSaleOrderDetailCountSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIGetSaleOrderDetailCountResponse" />
  </wsdl:message>
  <wsdl:message name="AddFDIGetSaleOrderDetailSoapIn">
    <wsdl:part name="parameters" element="tns:AddFDIGetSaleOrderDetail" />
  </wsdl:message>
  <wsdl:message name="AddFDIGetSaleOrderDetailSoapOut">
    <wsdl:part name="parameters" element="tns:AddFDIGetSaleOrderDetailResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIGetSaleOrderDetailSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateFDIGetSaleOrderDetail" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIGetSaleOrderDetailSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateFDIGetSaleOrderDetailResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIGetSaleOrderDetailsSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIGetSaleOrderDetails" />
  </wsdl:message>
  <wsdl:message name="DelFDIGetSaleOrderDetailsSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIGetSaleOrderDetailsResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIGetSaleOrderDetailSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIGetSaleOrderDetail" />
  </wsdl:message>
  <wsdl:message name="DelFDIGetSaleOrderDetailSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIGetSaleOrderDetailResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetSaleOrderDetailsSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIGetSaleOrderDetails" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetSaleOrderDetailsSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIGetSaleOrderDetailsResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetSaleOrderDetailByIdSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIGetSaleOrderDetailById" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetSaleOrderDetailByIdSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIGetSaleOrderDetailByIdResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetSaleOrderByPageSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIGetSaleOrderByPage" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetSaleOrderByPageSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIGetSaleOrderByPageResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetSaleOrderCountSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIGetSaleOrderCount" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetSaleOrderCountSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIGetSaleOrderCountResponse" />
  </wsdl:message>
  <wsdl:message name="AddFDIGetSaleOrderSoapIn">
    <wsdl:part name="parameters" element="tns:AddFDIGetSaleOrder" />
  </wsdl:message>
  <wsdl:message name="AddFDIGetSaleOrderSoapOut">
    <wsdl:part name="parameters" element="tns:AddFDIGetSaleOrderResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIGetSaleOrderSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateFDIGetSaleOrder" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIGetSaleOrderSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateFDIGetSaleOrderResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIGetSaleOrdersSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIGetSaleOrders" />
  </wsdl:message>
  <wsdl:message name="DelFDIGetSaleOrdersSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIGetSaleOrdersResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIGetSaleOrderSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIGetSaleOrder" />
  </wsdl:message>
  <wsdl:message name="DelFDIGetSaleOrderSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIGetSaleOrderResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetSaleOrdersSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIGetSaleOrders" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetSaleOrdersSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIGetSaleOrdersResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetSaleOrderByIdSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIGetSaleOrderById" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetSaleOrderByIdSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIGetSaleOrderByIdResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetWOrderDetailByPageSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIGetWOrderDetailByPage" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetWOrderDetailByPageSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIGetWOrderDetailByPageResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetWOrderDetailCountSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIGetWOrderDetailCount" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetWOrderDetailCountSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIGetWOrderDetailCountResponse" />
  </wsdl:message>
  <wsdl:message name="AddFDIGetWOrderDetailSoapIn">
    <wsdl:part name="parameters" element="tns:AddFDIGetWOrderDetail" />
  </wsdl:message>
  <wsdl:message name="AddFDIGetWOrderDetailSoapOut">
    <wsdl:part name="parameters" element="tns:AddFDIGetWOrderDetailResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIGetWOrderDetailSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateFDIGetWOrderDetail" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIGetWOrderDetailSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateFDIGetWOrderDetailResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIGetWOrderDetailsSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIGetWOrderDetails" />
  </wsdl:message>
  <wsdl:message name="DelFDIGetWOrderDetailsSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIGetWOrderDetailsResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIGetWOrderDetailSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIGetWOrderDetail" />
  </wsdl:message>
  <wsdl:message name="DelFDIGetWOrderDetailSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIGetWOrderDetailResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetWOrderDetailsSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIGetWOrderDetails" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetWOrderDetailsSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIGetWOrderDetailsResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetWOrderDetailByIdSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIGetWOrderDetailById" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetWOrderDetailByIdSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIGetWOrderDetailByIdResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetWOrderByPageSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIGetWOrderByPage" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetWOrderByPageSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIGetWOrderByPageResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetWOrderCountSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIGetWOrderCount" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetWOrderCountSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIGetWOrderCountResponse" />
  </wsdl:message>
  <wsdl:message name="AddFDIGetWOrderSoapIn">
    <wsdl:part name="parameters" element="tns:AddFDIGetWOrder" />
  </wsdl:message>
  <wsdl:message name="AddFDIGetWOrderSoapOut">
    <wsdl:part name="parameters" element="tns:AddFDIGetWOrderResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIGetWOrderSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateFDIGetWOrder" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIGetWOrderSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateFDIGetWOrderResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIGetWOrdersSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIGetWOrders" />
  </wsdl:message>
  <wsdl:message name="DelFDIGetWOrdersSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIGetWOrdersResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIGetWOrderSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIGetWOrder" />
  </wsdl:message>
  <wsdl:message name="DelFDIGetWOrderSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIGetWOrderResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetWOrdersSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIGetWOrders" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetWOrdersSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIGetWOrdersResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetWOrderByIdSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIGetWOrderById" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetWOrderByIdSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIGetWOrderByIdResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetRawMaterialDetailByPageSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIGetRawMaterialDetailByPage" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetRawMaterialDetailByPageSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIGetRawMaterialDetailByPageResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetRawMaterialDetailCountSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIGetRawMaterialDetailCount" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetRawMaterialDetailCountSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIGetRawMaterialDetailCountResponse" />
  </wsdl:message>
  <wsdl:message name="AddFDIGetRawMaterialDetailSoapIn">
    <wsdl:part name="parameters" element="tns:AddFDIGetRawMaterialDetail" />
  </wsdl:message>
  <wsdl:message name="AddFDIGetRawMaterialDetailSoapOut">
    <wsdl:part name="parameters" element="tns:AddFDIGetRawMaterialDetailResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIGetRawMaterialDetailSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateFDIGetRawMaterialDetail" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIGetRawMaterialDetailSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateFDIGetRawMaterialDetailResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIGetRawMaterialDetailsSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIGetRawMaterialDetails" />
  </wsdl:message>
  <wsdl:message name="DelFDIGetRawMaterialDetailsSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIGetRawMaterialDetailsResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIGetRawMaterialDetailSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIGetRawMaterialDetail" />
  </wsdl:message>
  <wsdl:message name="DelFDIGetRawMaterialDetailSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIGetRawMaterialDetailResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetRawMaterialDetailsSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIGetRawMaterialDetails" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetRawMaterialDetailsSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIGetRawMaterialDetailsResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetRawMaterialDetailByIdSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIGetRawMaterialDetailById" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetRawMaterialDetailByIdSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIGetRawMaterialDetailByIdResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetRawMaterialByPageSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIGetRawMaterialByPage" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetRawMaterialByPageSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIGetRawMaterialByPageResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetRawMaterialCountSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIGetRawMaterialCount" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetRawMaterialCountSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIGetRawMaterialCountResponse" />
  </wsdl:message>
  <wsdl:message name="AddFDIGetRawMaterialSoapIn">
    <wsdl:part name="parameters" element="tns:AddFDIGetRawMaterial" />
  </wsdl:message>
  <wsdl:message name="AddFDIGetRawMaterialSoapOut">
    <wsdl:part name="parameters" element="tns:AddFDIGetRawMaterialResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIGetRawMaterialSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateFDIGetRawMaterial" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIGetRawMaterialSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateFDIGetRawMaterialResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIGetRawMaterialsSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIGetRawMaterials" />
  </wsdl:message>
  <wsdl:message name="DelFDIGetRawMaterialsSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIGetRawMaterialsResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIGetRawMaterialSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIGetRawMaterial" />
  </wsdl:message>
  <wsdl:message name="DelFDIGetRawMaterialSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIGetRawMaterialResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetRawMaterialsSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIGetRawMaterials" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetRawMaterialsSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIGetRawMaterialsResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetRawMaterialByIdSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIGetRawMaterialById" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetRawMaterialByIdSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIGetRawMaterialByIdResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetMaterialDetailByPageSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIGetMaterialDetailByPage" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetMaterialDetailByPageSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIGetMaterialDetailByPageResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetMaterialDetailCountSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIGetMaterialDetailCount" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetMaterialDetailCountSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIGetMaterialDetailCountResponse" />
  </wsdl:message>
  <wsdl:message name="AddFDIGetMaterialDetailSoapIn">
    <wsdl:part name="parameters" element="tns:AddFDIGetMaterialDetail" />
  </wsdl:message>
  <wsdl:message name="AddFDIGetMaterialDetailSoapOut">
    <wsdl:part name="parameters" element="tns:AddFDIGetMaterialDetailResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIGetMaterialDetailSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateFDIGetMaterialDetail" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIGetMaterialDetailSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateFDIGetMaterialDetailResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIGetMaterialDetailsSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIGetMaterialDetails" />
  </wsdl:message>
  <wsdl:message name="DelFDIGetMaterialDetailsSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIGetMaterialDetailsResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIGetMaterialDetailSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIGetMaterialDetail" />
  </wsdl:message>
  <wsdl:message name="DelFDIGetMaterialDetailSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIGetMaterialDetailResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetMaterialDetailsSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIGetMaterialDetails" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetMaterialDetailsSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIGetMaterialDetailsResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetMaterialDetailByIdSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIGetMaterialDetailById" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetMaterialDetailByIdSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIGetMaterialDetailByIdResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetMaterialByPageSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIGetMaterialByPage" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetMaterialByPageSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIGetMaterialByPageResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetMaterialCountSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIGetMaterialCount" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetMaterialCountSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIGetMaterialCountResponse" />
  </wsdl:message>
  <wsdl:message name="AddFDIGetMaterialSoapIn">
    <wsdl:part name="parameters" element="tns:AddFDIGetMaterial" />
  </wsdl:message>
  <wsdl:message name="AddFDIGetMaterialSoapOut">
    <wsdl:part name="parameters" element="tns:AddFDIGetMaterialResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIGetMaterialSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateFDIGetMaterial" />
  </wsdl:message>
  <wsdl:message name="UpdateFDIGetMaterialSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateFDIGetMaterialResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIGetMaterialsSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIGetMaterials" />
  </wsdl:message>
  <wsdl:message name="DelFDIGetMaterialsSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIGetMaterialsResponse" />
  </wsdl:message>
  <wsdl:message name="DelFDIGetMaterialSoapIn">
    <wsdl:part name="parameters" element="tns:DelFDIGetMaterial" />
  </wsdl:message>
  <wsdl:message name="DelFDIGetMaterialSoapOut">
    <wsdl:part name="parameters" element="tns:DelFDIGetMaterialResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetMaterialsSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIGetMaterials" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetMaterialsSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIGetMaterialsResponse" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetMaterialByIdSoapIn">
    <wsdl:part name="parameters" element="tns:GetFDIGetMaterialById" />
  </wsdl:message>
  <wsdl:message name="GetFDIGetMaterialByIdSoapOut">
    <wsdl:part name="parameters" element="tns:GetFDIGetMaterialByIdResponse" />
  </wsdl:message>
  <wsdl:portType name="FDIServiceSoap">
    <wsdl:operation name="GetRawMaterial">
      <wsdl:input message="tns:GetRawMaterialSoapIn" />
      <wsdl:output message="tns:GetRawMaterialSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetMaterialInfo">
      <wsdl:input message="tns:GetMaterialInfoSoapIn" />
      <wsdl:output message="tns:GetMaterialInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetWorkOrder">
      <wsdl:input message="tns:GetWorkOrderSoapIn" />
      <wsdl:output message="tns:GetWorkOrderSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetDNOrder">
      <wsdl:input message="tns:GetDNOrderSoapIn" />
      <wsdl:output message="tns:GetDNOrderSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="PostWOClose">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">MES回传SAP生产订单WO报工</wsdl:documentation>
      <wsdl:input message="tns:PostWOCloseSoapIn" />
      <wsdl:output message="tns:PostWOCloseSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="PostWOIssue">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">MES回传SAP生产订单领料工</wsdl:documentation>
      <wsdl:input message="tns:PostWOIssueSoapIn" />
      <wsdl:output message="tns:PostWOIssueSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="PostDNOrder">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">MES回传SAP销售发货单</wsdl:documentation>
      <wsdl:input message="tns:PostDNOrderSoapIn" />
      <wsdl:output message="tns:PostDNOrderSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="PostRawMaterial">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">MES回传SAP原材料入库</wsdl:documentation>
      <wsdl:input message="tns:PostRawMaterialSoapIn" />
      <wsdl:output message="tns:PostRawMaterialSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="PostInventorySyn">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">MES库存同步SAP（初始化）</wsdl:documentation>
      <wsdl:input message="tns:PostInventorySynSoapIn" />
      <wsdl:output message="tns:PostInventorySynSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIInventorySynBacthByPage">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回分页FDIInventorySynBacth</wsdl:documentation>
      <wsdl:input message="tns:GetFDIInventorySynBacthByPageSoapIn" />
      <wsdl:output message="tns:GetFDIInventorySynBacthByPageSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIInventorySynBacthCount">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回FDIInventorySynBacth记录总数 配合分页查询用</wsdl:documentation>
      <wsdl:input message="tns:GetFDIInventorySynBacthCountSoapIn" />
      <wsdl:output message="tns:GetFDIInventorySynBacthCountSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddFDIInventorySynBacth">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">新增FDIInventorySynBacth</wsdl:documentation>
      <wsdl:input message="tns:AddFDIInventorySynBacthSoapIn" />
      <wsdl:output message="tns:AddFDIInventorySynBacthSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIInventorySynBacth">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">修改FDIInventorySynBacth</wsdl:documentation>
      <wsdl:input message="tns:UpdateFDIInventorySynBacthSoapIn" />
      <wsdl:output message="tns:UpdateFDIInventorySynBacthSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIInventorySynBacths">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按照关键字段删除（多个）FDIInventorySynBacth</wsdl:documentation>
      <wsdl:input message="tns:DelFDIInventorySynBacthsSoapIn" />
      <wsdl:output message="tns:DelFDIInventorySynBacthsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIInventorySynBacth">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">删除FDIInventorySynBacth</wsdl:documentation>
      <wsdl:input message="tns:DelFDIInventorySynBacthSoapIn" />
      <wsdl:output message="tns:DelFDIInventorySynBacthSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIInventorySynBacths">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">根据查询条件获取记录集FDIInventorySynBacth</wsdl:documentation>
      <wsdl:input message="tns:GetFDIInventorySynBacthsSoapIn" />
      <wsdl:output message="tns:GetFDIInventorySynBacthsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIInventorySynBacthById">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按Id查找FDIInventorySynBacth</wsdl:documentation>
      <wsdl:input message="tns:GetFDIInventorySynBacthByIdSoapIn" />
      <wsdl:output message="tns:GetFDIInventorySynBacthByIdSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIInventorySynByPage">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回分页FDIInventorySyn</wsdl:documentation>
      <wsdl:input message="tns:GetFDIInventorySynByPageSoapIn" />
      <wsdl:output message="tns:GetFDIInventorySynByPageSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIInventorySynCount">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回FDIInventorySyn记录总数 配合分页查询用</wsdl:documentation>
      <wsdl:input message="tns:GetFDIInventorySynCountSoapIn" />
      <wsdl:output message="tns:GetFDIInventorySynCountSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddFDIInventorySyn">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">新增FDIInventorySyn</wsdl:documentation>
      <wsdl:input message="tns:AddFDIInventorySynSoapIn" />
      <wsdl:output message="tns:AddFDIInventorySynSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIInventorySyn">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">修改FDIInventorySyn</wsdl:documentation>
      <wsdl:input message="tns:UpdateFDIInventorySynSoapIn" />
      <wsdl:output message="tns:UpdateFDIInventorySynSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIInventorySyns">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按照关键字段删除（多个）FDIInventorySyn</wsdl:documentation>
      <wsdl:input message="tns:DelFDIInventorySynsSoapIn" />
      <wsdl:output message="tns:DelFDIInventorySynsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIInventorySyn">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">删除FDIInventorySyn</wsdl:documentation>
      <wsdl:input message="tns:DelFDIInventorySynSoapIn" />
      <wsdl:output message="tns:DelFDIInventorySynSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIInventorySyns">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">根据查询条件获取记录集FDIInventorySyn</wsdl:documentation>
      <wsdl:input message="tns:GetFDIInventorySynsSoapIn" />
      <wsdl:output message="tns:GetFDIInventorySynsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIInventorySynById">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按Id查找FDIInventorySyn</wsdl:documentation>
      <wsdl:input message="tns:GetFDIInventorySynByIdSoapIn" />
      <wsdl:output message="tns:GetFDIInventorySynByIdSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostRawMaterialBatchByPage">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回分页FDIPostRawMaterialBatch</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostRawMaterialBatchByPageSoapIn" />
      <wsdl:output message="tns:GetFDIPostRawMaterialBatchByPageSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostRawMaterialBatchCount">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回FDIPostRawMaterialBatch记录总数 配合分页查询用</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostRawMaterialBatchCountSoapIn" />
      <wsdl:output message="tns:GetFDIPostRawMaterialBatchCountSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddFDIPostRawMaterialBatch">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">新增FDIPostRawMaterialBatch</wsdl:documentation>
      <wsdl:input message="tns:AddFDIPostRawMaterialBatchSoapIn" />
      <wsdl:output message="tns:AddFDIPostRawMaterialBatchSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIPostRawMaterialBatch">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">修改FDIPostRawMaterialBatch</wsdl:documentation>
      <wsdl:input message="tns:UpdateFDIPostRawMaterialBatchSoapIn" />
      <wsdl:output message="tns:UpdateFDIPostRawMaterialBatchSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostRawMaterialBatchs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按照关键字段删除（多个）FDIPostRawMaterialBatch</wsdl:documentation>
      <wsdl:input message="tns:DelFDIPostRawMaterialBatchsSoapIn" />
      <wsdl:output message="tns:DelFDIPostRawMaterialBatchsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostRawMaterialBatch">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">删除FDIPostRawMaterialBatch</wsdl:documentation>
      <wsdl:input message="tns:DelFDIPostRawMaterialBatchSoapIn" />
      <wsdl:output message="tns:DelFDIPostRawMaterialBatchSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostRawMaterialBatchs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">根据查询条件获取记录集FDIPostRawMaterialBatch</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostRawMaterialBatchsSoapIn" />
      <wsdl:output message="tns:GetFDIPostRawMaterialBatchsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostRawMaterialBatchById">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按Id查找FDIPostRawMaterialBatch</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostRawMaterialBatchByIdSoapIn" />
      <wsdl:output message="tns:GetFDIPostRawMaterialBatchByIdSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostRawMaterialDetailByPage">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回分页FDIPostRawMaterialDetail</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostRawMaterialDetailByPageSoapIn" />
      <wsdl:output message="tns:GetFDIPostRawMaterialDetailByPageSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostRawMaterialDetailCount">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回FDIPostRawMaterialDetail记录总数 配合分页查询用</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostRawMaterialDetailCountSoapIn" />
      <wsdl:output message="tns:GetFDIPostRawMaterialDetailCountSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddFDIPostRawMaterialDetail">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">新增FDIPostRawMaterialDetail</wsdl:documentation>
      <wsdl:input message="tns:AddFDIPostRawMaterialDetailSoapIn" />
      <wsdl:output message="tns:AddFDIPostRawMaterialDetailSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIPostRawMaterialDetail">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">修改FDIPostRawMaterialDetail</wsdl:documentation>
      <wsdl:input message="tns:UpdateFDIPostRawMaterialDetailSoapIn" />
      <wsdl:output message="tns:UpdateFDIPostRawMaterialDetailSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostRawMaterialDetails">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按照关键字段删除（多个）FDIPostRawMaterialDetail</wsdl:documentation>
      <wsdl:input message="tns:DelFDIPostRawMaterialDetailsSoapIn" />
      <wsdl:output message="tns:DelFDIPostRawMaterialDetailsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostRawMaterialDetail">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">删除FDIPostRawMaterialDetail</wsdl:documentation>
      <wsdl:input message="tns:DelFDIPostRawMaterialDetailSoapIn" />
      <wsdl:output message="tns:DelFDIPostRawMaterialDetailSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostRawMaterialDetails">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">根据查询条件获取记录集FDIPostRawMaterialDetail</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostRawMaterialDetailsSoapIn" />
      <wsdl:output message="tns:GetFDIPostRawMaterialDetailsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostRawMaterialDetailById">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按Id查找FDIPostRawMaterialDetail</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostRawMaterialDetailByIdSoapIn" />
      <wsdl:output message="tns:GetFDIPostRawMaterialDetailByIdSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostRawMaterialByPage">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回分页FDIPostRawMaterial</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostRawMaterialByPageSoapIn" />
      <wsdl:output message="tns:GetFDIPostRawMaterialByPageSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostRawMaterialCount">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回FDIPostRawMaterial记录总数 配合分页查询用</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostRawMaterialCountSoapIn" />
      <wsdl:output message="tns:GetFDIPostRawMaterialCountSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddFDIPostRawMaterial">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">新增FDIPostRawMaterial</wsdl:documentation>
      <wsdl:input message="tns:AddFDIPostRawMaterialSoapIn" />
      <wsdl:output message="tns:AddFDIPostRawMaterialSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIPostRawMaterial">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">修改FDIPostRawMaterial</wsdl:documentation>
      <wsdl:input message="tns:UpdateFDIPostRawMaterialSoapIn" />
      <wsdl:output message="tns:UpdateFDIPostRawMaterialSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostRawMaterials">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按照关键字段删除（多个）FDIPostRawMaterial</wsdl:documentation>
      <wsdl:input message="tns:DelFDIPostRawMaterialsSoapIn" />
      <wsdl:output message="tns:DelFDIPostRawMaterialsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostRawMaterial">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">删除FDIPostRawMaterial</wsdl:documentation>
      <wsdl:input message="tns:DelFDIPostRawMaterialSoapIn" />
      <wsdl:output message="tns:DelFDIPostRawMaterialSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostRawMaterials">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">根据查询条件获取记录集FDIPostRawMaterial</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostRawMaterialsSoapIn" />
      <wsdl:output message="tns:GetFDIPostRawMaterialsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostRawMaterialById">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按Id查找FDIPostRawMaterial</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostRawMaterialByIdSoapIn" />
      <wsdl:output message="tns:GetFDIPostRawMaterialByIdSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostSaleOrderBatchByPage">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回分页FDIPostSaleOrderBatch</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostSaleOrderBatchByPageSoapIn" />
      <wsdl:output message="tns:GetFDIPostSaleOrderBatchByPageSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostSaleOrderBatchCount">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回FDIPostSaleOrderBatch记录总数 配合分页查询用</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostSaleOrderBatchCountSoapIn" />
      <wsdl:output message="tns:GetFDIPostSaleOrderBatchCountSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddFDIPostSaleOrderBatch">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">新增FDIPostSaleOrderBatch</wsdl:documentation>
      <wsdl:input message="tns:AddFDIPostSaleOrderBatchSoapIn" />
      <wsdl:output message="tns:AddFDIPostSaleOrderBatchSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIPostSaleOrderBatch">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">修改FDIPostSaleOrderBatch</wsdl:documentation>
      <wsdl:input message="tns:UpdateFDIPostSaleOrderBatchSoapIn" />
      <wsdl:output message="tns:UpdateFDIPostSaleOrderBatchSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostSaleOrderBatchs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按照关键字段删除（多个）FDIPostSaleOrderBatch</wsdl:documentation>
      <wsdl:input message="tns:DelFDIPostSaleOrderBatchsSoapIn" />
      <wsdl:output message="tns:DelFDIPostSaleOrderBatchsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostSaleOrderBatch">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">删除FDIPostSaleOrderBatch</wsdl:documentation>
      <wsdl:input message="tns:DelFDIPostSaleOrderBatchSoapIn" />
      <wsdl:output message="tns:DelFDIPostSaleOrderBatchSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostSaleOrderBatchs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">根据查询条件获取记录集FDIPostSaleOrderBatch</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostSaleOrderBatchsSoapIn" />
      <wsdl:output message="tns:GetFDIPostSaleOrderBatchsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostSaleOrderBatchById">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按Id查找FDIPostSaleOrderBatch</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostSaleOrderBatchByIdSoapIn" />
      <wsdl:output message="tns:GetFDIPostSaleOrderBatchByIdSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostSaleOrderDetailByPage">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回分页FDIPostSaleOrderDetail</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostSaleOrderDetailByPageSoapIn" />
      <wsdl:output message="tns:GetFDIPostSaleOrderDetailByPageSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostSaleOrderDetailCount">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回FDIPostSaleOrderDetail记录总数 配合分页查询用</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostSaleOrderDetailCountSoapIn" />
      <wsdl:output message="tns:GetFDIPostSaleOrderDetailCountSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddFDIPostSaleOrderDetail">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">新增FDIPostSaleOrderDetail</wsdl:documentation>
      <wsdl:input message="tns:AddFDIPostSaleOrderDetailSoapIn" />
      <wsdl:output message="tns:AddFDIPostSaleOrderDetailSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIPostSaleOrderDetail">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">修改FDIPostSaleOrderDetail</wsdl:documentation>
      <wsdl:input message="tns:UpdateFDIPostSaleOrderDetailSoapIn" />
      <wsdl:output message="tns:UpdateFDIPostSaleOrderDetailSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostSaleOrderDetails">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按照关键字段删除（多个）FDIPostSaleOrderDetail</wsdl:documentation>
      <wsdl:input message="tns:DelFDIPostSaleOrderDetailsSoapIn" />
      <wsdl:output message="tns:DelFDIPostSaleOrderDetailsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostSaleOrderDetail">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">删除FDIPostSaleOrderDetail</wsdl:documentation>
      <wsdl:input message="tns:DelFDIPostSaleOrderDetailSoapIn" />
      <wsdl:output message="tns:DelFDIPostSaleOrderDetailSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostSaleOrderDetails">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">根据查询条件获取记录集FDIPostSaleOrderDetail</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostSaleOrderDetailsSoapIn" />
      <wsdl:output message="tns:GetFDIPostSaleOrderDetailsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostSaleOrderDetailById">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按Id查找FDIPostSaleOrderDetail</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostSaleOrderDetailByIdSoapIn" />
      <wsdl:output message="tns:GetFDIPostSaleOrderDetailByIdSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostSaleOrderByPage">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回分页FDIPostSaleOrder</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostSaleOrderByPageSoapIn" />
      <wsdl:output message="tns:GetFDIPostSaleOrderByPageSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostSaleOrderCount">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回FDIPostSaleOrder记录总数 配合分页查询用</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostSaleOrderCountSoapIn" />
      <wsdl:output message="tns:GetFDIPostSaleOrderCountSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddFDIPostSaleOrder">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">新增FDIPostSaleOrder</wsdl:documentation>
      <wsdl:input message="tns:AddFDIPostSaleOrderSoapIn" />
      <wsdl:output message="tns:AddFDIPostSaleOrderSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIPostSaleOrder">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">修改FDIPostSaleOrder</wsdl:documentation>
      <wsdl:input message="tns:UpdateFDIPostSaleOrderSoapIn" />
      <wsdl:output message="tns:UpdateFDIPostSaleOrderSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostSaleOrders">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按照关键字段删除（多个）FDIPostSaleOrder</wsdl:documentation>
      <wsdl:input message="tns:DelFDIPostSaleOrdersSoapIn" />
      <wsdl:output message="tns:DelFDIPostSaleOrdersSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostSaleOrder">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">删除FDIPostSaleOrder</wsdl:documentation>
      <wsdl:input message="tns:DelFDIPostSaleOrderSoapIn" />
      <wsdl:output message="tns:DelFDIPostSaleOrderSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostSaleOrders">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">根据查询条件获取记录集FDIPostSaleOrder</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostSaleOrdersSoapIn" />
      <wsdl:output message="tns:GetFDIPostSaleOrdersSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostSaleOrderById">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按Id查找FDIPostSaleOrder</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostSaleOrderByIdSoapIn" />
      <wsdl:output message="tns:GetFDIPostSaleOrderByIdSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOIssueBatchByPage">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回分页FDIPostWOIssueBatch</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostWOIssueBatchByPageSoapIn" />
      <wsdl:output message="tns:GetFDIPostWOIssueBatchByPageSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOIssueBatchCount">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回FDIPostWOIssueBatch记录总数 配合分页查询用</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostWOIssueBatchCountSoapIn" />
      <wsdl:output message="tns:GetFDIPostWOIssueBatchCountSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddFDIPostWOIssueBatch">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">新增FDIPostWOIssueBatch</wsdl:documentation>
      <wsdl:input message="tns:AddFDIPostWOIssueBatchSoapIn" />
      <wsdl:output message="tns:AddFDIPostWOIssueBatchSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIPostWOIssueBatch">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">修改FDIPostWOIssueBatch</wsdl:documentation>
      <wsdl:input message="tns:UpdateFDIPostWOIssueBatchSoapIn" />
      <wsdl:output message="tns:UpdateFDIPostWOIssueBatchSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostWOIssueBatchs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按照关键字段删除（多个）FDIPostWOIssueBatch</wsdl:documentation>
      <wsdl:input message="tns:DelFDIPostWOIssueBatchsSoapIn" />
      <wsdl:output message="tns:DelFDIPostWOIssueBatchsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostWOIssueBatch">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">删除FDIPostWOIssueBatch</wsdl:documentation>
      <wsdl:input message="tns:DelFDIPostWOIssueBatchSoapIn" />
      <wsdl:output message="tns:DelFDIPostWOIssueBatchSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOIssueBatchs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">根据查询条件获取记录集FDIPostWOIssueBatch</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostWOIssueBatchsSoapIn" />
      <wsdl:output message="tns:GetFDIPostWOIssueBatchsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOIssueBatchById">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按Id查找FDIPostWOIssueBatch</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostWOIssueBatchByIdSoapIn" />
      <wsdl:output message="tns:GetFDIPostWOIssueBatchByIdSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOIssueDetailByPage">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回分页FDIPostWOIssueDetail</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostWOIssueDetailByPageSoapIn" />
      <wsdl:output message="tns:GetFDIPostWOIssueDetailByPageSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOIssueDetailCount">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回FDIPostWOIssueDetail记录总数 配合分页查询用</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostWOIssueDetailCountSoapIn" />
      <wsdl:output message="tns:GetFDIPostWOIssueDetailCountSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddFDIPostWOIssueDetail">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">新增FDIPostWOIssueDetail</wsdl:documentation>
      <wsdl:input message="tns:AddFDIPostWOIssueDetailSoapIn" />
      <wsdl:output message="tns:AddFDIPostWOIssueDetailSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIPostWOIssueDetail">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">修改FDIPostWOIssueDetail</wsdl:documentation>
      <wsdl:input message="tns:UpdateFDIPostWOIssueDetailSoapIn" />
      <wsdl:output message="tns:UpdateFDIPostWOIssueDetailSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostWOIssueDetails">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按照关键字段删除（多个）FDIPostWOIssueDetail</wsdl:documentation>
      <wsdl:input message="tns:DelFDIPostWOIssueDetailsSoapIn" />
      <wsdl:output message="tns:DelFDIPostWOIssueDetailsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostWOIssueDetail">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">删除FDIPostWOIssueDetail</wsdl:documentation>
      <wsdl:input message="tns:DelFDIPostWOIssueDetailSoapIn" />
      <wsdl:output message="tns:DelFDIPostWOIssueDetailSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOIssueDetails">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">根据查询条件获取记录集FDIPostWOIssueDetail</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostWOIssueDetailsSoapIn" />
      <wsdl:output message="tns:GetFDIPostWOIssueDetailsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOIssueDetailById">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按Id查找FDIPostWOIssueDetail</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostWOIssueDetailByIdSoapIn" />
      <wsdl:output message="tns:GetFDIPostWOIssueDetailByIdSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOIssueByPage">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回分页FDIPostWOIssue</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostWOIssueByPageSoapIn" />
      <wsdl:output message="tns:GetFDIPostWOIssueByPageSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOIssueCount">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回FDIPostWOIssue记录总数 配合分页查询用</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostWOIssueCountSoapIn" />
      <wsdl:output message="tns:GetFDIPostWOIssueCountSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddFDIPostWOIssue">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">新增FDIPostWOIssue</wsdl:documentation>
      <wsdl:input message="tns:AddFDIPostWOIssueSoapIn" />
      <wsdl:output message="tns:AddFDIPostWOIssueSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIPostWOIssue">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">修改FDIPostWOIssue</wsdl:documentation>
      <wsdl:input message="tns:UpdateFDIPostWOIssueSoapIn" />
      <wsdl:output message="tns:UpdateFDIPostWOIssueSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostWOIssues">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按照关键字段删除（多个）FDIPostWOIssue</wsdl:documentation>
      <wsdl:input message="tns:DelFDIPostWOIssuesSoapIn" />
      <wsdl:output message="tns:DelFDIPostWOIssuesSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostWOIssue">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">删除FDIPostWOIssue</wsdl:documentation>
      <wsdl:input message="tns:DelFDIPostWOIssueSoapIn" />
      <wsdl:output message="tns:DelFDIPostWOIssueSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOIssues">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">根据查询条件获取记录集FDIPostWOIssue</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostWOIssuesSoapIn" />
      <wsdl:output message="tns:GetFDIPostWOIssuesSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOIssueById">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按Id查找FDIPostWOIssue</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostWOIssueByIdSoapIn" />
      <wsdl:output message="tns:GetFDIPostWOIssueByIdSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOCloseBatchByPage">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回分页FDIPostWOCloseBatch</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostWOCloseBatchByPageSoapIn" />
      <wsdl:output message="tns:GetFDIPostWOCloseBatchByPageSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOCloseBatchCount">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回FDIPostWOCloseBatch记录总数 配合分页查询用</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostWOCloseBatchCountSoapIn" />
      <wsdl:output message="tns:GetFDIPostWOCloseBatchCountSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddFDIPostWOCloseBatch">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">新增FDIPostWOCloseBatch</wsdl:documentation>
      <wsdl:input message="tns:AddFDIPostWOCloseBatchSoapIn" />
      <wsdl:output message="tns:AddFDIPostWOCloseBatchSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIPostWOCloseBatch">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">修改FDIPostWOCloseBatch</wsdl:documentation>
      <wsdl:input message="tns:UpdateFDIPostWOCloseBatchSoapIn" />
      <wsdl:output message="tns:UpdateFDIPostWOCloseBatchSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostWOCloseBatchs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按照关键字段删除（多个）FDIPostWOCloseBatch</wsdl:documentation>
      <wsdl:input message="tns:DelFDIPostWOCloseBatchsSoapIn" />
      <wsdl:output message="tns:DelFDIPostWOCloseBatchsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostWOCloseBatch">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">删除FDIPostWOCloseBatch</wsdl:documentation>
      <wsdl:input message="tns:DelFDIPostWOCloseBatchSoapIn" />
      <wsdl:output message="tns:DelFDIPostWOCloseBatchSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOCloseBatchs">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">根据查询条件获取记录集FDIPostWOCloseBatch</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostWOCloseBatchsSoapIn" />
      <wsdl:output message="tns:GetFDIPostWOCloseBatchsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOCloseBatchById">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按Id查找FDIPostWOCloseBatch</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostWOCloseBatchByIdSoapIn" />
      <wsdl:output message="tns:GetFDIPostWOCloseBatchByIdSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOCloseDetailByPage">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回分页FDIPostWOCloseDetail</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostWOCloseDetailByPageSoapIn" />
      <wsdl:output message="tns:GetFDIPostWOCloseDetailByPageSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOCloseDetailCount">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回FDIPostWOCloseDetail记录总数 配合分页查询用</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostWOCloseDetailCountSoapIn" />
      <wsdl:output message="tns:GetFDIPostWOCloseDetailCountSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddFDIPostWOCloseDetail">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">新增FDIPostWOCloseDetail</wsdl:documentation>
      <wsdl:input message="tns:AddFDIPostWOCloseDetailSoapIn" />
      <wsdl:output message="tns:AddFDIPostWOCloseDetailSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIPostWOCloseDetail">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">修改FDIPostWOCloseDetail</wsdl:documentation>
      <wsdl:input message="tns:UpdateFDIPostWOCloseDetailSoapIn" />
      <wsdl:output message="tns:UpdateFDIPostWOCloseDetailSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostWOCloseDetails">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按照关键字段删除（多个）FDIPostWOCloseDetail</wsdl:documentation>
      <wsdl:input message="tns:DelFDIPostWOCloseDetailsSoapIn" />
      <wsdl:output message="tns:DelFDIPostWOCloseDetailsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostWOCloseDetail">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">删除FDIPostWOCloseDetail</wsdl:documentation>
      <wsdl:input message="tns:DelFDIPostWOCloseDetailSoapIn" />
      <wsdl:output message="tns:DelFDIPostWOCloseDetailSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOCloseDetails">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">根据查询条件获取记录集FDIPostWOCloseDetail</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostWOCloseDetailsSoapIn" />
      <wsdl:output message="tns:GetFDIPostWOCloseDetailsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOCloseDetailById">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按Id查找FDIPostWOCloseDetail</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostWOCloseDetailByIdSoapIn" />
      <wsdl:output message="tns:GetFDIPostWOCloseDetailByIdSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOCloseByPage">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回分页FDIPostWOClose</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostWOCloseByPageSoapIn" />
      <wsdl:output message="tns:GetFDIPostWOCloseByPageSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOCloseCount">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回FDIPostWOClose记录总数 配合分页查询用</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostWOCloseCountSoapIn" />
      <wsdl:output message="tns:GetFDIPostWOCloseCountSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddFDIPostWOClose">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">新增FDIPostWOClose</wsdl:documentation>
      <wsdl:input message="tns:AddFDIPostWOCloseSoapIn" />
      <wsdl:output message="tns:AddFDIPostWOCloseSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIPostWOClose">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">修改FDIPostWOClose</wsdl:documentation>
      <wsdl:input message="tns:UpdateFDIPostWOCloseSoapIn" />
      <wsdl:output message="tns:UpdateFDIPostWOCloseSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostWOCloses">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按照关键字段删除（多个）FDIPostWOClose</wsdl:documentation>
      <wsdl:input message="tns:DelFDIPostWOClosesSoapIn" />
      <wsdl:output message="tns:DelFDIPostWOClosesSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostWOClose">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">删除FDIPostWOClose</wsdl:documentation>
      <wsdl:input message="tns:DelFDIPostWOCloseSoapIn" />
      <wsdl:output message="tns:DelFDIPostWOCloseSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOCloses">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">根据查询条件获取记录集FDIPostWOClose</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostWOClosesSoapIn" />
      <wsdl:output message="tns:GetFDIPostWOClosesSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOCloseById">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按Id查找FDIPostWOClose</wsdl:documentation>
      <wsdl:input message="tns:GetFDIPostWOCloseByIdSoapIn" />
      <wsdl:output message="tns:GetFDIPostWOCloseByIdSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetMaterialInfoByPage">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回分页FDIGetMaterialInfo</wsdl:documentation>
      <wsdl:input message="tns:GetFDIGetMaterialInfoByPageSoapIn" />
      <wsdl:output message="tns:GetFDIGetMaterialInfoByPageSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetMaterialInfoCount">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回FDIGetMaterialInfo记录总数 配合分页查询用</wsdl:documentation>
      <wsdl:input message="tns:GetFDIGetMaterialInfoCountSoapIn" />
      <wsdl:output message="tns:GetFDIGetMaterialInfoCountSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddFDIGetMaterialInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">新增FDIGetMaterialInfo</wsdl:documentation>
      <wsdl:input message="tns:AddFDIGetMaterialInfoSoapIn" />
      <wsdl:output message="tns:AddFDIGetMaterialInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIGetMaterialInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">修改FDIGetMaterialInfo</wsdl:documentation>
      <wsdl:input message="tns:UpdateFDIGetMaterialInfoSoapIn" />
      <wsdl:output message="tns:UpdateFDIGetMaterialInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetMaterialInfos">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按照关键字段删除（多个）FDIGetMaterialInfo</wsdl:documentation>
      <wsdl:input message="tns:DelFDIGetMaterialInfosSoapIn" />
      <wsdl:output message="tns:DelFDIGetMaterialInfosSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetMaterialInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">删除FDIGetMaterialInfo</wsdl:documentation>
      <wsdl:input message="tns:DelFDIGetMaterialInfoSoapIn" />
      <wsdl:output message="tns:DelFDIGetMaterialInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetMaterialInfos">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">根据查询条件获取记录集FDIGetMaterialInfo</wsdl:documentation>
      <wsdl:input message="tns:GetFDIGetMaterialInfosSoapIn" />
      <wsdl:output message="tns:GetFDIGetMaterialInfosSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetMaterialInfoById">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按Id查找FDIGetMaterialInfo</wsdl:documentation>
      <wsdl:input message="tns:GetFDIGetMaterialInfoByIdSoapIn" />
      <wsdl:output message="tns:GetFDIGetMaterialInfoByIdSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetSaleOrderDetailByPage">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回分页FDIGetSaleOrderDetail</wsdl:documentation>
      <wsdl:input message="tns:GetFDIGetSaleOrderDetailByPageSoapIn" />
      <wsdl:output message="tns:GetFDIGetSaleOrderDetailByPageSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetSaleOrderDetailCount">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回FDIGetSaleOrderDetail记录总数 配合分页查询用</wsdl:documentation>
      <wsdl:input message="tns:GetFDIGetSaleOrderDetailCountSoapIn" />
      <wsdl:output message="tns:GetFDIGetSaleOrderDetailCountSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddFDIGetSaleOrderDetail">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">新增FDIGetSaleOrderDetail</wsdl:documentation>
      <wsdl:input message="tns:AddFDIGetSaleOrderDetailSoapIn" />
      <wsdl:output message="tns:AddFDIGetSaleOrderDetailSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIGetSaleOrderDetail">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">修改FDIGetSaleOrderDetail</wsdl:documentation>
      <wsdl:input message="tns:UpdateFDIGetSaleOrderDetailSoapIn" />
      <wsdl:output message="tns:UpdateFDIGetSaleOrderDetailSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetSaleOrderDetails">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按照关键字段删除（多个）FDIGetSaleOrderDetail</wsdl:documentation>
      <wsdl:input message="tns:DelFDIGetSaleOrderDetailsSoapIn" />
      <wsdl:output message="tns:DelFDIGetSaleOrderDetailsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetSaleOrderDetail">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">删除FDIGetSaleOrderDetail</wsdl:documentation>
      <wsdl:input message="tns:DelFDIGetSaleOrderDetailSoapIn" />
      <wsdl:output message="tns:DelFDIGetSaleOrderDetailSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetSaleOrderDetails">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">根据查询条件获取记录集FDIGetSaleOrderDetail</wsdl:documentation>
      <wsdl:input message="tns:GetFDIGetSaleOrderDetailsSoapIn" />
      <wsdl:output message="tns:GetFDIGetSaleOrderDetailsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetSaleOrderDetailById">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按Id查找FDIGetSaleOrderDetail</wsdl:documentation>
      <wsdl:input message="tns:GetFDIGetSaleOrderDetailByIdSoapIn" />
      <wsdl:output message="tns:GetFDIGetSaleOrderDetailByIdSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetSaleOrderByPage">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回分页FDIGetSaleOrder</wsdl:documentation>
      <wsdl:input message="tns:GetFDIGetSaleOrderByPageSoapIn" />
      <wsdl:output message="tns:GetFDIGetSaleOrderByPageSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetSaleOrderCount">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回FDIGetSaleOrder记录总数 配合分页查询用</wsdl:documentation>
      <wsdl:input message="tns:GetFDIGetSaleOrderCountSoapIn" />
      <wsdl:output message="tns:GetFDIGetSaleOrderCountSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddFDIGetSaleOrder">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">新增FDIGetSaleOrder</wsdl:documentation>
      <wsdl:input message="tns:AddFDIGetSaleOrderSoapIn" />
      <wsdl:output message="tns:AddFDIGetSaleOrderSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIGetSaleOrder">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">修改FDIGetSaleOrder</wsdl:documentation>
      <wsdl:input message="tns:UpdateFDIGetSaleOrderSoapIn" />
      <wsdl:output message="tns:UpdateFDIGetSaleOrderSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetSaleOrders">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按照关键字段删除（多个）FDIGetSaleOrder</wsdl:documentation>
      <wsdl:input message="tns:DelFDIGetSaleOrdersSoapIn" />
      <wsdl:output message="tns:DelFDIGetSaleOrdersSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetSaleOrder">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">删除FDIGetSaleOrder</wsdl:documentation>
      <wsdl:input message="tns:DelFDIGetSaleOrderSoapIn" />
      <wsdl:output message="tns:DelFDIGetSaleOrderSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetSaleOrders">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">根据查询条件获取记录集FDIGetSaleOrder</wsdl:documentation>
      <wsdl:input message="tns:GetFDIGetSaleOrdersSoapIn" />
      <wsdl:output message="tns:GetFDIGetSaleOrdersSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetSaleOrderById">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按Id查找FDIGetSaleOrder</wsdl:documentation>
      <wsdl:input message="tns:GetFDIGetSaleOrderByIdSoapIn" />
      <wsdl:output message="tns:GetFDIGetSaleOrderByIdSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetWOrderDetailByPage">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回分页FDIGetWOrderDetail</wsdl:documentation>
      <wsdl:input message="tns:GetFDIGetWOrderDetailByPageSoapIn" />
      <wsdl:output message="tns:GetFDIGetWOrderDetailByPageSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetWOrderDetailCount">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回FDIGetWOrderDetail记录总数 配合分页查询用</wsdl:documentation>
      <wsdl:input message="tns:GetFDIGetWOrderDetailCountSoapIn" />
      <wsdl:output message="tns:GetFDIGetWOrderDetailCountSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddFDIGetWOrderDetail">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">新增FDIGetWOrderDetail</wsdl:documentation>
      <wsdl:input message="tns:AddFDIGetWOrderDetailSoapIn" />
      <wsdl:output message="tns:AddFDIGetWOrderDetailSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIGetWOrderDetail">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">修改FDIGetWOrderDetail</wsdl:documentation>
      <wsdl:input message="tns:UpdateFDIGetWOrderDetailSoapIn" />
      <wsdl:output message="tns:UpdateFDIGetWOrderDetailSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetWOrderDetails">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按照关键字段删除（多个）FDIGetWOrderDetail</wsdl:documentation>
      <wsdl:input message="tns:DelFDIGetWOrderDetailsSoapIn" />
      <wsdl:output message="tns:DelFDIGetWOrderDetailsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetWOrderDetail">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">删除FDIGetWOrderDetail</wsdl:documentation>
      <wsdl:input message="tns:DelFDIGetWOrderDetailSoapIn" />
      <wsdl:output message="tns:DelFDIGetWOrderDetailSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetWOrderDetails">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">根据查询条件获取记录集FDIGetWOrderDetail</wsdl:documentation>
      <wsdl:input message="tns:GetFDIGetWOrderDetailsSoapIn" />
      <wsdl:output message="tns:GetFDIGetWOrderDetailsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetWOrderDetailById">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按Id查找FDIGetWOrderDetail</wsdl:documentation>
      <wsdl:input message="tns:GetFDIGetWOrderDetailByIdSoapIn" />
      <wsdl:output message="tns:GetFDIGetWOrderDetailByIdSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetWOrderByPage">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回分页FDIGetWOrder</wsdl:documentation>
      <wsdl:input message="tns:GetFDIGetWOrderByPageSoapIn" />
      <wsdl:output message="tns:GetFDIGetWOrderByPageSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetWOrderCount">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回FDIGetWOrder记录总数 配合分页查询用</wsdl:documentation>
      <wsdl:input message="tns:GetFDIGetWOrderCountSoapIn" />
      <wsdl:output message="tns:GetFDIGetWOrderCountSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddFDIGetWOrder">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">新增FDIGetWOrder</wsdl:documentation>
      <wsdl:input message="tns:AddFDIGetWOrderSoapIn" />
      <wsdl:output message="tns:AddFDIGetWOrderSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIGetWOrder">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">修改FDIGetWOrder</wsdl:documentation>
      <wsdl:input message="tns:UpdateFDIGetWOrderSoapIn" />
      <wsdl:output message="tns:UpdateFDIGetWOrderSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetWOrders">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按照关键字段删除（多个）FDIGetWOrder</wsdl:documentation>
      <wsdl:input message="tns:DelFDIGetWOrdersSoapIn" />
      <wsdl:output message="tns:DelFDIGetWOrdersSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetWOrder">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">删除FDIGetWOrder</wsdl:documentation>
      <wsdl:input message="tns:DelFDIGetWOrderSoapIn" />
      <wsdl:output message="tns:DelFDIGetWOrderSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetWOrders">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">根据查询条件获取记录集FDIGetWOrder</wsdl:documentation>
      <wsdl:input message="tns:GetFDIGetWOrdersSoapIn" />
      <wsdl:output message="tns:GetFDIGetWOrdersSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetWOrderById">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按Id查找FDIGetWOrder</wsdl:documentation>
      <wsdl:input message="tns:GetFDIGetWOrderByIdSoapIn" />
      <wsdl:output message="tns:GetFDIGetWOrderByIdSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetRawMaterialDetailByPage">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回分页FDIGetRawMaterialDetail</wsdl:documentation>
      <wsdl:input message="tns:GetFDIGetRawMaterialDetailByPageSoapIn" />
      <wsdl:output message="tns:GetFDIGetRawMaterialDetailByPageSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetRawMaterialDetailCount">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回FDIGetRawMaterialDetail记录总数 配合分页查询用</wsdl:documentation>
      <wsdl:input message="tns:GetFDIGetRawMaterialDetailCountSoapIn" />
      <wsdl:output message="tns:GetFDIGetRawMaterialDetailCountSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddFDIGetRawMaterialDetail">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">新增FDIGetRawMaterialDetail</wsdl:documentation>
      <wsdl:input message="tns:AddFDIGetRawMaterialDetailSoapIn" />
      <wsdl:output message="tns:AddFDIGetRawMaterialDetailSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIGetRawMaterialDetail">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">修改FDIGetRawMaterialDetail</wsdl:documentation>
      <wsdl:input message="tns:UpdateFDIGetRawMaterialDetailSoapIn" />
      <wsdl:output message="tns:UpdateFDIGetRawMaterialDetailSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetRawMaterialDetails">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按照关键字段删除（多个）FDIGetRawMaterialDetail</wsdl:documentation>
      <wsdl:input message="tns:DelFDIGetRawMaterialDetailsSoapIn" />
      <wsdl:output message="tns:DelFDIGetRawMaterialDetailsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetRawMaterialDetail">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">删除FDIGetRawMaterialDetail</wsdl:documentation>
      <wsdl:input message="tns:DelFDIGetRawMaterialDetailSoapIn" />
      <wsdl:output message="tns:DelFDIGetRawMaterialDetailSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetRawMaterialDetails">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">根据查询条件获取记录集FDIGetRawMaterialDetail</wsdl:documentation>
      <wsdl:input message="tns:GetFDIGetRawMaterialDetailsSoapIn" />
      <wsdl:output message="tns:GetFDIGetRawMaterialDetailsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetRawMaterialDetailById">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按Id查找FDIGetRawMaterialDetail</wsdl:documentation>
      <wsdl:input message="tns:GetFDIGetRawMaterialDetailByIdSoapIn" />
      <wsdl:output message="tns:GetFDIGetRawMaterialDetailByIdSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetRawMaterialByPage">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回分页FDIGetRawMaterial</wsdl:documentation>
      <wsdl:input message="tns:GetFDIGetRawMaterialByPageSoapIn" />
      <wsdl:output message="tns:GetFDIGetRawMaterialByPageSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetRawMaterialCount">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回FDIGetRawMaterial记录总数 配合分页查询用</wsdl:documentation>
      <wsdl:input message="tns:GetFDIGetRawMaterialCountSoapIn" />
      <wsdl:output message="tns:GetFDIGetRawMaterialCountSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddFDIGetRawMaterial">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">新增FDIGetRawMaterial</wsdl:documentation>
      <wsdl:input message="tns:AddFDIGetRawMaterialSoapIn" />
      <wsdl:output message="tns:AddFDIGetRawMaterialSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIGetRawMaterial">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">修改FDIGetRawMaterial</wsdl:documentation>
      <wsdl:input message="tns:UpdateFDIGetRawMaterialSoapIn" />
      <wsdl:output message="tns:UpdateFDIGetRawMaterialSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetRawMaterials">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按照关键字段删除（多个）FDIGetRawMaterial</wsdl:documentation>
      <wsdl:input message="tns:DelFDIGetRawMaterialsSoapIn" />
      <wsdl:output message="tns:DelFDIGetRawMaterialsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetRawMaterial">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">删除FDIGetRawMaterial</wsdl:documentation>
      <wsdl:input message="tns:DelFDIGetRawMaterialSoapIn" />
      <wsdl:output message="tns:DelFDIGetRawMaterialSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetRawMaterials">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">根据查询条件获取记录集FDIGetRawMaterial</wsdl:documentation>
      <wsdl:input message="tns:GetFDIGetRawMaterialsSoapIn" />
      <wsdl:output message="tns:GetFDIGetRawMaterialsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetRawMaterialById">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按Id查找FDIGetRawMaterial</wsdl:documentation>
      <wsdl:input message="tns:GetFDIGetRawMaterialByIdSoapIn" />
      <wsdl:output message="tns:GetFDIGetRawMaterialByIdSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetMaterialDetailByPage">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回分页FDIGetMaterialDetail</wsdl:documentation>
      <wsdl:input message="tns:GetFDIGetMaterialDetailByPageSoapIn" />
      <wsdl:output message="tns:GetFDIGetMaterialDetailByPageSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetMaterialDetailCount">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回FDIGetMaterialDetail记录总数 配合分页查询用</wsdl:documentation>
      <wsdl:input message="tns:GetFDIGetMaterialDetailCountSoapIn" />
      <wsdl:output message="tns:GetFDIGetMaterialDetailCountSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddFDIGetMaterialDetail">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">新增FDIGetMaterialDetail</wsdl:documentation>
      <wsdl:input message="tns:AddFDIGetMaterialDetailSoapIn" />
      <wsdl:output message="tns:AddFDIGetMaterialDetailSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIGetMaterialDetail">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">修改FDIGetMaterialDetail</wsdl:documentation>
      <wsdl:input message="tns:UpdateFDIGetMaterialDetailSoapIn" />
      <wsdl:output message="tns:UpdateFDIGetMaterialDetailSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetMaterialDetails">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按照关键字段删除（多个）FDIGetMaterialDetail</wsdl:documentation>
      <wsdl:input message="tns:DelFDIGetMaterialDetailsSoapIn" />
      <wsdl:output message="tns:DelFDIGetMaterialDetailsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetMaterialDetail">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">删除FDIGetMaterialDetail</wsdl:documentation>
      <wsdl:input message="tns:DelFDIGetMaterialDetailSoapIn" />
      <wsdl:output message="tns:DelFDIGetMaterialDetailSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetMaterialDetails">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">根据查询条件获取记录集FDIGetMaterialDetail</wsdl:documentation>
      <wsdl:input message="tns:GetFDIGetMaterialDetailsSoapIn" />
      <wsdl:output message="tns:GetFDIGetMaterialDetailsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetMaterialDetailById">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按Id查找FDIGetMaterialDetail</wsdl:documentation>
      <wsdl:input message="tns:GetFDIGetMaterialDetailByIdSoapIn" />
      <wsdl:output message="tns:GetFDIGetMaterialDetailByIdSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetMaterialByPage">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回分页FDIGetMaterial</wsdl:documentation>
      <wsdl:input message="tns:GetFDIGetMaterialByPageSoapIn" />
      <wsdl:output message="tns:GetFDIGetMaterialByPageSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetMaterialCount">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回FDIGetMaterial记录总数 配合分页查询用</wsdl:documentation>
      <wsdl:input message="tns:GetFDIGetMaterialCountSoapIn" />
      <wsdl:output message="tns:GetFDIGetMaterialCountSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddFDIGetMaterial">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">新增FDIGetMaterial</wsdl:documentation>
      <wsdl:input message="tns:AddFDIGetMaterialSoapIn" />
      <wsdl:output message="tns:AddFDIGetMaterialSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIGetMaterial">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">修改FDIGetMaterial</wsdl:documentation>
      <wsdl:input message="tns:UpdateFDIGetMaterialSoapIn" />
      <wsdl:output message="tns:UpdateFDIGetMaterialSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetMaterials">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按照关键字段删除（多个）FDIGetMaterial</wsdl:documentation>
      <wsdl:input message="tns:DelFDIGetMaterialsSoapIn" />
      <wsdl:output message="tns:DelFDIGetMaterialsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetMaterial">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">删除FDIGetMaterial</wsdl:documentation>
      <wsdl:input message="tns:DelFDIGetMaterialSoapIn" />
      <wsdl:output message="tns:DelFDIGetMaterialSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetMaterials">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">根据查询条件获取记录集FDIGetMaterial</wsdl:documentation>
      <wsdl:input message="tns:GetFDIGetMaterialsSoapIn" />
      <wsdl:output message="tns:GetFDIGetMaterialsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetMaterialById">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">按Id查找FDIGetMaterial</wsdl:documentation>
      <wsdl:input message="tns:GetFDIGetMaterialByIdSoapIn" />
      <wsdl:output message="tns:GetFDIGetMaterialByIdSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="FDIServiceSoap" type="tns:FDIServiceSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="GetRawMaterial">
      <soap:operation soapAction="http://fanuc.com.cn/GetRawMaterial" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetMaterialInfo">
      <soap:operation soapAction="http://fanuc.com.cn/GetMaterialInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetWorkOrder">
      <soap:operation soapAction="http://fanuc.com.cn/GetWorkOrder" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetDNOrder">
      <soap:operation soapAction="http://fanuc.com.cn/GetDNOrder" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="PostWOClose">
      <soap:operation soapAction="http://fanuc.com.cn/PostWOClose" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="PostWOIssue">
      <soap:operation soapAction="http://fanuc.com.cn/PostWOIssue" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="PostDNOrder">
      <soap:operation soapAction="http://fanuc.com.cn/PostDNOrder" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="PostRawMaterial">
      <soap:operation soapAction="http://fanuc.com.cn/PostRawMaterial" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="PostInventorySyn">
      <soap:operation soapAction="http://fanuc.com.cn/PostInventorySyn" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIInventorySynBacthByPage">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIInventorySynBacthByPage" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIInventorySynBacthCount">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIInventorySynBacthCount" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIInventorySynBacth">
      <soap:operation soapAction="http://fanuc.com.cn/AddFDIInventorySynBacth" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIInventorySynBacth">
      <soap:operation soapAction="http://fanuc.com.cn/UpdateFDIInventorySynBacth" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIInventorySynBacths">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIInventorySynBacths" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIInventorySynBacth">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIInventorySynBacth" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIInventorySynBacths">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIInventorySynBacths" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIInventorySynBacthById">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIInventorySynBacthById" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIInventorySynByPage">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIInventorySynByPage" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIInventorySynCount">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIInventorySynCount" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIInventorySyn">
      <soap:operation soapAction="http://fanuc.com.cn/AddFDIInventorySyn" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIInventorySyn">
      <soap:operation soapAction="http://fanuc.com.cn/UpdateFDIInventorySyn" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIInventorySyns">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIInventorySyns" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIInventorySyn">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIInventorySyn" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIInventorySyns">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIInventorySyns" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIInventorySynById">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIInventorySynById" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostRawMaterialBatchByPage">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostRawMaterialBatchByPage" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostRawMaterialBatchCount">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostRawMaterialBatchCount" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIPostRawMaterialBatch">
      <soap:operation soapAction="http://fanuc.com.cn/AddFDIPostRawMaterialBatch" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIPostRawMaterialBatch">
      <soap:operation soapAction="http://fanuc.com.cn/UpdateFDIPostRawMaterialBatch" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostRawMaterialBatchs">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIPostRawMaterialBatchs" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostRawMaterialBatch">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIPostRawMaterialBatch" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostRawMaterialBatchs">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostRawMaterialBatchs" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostRawMaterialBatchById">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostRawMaterialBatchById" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostRawMaterialDetailByPage">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostRawMaterialDetailByPage" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostRawMaterialDetailCount">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostRawMaterialDetailCount" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIPostRawMaterialDetail">
      <soap:operation soapAction="http://fanuc.com.cn/AddFDIPostRawMaterialDetail" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIPostRawMaterialDetail">
      <soap:operation soapAction="http://fanuc.com.cn/UpdateFDIPostRawMaterialDetail" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostRawMaterialDetails">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIPostRawMaterialDetails" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostRawMaterialDetail">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIPostRawMaterialDetail" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostRawMaterialDetails">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostRawMaterialDetails" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostRawMaterialDetailById">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostRawMaterialDetailById" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostRawMaterialByPage">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostRawMaterialByPage" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostRawMaterialCount">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostRawMaterialCount" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIPostRawMaterial">
      <soap:operation soapAction="http://fanuc.com.cn/AddFDIPostRawMaterial" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIPostRawMaterial">
      <soap:operation soapAction="http://fanuc.com.cn/UpdateFDIPostRawMaterial" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostRawMaterials">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIPostRawMaterials" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostRawMaterial">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIPostRawMaterial" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostRawMaterials">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostRawMaterials" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostRawMaterialById">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostRawMaterialById" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostSaleOrderBatchByPage">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostSaleOrderBatchByPage" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostSaleOrderBatchCount">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostSaleOrderBatchCount" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIPostSaleOrderBatch">
      <soap:operation soapAction="http://fanuc.com.cn/AddFDIPostSaleOrderBatch" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIPostSaleOrderBatch">
      <soap:operation soapAction="http://fanuc.com.cn/UpdateFDIPostSaleOrderBatch" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostSaleOrderBatchs">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIPostSaleOrderBatchs" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostSaleOrderBatch">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIPostSaleOrderBatch" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostSaleOrderBatchs">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostSaleOrderBatchs" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostSaleOrderBatchById">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostSaleOrderBatchById" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostSaleOrderDetailByPage">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostSaleOrderDetailByPage" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostSaleOrderDetailCount">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostSaleOrderDetailCount" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIPostSaleOrderDetail">
      <soap:operation soapAction="http://fanuc.com.cn/AddFDIPostSaleOrderDetail" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIPostSaleOrderDetail">
      <soap:operation soapAction="http://fanuc.com.cn/UpdateFDIPostSaleOrderDetail" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostSaleOrderDetails">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIPostSaleOrderDetails" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostSaleOrderDetail">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIPostSaleOrderDetail" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostSaleOrderDetails">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostSaleOrderDetails" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostSaleOrderDetailById">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostSaleOrderDetailById" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostSaleOrderByPage">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostSaleOrderByPage" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostSaleOrderCount">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostSaleOrderCount" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIPostSaleOrder">
      <soap:operation soapAction="http://fanuc.com.cn/AddFDIPostSaleOrder" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIPostSaleOrder">
      <soap:operation soapAction="http://fanuc.com.cn/UpdateFDIPostSaleOrder" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostSaleOrders">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIPostSaleOrders" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostSaleOrder">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIPostSaleOrder" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostSaleOrders">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostSaleOrders" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostSaleOrderById">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostSaleOrderById" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOIssueBatchByPage">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostWOIssueBatchByPage" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOIssueBatchCount">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostWOIssueBatchCount" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIPostWOIssueBatch">
      <soap:operation soapAction="http://fanuc.com.cn/AddFDIPostWOIssueBatch" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIPostWOIssueBatch">
      <soap:operation soapAction="http://fanuc.com.cn/UpdateFDIPostWOIssueBatch" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostWOIssueBatchs">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIPostWOIssueBatchs" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostWOIssueBatch">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIPostWOIssueBatch" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOIssueBatchs">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostWOIssueBatchs" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOIssueBatchById">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostWOIssueBatchById" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOIssueDetailByPage">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostWOIssueDetailByPage" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOIssueDetailCount">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostWOIssueDetailCount" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIPostWOIssueDetail">
      <soap:operation soapAction="http://fanuc.com.cn/AddFDIPostWOIssueDetail" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIPostWOIssueDetail">
      <soap:operation soapAction="http://fanuc.com.cn/UpdateFDIPostWOIssueDetail" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostWOIssueDetails">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIPostWOIssueDetails" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostWOIssueDetail">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIPostWOIssueDetail" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOIssueDetails">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostWOIssueDetails" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOIssueDetailById">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostWOIssueDetailById" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOIssueByPage">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostWOIssueByPage" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOIssueCount">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostWOIssueCount" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIPostWOIssue">
      <soap:operation soapAction="http://fanuc.com.cn/AddFDIPostWOIssue" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIPostWOIssue">
      <soap:operation soapAction="http://fanuc.com.cn/UpdateFDIPostWOIssue" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostWOIssues">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIPostWOIssues" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostWOIssue">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIPostWOIssue" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOIssues">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostWOIssues" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOIssueById">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostWOIssueById" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOCloseBatchByPage">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostWOCloseBatchByPage" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOCloseBatchCount">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostWOCloseBatchCount" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIPostWOCloseBatch">
      <soap:operation soapAction="http://fanuc.com.cn/AddFDIPostWOCloseBatch" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIPostWOCloseBatch">
      <soap:operation soapAction="http://fanuc.com.cn/UpdateFDIPostWOCloseBatch" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostWOCloseBatchs">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIPostWOCloseBatchs" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostWOCloseBatch">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIPostWOCloseBatch" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOCloseBatchs">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostWOCloseBatchs" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOCloseBatchById">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostWOCloseBatchById" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOCloseDetailByPage">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostWOCloseDetailByPage" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOCloseDetailCount">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostWOCloseDetailCount" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIPostWOCloseDetail">
      <soap:operation soapAction="http://fanuc.com.cn/AddFDIPostWOCloseDetail" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIPostWOCloseDetail">
      <soap:operation soapAction="http://fanuc.com.cn/UpdateFDIPostWOCloseDetail" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostWOCloseDetails">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIPostWOCloseDetails" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostWOCloseDetail">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIPostWOCloseDetail" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOCloseDetails">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostWOCloseDetails" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOCloseDetailById">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostWOCloseDetailById" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOCloseByPage">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostWOCloseByPage" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOCloseCount">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostWOCloseCount" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIPostWOClose">
      <soap:operation soapAction="http://fanuc.com.cn/AddFDIPostWOClose" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIPostWOClose">
      <soap:operation soapAction="http://fanuc.com.cn/UpdateFDIPostWOClose" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostWOCloses">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIPostWOCloses" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostWOClose">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIPostWOClose" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOCloses">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostWOCloses" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOCloseById">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIPostWOCloseById" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetMaterialInfoByPage">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIGetMaterialInfoByPage" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetMaterialInfoCount">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIGetMaterialInfoCount" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIGetMaterialInfo">
      <soap:operation soapAction="http://fanuc.com.cn/AddFDIGetMaterialInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIGetMaterialInfo">
      <soap:operation soapAction="http://fanuc.com.cn/UpdateFDIGetMaterialInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetMaterialInfos">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIGetMaterialInfos" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetMaterialInfo">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIGetMaterialInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetMaterialInfos">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIGetMaterialInfos" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetMaterialInfoById">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIGetMaterialInfoById" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetSaleOrderDetailByPage">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIGetSaleOrderDetailByPage" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetSaleOrderDetailCount">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIGetSaleOrderDetailCount" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIGetSaleOrderDetail">
      <soap:operation soapAction="http://fanuc.com.cn/AddFDIGetSaleOrderDetail" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIGetSaleOrderDetail">
      <soap:operation soapAction="http://fanuc.com.cn/UpdateFDIGetSaleOrderDetail" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetSaleOrderDetails">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIGetSaleOrderDetails" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetSaleOrderDetail">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIGetSaleOrderDetail" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetSaleOrderDetails">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIGetSaleOrderDetails" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetSaleOrderDetailById">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIGetSaleOrderDetailById" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetSaleOrderByPage">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIGetSaleOrderByPage" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetSaleOrderCount">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIGetSaleOrderCount" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIGetSaleOrder">
      <soap:operation soapAction="http://fanuc.com.cn/AddFDIGetSaleOrder" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIGetSaleOrder">
      <soap:operation soapAction="http://fanuc.com.cn/UpdateFDIGetSaleOrder" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetSaleOrders">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIGetSaleOrders" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetSaleOrder">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIGetSaleOrder" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetSaleOrders">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIGetSaleOrders" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetSaleOrderById">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIGetSaleOrderById" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetWOrderDetailByPage">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIGetWOrderDetailByPage" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetWOrderDetailCount">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIGetWOrderDetailCount" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIGetWOrderDetail">
      <soap:operation soapAction="http://fanuc.com.cn/AddFDIGetWOrderDetail" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIGetWOrderDetail">
      <soap:operation soapAction="http://fanuc.com.cn/UpdateFDIGetWOrderDetail" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetWOrderDetails">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIGetWOrderDetails" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetWOrderDetail">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIGetWOrderDetail" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetWOrderDetails">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIGetWOrderDetails" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetWOrderDetailById">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIGetWOrderDetailById" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetWOrderByPage">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIGetWOrderByPage" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetWOrderCount">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIGetWOrderCount" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIGetWOrder">
      <soap:operation soapAction="http://fanuc.com.cn/AddFDIGetWOrder" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIGetWOrder">
      <soap:operation soapAction="http://fanuc.com.cn/UpdateFDIGetWOrder" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetWOrders">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIGetWOrders" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetWOrder">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIGetWOrder" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetWOrders">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIGetWOrders" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetWOrderById">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIGetWOrderById" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetRawMaterialDetailByPage">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIGetRawMaterialDetailByPage" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetRawMaterialDetailCount">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIGetRawMaterialDetailCount" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIGetRawMaterialDetail">
      <soap:operation soapAction="http://fanuc.com.cn/AddFDIGetRawMaterialDetail" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIGetRawMaterialDetail">
      <soap:operation soapAction="http://fanuc.com.cn/UpdateFDIGetRawMaterialDetail" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetRawMaterialDetails">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIGetRawMaterialDetails" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetRawMaterialDetail">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIGetRawMaterialDetail" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetRawMaterialDetails">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIGetRawMaterialDetails" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetRawMaterialDetailById">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIGetRawMaterialDetailById" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetRawMaterialByPage">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIGetRawMaterialByPage" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetRawMaterialCount">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIGetRawMaterialCount" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIGetRawMaterial">
      <soap:operation soapAction="http://fanuc.com.cn/AddFDIGetRawMaterial" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIGetRawMaterial">
      <soap:operation soapAction="http://fanuc.com.cn/UpdateFDIGetRawMaterial" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetRawMaterials">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIGetRawMaterials" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetRawMaterial">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIGetRawMaterial" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetRawMaterials">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIGetRawMaterials" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetRawMaterialById">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIGetRawMaterialById" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetMaterialDetailByPage">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIGetMaterialDetailByPage" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetMaterialDetailCount">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIGetMaterialDetailCount" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIGetMaterialDetail">
      <soap:operation soapAction="http://fanuc.com.cn/AddFDIGetMaterialDetail" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIGetMaterialDetail">
      <soap:operation soapAction="http://fanuc.com.cn/UpdateFDIGetMaterialDetail" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetMaterialDetails">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIGetMaterialDetails" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetMaterialDetail">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIGetMaterialDetail" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetMaterialDetails">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIGetMaterialDetails" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetMaterialDetailById">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIGetMaterialDetailById" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetMaterialByPage">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIGetMaterialByPage" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetMaterialCount">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIGetMaterialCount" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIGetMaterial">
      <soap:operation soapAction="http://fanuc.com.cn/AddFDIGetMaterial" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIGetMaterial">
      <soap:operation soapAction="http://fanuc.com.cn/UpdateFDIGetMaterial" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetMaterials">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIGetMaterials" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetMaterial">
      <soap:operation soapAction="http://fanuc.com.cn/DelFDIGetMaterial" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetMaterials">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIGetMaterials" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetMaterialById">
      <soap:operation soapAction="http://fanuc.com.cn/GetFDIGetMaterialById" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="FDIServiceSoap12" type="tns:FDIServiceSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="GetRawMaterial">
      <soap12:operation soapAction="http://fanuc.com.cn/GetRawMaterial" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetMaterialInfo">
      <soap12:operation soapAction="http://fanuc.com.cn/GetMaterialInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetWorkOrder">
      <soap12:operation soapAction="http://fanuc.com.cn/GetWorkOrder" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetDNOrder">
      <soap12:operation soapAction="http://fanuc.com.cn/GetDNOrder" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="PostWOClose">
      <soap12:operation soapAction="http://fanuc.com.cn/PostWOClose" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="PostWOIssue">
      <soap12:operation soapAction="http://fanuc.com.cn/PostWOIssue" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="PostDNOrder">
      <soap12:operation soapAction="http://fanuc.com.cn/PostDNOrder" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="PostRawMaterial">
      <soap12:operation soapAction="http://fanuc.com.cn/PostRawMaterial" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="PostInventorySyn">
      <soap12:operation soapAction="http://fanuc.com.cn/PostInventorySyn" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIInventorySynBacthByPage">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIInventorySynBacthByPage" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIInventorySynBacthCount">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIInventorySynBacthCount" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIInventorySynBacth">
      <soap12:operation soapAction="http://fanuc.com.cn/AddFDIInventorySynBacth" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIInventorySynBacth">
      <soap12:operation soapAction="http://fanuc.com.cn/UpdateFDIInventorySynBacth" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIInventorySynBacths">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIInventorySynBacths" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIInventorySynBacth">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIInventorySynBacth" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIInventorySynBacths">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIInventorySynBacths" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIInventorySynBacthById">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIInventorySynBacthById" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIInventorySynByPage">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIInventorySynByPage" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIInventorySynCount">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIInventorySynCount" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIInventorySyn">
      <soap12:operation soapAction="http://fanuc.com.cn/AddFDIInventorySyn" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIInventorySyn">
      <soap12:operation soapAction="http://fanuc.com.cn/UpdateFDIInventorySyn" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIInventorySyns">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIInventorySyns" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIInventorySyn">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIInventorySyn" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIInventorySyns">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIInventorySyns" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIInventorySynById">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIInventorySynById" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostRawMaterialBatchByPage">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostRawMaterialBatchByPage" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostRawMaterialBatchCount">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostRawMaterialBatchCount" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIPostRawMaterialBatch">
      <soap12:operation soapAction="http://fanuc.com.cn/AddFDIPostRawMaterialBatch" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIPostRawMaterialBatch">
      <soap12:operation soapAction="http://fanuc.com.cn/UpdateFDIPostRawMaterialBatch" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostRawMaterialBatchs">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIPostRawMaterialBatchs" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostRawMaterialBatch">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIPostRawMaterialBatch" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostRawMaterialBatchs">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostRawMaterialBatchs" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostRawMaterialBatchById">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostRawMaterialBatchById" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostRawMaterialDetailByPage">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostRawMaterialDetailByPage" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostRawMaterialDetailCount">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostRawMaterialDetailCount" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIPostRawMaterialDetail">
      <soap12:operation soapAction="http://fanuc.com.cn/AddFDIPostRawMaterialDetail" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIPostRawMaterialDetail">
      <soap12:operation soapAction="http://fanuc.com.cn/UpdateFDIPostRawMaterialDetail" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostRawMaterialDetails">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIPostRawMaterialDetails" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostRawMaterialDetail">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIPostRawMaterialDetail" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostRawMaterialDetails">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostRawMaterialDetails" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostRawMaterialDetailById">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostRawMaterialDetailById" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostRawMaterialByPage">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostRawMaterialByPage" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostRawMaterialCount">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostRawMaterialCount" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIPostRawMaterial">
      <soap12:operation soapAction="http://fanuc.com.cn/AddFDIPostRawMaterial" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIPostRawMaterial">
      <soap12:operation soapAction="http://fanuc.com.cn/UpdateFDIPostRawMaterial" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostRawMaterials">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIPostRawMaterials" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostRawMaterial">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIPostRawMaterial" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostRawMaterials">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostRawMaterials" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostRawMaterialById">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostRawMaterialById" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostSaleOrderBatchByPage">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostSaleOrderBatchByPage" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostSaleOrderBatchCount">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostSaleOrderBatchCount" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIPostSaleOrderBatch">
      <soap12:operation soapAction="http://fanuc.com.cn/AddFDIPostSaleOrderBatch" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIPostSaleOrderBatch">
      <soap12:operation soapAction="http://fanuc.com.cn/UpdateFDIPostSaleOrderBatch" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostSaleOrderBatchs">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIPostSaleOrderBatchs" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostSaleOrderBatch">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIPostSaleOrderBatch" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostSaleOrderBatchs">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostSaleOrderBatchs" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostSaleOrderBatchById">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostSaleOrderBatchById" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostSaleOrderDetailByPage">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostSaleOrderDetailByPage" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostSaleOrderDetailCount">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostSaleOrderDetailCount" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIPostSaleOrderDetail">
      <soap12:operation soapAction="http://fanuc.com.cn/AddFDIPostSaleOrderDetail" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIPostSaleOrderDetail">
      <soap12:operation soapAction="http://fanuc.com.cn/UpdateFDIPostSaleOrderDetail" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostSaleOrderDetails">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIPostSaleOrderDetails" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostSaleOrderDetail">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIPostSaleOrderDetail" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostSaleOrderDetails">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostSaleOrderDetails" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostSaleOrderDetailById">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostSaleOrderDetailById" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostSaleOrderByPage">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostSaleOrderByPage" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostSaleOrderCount">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostSaleOrderCount" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIPostSaleOrder">
      <soap12:operation soapAction="http://fanuc.com.cn/AddFDIPostSaleOrder" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIPostSaleOrder">
      <soap12:operation soapAction="http://fanuc.com.cn/UpdateFDIPostSaleOrder" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostSaleOrders">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIPostSaleOrders" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostSaleOrder">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIPostSaleOrder" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostSaleOrders">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostSaleOrders" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostSaleOrderById">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostSaleOrderById" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOIssueBatchByPage">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostWOIssueBatchByPage" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOIssueBatchCount">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostWOIssueBatchCount" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIPostWOIssueBatch">
      <soap12:operation soapAction="http://fanuc.com.cn/AddFDIPostWOIssueBatch" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIPostWOIssueBatch">
      <soap12:operation soapAction="http://fanuc.com.cn/UpdateFDIPostWOIssueBatch" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostWOIssueBatchs">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIPostWOIssueBatchs" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostWOIssueBatch">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIPostWOIssueBatch" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOIssueBatchs">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostWOIssueBatchs" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOIssueBatchById">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostWOIssueBatchById" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOIssueDetailByPage">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostWOIssueDetailByPage" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOIssueDetailCount">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostWOIssueDetailCount" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIPostWOIssueDetail">
      <soap12:operation soapAction="http://fanuc.com.cn/AddFDIPostWOIssueDetail" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIPostWOIssueDetail">
      <soap12:operation soapAction="http://fanuc.com.cn/UpdateFDIPostWOIssueDetail" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostWOIssueDetails">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIPostWOIssueDetails" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostWOIssueDetail">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIPostWOIssueDetail" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOIssueDetails">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostWOIssueDetails" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOIssueDetailById">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostWOIssueDetailById" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOIssueByPage">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostWOIssueByPage" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOIssueCount">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostWOIssueCount" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIPostWOIssue">
      <soap12:operation soapAction="http://fanuc.com.cn/AddFDIPostWOIssue" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIPostWOIssue">
      <soap12:operation soapAction="http://fanuc.com.cn/UpdateFDIPostWOIssue" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostWOIssues">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIPostWOIssues" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostWOIssue">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIPostWOIssue" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOIssues">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostWOIssues" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOIssueById">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostWOIssueById" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOCloseBatchByPage">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostWOCloseBatchByPage" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOCloseBatchCount">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostWOCloseBatchCount" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIPostWOCloseBatch">
      <soap12:operation soapAction="http://fanuc.com.cn/AddFDIPostWOCloseBatch" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIPostWOCloseBatch">
      <soap12:operation soapAction="http://fanuc.com.cn/UpdateFDIPostWOCloseBatch" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostWOCloseBatchs">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIPostWOCloseBatchs" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostWOCloseBatch">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIPostWOCloseBatch" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOCloseBatchs">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostWOCloseBatchs" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOCloseBatchById">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostWOCloseBatchById" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOCloseDetailByPage">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostWOCloseDetailByPage" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOCloseDetailCount">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostWOCloseDetailCount" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIPostWOCloseDetail">
      <soap12:operation soapAction="http://fanuc.com.cn/AddFDIPostWOCloseDetail" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIPostWOCloseDetail">
      <soap12:operation soapAction="http://fanuc.com.cn/UpdateFDIPostWOCloseDetail" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostWOCloseDetails">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIPostWOCloseDetails" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostWOCloseDetail">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIPostWOCloseDetail" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOCloseDetails">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostWOCloseDetails" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOCloseDetailById">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostWOCloseDetailById" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOCloseByPage">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostWOCloseByPage" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOCloseCount">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostWOCloseCount" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIPostWOClose">
      <soap12:operation soapAction="http://fanuc.com.cn/AddFDIPostWOClose" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIPostWOClose">
      <soap12:operation soapAction="http://fanuc.com.cn/UpdateFDIPostWOClose" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostWOCloses">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIPostWOCloses" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIPostWOClose">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIPostWOClose" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOCloses">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostWOCloses" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIPostWOCloseById">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIPostWOCloseById" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetMaterialInfoByPage">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIGetMaterialInfoByPage" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetMaterialInfoCount">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIGetMaterialInfoCount" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIGetMaterialInfo">
      <soap12:operation soapAction="http://fanuc.com.cn/AddFDIGetMaterialInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIGetMaterialInfo">
      <soap12:operation soapAction="http://fanuc.com.cn/UpdateFDIGetMaterialInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetMaterialInfos">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIGetMaterialInfos" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetMaterialInfo">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIGetMaterialInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetMaterialInfos">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIGetMaterialInfos" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetMaterialInfoById">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIGetMaterialInfoById" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetSaleOrderDetailByPage">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIGetSaleOrderDetailByPage" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetSaleOrderDetailCount">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIGetSaleOrderDetailCount" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIGetSaleOrderDetail">
      <soap12:operation soapAction="http://fanuc.com.cn/AddFDIGetSaleOrderDetail" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIGetSaleOrderDetail">
      <soap12:operation soapAction="http://fanuc.com.cn/UpdateFDIGetSaleOrderDetail" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetSaleOrderDetails">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIGetSaleOrderDetails" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetSaleOrderDetail">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIGetSaleOrderDetail" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetSaleOrderDetails">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIGetSaleOrderDetails" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetSaleOrderDetailById">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIGetSaleOrderDetailById" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetSaleOrderByPage">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIGetSaleOrderByPage" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetSaleOrderCount">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIGetSaleOrderCount" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIGetSaleOrder">
      <soap12:operation soapAction="http://fanuc.com.cn/AddFDIGetSaleOrder" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIGetSaleOrder">
      <soap12:operation soapAction="http://fanuc.com.cn/UpdateFDIGetSaleOrder" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetSaleOrders">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIGetSaleOrders" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetSaleOrder">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIGetSaleOrder" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetSaleOrders">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIGetSaleOrders" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetSaleOrderById">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIGetSaleOrderById" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetWOrderDetailByPage">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIGetWOrderDetailByPage" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetWOrderDetailCount">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIGetWOrderDetailCount" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIGetWOrderDetail">
      <soap12:operation soapAction="http://fanuc.com.cn/AddFDIGetWOrderDetail" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIGetWOrderDetail">
      <soap12:operation soapAction="http://fanuc.com.cn/UpdateFDIGetWOrderDetail" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetWOrderDetails">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIGetWOrderDetails" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetWOrderDetail">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIGetWOrderDetail" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetWOrderDetails">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIGetWOrderDetails" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetWOrderDetailById">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIGetWOrderDetailById" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetWOrderByPage">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIGetWOrderByPage" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetWOrderCount">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIGetWOrderCount" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIGetWOrder">
      <soap12:operation soapAction="http://fanuc.com.cn/AddFDIGetWOrder" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIGetWOrder">
      <soap12:operation soapAction="http://fanuc.com.cn/UpdateFDIGetWOrder" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetWOrders">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIGetWOrders" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetWOrder">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIGetWOrder" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetWOrders">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIGetWOrders" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetWOrderById">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIGetWOrderById" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetRawMaterialDetailByPage">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIGetRawMaterialDetailByPage" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetRawMaterialDetailCount">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIGetRawMaterialDetailCount" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIGetRawMaterialDetail">
      <soap12:operation soapAction="http://fanuc.com.cn/AddFDIGetRawMaterialDetail" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIGetRawMaterialDetail">
      <soap12:operation soapAction="http://fanuc.com.cn/UpdateFDIGetRawMaterialDetail" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetRawMaterialDetails">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIGetRawMaterialDetails" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetRawMaterialDetail">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIGetRawMaterialDetail" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetRawMaterialDetails">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIGetRawMaterialDetails" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetRawMaterialDetailById">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIGetRawMaterialDetailById" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetRawMaterialByPage">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIGetRawMaterialByPage" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetRawMaterialCount">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIGetRawMaterialCount" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIGetRawMaterial">
      <soap12:operation soapAction="http://fanuc.com.cn/AddFDIGetRawMaterial" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIGetRawMaterial">
      <soap12:operation soapAction="http://fanuc.com.cn/UpdateFDIGetRawMaterial" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetRawMaterials">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIGetRawMaterials" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetRawMaterial">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIGetRawMaterial" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetRawMaterials">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIGetRawMaterials" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetRawMaterialById">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIGetRawMaterialById" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetMaterialDetailByPage">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIGetMaterialDetailByPage" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetMaterialDetailCount">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIGetMaterialDetailCount" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIGetMaterialDetail">
      <soap12:operation soapAction="http://fanuc.com.cn/AddFDIGetMaterialDetail" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIGetMaterialDetail">
      <soap12:operation soapAction="http://fanuc.com.cn/UpdateFDIGetMaterialDetail" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetMaterialDetails">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIGetMaterialDetails" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetMaterialDetail">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIGetMaterialDetail" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetMaterialDetails">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIGetMaterialDetails" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetMaterialDetailById">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIGetMaterialDetailById" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetMaterialByPage">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIGetMaterialByPage" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetMaterialCount">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIGetMaterialCount" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFDIGetMaterial">
      <soap12:operation soapAction="http://fanuc.com.cn/AddFDIGetMaterial" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFDIGetMaterial">
      <soap12:operation soapAction="http://fanuc.com.cn/UpdateFDIGetMaterial" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetMaterials">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIGetMaterials" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelFDIGetMaterial">
      <soap12:operation soapAction="http://fanuc.com.cn/DelFDIGetMaterial" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetMaterials">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIGetMaterials" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFDIGetMaterialById">
      <soap12:operation soapAction="http://fanuc.com.cn/GetFDIGetMaterialById" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="FDIService">
    <wsdl:port name="FDIServiceSoap" binding="tns:FDIServiceSoap">
      <soap:address location="http://192.168.15.118/BFM.WebService/FDIService.asmx" />
    </wsdl:port>
    <wsdl:port name="FDIServiceSoap12" binding="tns:FDIServiceSoap12">
      <soap12:address location="http://192.168.15.118/BFM.WebService/FDIService.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>