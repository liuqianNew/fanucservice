/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-07-01
 */

CREATE TABLE [AVA_SM_ORDR](
	[DocEntry] [bigint] NULL,
	[CardCode] [nvarchar](8) NULL,
	[DocDate] [date] NULL,
	[Note] [nvarchar](255) NULL,
	[DocStatus] [nvarchar](1) NULL,
	[Deleted] [nvarchar](1) NULL,
	[IsSync] [nvarchar](1) NULL,
	[SyncDate] [date] NULL,
	[BaseEntry] [nvarchar](20) NULL,
	[BaseType] [nvarchar](20) NULL,
	[SAPDocEntry] [nvarchar](10) NULL,
	[BillNo] [nvarchar](20) NULL,
	[Extend1] [nvarchar](8) NULL,
	[Extend2] [nvarchar](30) NULL,
	[Extend3] [nvarchar](30) NULL,
	[Extend4] [nvarchar](255) NULL,
	[Extend5] [nvarchar](255) NULL,
	[Creator] [nvarchar](30) NULL,
	[CreateDate] [date] NULL,
	[CreateTime] [int] NULL
) ;

CREATE TABLE [dbo].[AVA_SM_RDR1](
	[DocEntry] [bigint] NULL,
	[LineId] [int] NULL,
	[BaseEntry] [nvarchar](20) NULL,
	[BaseType] [int] NULL,
	[BaseLineNum] [int] NULL,
	[ItemCode] [nvarchar](20) NULL,
	[CodeBars] [nvarchar](100) NULL,
	[Quantity] [decimal](8, 0) NULL,
	[Price] [int] NULL,
	[WhsCode] [nvarchar](8) NULL,
	[extend1] [nvarchar](100) NULL,
	[extend2] [nvarchar](100) NULL,
	[extend3] [nvarchar](100) NULL,
	[extend4] [nvarchar](100) NULL,
	[extend5] [nvarchar](100) NULL
)

