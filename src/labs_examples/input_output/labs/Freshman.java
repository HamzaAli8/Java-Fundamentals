package labs_examples.input_output.labs;

import java.io.Serializable;

public class Freshman implements Serializable {

    private String gender;
    private String weightSept;
    private String weightApr;
    private String bmiSept;
    private String bmiApr;


    public void setSex(String sex) {
        this.gender = sex;
    }

    public void setWeightSept(String weightSept) {
        this.weightSept = weightSept;
    }

    public void setWeightApr(String weightApr) {
        this.weightApr = weightApr;
    }

    public void setBmiSept(String bmiSept) {
        this.bmiSept = bmiSept;
    }

    public void setBmiApr(String bmiApr) {
        this.bmiApr = bmiApr;
    }

    @Override
    public String toString() {
        return "Freshman{" +
                "sex='" + gender + '\'' +
                ", weightSept='" + weightSept + '\'' +
                ", weightApr='" + weightApr + '\'' +
                ", bmiSept='" + bmiSept + '\'' +
                ", bmiApr='" + bmiApr + '\'' +
                '}';
    }
}




