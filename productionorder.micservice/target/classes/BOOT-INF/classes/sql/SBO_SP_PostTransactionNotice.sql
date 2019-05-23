IF :object_type = '202' AND :transaction_type = 'A'
THEN
	CALL AVA_FANUC_OWOR(:object_type,:transaction_type,:num_of_cols_in_key,:list_of_key_cols_tab_del,:list_of_cols_val_tab_del);
END IF;