package com.shop.project.service;

import com.shop.project.dto.SampleDto;

import java.util.List;

public interface SampleService {

	List<SampleDto> selectSampleList() throws Exception;

    void insertSample(SampleDto sampleDto) throws Exception;

    //void deleteQna(int QnaIdx) throws Exception;
}
