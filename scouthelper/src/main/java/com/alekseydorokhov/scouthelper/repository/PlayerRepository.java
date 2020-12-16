package com.alekseydorokhov.scouthelper.repository;

import com.alekseydorokhov.scouthelper.domain.DefenceStat;
import com.alekseydorokhov.scouthelper.domain.Player;
import com.alekseydorokhov.scouthelper.model.Filter;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Set;

public interface PlayerRepository extends CrudRepository<Player, Long> {
    public List<Player> findAll(Specification<Player> specification);
    public boolean existsByName(String name);
}
