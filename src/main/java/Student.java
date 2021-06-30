public class Student {

    private int id;
    private String name;
    private int level;
    private int class_num;
    private int num;
    private int in_time;
    private int out_time;


    public Student() {

    }

    public Student(int id, String name, int level, int class_num, int num, int in_time, int out_time) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.class_num = class_num;
        this.num = num;
        this.in_time= in_time;
        this.out_time= out_time;

    }

    @Override
    public String toString() {
        return this.id + "  | " + this.name + " " +this.level + "학년 " +
                this.class_num + "반 " + this.num + "번 " + this.in_time +this.out_time;
    }

    public String toFString() {
        return this.name+"-"+this.getLevel()+"-"+this.getClass_num()+"-"+this.getNum()+"-"+this.getIn_time()+"-"+this.getOut_time();

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


    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getClass_num() {
        return class_num;
    }

    public void setClass_num(int class_num) {
        this.class_num = class_num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getIn_time() {
        return in_time;
    }

    public void setIn_time(int in_time) {
        this.in_time = in_time;
    }

    public int getOut_time() {
        return out_time;
    }

    public void setOut_time(int out_time) {
        this.out_time = out_time;
    }
}
