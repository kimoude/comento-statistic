package com.demo.comentoStatistic.dao;

import com.demo.comentoStatistic.dto.YearCountDto;
import com.demo.comentoStatistic.dto.YearMonthCountDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StatisticMapper {
    YearCountDto selectYearLogin(@Param("year") String year);
    YearMonthCountDto selectYearMonthLogin(@Param("yearMonth") String yearMonth);
}
