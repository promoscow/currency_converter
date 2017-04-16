package com.company.util;

import com.company.Currency;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by promoscow on 15.04.17.
 */
public class BackupDB {
    private final String filePath = "./src/" + String.valueOf(this
            .getClass()
            .getPackage()
            .getName()
            .replace(".", "/") + "/currencies/");

    public Map<String, Currency> getBackupDB() {
        String fileExtencion = ".dat";
        HashMap<String, Currency> map = new HashMap<>();

        File file = new File(filePath);
        if (!file.exists()) return null;
        File[] listFiles = file.listFiles(new MyFilenameFilter(fileExtencion));
        if (listFiles.length == 0) return null;
        else {
            for (File f : listFiles) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(filePath + File.separator + f.getName());
                    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                    Currency currency = (Currency) objectInputStream.readObject();
                    fileInputStream.close();
                    objectInputStream.close();
                    map.put(currency.getdCode(), currency);
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
        return map;
    }

    public void createBackupDB(Map<String, Currency> map) {
        for (Map.Entry<String, Currency> entry : map.entrySet()) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(filePath + entry.getKey() + ".dat");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(entry.getValue());
                fileOutputStream.close();
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private class MyFilenameFilter implements FilenameFilter {
        private String ext;

        public MyFilenameFilter(String fileExtencion) {
            this.ext = fileExtencion.toLowerCase();
        }

        @Override
        public boolean accept(File dir, String name) {
            return name.toLowerCase().endsWith(ext);
        }
    }
}
