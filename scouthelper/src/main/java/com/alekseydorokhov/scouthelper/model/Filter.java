package com.alekseydorokhov.scouthelper.model;

import com.alekseydorokhov.scouthelper.domain.Player;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
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

    public void addCondition(String field, Object condition){
        conditions.put(field, condition);
    }

    @Override
    public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
        List<Predicate> predicates = buildPredicates(root, criteriaQuery, criteriaBuilder);
        return predicates.size() > 1
                ? criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]))
                : predicates.get(0);
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
