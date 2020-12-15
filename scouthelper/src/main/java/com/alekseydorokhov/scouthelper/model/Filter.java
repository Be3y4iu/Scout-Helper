package com.alekseydorokhov.scouthelper.model;

import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Filter implements Specification {

    //List<Object> conditions;
    Map<String, Object> conditions;

    public Filter() {
        conditions = new HashMap<>();
    }

    public void addCondition(String field, Object condition) {
        conditions.put(field, condition);
    }

    @Override
    public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
        List<Predicate> predicates = buildPredicates(root, criteriaQuery, criteriaBuilder);
        if (predicates.size() > 1)
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        if (predicates.size() == 1)
            return predicates.get(0);
        return criteriaBuilder.isNotNull(root);
    }


    public Predicate buildPredicate(String field, Object condition,
                                    Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
        return criteriaBuilder.equal(root.get(field), condition);

    }


    private List<Predicate> buildPredicates(Root<?> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
        return conditions.entrySet().stream()
                .map(entry -> buildPredicate(entry.getKey(), entry.getValue(), root, criteriaQuery, criteriaBuilder))
                .collect(Collectors.toList());
    }
}
