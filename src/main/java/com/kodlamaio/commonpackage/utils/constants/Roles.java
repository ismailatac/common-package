package com.kodlamaio.commonpackage.utils.constants;

public class Roles {
    public static final String AdminAndUser = "hasRole('admin') and hasRole('user')";
    public static final String Admin = "hasRole('admin')";
    public static final String User = "hasRole('user')";
    public static final String AdminOrUser = "hasRole('admin') or hasRole('user')";
}
