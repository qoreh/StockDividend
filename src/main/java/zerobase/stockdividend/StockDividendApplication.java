package zerobase.stockdividend;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import zerobase.stockdividend.model.Company;
import zerobase.stockdividend.scraper.Scraper;
import zerobase.stockdividend.scraper.YahooFinanceScraper;

import java.io.IOException;
@EnableScheduling
@EnableCaching
@SpringBootApplication
public class StockDividendApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockDividendApplication.class, args);
    }
}
