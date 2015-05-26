package domain.dbmodel;

/**
 * Created by bsu on 2015/5/22.
 */
public class User {

    private Integer id;
    private String name;
    private String funkyNumber;
    private String roundingMode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFunkyNumber() {
        return funkyNumber;
    }

    public void setFunkyNumber(String funkyNumber) {
        this.funkyNumber = funkyNumber;
    }

    public String getRoundingMode() {
        return roundingMode;
    }

    public void setRoundingMode(String roundingMode) {
        this.roundingMode = roundingMode;
    }
}
