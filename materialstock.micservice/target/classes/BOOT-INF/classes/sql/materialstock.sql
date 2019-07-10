
CREATE TABLE AVA_IM_OITW(
            "DocEntry" VARCHAR(30) ,
            "ItemCode" NVARCHAR(30) ,
            "ItemName" NVARCHAR(200) ,
            "Quantity" DECIMAL(11,2) ,
            "WhsCode" NVARCHAR(8) ,
            "BatchNum" NVARCHAR(30) ,
            "UserSign" NVARCHAR(8) ,
            "DocTime" DATE,
            "DocDate" DATE,
            "Udf1" NVARCHAR(8) ,
            "Udf2" NVARCHAR(30) ,
            "Udf3" NVARCHAR(30) ,
            "Udf4" NVARCHAR(30) ,
            "Udf5" NVARCHAR(200)
);
CREATE TABLE AVA_IM_ITW1(
            "DocEntry" VARCHAR(30),
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