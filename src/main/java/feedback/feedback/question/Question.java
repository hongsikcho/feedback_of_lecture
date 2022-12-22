package feedback.feedback.question;

import feedback.feedback.test.Test;
import jakarta.persistence.*;

@Entity
public class Question {

    @Id @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private Integer answer;

    @Column(nullable = false)
    private String explanation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TEST_ID")
    private Test test;
}
