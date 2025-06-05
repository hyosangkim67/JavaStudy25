package ch05.test_0529;

public class StudentDTO {

    private String names;
    private int kors;
    private int mats;
    private int engs;

    public StudentDTO() {}

    public StudentDTO(String names, int kors, int mats, int engs) {
        this.names = names;
        this.kors = kors;
        this.mats = mats;
        this.engs = engs;
    }

    public String getNames() {
        return names;
    }

    public int getKors() {
        return kors;
    }

    public int getMats() {
        return mats;
    }

    public int getEngs() {
        return engs;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public void setKors(int kors) {
        this.kors = kors;
    }

    public void setMats(int mats) {
        this.mats = mats;
    }

    public void setEngs(int engs) {
        this.engs = engs;
    }

    @Override
    public String toString() {
        return "StudentDTO [이름=" + names + ", 국어=" + kors + ", 수학=" + mats + ", 영어=" + engs + "]";
    }
}
