  /**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-04-03
 */
CREATE TABLE AVA_IM_OIGN(
            "EDIDocEntry" BIGINT,
            "DocDate" DATE ,
            "DocEntry" INTEGER,
            "Comments" NVARCHAR(200) ,
            "Status" NVARCHAR(1) ,
            "UserSign" NVARCHAR(8) ,
            "DocTime" INTEGER ,
            "ErrorTime" INTEGER ,
            "Udf1" NVARCHAR(8) ,
            "Udf2" NVARCHAR(30) ,
            "Udf3" NVARCHAR(30) ,
            "Udf4" NVARCHAR(30) ,
            "Udf5" NVARCHAR(200)
);
CREATE TABLE AVA_IM_IGN1(
            "EDIDocEntry" BIGINT ,
            "EDILineId" INTEGER ,
            "DocEntry" INTEGER ,
            "LineNum" INTEGER,
            "ItemCode" NVARCHAR(30) ,
            "ItemName" NVARCHAR(200) ,
            "Qty" DECIMAL(11,2) ,
            "WareHouse" NVARCHAR(8) ,
            "Project" NVARCHAR(30) ,
            "BaseREF" INTEGER ,
            "BaseEntry" INTEGER,
            "BaseLine" INTEGER ,
            "OcrCode" NVARCHAR(30) ,
            "OcrCode2" NVARCHAR(30) ,
            "OcrCode3" NVARCHAR(30) ,
            "OcrCode4" NVARCHAR(30) ,
            "OcrCode5" NVARCHAR(30) ,
            "WorkTime" DECIMAL(11,2) ,
            "BatchNum" NVARCHAR(30) ,
            "Udf1" NVARCHAR(8) ,
            "Udf2" NVARCHAR(30) ,
            "Udf3" NVARCHAR(30) ,
            "Udf4" NVARCHAR(30) ,
            "Udf5" NVARCHAR(200)
);
CREATE TABLE AVA_IM_IGN2(
            "EDIDocEntry" BIGINT ,
            "EDILineId" INTEGER,
            "EDIItemLineId" INTEGER,
            "DocEntry" INTEGER,
            "ItemLineId" INTEGER,
            "LineNum" INTEGER ,
            "ItemCode" NVARCHAR(30) ,
            "Quantity" DECIMAL(11,2) ,
            "BatchNum" NVARCHAR(30) ,
            "Udf1" NVARCHAR(8) ,
            "Udf2" NVARCHAR(30) ,
            "Udf3" NVARCHAR(30) ,
            "Udf4" NVARCHAR(30) ,
            "Udf5" NVARCHAR(200)
);