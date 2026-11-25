package com.demo.comentoStatistic.controller;

import com.demo.comentoStatistic.dto.YearCountDto;
import com.demo.comentoStatistic.dto.YearMonthCountDto;
import com.demo.comentoStatistic.service.StatisticService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatisticController {
    private final StatisticService statisticService;

    public StatisticController(StatisticService statisticService) {
        this.statisticService = statisticService;
    }

    @GetMapping(value = "/api/v1/logins/{year}", produces = "application/json")
    public ResponseEntity<YearCountDto> getYearLoginCount(@PathVariable("year") String year) {
        return ResponseEntity.ok(statisticService.getYearLogins(year));
    }

    @GetMapping(value = "/api/v1/logins/{year}/{month}", produces = "application/json")
    public ResponseEntity<YearMonthCountDto> getYearMonthLoginCount(
            @PathVariable("year") String year, @PathVariable("month") String month) {
        return ResponseEntity.ok(statisticService.getYearMonthLogins(year, month));
    }
}
