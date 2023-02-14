package com.hj.houseinfo.repository

import com.hj.houseinfo.domain.faq.Faq
import org.springframework.data.jpa.repository.JpaRepository

interface FaqRepository : JpaRepository<Faq, Long> {
}