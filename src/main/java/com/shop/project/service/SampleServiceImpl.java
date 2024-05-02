package com.shop.project.service;

import com.shop.project.dto.SampleDto;
import com.shop.project.mapper.SampleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleServiceImpl implements SampleService {

    @Autowired
    private SampleMapper qnaMapper;


    @Override
    public List<SampleDto> selectSampleList() throws Exception {
        return qnaMapper.selectSampleList();
    }

    @Override
    public void insertSample(SampleDto Qna) throws Exception {
        qnaMapper.insertSample(Qna);
    }

//    @Override
//    public void deleteQna(int QnaIdx) throws Exception {
//        qnaMapper.deleteQna(QnaIdx);
//    }
}
