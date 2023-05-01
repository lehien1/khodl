package com.bezkoder.spring.jpa.repository.impl;

import com.bezkoder.spring.jpa.model.FirstEntity;
import com.bezkoder.spring.jpa.model.SecondEntity;
import com.bezkoder.spring.jpa.repository.custom.FirstRepository;
import com.opengamma.elsql.ElSql;
import com.opengamma.elsql.ElSqlConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import sql.QuerySql;

import javax.persistence.*;
import java.util.List;

@Repository
@RequiredArgsConstructor
@Slf4j
public class ImplFirstRepository implements FirstRepository {
    ElSql bundle = ElSql.of(ElSqlConfig.DEFAULT, QuerySql.class);

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<FirstEntity> getDataByYear(String year) {
        try {
            String sqlQuery = bundle.getSql(QuerySql.FIRST_QUERY);
            Query query = entityManager.createNativeQuery(sqlQuery, FirstEntity.class);
            query.setParameter("year", year);

            return query.getResultList();
        } catch (NoResultException e) {
            log.warn("Data not found while find by year = {}", year);
        } catch (Exception e) {
            log.error("Failed while get data list by year = {}", year);
        }
        return null;
    }

    @Override
    public SecondEntity getTotalByYear(String year) {
        try {
            String sqlQuery = bundle.getSql(QuerySql.SECOND_QUERY);
            Query query = entityManager.createNativeQuery(sqlQuery, SecondEntity.class);
            query.setParameter("year", year);

            return (SecondEntity) query.getSingleResult();
        } catch (NoResultException e) {
            log.warn("Data not found while find by year = {}", year);
        } catch (Exception e) {
            log.error("Failed while get total by year = {}", year);
        }
        return null;
    }
}
