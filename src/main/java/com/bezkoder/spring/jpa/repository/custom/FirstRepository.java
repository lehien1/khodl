package com.bezkoder.spring.jpa.repository.custom;

import com.bezkoder.spring.jpa.model.FirstEntity;
import com.bezkoder.spring.jpa.model.SecondEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FirstRepository {
    List<FirstEntity> getDataByYear(String year);

    SecondEntity getTotalByYear(String year);
}
