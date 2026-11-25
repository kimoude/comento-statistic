package com.demo.comentoStatistic.service;

import com.demo.comentoStatistic.dao.StatisticMapper;
import com.demo.comentoStatistic.dto.YearCountDto;
import com.demo.comentoStatistic.dto.YearMonthCountDto;
import org.springframework.stereotype.Service;

@Service
public class StatisticService {
    private final StatisticMapper statisticMapper;

    public StatisticService(StatisticMapper statisticMapper) {
        this.statisticMapper = statisticMapper;
    }

    public YearCountDto getYearLogins(String year) {
        return statisticMapper.selectYearLogin(year);
    }

    public YearMonthCountDto getYearMonthLogins(String year, String month) {
        return statisticMapper.selectYearMonthLogin(year + month);
    }
}
