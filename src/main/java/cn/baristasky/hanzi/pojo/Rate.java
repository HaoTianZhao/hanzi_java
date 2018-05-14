package cn.baristasky.hanzi.pojo;

/**
 * Created by 赵 on 2018/5/7
 */
public class Rate implements Comparable<Rate> {
    private int id;
    private String name;
    private int section;
    private int errorTime;

    public Rate() {
    }

    public Rate(String name, int section, int errorTime) {
        this.name = name;
        this.section = section;
        this.errorTime = errorTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public int getErrorTime() {
        return errorTime;
    }

    public void setErrorTime(int errorTime) {
        this.errorTime = errorTime;
    }

    @Override
    public int compareTo(Rate o) {
        if (this.section > o.section)
            return 1;
        if (this.section == o.section && this.errorTime < o.errorTime)
            return 1;
        if (this.section == o.section && this.errorTime == o.errorTime)
            return 0;
        return -1;
    }
}
