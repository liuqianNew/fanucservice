/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-07-01
 */
        CREATE TABLE AVA_SM_ODLN(
                    "DocEntry" INTEGER(8) ,
                    "CardCode" NVARCHAR(8) ,
                    "DocDate" DATE(8) ,
                    "Note" NVARCHAR(255) ,
                    "DocStatus" NVARCHAR(1) ,
                    "Deleted" NVARCHAR(1) ,
                    "IsSync" NVARCHAR(1) ,
                    "SyncDate" DATE(8) ,
                    "SAPDocEntry" NVARCHAR(10) ,
                    "BillNo" NVARCHAR(20) ,
                    "LogisticsNo" NVARCHAR(20) ,
                    "BaseEntry" NVARCHAR(20) ,
                    "BaseType" NVARCHAR(20) ,
                    "Extend1" NVARCHAR(8) ,
                    "Extend2" NVARCHAR(30) ,
                    "Extend3" NVARCHAR(30) ,
                    "Extend4" NVARCHAR(30) ,
                    "Extend5" NVARCHAR(255) ,
                    "Creator" NVARCHAR(30) ,
                    "CreateDate" DATE(8) ,
                    "CreateTime" INTEGER(8) 
        );
        CREATE TABLE AVA_SM_DLN1(
                    "DocEntry" INTEGER(8) ,
                    "LineId" INTEGER(8) ,
                    "BaseEntry" NVARCHAR(20) ,
                    "BaseType" INTEGER(8) ,
                    "BaseLineNum" INTEGER(8) ,
                    "ItemCode" NVARCHAR(20) ,
                    "CodeBars" NVARCHAR(100) ,
                    "Quantity" DECIMAL(8) ,
                    "Price" INTEGER(8) ,
                    "WhsCode" NVARCHAR(8) ,
                    "Extend1" NVARCHAR(8) ,
                    "Extend2" NVARCHAR(30) ,
                    "Extend3" NVARCHAR(30) ,
                    "Extend4" NVARCHAR(30) ,
                    "Extend5" NVARCHAR(255) 
        );
