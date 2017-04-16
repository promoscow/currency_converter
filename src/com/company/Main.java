package com.company;

import com.company.util.BackupDB;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Strategy strategy = new Strategy();
        BackupDB backupDB = new BackupDB();
        Map<String, Currency> map = new HashMap<>();
        map = backupDB.getBackupDB();
//        map = strategy.getCurrencies();
//        backupDB.createBackupDB(map);
        map.values().forEach(System.out::println);
    }
}
