/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-07-01
 */
create view AVA_IM_VIEW_OITW as
select T0."ItemCode",T1."ItemName",T0."WhsCode",T1."SalUnitMsr", T3."ItmsGrpCod",T3."ItmsGrpNam",T0."OnHand" ,"Price" from OITW T0
											left join OITM T1 ON T0."ItemCode" = T1."ItemCode"
											inner join ITM1 T2 ON T0."ItemCode" = T2."ItemCode" and T2."PriceList" = 1
											left join OITB T3 ON T1."ItmsGrpCod" = T3."ItmsGrpCod"
