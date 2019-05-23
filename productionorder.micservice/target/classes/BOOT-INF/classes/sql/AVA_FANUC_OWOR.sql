alter PROCEDURE AVA_FANUC_OWOR
(
	in object_type nvarchar(30), 				-- SBO Object Type
	in transaction_type nchar(1),			-- [A]dd, [U]pdate, [D]elete, [C]ancel, C[L]ose
	in num_of_cols_in_key int,
	in list_of_key_cols_tab_del nvarchar(255),
	in list_of_cols_val_tab_del nvarchar(255)
)
LANGUAGE SQLSCRIPT
AS

-- Return values
error  int;				-- Result (0 for no error)
error_message nvarchar (200); 		-- Error string to be displayed
begin

error := 0;
error_message := N'Ok';

--------------------------------------------------------------------------------------------------------------------------------

--	ADD	YOUR	CODE	HERE

--   create by Fancy 2019/3/28
--   控制同步状态：1、新增生产订单同步状态默认为N，同步消息为空，

IF :transaction_type = N'A'
THEN
	UPDATE "OWOR" SET "U_IsSync" = 'N',"U_SyncMessage" = '' WHERE "DocEntry" = :list_of_cols_val_tab_del;
END IF;

--------------------------------------------------------------------------------------------------------------------------------

-- Select the return values
select :error, :error_message FROM dummy;

end;