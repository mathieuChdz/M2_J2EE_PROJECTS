package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Info {

    @Id
    @GeneratedValue
    private Long info_id;
    private String observation;

    private int age;

    public Info(){}

    public Long getInfo_id() {
        return info_id;
    }

    public void setInfo_id(Long info_id) {
        this.info_id = info_id;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Info{" +
                "info_id=" + info_id +
                ", observation='" + observation + '\'' +
                ", age=" + age +
                '}';
    }
}
