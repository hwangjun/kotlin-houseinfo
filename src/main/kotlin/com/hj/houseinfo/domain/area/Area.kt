package com.hj.houseinfo.domain.area

import com.hj.houseinfo.domain.BaseEntity
import jakarta.persistence.*

@Entity
@Table(name = "area")
class Area(
        @Id
        @Column(name = "area_id", nullable = false)
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long,

        @Column(nullable = true)
        var name: String
) : BaseEntity(){}