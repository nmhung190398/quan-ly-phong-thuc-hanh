package com.phongthuchanh.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "room_calendar")
@Getter
@Setter
public class RoomCalendar extends AbstractAuditingEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "shift")
    private Integer shift;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "classes_id", updatable = false, insertable = false)
    private Long classesId;

    @Column(name = "room_id", updatable = false, insertable = false)
    private Long roomId;

    @ManyToOne
//    @JoinColumn(name = "classes_id")
    private Classes classes;

    @ManyToOne
//    @JoinColumn(name = "room_id")
    private Room room;

    @Column(name = "status")
    private Integer status;

    @NotNull
    @Column(nullable = false)
    private boolean activated = false;

    @Column(name = "description")
    private String description;
}
