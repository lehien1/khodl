package com.bezkoder.spring.jpa.Service;

import com.bezkoder.spring.jpa.model.FirstEntity;
import com.bezkoder.spring.jpa.model.SecondEntity;
import com.bezkoder.spring.jpa.repository.custom.FirstRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
@Slf4j
public class FirstService {

    @Autowired
    private final FirstRepository firstRepository;

    public ResponseEntity<List<FirstEntity>> getData(String year) {
        List<FirstEntity> firstEntityList = firstRepository.getDataByYear(year);

        if (Objects.isNull(firstEntityList)) {
            log.warn("Can not get data list with year {}", year);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        log.info("SUCCESS get data list with year {}", year);
        return new ResponseEntity<>(firstEntityList, HttpStatus.OK);
    }

    public ResponseEntity<SecondEntity> getTotal(String year) {
        SecondEntity secondEntity = firstRepository.getTotalByYear(year);

        if (Objects.isNull(secondEntity)) {
            log.warn("Can not get total with year {}", year);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        log.info("SUCCESS get total with year {}", year);
        return new ResponseEntity<>(secondEntity, HttpStatus.OK);
    }
}
