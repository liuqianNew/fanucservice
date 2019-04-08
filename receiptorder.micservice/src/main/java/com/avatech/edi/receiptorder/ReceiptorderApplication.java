/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-04-01
 */
package com.avatech.edi.receiptorder;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.avatech.edi.receiptorder.mapper")
public class ReceiptOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReceiptOrderApplication.class, args);
    }

}