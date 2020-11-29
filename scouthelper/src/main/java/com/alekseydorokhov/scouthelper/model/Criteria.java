package com.alekseydorokhov.scouthelper.model;

import com.alekseydorokhov.scouthelper.bean.Club;
import com.alekseydorokhov.scouthelper.bean.Position;
import com.alekseydorokhov.scouthelper.domain.Player;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.Specification;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Criteria {
    private String name = null;
    private Position position = null;
    private Club currentClub = null;
    private Integer age = null;

    public Specification createSpecification(){
        Filter filter = new Filter();
        if(Objects.nonNull(name))
            filter.addCondition("name", name);
        if(Objects.nonNull(position))
            filter.addCondition("position", position);
        if(Objects.nonNull(currentClub))
            filter.addCondition("currentClub", currentClub);
        if(Objects.nonNull(age))
            filter.addCondition("age", age);
        return filter;
    }
}
