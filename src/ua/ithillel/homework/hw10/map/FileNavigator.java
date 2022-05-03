package ua.ithillel.homework.hw10.map;

import java.util.*;

public class FileNavigator {

    private Map<String, ArrayList<FileData>> fileDataMap = new HashMap();

    public void add(FileData file) {
        for (Map.Entry<String, ArrayList<FileData>> files : fileDataMap.entrySet()) {
            if (files.getKey().equals(file.getPath())) {
                files.getValue().add(file);
            } else {
                ArrayList<FileData> listOfFiles = new ArrayList<>();
                listOfFiles.add(file);
                fileDataMap.put(file.getPath(), listOfFiles);
            }
        }
    }

    public Map<String, ArrayList<FileData>> find(String path) {
        Map<String, ArrayList<FileData>> fileData = new HashMap<>();
        for (Map.Entry<String, ArrayList<FileData>> file : fileDataMap.entrySet()) {
            if (file.getKey().equals(path)) {
                fileData.put(file.getKey(), file.getValue());
            }
        }
        return fileData;
    }

    public ArrayList<FileData> filterBySize(int size) {
        ArrayList<FileData> returnList = new ArrayList<>();
        for (Map.Entry<String, ArrayList<FileData>> entry : fileDataMap.entrySet()) {
            for (FileData data : entry.getValue()) {
                if (data.getSize() <= size) {
                    returnList.add(data);
                }
            }
        }
        return returnList;
    }

    public void remove(String path) {
        for (String filePath : fileDataMap.keySet()) {
            if (filePath.equals(path)) {
                fileDataMap.remove(path);
                break;
            }
        }
    }

    public List<FileData> sortBySize() {
        List<FileData> files = new ArrayList<>();
        for (Map.Entry<String, ArrayList<FileData>> entry : fileDataMap.entrySet()) {
            for (FileData data : entry.getValue()) {
                Arrays.sort(new List[]{Arrays.asList(data.getSize())});
                files.add(data);
            }
        }
        return files;
    }

    public void draw() {
        for (Map.Entry<String, ArrayList<FileData>> files : fileDataMap.entrySet()) {
            System.out.println(files.getKey() + ", " + files.getValue());
        }
    }
}
