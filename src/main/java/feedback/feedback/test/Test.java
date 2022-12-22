package feedback.feedback.test;

import feedback.feedback.question.Question;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Test {

    @Id @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "test")
    private List<Question> question = new ArrayList<>();
}
