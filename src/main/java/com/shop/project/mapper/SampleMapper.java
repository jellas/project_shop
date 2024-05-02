package com.shop.project.mapper;

import com.shop.project.dto.SampleDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SampleMapper {

    // R
	List<SampleDto> selectSampleList() throws Exception;
    //C
    void insertSample(SampleDto Qna) throws Exception;
    //D
    void deleteQna(int QnaIdx) throws Exception;

}
