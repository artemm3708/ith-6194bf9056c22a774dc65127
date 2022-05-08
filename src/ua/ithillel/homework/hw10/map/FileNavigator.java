package ua.ithillel.homework.hw10.map;

import java.util.*;

public class FileNavigator {

    private Map<String, ArrayList<FileData>> fileDataMap = new HashMap();

    public void add(String path, FileData file) {
        if (fileDataMap.containsKey(path)) {
            fileDataMap.get(path).add(file);
        } else {
            ArrayList<FileData> listOfFiles = new ArrayList<>();
            listOfFiles.add(file);
            fileDataMap.put(file.getPath(), listOfFiles);
        }
    }

    public ArrayList<ArrayList<FileData>> find(String path) {
        ArrayList<ArrayList<FileData>> fileData = new ArrayList<>();
        fileData.add(fileDataMap.get(path));
        return fileData;
    }

    public List<ArrayList<FileData>> filterBySize(int size) {
        List<ArrayList<FileData>> returnList = new ArrayList<>(fileDataMap.values());
        for (int i = 0; i < returnList.size(); i++) {
            if (returnList.get(i).get(i).getSize() >= size) {
                returnList.remove(i);
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
        List<FileData> files = new ArrayList(fileDataMap.values());
        //Collections.sort(files);
        return files;
    }
}
