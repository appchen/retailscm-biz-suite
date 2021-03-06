
package com.doublechaintech.retailscm.retailstoremembergiftcardconsumerecord;
import com.doublechaintech.retailscm.AccessKey;


public class RetailStoreMemberGiftCardConsumeRecordTable{


	public static AccessKey withId(Object value){
		AccessKey accessKey = new AccessKey();
		accessKey.setColumnName(COLUMN_ID);
		accessKey.setValue(value);
		return accessKey;
	}
	//Add extra identifiers
	

	//only this package can use this, so the scope is default, not public, not private either nor protected
	public static final String TABLE_NAME="retail_store_member_gift_card_consume_record_data";
	static final String COLUMN_ID = "id";
	static final String COLUMN_OCCURE_TIME = "occure_time";
	static final String COLUMN_OWNER = "owner";
	static final String COLUMN_BIZ_ORDER = "biz_order";
	static final String COLUMN_NUMBER = "number";
	static final String COLUMN_AMOUNT = "amount";
	static final String COLUMN_VERSION = "version";
 
	public static final String []ALL_CLOUMNS = {COLUMN_ID, 
		COLUMN_OCCURE_TIME, COLUMN_OWNER, COLUMN_BIZ_ORDER, COLUMN_NUMBER, COLUMN_AMOUNT, 
		COLUMN_VERSION};
	public static final String []NORMAL_CLOUMNS = {
		COLUMN_OCCURE_TIME, COLUMN_OWNER, COLUMN_BIZ_ORDER, COLUMN_NUMBER, COLUMN_AMOUNT
		};
	
	
}


