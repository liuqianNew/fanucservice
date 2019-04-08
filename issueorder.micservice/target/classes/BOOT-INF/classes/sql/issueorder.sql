/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-04-03
 */
CREATE TABLE AVA_IM_OIGE(
    "EDIDocEntry" BigInt ,
            "DocDate" DATE,
            "DocEntry" INTEGER,
            "Comments" NVARCHAR(200) ,
            "UserSign" NVARCHAR(8) ,
            "DocTime" DATE ,
            "Udf1" NVARCHAR(8) ,
            "Udf2" NVARCHAR(30) ,
            "Udf3" NVARCHAR(30) ,
            "Udf4" NVARCHAR(30) ,
            "Udf5" NVARCHAR(200)
);
CREATE TABLE AVA_IM_IGE1(
      "EDIDocEntry" BigInt ,
      "EDILineId" INTEGER,
            "DocEntry" INTEGER,
            "LineId" INTEGER,
            "ItemCode" NVARCHAR(30) ,
            "ItemName" NVARCHAR(200) ,
            "Quantity" DECIMAL(11,2) ,
            "WhsCode" NVARCHAR(8) ,
            "BaseEntry" INTEGER ,
            "BaseLine" INTEGER,
            "unitMsr" NVARCHAR(8) ,
            "Udf1" NVARCHAR(8) ,
            "Udf2" NVARCHAR(30) ,
            "Udf3" NVARCHAR(30) ,
            "Udf4" NVARCHAR(30) ,
            "Udf5" NVARCHAR(200)
);
CREATE TABLE AVA_IM_IGE2(
      "EDIDocEntry" BigInt ,
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