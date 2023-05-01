package com.bezkoder.spring.jpa.controller;

import com.bezkoder.spring.jpa.Service.FirstService;
import com.bezkoder.spring.jpa.model.FirstEntity;
import com.bezkoder.spring.jpa.model.SecondEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
public class FirstController {

    private final FirstService firstService;

    @GetMapping("/first/{year}")
    ResponseEntity<List<FirstEntity>> getData(@PathVariable("year") String year) {
        log.info("Get data list with year {}", year);

        return firstService.getData(year);
    }

    @GetMapping("/second/{year}")
    ResponseEntity<SecondEntity> getTotal(@PathVariable("year") String year) {
        log.info("Get total with year {}", year);

        return firstService.getTotal(year);
    }
}
