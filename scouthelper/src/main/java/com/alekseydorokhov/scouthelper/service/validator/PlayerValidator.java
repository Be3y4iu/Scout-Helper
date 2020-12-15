package com.alekseydorokhov.scouthelper.service.validator;

import com.alekseydorokhov.scouthelper.bean.Club;
import com.alekseydorokhov.scouthelper.bean.Position;
import com.alekseydorokhov.scouthelper.domain.Player;
import org.springframework.stereotype.Service;
import static com.alekseydorokhov.scouthelper.bean.PlayerConstants.*;

import java.util.Objects;

@Service
public class PlayerValidator {

    public boolean isValidName(String name){
        return Objects.nonNull(name) && !name.isEmpty();
    }

    public boolean isValidAge(int age){
            return age>=MIN_AGE;
    }

    public boolean isValidPosition(Position pos){
        return Objects.nonNull(pos);
    }

    public boolean isValidClub(Club club){
        return Objects.nonNull(club);
    }

    public boolean isValidPlayer(Player player){
        return isValidName(player.getName()) &&
                isValidAge(player.getAge()) &&
                isValidClub(player.getCurrentClub()) &&
                isValidPosition(player.getPosition());
    }

}
