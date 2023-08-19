package ru.netology.spring_boot_rest1.repository;

import org.springframework.stereotype.Repository;
import ru.netology.spring_boot_rest1.model.Authorities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> authorities = new ArrayList<>();
        if (user.equals("Ivan") && password.equals("123")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        } else if (user.equals("Oleg") && password.equals("321")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE);
        } else if (user.equals("Pavel") && password.equals("000")) {
            Collections.addAll(authorities, Authorities.READ);
        }
        return authorities;

    }
}