package com.financial.statement;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
 // 多个mapper 如何处理
@MapperScan(value = {"com.financial.statement.account.dao", "x"})
public class FinancialStatementApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancialStatementApplication.class, args);
	}
}
