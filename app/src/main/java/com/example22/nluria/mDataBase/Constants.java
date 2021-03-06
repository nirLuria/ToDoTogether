package com.example22.nluria.mDataBase;

/**
 * Created by nluria on 3/22/2017.
 */

public class Constants
{

    //COLUMNS
    static final String ROW_ID="id";
    static final String NAME="name";

    //DB PROPS
    static final String DB_NAME="ee_DB";
    static final String TB_NAME="ee_TB";
    static final int DB_VERSION=1;


    //CREATE TABLE
    static final String CREATE_TB="CREATE TABLE ee_TB(id INTEGER PRIMARY KEY AUTOINCREMENT,"
            + "name TEXT NOT NULL);";

    //DROP TB
    static final String DROP_TB="DRP TABLE IF EXISTS "+TB_NAME;




}
