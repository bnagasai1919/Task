package com.jpmc.application.Entity;
import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@SuppressWarnings("serial")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Studente extends BaseModel

{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;

    @Version
    private Integer version;

    @ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinTable(
            joinColumns= {@JoinColumn(name="studentid",referencedColumnName="id")
            },
            inverseJoinColumns= {
                    @JoinColumn(name="Courseid",referencedColumnName="id")
            }
    )
    private List<Course> courses;

    
}
