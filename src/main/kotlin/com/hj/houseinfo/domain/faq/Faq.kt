package com.hj.houseinfo.domain.faq

import com.hj.houseinfo.domain.BaseEntity
import jakarta.persistence.*

@Entity
@Table(name = "Faq")
class Faq(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "faq_id", nullable = false)
        var id: Long? = null,
        var subject: String,
        var content: String
) : BaseEntity() {}