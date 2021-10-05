package com.example.demo.repository;

import com.example.demo.entity.SampleEntity;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SampleTableRepository {
    
    @Select("SELECT * FROM SAMPLE_TABLE WHERE SAMPLE_ID = #{SAMPLE_ID}")
    SampleEntity findOne(int sampleId);
}
