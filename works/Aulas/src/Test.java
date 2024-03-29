public class Test {

    private String name;
    private Double value;
    private Integer code;

    private static final StringBuilder sb = new StringBuilder();

    public Test() {}

    public Test(String name, Double value, Integer code) {
        this.name = name;
        this.code = code;
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    @Override
    public String toString() {
        sb.setLength(0);
        sb.append(String.format("Name: %s\n", name));
        sb.append(String.format("Value: %f\n", value));
        sb.append(String.format("Code: %d\n", code));
        return sb.toString();
    }
}
