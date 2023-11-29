package zerobase.stockdividend.web;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zerobase.stockdividend.model.ScrapedResult;
import zerobase.stockdividend.service.FinanceService;

@RestController
@RequestMapping("/finance")
@AllArgsConstructor
public class FinanceController {
    private final FinanceService financeService;
    @PreAuthorize("hasRole('READ')")
    @GetMapping("/dividend/{companyName}")
    public ResponseEntity<?> searchFinance(@PathVariable String companyName) {
        ScrapedResult result = this.financeService.getDividendByCompanyName(companyName);
        return ResponseEntity.ok(result);
    }

}
