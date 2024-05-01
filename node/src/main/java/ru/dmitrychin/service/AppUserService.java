package ru.dmitrychin.service;

import ru.dmitrychin.entity.AppUser;

public interface AppUserService {
    String registerUser(AppUser appUser);
    String setEmail(AppUser appUser, String email);
}
