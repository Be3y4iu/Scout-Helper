package com.alekseydorokhov.scouthelper.repository;

import com.alekseydorokhov.scouthelper.domain.Player;
import com.alekseydorokhov.scouthelper.model.Filter;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlayerRepository extends CrudRepository<Player, Long> {
    public List<Player> findAll(Specification<Player> specification);
}
