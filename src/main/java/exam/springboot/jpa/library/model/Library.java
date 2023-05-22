package exam.springboot.jpa.library.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="library")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Library {

    @Id
    private Long lbno;

    private String lbname;
    private String sido;
    private String gugun;
    private String lbtype;
    private String clsday;
    private String addr;
    private String phone;
    private String homepage;
    private double lat;
    private double lon;
    private String regdate;

}
