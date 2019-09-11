package com.mrn.springit.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@NoArgsConstructor
@Data // -> no need to getter&setter, requiredConstructor, hashCode & equals + tostring
public class Link extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String url;

    // comments
    @OneToMany(mappedBy = "link")
    private List<Comment> comments = new ArrayList<>();


}
