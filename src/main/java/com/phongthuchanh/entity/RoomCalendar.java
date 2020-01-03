package com.phongthuchanh.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

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
    private Instant date;

    @Column(name = "classes_id")
    private Long classesId;

    @ManyToOne
    @JoinColumn(name = "classes_id")
    private Classes classes;

    @Column(name = "status")
    private Integer status;
}
