package com.tradeledger.cards.controller;

import com.tradeledger.cards.dto.Applicant;
import com.tradeledger.cards.dto.EligibilityResponse;
import com.tradeledger.cards.service.CardEligibilityService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Validated
@RequiredArgsConstructor
public class CardEligibilityController {
    private final CardEligibilityService cardEligibilityService;

    @PostMapping("/check-eligibility")
    @CrossOrigin(origins = "*")
    public EligibilityResponse checkEligibility(@RequestBody @Valid Applicant applicant){
        return cardEligibilityService.eligibilityService(applicant);
    }
}
