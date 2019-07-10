/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-04-04
 */
CREATE TABLE AVA_IM_ODRN(
            "EDIDocEntry" BIGINT ,
            "DocEntry" VARCHAR(30) ,
            "CardCode" NVARCHAR(30) ,
            "CardName" NVARCHAR(200) ,
            "ShiptoCode" NVARCHAR(30) ,
            "Address3" NVARCHAR(200) ,
            "Phone1" NVARCHAR(20) ,
            "CntctCode" NVARCHAR(20) ,
            "DocType" NVARCHAR(20) ,
            "DocDate" DATE,
            "DocStatus" NVARCHAR(1) ,
            "Comments" NVARCHAR(200) ,
            "UserSign" NVARCHAR(8) ,
            "PayType" NVARCHAR(8) ,
            "DeliveryNum" NVARCHAR(30) ,
            "DocTime" INTEGER ,
            "ErrorTime" INTEGER ,
            "IsSync" NVARCHAR(1) default 'N',
            "SyncMessage" NVARCHAR(200),
            "SyncDate" DATE,
            "SyncTime" INTEGER ,
            "SAPDocEntry" NVARCHAR(30),
            "Udf1" NVARCHAR(8) ,
            "Udf2" NVARCHAR(30) ,
            "Udf3" NVARCHAR(30) ,
            "Udf4" NVARCHAR(30) ,
            "Udf5" NVARCHAR(200)
);
CREATE TABLE AVA_IM_DRN1(
            "EDIDocEntry" BIGINT,
            "EDILineId" INTEGER ,
            "DocEntry" VARCHAR(30) ,
            "LineId" INTEGER,
            "ItemCode" NVARCHAR(30) ,
            "ItemName" NVARCHAR(200) ,
            "Quantity" DECIMAL(11,2) ,
            "WhsCode" NVARCHAR(8) ,
            "BaseEntry" VARCHAR(30) ,
            "BaseLine" INTEGER,
            "unitMsr" NVARCHAR(8) ,
            "Udf1" NVARCHAR(8) ,
            "Udf2" NVARCHAR(30) ,
            "Udf3" NVARCHAR(30) ,
            "Udf4" NVARCHAR(30) ,
            "Udf5" NVARCHAR(200)
);
CREATE TABLE AVA_IM_DRN2(
            "EDIDocEntry" BIGINT,
            "EDILineId" INTEGER,
            "EDIItemLineId" INTEGER,
            "DocEntry" VARCHAR(30) ,
            "ItemLineId" INTEGER,
            "LineNum" INTEGER,
            "ItemCode" NVARCHAR(30) ,
            "Quantity" DECIMAL(11,2) ,
            "BatchNum" NVARCHAR(30) ,
            "Udf1" NVARCHAR(8) ,
            "Udf2" NVARCHAR(30) ,
            "Udf3" NVARCHAR(30) ,
            "Udf4" NVARCHAR(30) ,
            "Udf5" NVARCHAR(200)
);
