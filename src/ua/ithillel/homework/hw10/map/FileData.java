package ua.ithillel.homework.hw10.map;

import java.util.Objects;

public class FileData {

    private int size;
    private String name;
    private String path;

    public FileData(String name, int size, String path) {
        this.size = size;
        this.name = name;
        this.path = path;
    }

    public int getSize() {
        return this.size;
    }

    public String getName() {
        return this.name;
    }

    public String getPath() {
        return this.path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FileData fileData = (FileData) o;
        return size == fileData.size && Objects.equals(name, fileData.name) && Objects.equals(path, fileData.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, name, path);
    }

    @Override
    public String toString() {
        return "{" +
                "size=" + size +
                ", name='" + name + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
